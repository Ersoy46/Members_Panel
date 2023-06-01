package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Service_Providers_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import static utilities.Driver.driver;

public class Service_Providers_StepDefinitions {

Service_Providers_Page service_providers_page=new Service_Providers_Page();
    Actions actions=new Actions(Driver.getDriver());


    @Then("hizmet saglayıcılar sekmesine tıklar")
    public void hizmet_saglayıcılar_sekmesine_tıklar() {
service_providers_page.hizmetsaglayıcılar.click();
        ResuableMethods.waitFor(3);

    }
    @Then("acılan sayfayı asagı-yukarı kaydırır tüm sayfayi görür")
    public void acılan_sayfayı_asagı_yukarı_kaydırır_tüm_sayfayi_görür() {


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);


        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);


    }
    @Then("clemta isimli sirketin altında bulunan indirim al butonuna basar ve tamam der")
    public void clemta_isimli_sirketin_altında_bulunan_indirim_al_butonuna_basar_ve_tamam_der() {

        service_providers_page.hizmetsaglayiciClemta.click();
        ResuableMethods.waitFor(2);

       actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        service_providers_page.hizmetsaglayiciTamamButonu.click();
        ResuableMethods.waitFor(2);

    }
    @Then("vidyoner isimli sirketin altında bulunan indirim al butonuna basar ve tamam der")
    public void vidyoner_isimli_sirketin_altında_bulunan_indirim_al_butonuna_basar_ve_tamam_der() {

        service_providers_page.HizmetsaglayiciVidyoner.click();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        service_providers_page.hizmetsaglayiciTamamButonu.click();
        ResuableMethods.waitFor(2);

    }
    @Then("shıppıng garage isimli sirketin altında bulunan indirim al butonuna basar ve tamam der")
    public void parkpalet_isimli_sirketin_altında_bulunan_indirim_al_butonuna_basar_ve_tamam_der() {

        service_providers_page.HizmetsaglayiciShıppıngGarage.click();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        service_providers_page.hizmetsaglayiciTamamButonu.click();
        ResuableMethods.waitFor(2);

    }
}
