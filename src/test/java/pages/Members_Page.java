package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
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

    @FindBy(xpath = "//a[@class='bg-white rounded-md shadow-md w-full pt-6 ']")
    public WebElement dashboardentegrasyon;

    @FindBy(xpath = "//a[@class='bg-white rounded-md shadow-md w-full min-h-full pt-6'][1]")
    public WebElement dashboardpaketbilgisi;

    @FindBy(xpath = "//button[@id='updateBtn']")
    public WebElement faturaBilgisi;

    @FindBy(xpath = "//a[@class='bg-white rounded-md shadow-md w-full min-h-full pt-6'][2]")
    public WebElement dashboarddiscord;

    @FindBy(xpath = "//button[@class='px-8 bg-headerPrimary py-2 text-white rounded-md shadow-md']")
    public WebElement dashboardindirimlerikesfet;

    @FindBy(xpath = "//a[@href='/manufacturers-and-wholesalers']")
    public WebElement ureticiveToptancı;


    @FindBy(xpath = "//a[@href='https://wa.me/905066294010?text=Merhaba,%20ben%20size%20Rexven%20arac%C4%B1l%C4%B1%C4%9F%C4%B1yla%20ula%C5%9Ft%C4%B1m']")
    public WebElement ureticiveToptancıiletisimKur;

    @FindBy(xpath = "//input[@class='PhoneInputInput']")
    public WebElement telefonNumarasıKayıt;

    @FindBy(xpath = "//input[@id='contract']")
    public WebElement telefonNumarasıKvkkOnay;

    @FindBy(xpath = "//button[@class='flex flex-row items-center justify-center text-center w-full border rounded-xl outline-none py-3 undefined  bg-headerPrimary border-none text-white text-sm shadow-sm']")
    public WebElement telefonNumarasıOnaylaButonu;

    @FindBy(xpath = "//button[@class='w-[50%] border-2 py-2 border-headerPrimary rounded-r-md']")
    public WebElement urunlerButonu;

    @FindBy(xpath = "//div[22]//button[@class='w-full']")
    public WebElement urunleriInceleIletisimKur;









}
