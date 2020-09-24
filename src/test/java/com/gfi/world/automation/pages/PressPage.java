package com.gfi.world.automation.pages;

import com.gfi.world.automation.utils.commons.Page;
import org.openqa.selenium.By;

public class PressPage extends Page {

    private final By PRESS_TEXT = By.cssSelector("a[class='inbl fs12']");

    public boolean verifyPressText(String text) {
        isVisible(PRESS_TEXT);
        return getTextFromLabel(PRESS_TEXT).equals(text);
    }
}