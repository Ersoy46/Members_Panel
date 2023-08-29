package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Tools_Tab_Etsy_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import javax.swing.text.html.Option;

import static utilities.Driver.driver;

public class Tools_Tab_Etsy_StepDefinitions {


    Tools_Tab_Etsy_Page tools_tab_etsy_page = new Tools_Tab_Etsy_Page();

    Actions actions = new Actions(Driver.getDriver());


    @Then("araclar sekmesinde bulunan Etsy sekmesini tiklar")
    public void araclar_sekmesinde_bulunan_etsy_sekmesini_tiklar() {

        tools_tab_etsy_page.EtsySekmesi.click();
        ResuableMethods.waitFor(2);

    }

    @Then("Etsy kar hesaplama secenegini tiklar")
    public void etsy_kar_hesaplama_secenegini_tiklar() {
        tools_tab_etsy_page.EtsyKarHesaplamaSekmesi.click();
        ResuableMethods.waitFor(2);

    }

    @Then("acilan sayfada sadece Turkish Lira secer, satis fiyatını yazar  ve hesapla der")
    public void acilan_sayfada_sadece_satis_fiyatını_yazar_ve_hesapla_der() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);


        Select select = new Select(tools_tab_etsy_page.MagazaParaBirimi);
        select.selectByValue("TRY");
        ResuableMethods.waitFor(3);


        tools_tab_etsy_page.EtsySatisFiyati.clear();
        ResuableMethods.waitFor(2);
        tools_tab_etsy_page.EtsySatisFiyati.sendKeys("500");
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        tools_tab_etsy_page.EtsyHesaplaButonu.click();
        ResuableMethods.waitFor(7);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='75%';");


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(8);


    }

    @Then("gelen sonuclarin dogrulamasinı yapar")
    public void gelen_sonuclarin_dogrulamasinı_yapar() {

        //
        String actuelGelir = tools_tab_etsy_page.EtsySonucGelir.getText();
        String expectedGelir = "500.00";
        Assert.assertEquals("GELİR SONUCU UYUSMUYOR", expectedGelir, actuelGelir);
        System.out.println(tools_tab_etsy_page.EtsySonucGelir.getText());

        //
        String actualMaliyet = tools_tab_etsy_page.EtsySonucMaaliyet.getText();
        String expectedMaliyet = "0.00";
        Assert.assertEquals("MAALİYET SONUCU UYUSMUYOR", expectedMaliyet, actualMaliyet);
        System.out.println(tools_tab_etsy_page.EtsySonucMaaliyet.getText());

        //
        String actualKesinti = tools_tab_etsy_page.EtsySonucKesinti.getText();
        String expectedKesinti = "78.75";
        Assert.assertEquals("KESİNTİ SONUCU UYUSMUYOR", expectedKesinti, actualKesinti);
        System.out.println(tools_tab_etsy_page.EtsySonucKesinti.getText());

        //
        String actualKar = tools_tab_etsy_page.EtsySonucKar.getText();
        String expectedKar = "421.25";
        Assert.assertEquals("KAR SONUCU UYUSMUYOR", expectedKar, actualKar);
        System.out.println(tools_tab_etsy_page.EtsySonucKar.getText());

        //
        String actualKarMarji = tools_tab_etsy_page.EtsySonucKarMarji.getText();
        String expectedKarMarji = "84.25";
        Assert.assertEquals("KAR MARJI SONUCU UYUSMUYOR", expectedKarMarji, actualKarMarji);
        System.out.println(tools_tab_etsy_page.EtsySonucKarMarji.getText());


        System.out.println(tools_tab_etsy_page.EtsyKesintiTablosu.getText());

        String actualListelemeUcreti = tools_tab_etsy_page.EtsySonucListelemeUcreti.getText();
        String expectedListelemeUcreti = "₺ 5.25";
        Assert.assertEquals("LİSTELEME UCRETİ UYUSMUYOR", expectedListelemeUcreti, actualListelemeUcreti);
        System.out.println(tools_tab_etsy_page.EtsySonucListelemeUcreti.getText());

        //
        String actualIslemUcretiUrun = tools_tab_etsy_page.EtsySonucIslemUcretiUrun.getText();
        String expectedIslemUcretiUrun = "₺ 32.5";
        Assert.assertEquals("ISLEM UCRETİ (URUN) UYUSMUYOR", expectedIslemUcretiUrun, actualIslemUcretiUrun);
        System.out.println(tools_tab_etsy_page.EtsySonucIslemUcretiUrun.getText());

        //
        String actualIslemUcretiKargo = tools_tab_etsy_page.EtsySonucIslemUcretiKargo.getText();
        String expectedIslemUcretiKargo = "₺ 0";
        Assert.assertEquals("KARGO ISLEM UCRETİ UYUSMUYOR", expectedIslemUcretiKargo, actualIslemUcretiKargo);
        System.out.println(tools_tab_etsy_page.EtsySonucIslemUcretiKargo.getText());

        //
        String actualIslemUcretiHediyePaketi = tools_tab_etsy_page.EtsySonucIslemUcretiHediyePaketi.getText();
        String expectedIslemUcretiHediyePaketi = "₺ 0";
        Assert.assertEquals("HEDİYE PAKETİ ISLEM UCRETİ UYUSMUYOR", expectedIslemUcretiHediyePaketi, actualIslemUcretiHediyePaketi);
        System.out.println(tools_tab_etsy_page.EtsySonucIslemUcretiHediyePaketi.getText());

        System.out.println(tools_tab_etsy_page.EtsySonucOdemeIslemUcreti.getText());
        System.out.println(tools_tab_etsy_page.EtsySonucYasalIslemUcreti.getText());
        System.out.println(tools_tab_etsy_page.EtsySonucOffsiteAdsUcreti.getText());
        System.out.println(tools_tab_etsy_page.EtsySonucKDV.getText());
        System.out.println(tools_tab_etsy_page.EtsySonucParaBirimiDonüsümUcreti.getText());
        System.out.println(tools_tab_etsy_page.EtsySonucSatisVergisi.getText());

    }

    @Then("magaza para birimi olarak Turkish Lira secer")
    public void magaza_para_birimi_olarak_turkish_lira_secer() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        Select select = new Select(tools_tab_etsy_page.MagazaParaBirimi);

        select.selectByValue("TRY");

        ResuableMethods.waitFor(2);
    }

    @Then("vergi numarasi yok")
    public void vergi_numarasi_yok() {

        // actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.vergiNumarasi.click();


    }

    @Then("Offsite Ads  %{int}")
    public void offsite_ads(Integer int1) {

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_etsy_page.OffsiteAds.click();
    }

    @Then("ucretsiz listeleme var olarak secer")
    public void ucretsiz_listeleme_var_olarak_secer() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.UcretsizListeleme.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);


    }

    @Then("gerekli tüm alanlara satis bilgileri girer")
    public void gerekli_tüm_alanlara_satis_bilgileri_girer() {

        tools_tab_etsy_page.EtsySatisFiyati.clear();
        tools_tab_etsy_page.EtsySatisFiyati.sendKeys("600");
        actions.sendKeys(Keys.TAB).perform();

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_etsy_page.EtsyKargoUcreti.sendKeys("50");
        actions.sendKeys(Keys.TAB).perform();

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_etsy_page.EtsyHediyePaketiUcreti.sendKeys("10");
        actions.sendKeys(Keys.TAB).perform();

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        tools_tab_etsy_page.EtsysatisVergisi.sendKeys("40");

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.EtsyUrunMaliyeti.sendKeys("150");

        actions.sendKeys(Keys.TAB).perform();

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        tools_tab_etsy_page.EtsyIscilikMaliyeti.sendKeys("50");

        actions.sendKeys(Keys.TAB).perform();

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_etsy_page.EtsyPaketlemeMaliyeti.sendKeys("10");

        actions.sendKeys(Keys.TAB).perform();

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_etsy_page.EtsyKargomaliyeti.sendKeys("30");

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_etsy_page.EtsyReklamMaliteyi.sendKeys("10");

        ResuableMethods.waitFor(2);
    }

    @Then("hesapla butonuna tiklar")
    public void hesapla_butonuna_tiklar() {
        tools_tab_etsy_page.EtsyHesaplaButonu.click();
        ResuableMethods.waitFor(7);

    }

    @Then("gelen sonuclarin dogrulamsını yapar")
    public void gelen_sonuclarin_dogrulamsını_yapar() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(7);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='75%';");

        WebElement SonucGelirSekmesi = driver.findElement(By.xpath("//div[@class='flex space-x-1 mt-4']"));
        System.out.println(SonucGelirSekmesi.getText());
    }
