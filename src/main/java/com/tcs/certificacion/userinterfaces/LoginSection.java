package com.tcs.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginSection {
    public static final Target BURGUER_MENU_ICON = Target.the("menu icon in the landing page").located(By.id("imageViewMenu"));
    public static final Target LOGIN_ICON = Target.the("icon in the landing page").located(By.id("linearLayoutLogin"));
    public static final Target USER_FIELD = Target.the("user field in the authentication alert").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"));
    public static final Target PASSWORD_FIELD = Target.the("password field in the authentication alert").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"));
    public static final Target SUBMIT_BUTTON = Target.the("submit button in the authentication alert").located(By.id("buttonLogin"));
}
