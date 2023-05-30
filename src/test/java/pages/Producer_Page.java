package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Producer_Page {

    public Producer_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "default-search")
    public WebElement urunlersearchBox;

    @FindBy(xpath = "//button[@class='text-white absolute right-0 bottom-0 bg-headerPrimary rounded-r-md font-medium text-sm px-4 py-2 md:py-2.5']")
    public WebElement searcharamatusu;


    @FindBy(xpath = "//a[@href='/manufacturer/25']/button[@class='w-full']")
    public WebElement firmaMossiUrunIncele;

    @FindBy(xpath = "//button[@class='relative inline-flex items-center rounded-r-md px-2 py-2 text-gray-400 ring-1 ring-inset ring-gray-300 hover:bg-gray-50 focus:z-20 focus:outline-offset-0']")
    public WebElement urunlerSayfaIlerle;

    @FindBy(xpath = "//button[@class='text-sm lg:text-sm w-full border-2 py-2  xl:px-4 text-white bg-headerPrimary border-headerPrimary rounded-md']")
    public WebElement producerUreticiveyaToptancıOl;

    @FindBy(xpath = "//input[@id='isKvkkAccepted']")
    public WebElement producerKvkk;

    @FindBy(xpath = "//button[@class='mt-1 rounded-md bg-headerPrimary py-2.5 px-8 text-xs font-semibold text-white shadow-sm hover:bg-secondary focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600 md:text-sm']")
    public WebElement producerKayitOl;
}
