package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoadMap_Page {

    public RoadMap_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//a[.='Yol Haritası']")
    public WebElement yolHaritasiSekmesi;

@FindBy(xpath = "//li[.='Eğitimlere Başladım']")
    public WebElement egitimlereBasladim;

@FindBy(xpath = "//li[.='Amazon/Etsy Hesabımı Açtım']")
    public WebElement amazonEtsyHesabimiActim;

@FindBy(xpath = "//li[.='İlk Satışımı Yaptım']")
    public WebElement ilkSatisimiYaptim;

@FindBy(xpath = "//li[.='41000$ Satışa Ulaştım']")
    public WebElement binDolaraUlastim;

@FindBy(xpath = "//li[.='510.000$ Satışa Ulaştım']")
    public WebElement onBinDolaraUlastim;

@FindBy(xpath = "//div[.=\"Ürünü Olmayan ve Amazon'da Private Label Satış Yapmak İsteyenler\"]")
    public WebElement urunuOlmayanPrivateLabel;

    @FindBy(xpath = "//div[.=\"Amazon'da Arbitraj / Wholesale Yapmak İsteyenler\"]")
    public WebElement amazondaArbirraj;

    @FindBy(xpath = "//div[@class='mt-8 grid grid-cols-1 gap-10 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-2 xl:grid-cols-3']/div[@class='flex flex-col  shadow-lg shadow-secondary/50 rounded-md m-4']/div[contains(.,\"Ürünü Olan (Üretici, Toptancı veya Trendyol Satıcısı) ve Amazon'da Private Label\")]")
    public WebElement urunuOlanPrivateLabel;

    @FindBy(xpath = "//div[.='Sermayesi Çok Az Olduğu İçin Amazon veya Etsy Uzmanı Olarak Çalışmak isteyenler']")
    public WebElement sermayesiAzAmazonUzmani;

    @FindBy(xpath = "//div[.=\"Ürünü Olmayan ve Etsy'de Satış Yapmak İsteyenler\"]")
    public WebElement urunuOlmayanEtsySatis;

    @FindBy(xpath = "//div[6]/div[@class='px-4 py-8 xl:pt-6 xl:pb-16 sm:py-6 md:py-3 lg:py-4  text-headerPrimary text-center text-sm font-bold border-b-2 border-primary sm:h-auto md:h-24 lg:h-24 xl:h-28']")
    public WebElement urunuOlanEtsySatıs;



}
