package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Register_Login_Page {

    public Register_Login_Page
            () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Yanlış şifre ve mail!']")
    public WebElement yanlisSifreMail;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Incorrect email or password']")
    public WebElement yanlisSifre1;

    @FindBy(xpath = "//a[contains(.,'Kayıt Ol')]")
    public WebElement KayitOlButonu;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement KayitOlAd;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement KayitOlSoyad;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement KayitOlEmail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement KayitOlPasword;

    @FindBy(xpath = "//input[@id='passwordConfirm']")
    public WebElement KayitOlPaswordTekrar;

    @FindBy(xpath = "//input[@id='isKvkkAccepted']")
    public WebElement KayitOlKvkk;

    @FindBy(xpath = "//button[@class='flex w-full justify-center rounded-md border border-transparent bg-secondary py-2 px-4 text-sm font-medium text-white shadow-sm hover:bg-secondary focus:outline-none focus:ring-2 focus:ring-secondary focus:ring-offset-2']")
    public WebElement KayitOlKayit;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Bu email kullanılıyor!']")
    public WebElement emailKullaniliyor;

@FindBy(xpath = "//h3[.='Bu alan boş bırakılamaz']")
    public WebElement KayitOlSoyadBos;

@FindBy(xpath = "//h3[.='Lütfen üyelik sözleşmesini kabul ediniz']")
    public WebElement KayitOlKvkkBos;

@FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.=\"Invalid input: Password fields don't match!\"]")
    public WebElement KayitOlSifreTekrariYanlis;

}
