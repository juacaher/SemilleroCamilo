package com.sophos.certificacion.questions;

import com.sophos.certificacion.userinterfaces.Cart;
import com.sophos.certificacion.utils.Constants;
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
