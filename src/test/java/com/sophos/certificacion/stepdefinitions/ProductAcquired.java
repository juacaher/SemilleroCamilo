package com.sophos.certificacion.stepdefinitions;

import com.sophos.certificacion.models.Product;
import com.sophos.certificacion.questions.PaymentCheckout;
import com.sophos.certificacion.tasks.Login;
import com.sophos.certificacion.tasks.SelectAddToCart;
import com.sophos.certificacion.tasks.SelectCart;
import com.sophos.certificacion.tasks.SelectTablet;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ProductAcquired {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Autobots");
    }
    @Given("^user logs in$")
    public void userLogsIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.intoTheSite());
    }

    @When("^user proceed buying without a valid payment method$")
    public void userProceedBuyingWithoutAValidPaymentMethod(List<Product> product) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectTablet.selecttabletmenu(),
                SelectAddToCart.intoAddCart(),
                SelectCart.selectCart()
        );
    }

    @Then("^he should see the alert message$")
    public void heShouldSeeTheAlertMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PaymentCheckout.verify()));
    }
}
