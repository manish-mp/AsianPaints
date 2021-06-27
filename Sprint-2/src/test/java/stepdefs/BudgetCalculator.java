package stepdefs;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.ParentClass;
import Base.Screenshot;
import apachePOI.ExcelClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ColourAndTexture;



public class BudgetCalculator extends ParentClass {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Screenshot Sc = new Screenshot();
	ColourAndTexture obj= new ColourAndTexture();


	@Given("click on PaintBudgetCalculator")
	public void click_on_PaintBudgetCalculator() throws InterruptedException {

		//		WebElement Element = driver.findElement(By.xpath("//div[@class='js-item-pill--main js-item-pill--elem']//a[normalize-space()='Lightings']"));
		//		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);
		//		WebDriverWait wait = new WebDriverWait(driver,30);
		//		boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='headerNav'][@class='collapse navbar-collapse header__navbar-content']")));
		//		if(invisible) {
		//			obj.budgetcalculator();
		//		}
		boolean understand= driver.findElement(By.xpath("//button[@class='ctaText i-understand-btn text-uppercase']")).isDisplayed();
		if(understand) {
			driver.findElement(By.xpath("//button[@class='ctaText i-understand-btn text-uppercase']")).click();
		}
		obj.budgetcalculator();
	}

	@Test
	@When("click on quick calculator and enters the required fields")
	public void click_on_quick_calculator_and_enters_the_required_fields() throws Throwable {

		//obj.cookies();
		ExcelClass pf = new ExcelClass();
		int A =pf.CarpetAreaXl();
		String Area = Integer.toString(A);
		obj.quickcalculator();
		Thread.sleep(3000);
		obj.checkprojecttype();
		Thread.sleep(3000);
		obj.SpaceSelectorInt();
		Thread.sleep(3000);
		obj.carpetarea();
		Thread.sleep(3000);
		obj.getarea(Area);
		Thread.sleep(3000);
		obj.calculatenow();
	}

	@Test
	@Then("user should able to get calculated budget")
	public void user_should_able_to_get_calculated_budget() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/span")));
		String expected ="Estimated product cost:";
		String actual=obj.actualMethod();
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		Sc.takeScreenshotAtEndOfTest();

	}
}