package com.weborders.Pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


// TODO: * it meant to be extended
public abstract class AbstractBasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);






    public AbstractBasePage(){

        PageFactory.initElements(Driver.getDriver(), this);


    }


}
