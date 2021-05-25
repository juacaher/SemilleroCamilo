package com.tcs.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Cart {

    public static final Target IMAGE_CART = Target.the("image cart").located(By.id("imageViewCart"));
    public static final Target BUTTON_CART = Target.the("button check out").located(By.id("buttonCheckOut"));
    public static final Target BUTTON_PAY = Target.the("button check out").located(By.id("buttonPayNow"));
    public static final Target MESSAGE = Target.the("message check out").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

}
