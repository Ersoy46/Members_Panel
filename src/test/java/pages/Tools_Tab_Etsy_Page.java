package pages;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Tools_Tab_Etsy_Page {


    public Tools_Tab_Etsy_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//nav[@class='flex-1 space-y-1 px-2 py-4']/div[@class='space-y-1']//p[@class='w-full flex justify-between items-center ']")
    public WebElement EtsySekmesi;

    @FindBy(xpath = "//a[contains(.,'- Kar Hesaplama')]")
    public WebElement EtsyKarHesaplamaSekmesi;

    @FindBy(xpath = "//select[@id='shopCurrency']")
    public WebElement MagazaParaBirimi;

    @FindBy(xpath = "//input[@id='salePrice']")
    public WebElement EtsySatisFiyati;

    @FindBy(xpath = "//input[@id='shippingIncome']")
    public WebElement EtsyKargoUcreti;

    @FindBy(xpath = "//input[@id='giftBoxIncome']")
    public WebElement EtsyHediyePaketiUcreti;

    @FindBy(xpath = "//input[@id='tax']")
    public WebElement EtsysatisVergisi;

    @FindBy(xpath = "//input[@id='productCost']")
    public WebElement EtsyUrunMaliyeti;

    @FindBy(xpath = "//input[@id='laborCost']")
    public WebElement EtsyIscilikMaliyeti;

    @FindBy(xpath = "//input[@id='packageCost']")
    public WebElement EtsyPaketlemeMaliyeti;

    @FindBy(xpath = "//input[@id='shippingCost']")
    public WebElement EtsyKargomaliyeti;

    @FindBy(xpath = "//input[@id='addCost']")
    public  WebElement EtsyReklamMaliteyi;


    @FindBy(xpath = "//span[@class='mr-2']")
    public WebElement EtsyHesaplaButonu;

    @FindBy(xpath = "//p[contains(.,'500.00')]")
    public WebElement EtsySonucGelir;

    @FindBy(xpath = "//div[@class='flex space-x-1 mt-4']/div[2]//p[@class='mb-1 font-bold text-xs xl:text-sm']")
    public WebElement EtsySonucMaaliyet;

    @FindBy(xpath = "//p[contains(.,'77.72')]")
    public WebElement EtsySonucKesinti;

    @FindBy(xpath = "//p[contains(.,'422.28')]")
    public WebElement EtsySonucKar;

    @FindBy(xpath = "//p[contains(.,'84.46')]")
    public WebElement EtsySonucKarMarji;

    @FindBy(xpath = "//h1[@class='w-full border border-[#FF9E66] text-xl font-bold text-[#F45900] text-center rounded-sm bg-[#FFDFCC] p-1 mb-2']")
    public  WebElement EtsyKesintiTablosu;

    @FindBy(xpath = "//p[.='₺ 4.22']")
    public WebElement EtsySonucListelemeUcreti;

    @FindBy(xpath = "//p[.='₺ 32.5']")
    public WebElement EtsySonucIslemUcretiUrun;

    @FindBy(xpath = "//div[@class='col-span-12 px-2 lg:px-4  lg:col-span-6 xl:col-span-5 bg-white rounded-xl shadow-xl']/div[3]/p[@class='w-full rounded-sm border border-[#FCE3CF] px-2 py-2 shadow-sm text-xs min-[1335px]:text-sm bg-white']")
    public WebElement EtsySonucIslemUcretiKargo;

    @FindBy(xpath = "//div[@class='col-span-12 px-2 lg:px-4  lg:col-span-6 xl:col-span-5 bg-white rounded-xl shadow-xl']/div[4]/p[@class='w-full rounded-sm border border-[#FCE3CF] px-2 py-2 shadow-sm text-xs min-[1335px]:text-sm bg-white']")
    public WebElement EtsySonucIslemUcretiHediyePaketi;

    @FindBy(xpath = "//p[.='₺ 35.5']")
    public WebElement EtsySonucOdemeIslemUcreti;

    @FindBy(xpath = "//p[.='₺ 5.5']")
    public WebElement EtsySonucYasalIslemUcreti;

    @FindBy(xpath = "//div[@class='col-span-12 px-2 lg:px-4  lg:col-span-6 xl:col-span-5 bg-white rounded-xl shadow-xl']/div[7]/p[@class='w-full rounded-sm border border-[#FCE3CF] px-2 py-2 shadow-sm text-xs min-[1335px]:text-sm bg-white']")
    public WebElement EtsySonucOffsiteAdsUcreti;

    @FindBy(xpath = "//div[@class='col-span-12 px-2 lg:px-4  lg:col-span-6 xl:col-span-5 bg-white rounded-xl shadow-xl']/div[8]/p[@class='w-full rounded-sm border border-[#FCE3CF] px-2 py-2 shadow-sm text-xs min-[1335px]:text-sm bg-white']")
    public WebElement EtsySonucKDV;

    @FindBy(xpath = "//div[@class='col-span-12 px-2 lg:px-4  lg:col-span-6 xl:col-span-5 bg-white rounded-xl shadow-xl']/div[9]/p[@class='w-full rounded-sm border border-[#FCE3CF] px-2 py-2 shadow-sm text-xs min-[1335px]:text-sm bg-white']")
    public WebElement EtsySonucParaBirimiDonüsümUcreti;

    @FindBy(xpath = "//div[@class='col-span-12 px-2 lg:px-4  lg:col-span-6 xl:col-span-5 bg-white rounded-xl shadow-xl']/div[10]/p[@class='w-full rounded-sm border border-[#FCE3CF] px-2 py-2 shadow-sm text-xs min-[1335px]:text-sm bg-white']")
    public WebElement EtsySonucSatisVergisi;

@FindBy(xpath = "//input[@class='border-gray-300 text-cardBorder min-[1335px]:text-sm focus:ring-cardBorder']")
    public WebElement vergiNumarasi;

@FindBy(xpath = "//input[@value='12']")
    public WebElement OffsiteAds;

@FindBy(xpath = "//input[@value='free']")
    public WebElement UcretsizListeleme;

//
@FindBy(xpath = "//span[contains(.,'Çok Satan Satıcılar')]")
    public WebElement Etsycoksatansaticilar;

@FindBy(xpath = "//form[@class='grid grid-cols-12 gap-4 p-4']/div[1]//button[@class='relative w-full cursor-default rounded-md bg-white py-2 pl-3 pr-10  text-xs min-[1335px]:text-sm text-left text-gray-900 shadow-sm ring-1 ring-inset ring-cardBorder focus:outline-none ']")
    public WebElement Ulke;

@FindBy(xpath = "//div[@class='flex flex-col items-center']//span[@class='block truncate']")
    public WebElement MagazaAcilisYili;

@FindBy(xpath = "//form[@class='grid grid-cols-12 gap-4 p-4']/div[3]//span[@class='block truncate']")
    public WebElement Kategori;

@FindBy(xpath = "//div[4]//button[@class='relative w-full cursor-default rounded-md bg-white py-2 pl-3 pr-10  text-xs min-[1335px]:text-sm text-left text-gray-900 shadow-sm ring-1 ring-inset ring-cardBorder focus:outline-none ']")
    public WebElement UrunTipi;

@FindBy(xpath = "//input[@id='totalSaleCountMin']")
    public WebElement MinToplamSatis;

    @FindBy(xpath = "//input[@id='totalSaleCountMax']")
    public WebElement MaxToplamSatis;

    @FindBy(xpath = "//input[@id='avgSalesMin']")
    public WebElement MinOrtGunlukSatis;

    @FindBy(xpath = "//input[@id='avgSalesMax']")
    public WebElement MaxOrtGunlukSatis;

    @FindBy(xpath = "//input[@id='reviewCountMin']")
    public WebElement MinYorumSayisi;

    @FindBy(xpath = "//input[@id='reviewCountMax']")
    public WebElement MaxYorumSayisi;;

    @FindBy(xpath = "//input[@id='totalListingCountMin']")
    public WebElement MinToplamUrun;

    @FindBy(xpath = "//input[@id='totalListingCountMax']")
    public WebElement MaxToplamUrun;

@FindBy(xpath = "//button[@class='col-span-12 w-1-2 px-4 py-2 text-sm lg:w-3/12 lg:text-base my-2 mx-auto text-white font-bold rounded-md  bg-headerPrimary    flex items-center justify-center']")
    public WebElement FiltreleriUygulaSekmesi;

}