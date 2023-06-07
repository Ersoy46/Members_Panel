package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EKitaplar_Page {

    public EKitaplar_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//a[.='E-Kitaplar']")
    public WebElement EKitaplarSekmesi;

    @FindBy(xpath = "//h3[.=\"Amazon'da Yol Haritası E-Kitabı\"]")
    public WebElement AmazondaYolHaritasiEKitabi;

    @FindBy(xpath = "//h3[.='Amazon Eğitimi E-Kitabı']")
    public WebElement AmazonEgitimiEKitabi;

    @FindBy(xpath = "//h3[.=\"A'dan Z'ye Trendyol Eğitimi E-Kitabı\"]")
    public WebElement AdanZyeTrendyolEkitabi;

    @FindBy(xpath = "//h3[.='Etsy Hesap Kuralları Rehberi']")
    public WebElement EtsyHesapKurallariRehberi;

    @FindBy(xpath = "//div[@class='bg-white p-6 grid  gap-6 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-2 xl:grid-cols-3 rounded-2xl']/div[1]//span[@class='flex']")
    public WebElement EkitapIndir1;

    @FindBy(xpath = "//div[@class='bg-white p-6 grid  gap-6 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-2 xl:grid-cols-3 rounded-2xl']/div[2]//span[@class='flex']")
    public WebElement EkitapIndir2;

    @FindBy(xpath = "//div[@class='bg-white p-6 grid  gap-6 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-2 xl:grid-cols-3 rounded-2xl']/div[3]//span[@class='flex']")
    public WebElement EkitapIndir3;

    @FindBy(xpath = "//div[@class='bg-white p-6 grid  gap-6 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-2 xl:grid-cols-3 rounded-2xl']/div[4]//span[@class='flex']")
    public WebElement EkitapIndir4;


}
