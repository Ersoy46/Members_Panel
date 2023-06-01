package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Service_Providers_Page {

    public Service_Providers_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[.='Hizmet Sağlayıcılar']")
    public WebElement hizmetsaglayıcılar;

    @FindBy(xpath = "//div[6]//span[@class='flex']")
    public WebElement hizmetsaglayiciClemta;


    @FindBy(xpath = "//div[7]//span[@class='flex']")
    public WebElement HizmetsaglayiciVidyoner;


    @FindBy(xpath = "//div[8]//span[@class='flex']")
    public WebElement HizmetsaglayiciShıppıngGarage;

    @FindBy(xpath = "//button[@class='mt-3  text-white justify-center rounded-md bg-primary px-8 py-2 text-sm font-semibold  shadow-sm ring-1 ring-inset ring-gray-300 hover:bg-gray-50 hover:text-primary sm:col-start-1 sm:mt-0']")
    public WebElement hizmetsaglayiciTamamButonu;
}
