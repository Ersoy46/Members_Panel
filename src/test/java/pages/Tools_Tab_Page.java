package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Tools_Tab_Page {

    public Tools_Tab_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[contains(.,'Trendyol')]")
    public WebElement trendyolSekmesi;

    @FindBy(xpath = "//a[.='-Kar Hesaplama']")
    public WebElement trendyolKarHesaplamaSekmesi;

    @FindBy(xpath = "//input[@id='commissionRate']")
    public WebElement trendyolKomisyonOrani;

    @FindBy(xpath = "//input[@id='sellingPrice']")
    public WebElement trendyolsatisFiyati ;

    @FindBy(xpath = "//input[@id='shippingIncome']")
    public WebElement trendyolkargoUcreti;

    @FindBy(xpath = "//input[@id='costOfPurchase']")
    public WebElement trendyolurunMaliyeti;

    @FindBy(xpath = "//input[@id='laborCost']")
    public WebElement trendyolislilikMaliyeti;

    @FindBy(xpath = "//input[@id='packageCost']")
    public WebElement trendyolpaketlemeMaliyeti;

    @FindBy(xpath = "//input[@id='shippingCost']")
    public WebElement trendyolkargoMaliyeti;

    @FindBy(xpath = "//input[@id='advertisingCost']")
    public WebElement trendyolreklamMaliyeti;

    @FindBy(xpath = "//button[@class='mt-2 mb-2 text-white font-bold rounded-md  bg-headerPrimary w-full py-2.5 px-2 flex items-center justify-center']")
    public WebElement trendyolHesaplaButonu;

    @FindBy(xpath = "(//div[@class='mb-1 font-bold'])[1]")
    public WebElement trendyolHesaplaSonucGelir;

    @FindBy(xpath = "(//div[@class='mb-1 font-bold'])[2]")
    public WebElement trendyolHesaplaSonucMaliyet;

    @FindBy(xpath = "(//div[@class='mb-1 font-bold'])[3]")
    public WebElement trendyolHesaplaSonucKesinti;

    @FindBy(xpath = "(//div[@class='mb-1 font-bold'])[4]")
    public WebElement trendyolHesaplaSonucKar;

    @FindBy(xpath = "(//div[@class='mb-1 font-bold'])[5]")
    public WebElement trendyolHesaplaSonucKarMarjı;

    @FindBy(xpath = "//div[@class='mt-1 mb-4 flex flex-col gap-y-[2px] ']")
    public WebElement sonucKesintiTablosu;





}
