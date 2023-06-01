package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Consultancy_Page {

    public Consultancy_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Danışmanlık']")
    public WebElement danismanlıkSekmesi;

    @FindBy(xpath = "(//button[@class='text-white font-medium flex items-center w-full justify-center text-sm 2xl:text-base my-2 mb-4'])[1]")
    public WebElement danismanlıkAmazonAvantajlariGoruntule;

    @FindBy(xpath = "//button[@class='text-description font-medium flex items-center w-full justify-center text-sm 2xl:text-base my-2 mb-4']")
    public WebElement danismanlıkRexvenAvantajlariGoruntule;

    @FindBy(xpath = "(//button[@class='text-white font-medium flex items-center w-full justify-center text-sm 2xl:text-base my-2 mb-4'])[2]")
    public WebElement danismanlıkETSYAvantajlariGoruntule;

    @FindBy(xpath = "(//a[@class='bg-rexRed text-white rounded-lg block w-full text-center font-medium py-2'])[1]")
    public WebElement danismanlıkAmazonIletisimKur;

    @FindBy(xpath = "//a[@class='bg-headingPrimary text-white rounded-lg block w-full text-center font-medium py-2']")
    public WebElement danismanlıkRexvenIletisimKur;

    @FindBy(xpath = "(//a[@class='bg-rexRed text-white rounded-lg block w-full text-center font-medium py-2'])[2]")
    public WebElement danismanlıkETSYIletisimKur;

}