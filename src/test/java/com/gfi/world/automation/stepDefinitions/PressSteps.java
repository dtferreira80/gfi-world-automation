package com.gfi.world.automation.stepDefinitions;

import com.gfi.world.automation.pages.PartnersPage;
import com.gfi.world.automation.pages.PressPage;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Então;

import static org.junit.Assert.assertTrue;

public class PressSteps {

    private PressPage pressPage;

    @Before
    public void setup() {
        pressPage = new PressPage();
    }

    /* =========================ENTÃO========================= */
    @Então("^ele verifica que o texto \"([^\"]*)\" foi exibido com sucesso$")
    public void eleVerificaQueOTextoFoiExibidoComSucesso(String text) {
        assertTrue(pressPage.verifyPressText(text));
    }
}