//tc18
    @Then("cok satan saticilar sekmesine tiklar")
    public void cok_satan_saticilar_sekmesine_tiklar() {

        tools_tab_etsy_page.Etsycoksatansaticilar.click();
    }

    @Then("acilan sayfada gerekli bilgileri  doldurur")
    public void acilan_sayfada_gerekli_bilgileri_doldurur() {

        ResuableMethods.waitFor(2);
        tools_tab_etsy_page.Ulke.click();
        ResuableMethods.waitFor(1);
        WebElement hepsi = driver.findElement(By.xpath("//span[@class='font-semibold block truncate']"));
        hepsi.click();
        ResuableMethods.waitFor(1);


        //
        tools_tab_etsy_page.MagazaAcilisYili.click();
        ResuableMethods.waitFor(1);
        WebElement hepsi1 = driver.findElement(By.xpath("//span[@class='font-semibold block truncate']"));
        hepsi1.click();
        ResuableMethods.waitFor(2);

        //
        tools_tab_etsy_page.Kategori.click();
        ResuableMethods.waitFor(1);
        WebElement hepsi2 = driver.findElement(By.xpath("//span[@class='font-semibold block truncate']"));
        hepsi2.click();
        ResuableMethods.waitFor(2);

        //
        tools_tab_etsy_page.UrunTipi.click();
        ResuableMethods.waitFor(1);
        WebElement hepsi3 = driver.findElement(By.xpath("//span[@class='font-semibold block truncate']"));
        hepsi3.click();
        ResuableMethods.waitFor(2);

        //
        tools_tab_etsy_page.MinToplamSatis.sendKeys("50");
        ResuableMethods.waitFor(1);
        tools_tab_etsy_page.MaxToplamSatis.sendKeys("5000");
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.MinOrtGunlukSatis.sendKeys("10");
        ResuableMethods.waitFor(1);
        tools_tab_etsy_page.MaxOrtGunlukSatis.sendKeys("200");
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.MinYorumSayisi.sendKeys("30");
        ResuableMethods.waitFor(1);
        tools_tab_etsy_page.MaxYorumSayisi.sendKeys("600");
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.MinToplamUrun.sendKeys("200");
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.MaxToplamUrun.sendKeys("1500");
        ResuableMethods.waitFor(1);
    }

    @Then("filtreleri uygula secenegine tiklar")
    public void filtreleri_uygula_secenegine_tiklar() {

        tools_tab_etsy_page.FiltreleriUygulaSekmesi.click();
        ResuableMethods.waitFor(3);


    }

    @And("Satın al popup geldigini teyit eder dogrular.")
    public void satınAlPopupGeldiginiTeyitEderDogrular() {
        WebElement cookies = driver.findElement(By.xpath("//div[@class='mt-5 sm:mt-6']/a[.='Satın Al']"));
        Assert.assertTrue(cookies.isDisplayed());
        ResuableMethods.waitFor(3);
        System.out.println("COOKİES =" + cookies.getText());
    }


}
