package com.tcs.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddToCart {

    public static final Target QUANTITY_ICON = Target.the("icon select quantity").located(By.id("linearLayoutProductQuantity"));
    public static final Target NUMBERS_ITEMS = Target.the("select quantity").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]"));
    public static final Target APPLY_ICON = Target.the("icon apply").located(By.id("textViewApply"));
    public static final Target ADDTOCART = Target.the("icon add to cart").located(By.id("buttonProductAddToCart"));
}
