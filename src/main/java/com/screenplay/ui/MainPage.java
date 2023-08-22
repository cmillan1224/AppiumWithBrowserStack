package com.screenplay.ui;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class MainPage {

    public static final Locator BUTTON_GOTO_LOGIN_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[3]").withIosAccesibilityId("1");
    public static final Target BUTTON_GOTO_LOGIN = Target.the("Ya tienes una cuenta").located(theElementBy(BUTTON_GOTO_LOGIN_LOCATOR));
}
