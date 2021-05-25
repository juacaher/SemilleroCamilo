package com.tcs.certificacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\product_shoping.feature",
                    glue = "com.tcs.certificacion.stepdefinitions",
                    snippets = SnippetType.CAMELCASE)
public class Buying {
}
