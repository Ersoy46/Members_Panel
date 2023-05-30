package stepdefinitions;

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

public class Uretici_Toptancı_StepDefinitions08 {

    Producer_Page producer_page = new Producer_Page();
    Actions actions = new Actions(Driver.getDriver());

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
}
