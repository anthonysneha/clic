package com.clicbrics.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Clicbrics.feature",
glue="com.clicbrics.test.steps")

public class LoginRunner {

	
}
