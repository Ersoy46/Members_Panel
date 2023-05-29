package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

import java.security.Key;

import static utilities.Driver.driver;

public class Dashboard01StepDefinitions {

    Members_Page members_page = new Members_Page();

    @Given("kullanıcı members.rexven.com sayfasına gider")
    public void kullanıcı_members_rexven_com_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("Members.rexvenURL"));


    }

    @Then("geçerli mail adresi girer")
    public void geçerli_mail_adresi_girer() {
        members_page.email.sendKeys("rexvendeneme@gmail.com" + Keys.ENTER);
        ResuableMethods.waitFor(2);


    }

    @Then("geçerli password girer")
    public void geçerli_password_girer() {
        members_page.password.sendKeys("rexven30194" + Keys.ENTER);
        ResuableMethods.waitFor(2);

    }

    @Then("Giriş yap sekmesine tıklar")
    public void giriş_yap_sekmesine_tıklar() {
        members_page.girişyap.click();

    }

    @Then("dashboard sayfasını aşagı-yukarı kaydırır tüm sayfayı görür")
    public void dashboard_sayfasını_aşagı_kaydırır_tüm_sayfayı_görür() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);
    }

    @Then("dashboard da bulunan profil butonuna tıklar")
    public void dashboard_da_bulunan_profil_butonuna_tıklar() {
        members_page.dashboardprofilbutonu.click();
        ResuableMethods.waitFor(2);

    }

    @When("Ad Soyad bölümüne gerekli bilgileri girer")
    public void ad_soyad_bölümüne_gerekli_bilgileri_girer() {
        members_page.profilAd.clear();
        ResuableMethods.waitFor(2);
        members_page.profilAd.sendKeys("Members" + Keys.ENTER);

        members_page.profilSoyad.clear();
        ResuableMethods.waitFor(2);
        members_page.profilSoyad.sendKeys("Test Deneme" + Keys.ENTER);


    }

    @Then("Onayla der ve sayfayı kapatır.")
    public void onayla_der_ve_sayfayı_kapatır() {
        members_page.profilOnayla.click();


    }
}
