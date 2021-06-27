package stepdefs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.ParentClass;
import Base.Screenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ColourAndTexture;
@Test
public class PaintAndTexture extends ParentClass {
	ColourAndTexture obj;
	PaintAndTexture paintandtexture;
	Screenshot Sc;

	public PaintAndTexture() {
		super();
	}
	@Before
	public void setup() {
		initialize();
		obj =new  ColourAndTexture();
		Sc = new Screenshot();
		paintandtexture = new PaintAndTexture();


	}

	@Given("user is at the  asian Paints home page")
	public void user_is_at_the_asian_Paints_home_page() {

		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test
	@Given("user click on Paints & textures icon")
	public void user_click_on_Paints_textures_icon() {
		ColourAndTexture obj = PageFactory.initElements(driver, ColourAndTexture.class);
		obj.checkPaintsTexture();
	}


	@Given("^user click on interiors wall paints$")
	public void user_click_on_interiors_wall_paints() throws Throwable {
		ColourAndTexture obj = PageFactory.initElements(driver, ColourAndTexture.class);
		//obj.cookies();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@title='Interior Wall Paints - Asian Paints']")));
		Thread.sleep(3000);
		obj.checkInteriorWall();


	}
	@Test
	@Then("user should able to see all the different types of paints in interior Category")
	public void user_should_able_to_see_all_the_different_types_of_paints_in_interior_Category() throws IOException, InterruptedException {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Home Paint & Painting Colours Plain Finishes Interior Walls - Asian Paints";
		Assert.assertEquals(expectedTitle,actualTitle);
		Thread.sleep(2000);
		Sc.takeScreenshotAtEndOfTest();

	}

	@Test
	@When("^click on exteriors wall paints$")
	public void click_on_exteriors_wall_paints() throws Exception {

		obj.cookies();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@title='Interior Wall Paints - Asian Paints']")));
		Thread.sleep(3000);
		obj.checkExteriorWall();


	}
	@Test
	@Then("user should able to see all the different types of paints in exterior Category")
	public void user_should_able_to_see_all_the_different_types_of_paints_in_exterior_Category() throws IOException, InterruptedException {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Exterior Wall Paints - Home Exterior Designs - Asian Paints";
		Assert.assertEquals(expectedTitle,actualTitle);
		Thread.sleep(2000);
		Sc.takeScreenshotAtEndOfTest();

	}
	@Test
	@When("click on wood and metal wall paints")
	public void click_on_wood_and_metal_wall_paints() throws Exception {

		obj.cookies();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@title='Interior Wall Paints - Asian Paints']")));
		Thread.sleep(5000);
		obj.checkWoodAndMetal();
	}
	@Test
	@Then("user should able to see all the different types of paints in wood and metal Category")
	public void user_should_able_to_see_all_the_different_types_of_paints_in_wood_and_metal_Category() throws IOException, InterruptedException {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Choose the Right Wood Finish for your Home Furniture - Asian Paints";
		Assert.assertEquals(expectedTitle,actualTitle);
		Thread.sleep(2000);
		Sc.takeScreenshotAtEndOfTest();

	}
	@After
	public void teardown() {
		driver.close();
	}


}
