package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class Members_Page {

    public Members_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id="password")
public WebElement password;

    @FindBy(xpath = "//button[@class='flex w-full justify-center rounded-md border border-transparent bg-secondary py-2 px-4 text-sm font-medium text-white shadow-sm hover:bg-secondary focus:outline-none focus:ring-2 focus:ring-secondary focus:ring-offset-2']")
public  WebElement girişyap;

    @FindBy(xpath = "//p[@class='flex justify-center mb-2 ']")
    public  WebElement dashboardprofilbutonu;

    @FindBy(xpath="//input[@id='firstName']")
    public WebElement profilAd;

    @FindBy(xpath="//input[@id='lastName']")
    public WebElement profilSoyad;

    @FindBy(xpath = "//div[@class='flex flex-1 justify-end gap-x-3']/button[@class='rounded-md bg-headerPrimary py-2.5 px-8 text-xs font-semibold text-white shadow-sm hover:bg-secondary focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600 md:text-sm']")
    public  WebElement profilOnayla;

}
