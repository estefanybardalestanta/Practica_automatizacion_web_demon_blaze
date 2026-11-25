package org.example.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParameterDefinition {

    @ParameterType("actor")
    public Actor actor(String actorName) {
        return OnStage.theActor(actorName);
    }

    @Before
    public void setTheActor() {
        OnStage.setTheStage(new OnlineCast());
    }
}
