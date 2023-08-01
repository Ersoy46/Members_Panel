package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Integration_Page {

    public Integration_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".bg-secondary")
    public WebElement EntegrasyonSekmesi;

    @FindBy(xpath = "//input[@id='sellerId']")
    public WebElement SaticiID;

    @FindBy(xpath = "//input[@id='apiKey']")
    public WebElement ApiKey;

    @FindBy(xpath = "//input[@id='apiSecret']")
    public WebElement ApiSecret;

    @FindBy(xpath = "//button[@class='mt-4 rounded-md bg-headerPrimary py-2.5 px-8 text-xs font-semibold text-white shadow-sm hover:bg-secondary focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600 md:text-sm']")
    public WebElement KayitOl;
}
