package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import utilities.Driver;
import utilities.ResuableMethods;

public class Uretici_Toptancı_StepDefinitions06 {

    Members_Page members_page = new Members_Page();

    @Then("uretici ve toptancılar sekmesine tıklar")
    public void uretici_ve_toptancılar_sekmesine_tıklar() {
        ResuableMethods.waitFor(2);
        members_page.ureticiveToptancı.click();
        ResuableMethods.waitFor(2);
    }

    @Then("sayfayı aşagı-yukarı kaydırır tüm saticilari görür")
    public void sayfayı_aşagı_yukarı_kaydırır_tüm_sayfayı_görür() {
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP).perform();


    }

    @Then("iletişim kur butonuna tıklar")
    public void iletişim_kur_butonuna_tıklar() {

        ResuableMethods.waitFor(3);
        members_page.ureticiveToptancıiletisimKur.click();

    }

    @Then("telefon numarası girer ve doğrulama kodu geldiğini teyit eder")
    public void telefon_numarası_girer_ve_doğrulama_kodu_geldiğini_teyit_eder() {

        ResuableMethods.waitFor(2);

        members_page.telefonNumarasıKayıt.sendKeys("5425424241");
        ResuableMethods.waitFor(2);
        members_page.telefonNumarasıKvkkOnay.click();
        ResuableMethods.waitFor(2);
        members_page.telefonNumarasıOnaylaButonu.click();

        ResuableMethods.waitFor(5);

    }


    @Then("geçerli mail bir adresi girer")
    public void geçerliMailBirAdresiGirer() {
        members_page.email.sendKeys("rexvendeneme1@gmail.com" + Keys.ENTER);
        ResuableMethods.waitFor(2);
    }
}
