package StepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features  ="C:\\Users\\Dell\\Downloads\\E_commerce_testing\\src\\test\\resources\\Features\\buying.feature",
glue = {"StepDefs"})
public class testRunner {

}

