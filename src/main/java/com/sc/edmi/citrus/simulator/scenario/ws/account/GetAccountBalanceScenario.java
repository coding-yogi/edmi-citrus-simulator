package com.sc.edmi.citrus.simulator.scenario.ws.account;

import com.consol.citrus.simulator.scenario.AbstractSimulatorScenario;
import com.consol.citrus.simulator.scenario.Scenario;
import com.consol.citrus.simulator.scenario.ScenarioDesigner;
import com.consol.citrus.simulator.scenario.ScenarioRunner;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Aniket Gadre on 1/9/2019.
 */
@Scenario("GetAccountBalance")
public class GetAccountBalanceScenario extends AbstractSimulatorScenario {

    @Override
    public void run(ScenarioDesigner scenario) {
        scenario
                .soap()
                .receive()
                .payload(new ClassPathResource("templates/soap/account/accountBalanceRequest.xml"))
                .soapAction("scbCoreBankingAccount_v6_ws_providerV2_Account_Binder_getAccountBalances");

        scenario
                .soap()
                .send()
                .payload("templates/soap/account/accountBalanceResponse.xml");
    }
}
