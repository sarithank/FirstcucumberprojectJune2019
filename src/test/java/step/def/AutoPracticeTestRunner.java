package step.def;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/Ganaparthi/Documents/Saritha/eclipseProject/FirstCucumberProjectJune2019/src/main/java/Feature/AutoPractice.feature",
                  glue= {"step.def"},
                  plugin= {"pretty","html:/Users/Ganaparthi/Documents/Saritha/eclipseProject/FirstCucumberProjectJune2019/target","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
                  dryRun=false,//mapping between feature & stepdefinition is properor not
                  strict=true, //it will check if any step is not defined in the stepdifinition file
                  monochrome=true//it will check the console output in a proper readable format
                  )

public class AutoPracticeTestRunner {

}
