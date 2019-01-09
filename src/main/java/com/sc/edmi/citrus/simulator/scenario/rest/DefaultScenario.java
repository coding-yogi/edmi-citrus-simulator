package com.sc.edmi.citrus.simulator.scenario.rest;

import com.consol.citrus.http.message.HttpMessage;
import com.consol.citrus.simulator.scenario.*;
import org.springframework.http.HttpStatus;

/**
 * Created by Aniket Gadre on 1/9/2019.
 */
@Scenario("DEFAULT")
public class DefaultScenario extends AbstractSimulatorScenario  {

    @Override
    public void run(ScenarioDesigner designer) {
        designer.echo("Default scenario executed!");

        designer.send()
                .message(new HttpMessage("Welcome to the Citrus simulator")
                        .status(HttpStatus.OK));
    }
}
