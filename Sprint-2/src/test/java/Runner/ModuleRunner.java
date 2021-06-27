package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Feature//"
,glue= {"stepdefs"},monochrome=true//tags= {" @VerifyBudgetCalculator,@VerifyContractorFinder,@VerifyPaints&Textures"}
,dryRun=false
,plugin= {"pretty","html:TestNGReports/htmlreport",
		"json:TestNGReports/jsonreport.json",
"junit:TestNGReports/xmlreport.xml"}

		)

public class ModuleRunner extends AbstractTestNGCucumberTests 
{

}
