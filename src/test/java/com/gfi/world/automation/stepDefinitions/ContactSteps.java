package com.gfi.world.automation.stepDefinitions;

import com.gfi.world.automation.pages.ContactPage;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Então;

import static org.junit.Assert.assertTrue;

public class ContactSteps {

    private ContactPage contactPage;

    @Before
    public void setup() { contactPage = new ContactPage(); }

    /* =========================ENTÃO========================= */
    @Então("^ele verifica que o texto \"([^\"]*)\" foi exibido na página contactos com sucesso$")
    public void eleVerificaQueOTextoFoiExibidoNaPáginaContactosComSucesso(String text) {
        assertTrue(contactPage.verifyContactText(text));
    }
}
