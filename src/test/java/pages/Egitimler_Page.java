package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Egitimler_Page {

    public Egitimler_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Eğitimler']")
    public WebElement EgitimlerSekmesi;

    @FindBy(xpath = "//h3[.='Ücretsiz Amazon Eğitimi']")
    public WebElement UcretsizAmazonEgtimi;

    @FindBy(xpath = "//h3[.='Ücretsiz Etsy Eğitimi']")
    public WebElement UcretsizEtsyEgitimi;

    @FindBy(xpath = "//h3[.='Amazon Master Eğitimi']")
    public WebElement AmazonMasterEgitimi;

    @FindBy(xpath = "//h3[.='Ücretsiz İkas Eğitimi']")
    public WebElement UcretsizIkasEgitimi;

    @FindBy(xpath = "//h3[.='Amazon Uzmanı Eğitimi']")
    public WebElement AmazonUzmaniEgitimi;

    @FindBy(xpath = "//h3[.='Etsy Master Eğitimi']")
    public WebElement EtsyMasterEgitimi;

    @FindBy(xpath = "//h3[.='Trendyol Master Eğitimi']")
    public WebElement TrendyolMasterEgitimi;

    @FindBy(xpath = "//h3[.='Canli Eğitimi Kayıtları']")
    public WebElement CanliEgitimKayitlari;

    @FindBy(xpath = "//a[@href='/courses/1/Ücretsiz Amazon Eğitimi']//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement AmazonBaslangicEgitimi;

    @FindBy(xpath = "//a[@href='/courses/2/Ücretsiz Etsy Eğitimi']//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement EtsyBaslangicEgitimi;

    @FindBy(xpath = "//a[@href='/courses/3/Ücretsiz İkas Eğitimi']//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement ikasBaslangicEgitimi;

    @FindBy(xpath = "//div[@class='bg-white p-2 md:p-6 grid  gap-6 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-2 xl:grid-cols-3 rounded-2xl']/div[1]//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement AmazonMasterEgitimiKilitli;

    @FindBy(xpath = "//div[@class='bg-white p-2 md:p-6 grid  gap-6 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-2 xl:grid-cols-3 rounded-2xl']/div[2]//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement AmazonUzmaniEgitimiKilitli;

    @FindBy(xpath = "//div[@class='bg-white p-2 md:p-6 grid  gap-6 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-2 xl:grid-cols-3 rounded-2xl']/div[3]//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement EtsyMasterEgitimiKilitli;

    @FindBy(xpath = "//a[@href='/courses/4/Amazon Master Eğitimi']//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement AmazonMasterUcretli;

    @FindBy(xpath = "//a[@href='/courses/5/Amazon Uzmanı Eğitimi']//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement AmazonUzmaniUcretli;

    @FindBy(xpath = "(//div[@class='absolute  z-[5] top-[45%] left-[46.5%] '])[7]")
    public WebElement TrendyolMasterUcretli;

    @FindBy(xpath = "//a[@href='/courses/8/Canli Eğitimi Kayıtları']//div[@class='absolute  z-[5] top-[45%] left-[46.5%] ']")
    public WebElement CanliEgitimKayitlariUcretli;
}
