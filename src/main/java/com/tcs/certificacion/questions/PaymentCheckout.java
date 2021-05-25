package com.tcs.certificacion.questions;

import com.tcs.certificacion.userinterfaces.Cart;
import com.tcs.certificacion.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PaymentCheckout implements Question<Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(Cart.MESSAGE).viewedBy(actor).asString().equals(Constants.SUCCESFUL_MSM);
    }

    public static PaymentCheckout verify(){
        return new PaymentCheckout();
    }
}
