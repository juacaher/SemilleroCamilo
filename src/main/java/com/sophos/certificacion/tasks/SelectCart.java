package com.sophos.certificacion.tasks;

import com.sophos.certificacion.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Cart.IMAGE_CART),
                Click.on(Cart.BUTTON_CART),
                Click.on(Cart.BUTTON_PAY));
    }

    public static SelectCart selectCart(){
        return new SelectCart();
    }
}
