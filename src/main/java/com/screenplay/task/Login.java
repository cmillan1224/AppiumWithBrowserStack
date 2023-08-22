package com.screenplay.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.*;
import net.serenitybdd.screenplay.actions.*;

import static com.screenplay.ui.MainPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    public Login() {}

    public static Performable goTo() {
        return new Login();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUTTON_GOTO_LOGIN,isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_GOTO_LOGIN)
        );
    }
}
