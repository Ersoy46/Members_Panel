package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Register_Login_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import java.time.Duration;

public class Register_Login_StepDefinitions {

    Register_Login_Page register_login_page = new Register_Login_Page();

    Actions actions = new Actions(Driver.getDriver());


    //TC56
    @Then("gecersiz password girer")
    public void gecersiz_password_girer() {
        register_login_page.password.sendKeys("123654789" + Keys.ENTER);
        ResuableMethods.waitFor(4);
    }

    @Then("yanlis sifre ve mail yazisini görür")
    public void yanlis_sifre_ve_mail_yazisini_görür() {

        ResuableMethods.waitFor(2);
    }

    //TC57
    @Then("gecersiz mail adresi girer")
    public void gecersizMailAdresiGirer() {
        register_login_page.email.sendKeys("rexvendeneme@gmail.c" + Keys.ENTER);
        ResuableMethods.waitFor(2);
    }

    @Then("yanlis sifre ve mail yazisıni görür")
    public void yanlisSifreVeMailYazisıniGörür() {
        String actualYanlisSifre1 = register_login_page.yanlisSifre1.getText();
        String expectedYanlisSifre1 = "Incorrect email or password";
        Assert.assertEquals("Yanlis şifre ve mail yazisi görünmüyor", expectedYanlisSifre1, actualYanlisSifre1);
        Assert.assertTrue(register_login_page.yanlisSifre1.isDisplayed());
        System.out.println(register_login_page.yanlisSifre1.getText());
        ResuableMethods.waitFor(2);
    }


    @Then("yanlis sifre ve mail yazısini görür")
    public void yanlisSifreVeMailYazısiniGörür() {

    }

    @Then("kayit ol sekmesine tiklar")
    public void kayitOlSekmesineTiklar() {

        register_login_page.KayitOlButonu.click();
    }

    @And("gelen sayfada gerekli bilgileri doldurur")
    public void gelenSayfadaGerekliBilgileriDoldurur() {
        register_login_page.KayitOlAd.sendKeys("Rexven Test");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlSoyad.sendKeys("Deneme");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlEmail.sendKeys("rexvendeneme@gmail.com");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlPasword.sendKeys("123654789");
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        register_login_page.KayitOlPaswordTekrar.sendKeys("123654789");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlKvkk.click();
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlKayit.click();
        ResuableMethods.waitFor(3);

    }

    @Then("bu email kullanılyor yazisini görür")
    public void buEmailKullanılyorYazisiniGörür() {
        String actualEmailKullaniliyor = register_login_page.emailKullaniliyor.getText();
        String expectedEmailKullaniliyor = "Bu email kullanılıyor!";
        Assert.assertEquals("Bu email kullanliyor yazisi görünmüyor", expectedEmailKullaniliyor, actualEmailKullaniliyor);
        Assert.assertTrue(register_login_page.emailKullaniliyor.isDisplayed());
        System.out.println(register_login_page.emailKullaniliyor.getText());
        ResuableMethods.waitFor(2);
    }

    //TC60
    @Then("gelen sayfada gerekli bilgileri eksik doldurur")
    public void gelen_sayfada_gerekli_bilgileri_eksik_doldurur() {
        register_login_page.KayitOlAd.sendKeys("Rexven Test");
        ResuableMethods.waitFor(1);
        //    register_login_page.KayitOlSoyad.sendKeys("Deneme");
        //  ResuableMethods.waitFor(1);

        register_login_page.KayitOlEmail.sendKeys("rexvendeneme@gmail.com");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlPasword.sendKeys("123654789");
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        register_login_page.KayitOlPaswordTekrar.sendKeys("123654789");
        ResuableMethods.waitFor(1);
        //   register_login_page.KayitOlKvkk.click();
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlKayit.click();
        ResuableMethods.waitFor(1);

    }

    @Then("boş alan bırakılamaz uyari yazisini görür")
    public void boş_alan_bırakılamaz_uyari_yazisini_görür() {
        Assert.assertTrue(register_login_page.KayitOlSoyadBos.isDisplayed());


    }

    @Then("kvkk butonunu işaretlemez ve uyarı yazisini görür")
    public void kvkk_butonunu_işaretlemez_ve_uyarı_yazisini_görür() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        Assert.assertTrue(register_login_page.KayitOlKvkkBos.isDisplayed());
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(4);
    }

    //TC61
    @Then("gelen sayfada gerekli  bilgileri doldurur")
    public void gelen_sayfada_gerekli_bilgileri_doldurur() {
        register_login_page.KayitOlAd.sendKeys("Rexven Test");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlSoyad.sendKeys("Deneme");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlEmail.sendKeys("rexvendeneme@gmail.com");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlPasword.sendKeys("123654789");
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        register_login_page.KayitOlPaswordTekrar.sendKeys("1236547412");
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlKvkk.click();
        ResuableMethods.waitFor(1);
        register_login_page.KayitOlKayit.click();
        ResuableMethods.waitFor(3);
    }

    @Then("şifre ve şifre tekrari birbiri ile farklı girer")
    public void şifre_ve_şifre_tekrari_birbiri_ile_farklı_girer() {

    }

    @Then("Geçersiz giriş: Parola alanları eşleşmiyor yazisini görür")
    public void geçersiz_giriş_parola_alanları_eşleşmiyor_yazisini_görür() {

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));  // 10 saniye boyunca bekleyin
            WebElement element = wait.until(ExpectedConditions.visibilityOf(register_login_page.KayitOlSifreTekrariYanlis));

            Assert.assertTrue("Mesaj görünmüyor", element.isDisplayed());
            Assert.assertEquals("Mesaj doğru değil", "Invalid input: Password fields don't match!", element.getText());
            System.out.println(register_login_page.KayitOlSifreTekrariYanlis.getText());
    }



    }



