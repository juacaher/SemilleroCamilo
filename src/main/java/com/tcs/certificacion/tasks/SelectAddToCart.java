package com.tcs.certificacion.tasks;

import com.tcs.certificacion.userinterfaces.AddToCart;
import com.tcs.certificacion.userinterfaces.TabletSelection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectAddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddToCart.QUANTITY_ICON),
                Click.on(AddToCart.NUMBERS_ITEMS),
                Click.on(AddToCart.APPLY_ICON),
                Click.on(AddToCart.ADDTOCART));
    }

    public static SelectAddToCart intoAddCart(){
        return new SelectAddToCart();
    }
}
