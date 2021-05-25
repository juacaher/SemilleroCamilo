package com.tcs.certificacion.tasks;

import com.tcs.certificacion.userinterfaces.LoginSection;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String chami = "oe";
        String chami2 = "oe";

        new InternalSystemClock().pauseFor(3000);
        actor.attemptsTo(
                Click.on(LoginSection.BURGUER_MENU_ICON),
                Click.on(LoginSection.LOGIN_ICON),
               // Wait.until(WebElementQuestion.stateOf(LoginSection.USER_FIELD), WebElementStateMatchers.isVisible()).forNoLongerThan(5).seconds()),
                Enter.theValue("autobots").into(LoginSection.USER_FIELD),
                Enter.theValue("12345Qwer").into(LoginSection.PASSWORD_FIELD),
                Click.on(LoginSection.SUBMIT_BUTTON));
    }
    public static Login intoTheSite(){
        return new Login();
    }
}
