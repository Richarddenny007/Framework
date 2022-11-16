package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
  features = {"D:\\AdvSelenium\\MavenProjectCCmbr\\src\\test\\java\\Featurefile"},
  
  glue= {"StepDefinition"},
  
  dryRun= false,
  
  monochrome=false,
  
  plugin= {"pretty","html:Report\\login.html"}
  
	  	  )



public class Runnerc extends AbstractTestNGCucumberTests
{
   
}
