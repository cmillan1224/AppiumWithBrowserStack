package com.screenplay.ui;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class AccountPage {
    public static final Locator TEXT_VIEW_DESCRIPTION_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[1]").withIosAccesibilityId("Looks like your account was created with Google!");
    public static final Target TEXT_VIEW_DESCRIPTION = Target.the("Ya tienes una cuenta").located(theElementBy(TEXT_VIEW_DESCRIPTION_LOCATOR));

}
