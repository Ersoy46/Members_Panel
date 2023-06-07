package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import pages.Producer_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import static utilities.Driver.driver;

public class Uretici_Toptancı_StepDefinitions {

    Members_Page members_page = new Members_Page();
    Producer_Page producer_page = new Producer_Page();
    Actions actions = new Actions(Driver.getDriver());

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

    //TC07
    @Then("urunler butonuna tıklar")
    public void urunleri_incele_butonuna_tıklar() {
        ResuableMethods.waitFor(3);
        members_page.urunlerButonu.click();
        ResuableMethods.waitFor(2);

    }
    @Then("sayfayı aşagı kaydırır tüm ürünleri görür")
    public void sayfayı_aşagı_yukarı_kaydırır_tüm_ürünleri_görür() {

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);

    }
    @Then("iletişim kur butonuna tıklar ve whatsapp'a yönlendirdiğini teyit eder")
    public void iletişim_kur_butonuna_tıklar_ve_whatsapp_a_yönlendirdiğini_teyit_eder() {

        members_page.urunleriInceleIletisimKur.click();
        ResuableMethods.waitFor(3);
        ResuableMethods.switchToWindow("Whatsapp");
        ResuableMethods.waitFor(5);
    }
    //TC08

    @Then("search butonuna eşofman yazar")
    public void search_butonuna_eşofman_yazar() {
        ResuableMethods.waitFor(2);
        producer_page.urunlersearchBox.sendKeys("Eşofman" + Keys.ENTER);
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(4);

    }

    @Then("ara sekmesine tıklar")
    public void ara_sekmesine_tıklar() {

    }

    @Then("Mossi isimli firmanın urunleri incele sekmesine tıklar")
    public void mossi_isimli_firmanın_urunleri_incele_sekmesine_tıklar() {
        producer_page.firmaMossiUrunIncele.click();
        ResuableMethods.waitFor(5);

    }
    @And("sayfa URL'sinin Mossi isimli firmaya ait olduğunu teyit eder")
    public void sayfaURLSininMossiIsimliFirmayaAitOlduğunuTeyitEder() {
        String actuelUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://members.rexven.com/manufacturer/25";

        Assert.assertEquals("SAYFA URL'Sİ DOGRU DEGİL", expectedUrl, actuelUrl);
    }

    @Then("sayfayı aşagı kaydırıp tüm ürünleri görür")
    public void sayfayı_aşagı_kaydırıp_tüm_ürünleri_görür() {


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
    }

    @Then("ikinci sayfaya gecer tüm ürünleri kontrol eder")
    public void ikinci_sayfaya_gecer_tüm_ürünleri_kontrol_eder() {

        producer_page.urunlerSayfaIlerle.click();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
    }

    @Then("ucuncu sayfaya gecer tüm urunleri kontrol eder")
    public void ucuncu_sayfaya_gecer_tüm_urunleri_kontrol_eder() {
        producer_page.urunlerSayfaIlerle.click();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
    }
    //TC09
    @Then("Uretici veya Toptancı ol sekmesine tıklar")
    public void uretici_veya_toptancı_ol_sekmesine_tıklar() {
        ResuableMethods.waitFor(2);
        producer_page.producerUreticiveyaToptancıOl.click();
        ResuableMethods.waitFor(3);
    }

    @Then("acilan sayfada gerekli bilgileri doldurur")
    public void acilan_sayfada_gerekli_bilgileri_doldurur() {
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("123456321365241")).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("123123123")).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("123123123")).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB)

                .sendKeys(faker.numerify("27")).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("542 542 42 42")).perform();
        ResuableMethods.waitFor(5);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @Then("kayıt ol sekmesine tıklar")
    public void kayıt_ol_sekmesine_tıklar() {
        producer_page.producerKvkk.click();
        ResuableMethods.waitFor(2);

        producer_page.producerKayitOl.click();
        ResuableMethods.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='85%';");
        ResuableMethods.waitFor(3);
    }
    @Then("Kullanıcı magaza bilgileri gecersiz. Lütfen kontrol ediniz yazısını görür")
    public void kullanıcı_magaza_bilgileri_gecersiz_lütfen_kontrol_ediniz_yazısını_görür() {
    }
}
