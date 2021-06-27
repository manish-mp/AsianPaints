package stepdefs;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.ParentClass;
import Base.Screenshot;
import apachePOI.ExcelClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ColourAndTexture;


@Test

public class ContractorFinder extends ParentClass{


	ColourAndTexture obj = new ColourAndTexture();
	Screenshot Sc= new Screenshot();

	@Test
	@Given("user click on Contractor Finder icon")
	public void user_click_on_Contractor_Finder_icon() {
		obj.ContractorFinder();
	}
	@Test
	@When("^enter valid city name$")
	public void enter_valid_city() throws Throwable {

		ExcelClass pf = new ExcelClass();
		String name= pf.CityNameXl();
		obj.getcity(name);
		Thread.sleep(3000);

		boolean understand= driver.findElement(By.xpath("//button[@class='ctaText i-understand-btn text-uppercase']")).isDisplayed();
		if(understand) {
			driver.findElement(By.xpath("//button[@class='ctaText i-understand-btn text-uppercase']")).click();
		}
		obj.serach();
		Thread.sleep(10000);

	}

	@Test
	@Then("^user should able to see the list of contractor$")
	public void user_should_able_to_see_the_list_of_contractor() throws IOException, InterruptedException  {

		boolean cookies =driver.findElement(By.xpath("//button[@class='ctaText i-understand-btn text-uppercase']")).isDisplayed();
		if (cookies) {
			obj.cookies();}

		String expected = "Mushtaque Isa Sahikh";
		String actual = driver.findElement(By.xpath("//h3[normalize-space()='Mushtaque Isa Sahikh']")).getText();
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);
		Sc.takeScreenshotAtEndOfTest();

	}


}

