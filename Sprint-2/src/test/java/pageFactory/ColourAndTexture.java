
package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.ParentClass;


public class ColourAndTexture extends ParentClass {


	@FindBy(xpath="//span[@class='iconTextLinks__text visible-in-Desktop'][normalize-space()='PAINTS & TEXTURES']")
	WebElement Paints_Texture;
	@FindBy(xpath="//img[@title='Interior Wall Paints - Asian Paints']")
	WebElement Interior_wall;
	@FindBy(xpath="//img[@title='Interior Wall Paints - Asian Paints']")
	WebElement Interior_Paints;
	@FindBy(xpath="//div[@class='apPlpListing baseCTSpace aem-GridColumn aem-GridColumn--default--12']//div[@class='circular-image-carousel']")
	WebElement All_Interior_Paints;
	@FindBy(xpath="//img[@title='Exterior Wall Paints - Asian Paints']")
	WebElement Exterior_wall;
	@FindBy(xpath="//a[normalize-space()='Exterior Wall Paints']")
	WebElement Exterior_Paints;
	@FindBy(xpath="//img[@title='Wood & Metal House Paints - Asian Paints']")
	WebElement WoodAndMetals;
	@FindBy(xpath="//div[@class='circular-image-carousel']")
	WebElement All_Exterior_Paints;
	@FindBy(xpath="//div[@class='columnCrosslinks__body js-columnCrosslinksBody']//a[1]")
	WebElement Budget_Calculator;
	@FindBy(xpath="//a[normalize-space()='Quick calculator']")
	WebElement Quick_Calculator;
	@FindBy(xpath="//h3[normalize-space()='Type of project']")
	WebElement Project_Type;
	@FindBy(xpath="//span[@class='form-global__custom-label-text align-middle d-inline-block'][normalize-space()='Fresh Painting']")
	WebElement Fresh_Painting;
	@FindBy(xpath="//span[@class='form-global__custom-label-text align-middle d-inline-block'][normalize-space()='Re-Painting']")
	WebElement Re_Painting;
	@FindBy(xpath="//h3[normalize-space()='Select space']")
	WebElement Space_Selector;
	@FindBy(xpath="//span[@class='form-global__custom-label-text align-middle d-inline-block'][normalize-space()='Interior']")
	WebElement Interior_Space;
	@FindBy(xpath="//span[@class='form-global__custom-label-text align-middle d-inline-block'][normalize-space()='Exterior']")
	WebElement Exterior_Space;
	@FindBy(xpath="//h3[normalize-space()='Size of home']")
	WebElement Home_Size;
	@FindBy(xpath="//span[normalize-space()='1BHK']")
	WebElement One_BHK;
	@FindBy(xpath="//span[normalize-space()='2BHK']")
	WebElement Two_BHK;
	@FindBy(xpath="//span[normalize-space()='3BHK or more']")
	WebElement Three_BHK_or_more;
	@FindBy(xpath="//input[@name='SQ_FT_VALUE'][@type='text'][@placeholder='Ex: 1200']")
	WebElement Carpet_area;
	@FindBy(xpath="//input[@placeholder='Ex: 1200']")
	WebElement Area;
	@FindBy(xpath="//a[normalize-space()='CALCULATE NOW']")
	WebElement Calculate_now;
	@FindBy(xpath="//div[@class='slick-slide slick-current slick-active']//div[@class='budget-estimation d-flex justify-content-between']//div//span[contains(text(),'Estimated product cost:')]")
	WebElement Estimate_Price;
	@FindBy(xpath="//span[normalize-space()='Find a Contractor']")
	WebElement ContractorFinder;
	@FindBy(xpath="//div[@class='leftAlign']//input[@id='ctaPincode']")
	WebElement City;
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement Search;
	@FindBy(xpath="//button[@class='ctaText i-understand-btn text-uppercase']")
	WebElement understand;
	@FindBy(xpath="//h3[normalize-space()='Ayodhya Verma']")
	WebElement Result;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/span")
	WebElement actual_id;
	public ColourAndTexture()
	{

		PageFactory.initElements(driver, this); 
	}
	public WebElement checkPaintsTexture()
	{
		Paints_Texture.click();
		return Paints_Texture;
	}
	public void checkInteriorWall()
	{	//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Colours & Textures']"))).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@title='Interior Wall Paints - Asian Paints']"))).click().build().perform();
		Interior_wall.click();

	}
	public void checkInteriorpaints()
	{
		Interior_Paints.click();
		All_Interior_Paints.isDisplayed();

	}
	public void checkExteriorWall() {
		Exterior_wall.click();
	}
	public void checkExteriorpaints()
	{
		Exterior_Paints.click();
		All_Exterior_Paints.isDisplayed();
	}


	public void checkWoodAndMetal() {
		WoodAndMetals.click();
	}
	public void budgetcalculator()
	{	
		//		WebDriverWait wait = new WebDriverWait(driver,10);
		//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='columnCrosslinks__body js-columnCrosslinksBody']//a[1]")));
		Budget_Calculator.click();

	}
	public void quickcalculator()
	{
		Quick_Calculator.click();
	} 
	public void checkprojecttype()
	{
		Project_Type.click();
		Fresh_Painting.click();
		Re_Painting.click();
	}

	public void SpaceSelectorInt() throws Throwable
	{
		Space_Selector.click();
		Thread.sleep(1000);
		Interior_Space.click();
		Thread.sleep(1000);
		Home_Size.click();
		Thread.sleep(1000);
		One_BHK.click();
		Thread.sleep(1000);
		Two_BHK.click();
		Thread.sleep(1000);
		Three_BHK_or_more.click();

	}

	public void SpaceSelectorExt()
	{
		Exterior_Space.click();
	}
	public void carpetarea()
	{	
		Carpet_area.click();
	}
	public void getarea(String value) {
		Area.sendKeys(value);
	}
	public void calculatenow() {
		Calculate_now.click();
	}
	public void Estimateprice()
	{
		Estimate_Price.isDisplayed();
	}
	public void ContractorFinder()
	{
		ContractorFinder.click();

	}
	public void getcity(String name)
	{
		City.sendKeys(name);
	}
	public void serach()
	{

		Search.click();
	}
	public void cookies()
	{
		understand.click();
	}
	public String actualMethod()
	{
		String actual = actual_id.getText();
		return actual;
	}
}




