package com.screenplay.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.screenplay.ui.LoginPage.*;

public class Credentials implements Task {


    public Credentials() {}

    public static Performable enter() {
        return new Credentials();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("cristianjhoan49@gmail.com").into(INP_MAIL),
                Enter.keyValues("Cmillan1224").into(INP_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
}
