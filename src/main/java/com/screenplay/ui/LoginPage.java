package com.screenplay.ui;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class LoginPage {
    public static final Locator BUTTON_LOGIN_LOCATOR = locator().withAndroidId("com.duolingo:id/signinButton").withIosAccesibilityId("1");
    public static final Target BUTTON_LOGIN = Target.the("Log on").located(theElementBy(BUTTON_LOGIN_LOCATOR));
    public static final Locator INP_PASSWORD_LOCATOR = locator().withAndroidId("com.duolingo:id/passwordView").withIosAccesibilityId("1");
    public static final Target INP_PASSWORD = Target.the("Password").located(theElementBy(INP_PASSWORD_LOCATOR));
    public static final Locator INP_MAIL_LOCATOR = locator().withAndroidId("com.duolingo:id/loginView").withIosAccesibilityId("1");
    public static final Target INP_MAIL = Target.the("Email").located(theElementBy(INP_MAIL_LOCATOR));

}
