package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EKitaplar_Page;
import pages.Soru_Cevap_Page;
import utilities.Driver;
import utilities.ResuableMethods;

public class Soru_Cevap_Kutuphane_StepDefinitions {

    Soru_Cevap_Page soru_cevap_page = new Soru_Cevap_Page();

    Actions actions = new Actions(Driver.getDriver());


    @Then("Soru Cevap Kutuphanesi sekmesine tiklar")
    public void soru_cevap_kutuphanesi_sekmesine_tiklar() {
        soru_cevap_page.SoruCevapKutuphanesi.click();
        ResuableMethods.waitFor(4);
    }

    @Then("search kismina Emparazon yazar ara der")
    public void search_kismina_emparazon_yazar_ara_der() {
        soru_cevap_page.SearchButonu.sendKeys("Emparazon");
        ResuableMethods.waitFor(2);
        soru_cevap_page.SearchButonu.click();
        ResuableMethods.waitFor(1);




    }

    @Then("gelen sonucların emparazon ile ilgili oldugunu teyit eder.")
    public void gelen_sonucların_emparazon_ile_ilgili_oldugunu_teyit_eder() {

        String actualEmparazon=soru_cevap_page.EmparazonTeyit.getText();
        String expectedEmparazon="Emparazonda ürün araştırırken fırsat olabilmesi için hacim değerlerinin en az kaç olması gerekir?";
        Assert.assertEquals("Emparazon Arama Sonucu Gorunmuyor", expectedEmparazon, actualEmparazon);
        System.out.println(soru_cevap_page.EmparazonTeyit.getText());
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);

        String actualEmparazon2=soru_cevap_page.EmparazonTeyit2.getText();
        String expectedEmparazon2="Emparazon’a ek olarak Helium10 da alınmalı mıdır?";
        Assert.assertEquals("Emparazon Teyit Yazisi Gorunmuyor",expectedEmparazon2,actualEmparazon2);
        System.out.println(soru_cevap_page.EmparazonTeyit2.getText());
        ResuableMethods.waitFor(1);
    }

    //TC54
    @And("sayfayi asagi dogru indirir")
    public void sayfayiAsagiDogruIndirir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(1);

    }

    @Then("ileri tusuna tiklar diger sayfalarin dogru acildigini teyit eder")
    public void ileriTusunaTiklarDigerSayfalarinDogruAcildiginiTeyitEder() {
        soru_cevap_page.ileriTusu.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        soru_cevap_page.ileriTusu.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        soru_cevap_page.ileriTusu.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        soru_cevap_page.ileriTusu.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        soru_cevap_page.ileriTusu.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
    }
}
