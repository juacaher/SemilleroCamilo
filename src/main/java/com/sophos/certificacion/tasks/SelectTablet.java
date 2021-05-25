package com.sophos.certificacion.tasks;

import com.sophos.certificacion.userinterfaces.TabletSelection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTablet implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TabletSelection.TABLET_ICON),
                Click.on(TabletSelection.SELECT_TABLET));
    }

    public static SelectTablet selecttabletmenu(){
        return new SelectTablet();
    }
}
