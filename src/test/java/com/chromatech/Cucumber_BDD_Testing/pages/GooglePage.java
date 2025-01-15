package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public GooglePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);}

    @FindBy(xpath = "//textarea[@id='APjFqb']")
    public WebElement searchBox;
}
