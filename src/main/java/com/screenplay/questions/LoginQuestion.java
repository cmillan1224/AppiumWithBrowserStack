package com.screenplay.questions;

import net.serenitybdd.screenplay.Question;

import static com.screenplay.ui.AccountPage.TEXT_VIEW_DESCRIPTION;

public class LoginQuestion {
    public static Question<String> checkDescription(){return actor -> (TEXT_VIEW_DESCRIPTION.resolveFor(actor).getText());}
}
