package com.gfi.world.automation.pages;

import com.gfi.world.automation.utils.commons.Page;
import org.openqa.selenium.By;

public class ContactPage extends Page {

    private final By CONTACT_TEXT = By.cssSelector("h1[class='inbl fs56']");

    public boolean verifyContactText(String text) {
        isVisible(CONTACT_TEXT);
        return getTextFromLabel(CONTACT_TEXT).equals(text);
    }
}