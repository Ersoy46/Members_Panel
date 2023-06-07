package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Soru_Cevap_Page {

    public Soru_Cevap_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[.='Soru-Cevap Kütüphanesi']")
    public WebElement SoruCevapKutuphanesi;

    @FindBy(xpath = "//input[@id='default-search']")
    public WebElement SearchButonu;

    @FindBy(xpath = "//button[@class='relative inline-flex items-center rounded-r-md px-2 py-2 text-gray-400 ring-1 ring-inset ring-gray-300 hover:bg-gray-50 focus:z-20 focus:outline-offset-0']")
    public WebElement ileriTusu;

    @FindBy(xpath = "//span[contains(.,'Emparazonda ürün araştırırken fırsat olabilmesi için hacim değerlerinin en az ka')]")
    public WebElement EmparazonTeyit;

    @FindBy(xpath = "//span[.='Emparazon’a ek olarak Helium10 da alınmalı mıdır?']")
    public WebElement EmparazonTeyit2;
}
