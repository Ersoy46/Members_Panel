package stepdefinitions;

import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import pages.Tools_Tab_Page;
import utilities.Driver;
import utilities.ResuableMethods;


import java.io.IOException;
import java.time.Duration;

import static utilities.Driver.driver;

public class Tools_Tab_StepDefinitions {

    Tools_Tab_Page tools_tab_page = new Tools_Tab_Page();
    Actions actions = new Actions(Driver.getDriver());




    @Then("araclar sekmesinde bulunan Trendyol sekmesini tiklar")
    public void araclar_sekmesinde_bulunan_trendyol_sekmesini_tiklar() {
        ResuableMethods.waitFor(2);
        tools_tab_page.trendyolSekmesi.click();
        ResuableMethods.waitFor(2);
    }

    @Then("kar hesaplama secenegini tiklar")
    public void kar_hesaplama_secenegini_tiklar() {
        tools_tab_page.trendyolKarHesaplamaSekmesi.click();
        ResuableMethods.waitFor(3);
    }

    @Then("acilan sayfada  gerekli tum bilgileri girer ve hesaplama yapar")
    public void acilan_sayfada_gerekli_bilgileri_girer_ve_hesaplama_yapar() throws IOException {

        WebElement dropdownElementi = driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']"));
        ResuableMethods.waitFor(2);
        dropdownElementi.click();  // Dropdown'ı açmak için tıkla

// İndex 24 olan seçeneği seçmek için 24 kez aşağı ok tuşuna bas
        for (int i = 0; i < 24; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
        ResuableMethods.waitFor(2);

// Seçimi tamamlamak için ENTER tuşuna bas
        actions.sendKeys(Keys.ENTER).perform();


        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);

        tools_tab_page.trendyolKomisyonOrani.clear();
        tools_tab_page.trendyolKomisyonOrani.sendKeys("21");
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);


        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);


        WebElement KDVDropDown =
                driver.findElement(By.xpath("//select[@id='vatRate']"));
        Select select = new Select(KDVDropDown);
        select.selectByIndex(2);
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_page.trendyolsatisFiyati.sendKeys("300");
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_page.trendyolkargoUcreti.sendKeys("30");
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();


        tools_tab_page.trendyolurunMaliyeti.sendKeys("100");
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_page.trendyolislilikMaliyeti.sendKeys("20");
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_page.trendyolpaketlemeMaliyeti.sendKeys("10");
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_page.trendyolkargoMaliyeti.sendKeys("20");
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);

        tools_tab_page.trendyolreklamMaliyeti.sendKeys("15");
        ResuableMethods.waitFor(1);

        tools_tab_page.trendyolHesaplaButonu.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(15);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);




    }

    @Then("cikan hesaplama sonucunun dogru oldugunu kontrol eder")
    public void cikan_hesaplama_sonucunun_dogru_oldugunu_kontrol_eder() {

        //
        String actuelGelir = tools_tab_page.trendyolHesaplaSonucGelir.getText();
        String expectedGelir = "330 ₺";
        Assert.assertEquals("GELİR SONUCU UYUSMUYOR", expectedGelir, actuelGelir);
        System.out.println(tools_tab_page.trendyolHesaplaSonucGelir.getText());
        //
        String actualMaliyet = tools_tab_page.trendyolHesaplaSonucMaliyet.getText();
        String expectedMaliyet = "165 ₺";
        Assert.assertEquals("MAALİYET SONUCU UYUSMUYOR", expectedMaliyet, actualMaliyet);
        System.out.println(tools_tab_page.trendyolHesaplaSonucMaliyet.getText());
        //
        String actualKesinti = tools_tab_page.trendyolHesaplaSonucKesinti.getText();
        String expectedKesinti = "71.89 ₺";
        Assert.assertEquals("KESİNTİ SONUCU UYUSMUYOR", expectedKesinti, actualKesinti);
        System.out.println(tools_tab_page.trendyolHesaplaSonucKesinti.getText());

        //
        String actualKar = tools_tab_page.trendyolHesaplaSonucKar.getText();
        String expectedKar = "93.11 ₺";
        Assert.assertEquals("KAR SONUCU UYUSMUYOR", expectedKar, actualKar);
        System.out.println(tools_tab_page.trendyolHesaplaSonucKar.getText());

        //
        String actualKarMarji = tools_tab_page.trendyolHesaplaSonucKarMarjı.getText();
        String expectedKarMarji = "28.21 %";
        Assert.assertEquals("KAR MARJI SONUCU UYUSMUYOR", expectedKarMarji, actualKarMarji);
        System.out.println(tools_tab_page.trendyolHesaplaSonucKarMarjı.getText());


        System.out.println(tools_tab_page.sonucKesintiTablosu.getText());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%';");

        ResuableMethods.waitFor(3);
    }

    @Then("acilan sayfada kategoriyi secer")
    public void acilan_sayfada_kategoriyi_secer() {

        WebElement dropdownElementi1 = driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']"));
        ResuableMethods.waitFor(2);
        dropdownElementi1.click();    // Dropdown'ı açmak için tıkla

// İndex 24 olan seçeneği seçmek için 24 kez aşağı ok tuşuna bas
        for (int i = 0; i < 14; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
        ResuableMethods.waitFor(2);

// Seçimi tamamlamak için ENTER tuşuna bas
        actions.sendKeys(Keys.ENTER).perform();




    }
    @Then("satis fiyatini yazar")
    public void satis_fiyatini_yazar() {

        tools_tab_page.trendyolsatisFiyati.sendKeys("500");
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);


    }
    @Then("hesapla butonuna basar")
    public void hesapla_butonuna_basar() {

        tools_tab_page.trendyolHesaplaButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(15);

    }
    @Then("gelen sonuclarin dogrulamasini yapar")
    public void gelen_sonuclarin_dogrulamasini_yapar() {
        //
        String actuelGelir = tools_tab_page.trendyolHesaplaSonucGelir.getText();
        String expectedGelir = "500 ₺";
        Assert.assertEquals("GELİR SONUCU UYUSMUYOR", expectedGelir, actuelGelir);
        System.out.println(tools_tab_page.trendyolHesaplaSonucGelir.getText());
        //
        String actualMaliyet = tools_tab_page.trendyolHesaplaSonucMaliyet.getText();
        String expectedMaliyet = "0 ₺";
        Assert.assertEquals("MAALİYET SONUCU UYUSMUYOR", expectedMaliyet, actualMaliyet);
        System.out.println(tools_tab_page.trendyolHesaplaSonucMaliyet.getText());
        //
        String actualKesinti = tools_tab_page.trendyolHesaplaSonucKesinti.getText();
        String expectedKesinti = "168.24 ₺";
        Assert.assertEquals("KESİNTİ SONUCU UYUSMUYOR", expectedKesinti, actualKesinti);
        System.out.println(tools_tab_page.trendyolHesaplaSonucKesinti.getText());

        //
        String actualKar = tools_tab_page.trendyolHesaplaSonucKar.getText();
        String expectedKar = "331.76 ₺";
        Assert.assertEquals("KAR SONUCU UYUSMUYOR", expectedKar, actualKar);
        System.out.println(tools_tab_page.trendyolHesaplaSonucKar.getText());

        //
        String actualKarMarji = tools_tab_page.trendyolHesaplaSonucKarMarjı.getText();
        String expectedKarMarji = "66.35 %";
        Assert.assertEquals("KAR MARJI SONUCU UYUSMUYOR", expectedKarMarji, actualKarMarji);
        System.out.println(tools_tab_page.trendyolHesaplaSonucKarMarjı.getText());


        System.out.println(tools_tab_page.sonucKesintiTablosu.getText());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%';");

        ResuableMethods.waitFor(3);
    }




}
