package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsPage extends Utility {

    By productsText = By.xpath("//span[contains(text(),'Products')]");
    By list = (By.xpath("//div[@id='']"));


    public String getProductsText(){
        return getTextFromElement(productsText);
    }

    public String getItemNumberOnProductsPage(){
        return getTextFromElement(list);
    }
}
