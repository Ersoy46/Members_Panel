package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Egitimler_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import java.util.concurrent.TimeUnit;

import static utilities.Driver.driver;

public class Egitimler_StepDefinitions {

    Egitimler_Page egitimler_page = new Egitimler_Page();

    Actions actions = new Actions(Driver.getDriver());


    @Then("Egitimler sekmesine tiklar")
    public void egitimler_sekmesine_tiklar() {
        egitimler_page.EgitimlerSekmesi.click();
        ResuableMethods.waitFor(4);
    }

    @When("sayfayi asagi indirir {int} adet egitim oldugunu teyit eder konsola yazdidir")
    public void sayfayi_asagi_indirir_adet_egitim_oldugunu_teyit_eder_konsola_yazdidir(Integer int1) {
        ResuableMethods.waitFor(2);

        String actualUcretsizAmazon = egitimler_page.UcretsizAmazonEgtimi.getText();
        String expectedUcretsizAmazon = "Ücretsiz Amazon Eğitimi";
        Assert.assertEquals("UCRETSİZ AMAZON EGİTİMİ GORUNMUYOR", expectedUcretsizAmazon, actualUcretsizAmazon);
        System.out.println(egitimler_page.UcretsizAmazonEgtimi.getText());

        String actualUcretsizEtsy = egitimler_page.UcretsizEtsyEgitimi.getText();
        String expectedUcretsizEtsy = "Ücretsiz Etsy Eğitimi";
        Assert.assertEquals("UCRETSİZ ETSY EGİTİMİ GORUNMUYOR", expectedUcretsizEtsy, actualUcretsizEtsy);
        System.out.println(egitimler_page.UcretsizEtsyEgitimi.getText());

        String actualUcretsizIkas = egitimler_page.UcretsizIkasEgitimi.getText();
        String expectedUcretsizIkas = "Ücretsiz İkas Eğitimi";
        Assert.assertEquals("UCRETSİZ IKAS EGİTİMİ GORUNMUYOR", expectedUcretsizIkas, actualUcretsizIkas);
        System.out.println(egitimler_page.UcretsizIkasEgitimi.getText());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        String actualAmazonMaster = egitimler_page.AmazonMasterEgitimi.getText();
        String expectedAmazonMaster = "Amazon Master Eğitimi";
        Assert.assertEquals("AMAZON MASTER EGİTİMİ GORUNMUYOR", expectedAmazonMaster, actualAmazonMaster);
        System.out.println(egitimler_page.AmazonMasterEgitimi.getText());

        String actualAmazonUzmaniEgitimi = egitimler_page.AmazonUzmaniEgitimi.getText();
        String expectedAmazonUzmaniEgitimi = "Amazon Uzmanı Eğitimi";
        Assert.assertEquals("AMAZON UZMANI EGİTİMİ GORUNMUYOR", expectedAmazonUzmaniEgitimi, actualAmazonUzmaniEgitimi);
        System.out.println(egitimler_page.AmazonUzmaniEgitimi.getText());

        String actualEtsyMasterEgitimi = egitimler_page.EtsyMasterEgitimi.getText();
        String expectedEtsyMasterEgitimi = "Etsy Master Eğitimi";
        Assert.assertEquals("ETSY MASTER EGİTİMİ GORUNMUYOR", expectedEtsyMasterEgitimi, actualEtsyMasterEgitimi);
        System.out.println(egitimler_page.EtsyMasterEgitimi.getText());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        String actualTrendyolMasterEgitimi = egitimler_page.TrendyolMasterEgitimi.getText();
        String expectedTrendyolMasterEgitimi = "Trendyol Master Eğitimi";
        Assert.assertEquals("TRENDYOL MASTER EGİTİMİ GORUNMUYOR", expectedTrendyolMasterEgitimi, actualTrendyolMasterEgitimi);
        System.out.println(egitimler_page.TrendyolMasterEgitimi.getText());

        String actualCanliEgitimKayitlari = egitimler_page.CanliEgitimKayitlari.getText();
        String expectedCanliEgitimKayitlari = "Canli Eğitimi Kayıtları";
        Assert.assertEquals("CANLİ EGİTİM KAYİTLARİ GORUNMUYOR", expectedCanliEgitimKayitlari, actualCanliEgitimKayitlari);
        System.out.println(egitimler_page.CanliEgitimKayitlari.getText());
    }

    //TC 38

    @When("amazon baslangic egitimine tiklar")
    public void amazon_baslangic_egitimine_tiklar() {
        egitimler_page.AmazonBaslangicEgitimi.click();
        ResuableMethods.waitFor(8);


        // video elementini locate etmek için uygun bir locator kullanın
        WebElement video = driver.findElement(By.xpath("//video[@id='videoPlayer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Video oynatma durumunu kontrol et
        String isVideoPlayed = js.executeScript("return arguments[0].played.length>0", video).toString();

        if (isVideoPlayed.equals("true")) {
            System.out.println("VİDEO İS PLAYED");
        } else {
            System.out.println("VİDEO İS NOT PLAYED");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Video playback failed");
        }

    }

    @When("Video iceriginde bulunan diger egitimlerin calistigini teyit eder")
    public void video_iceriginde_bulunan_diger_egitimlerin_calistigini_teyit_eder() {

        WebElement amazonIsModeli = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[2]"));
        amazonIsModeli.click();
        ResuableMethods.waitFor(4);
        String amazonIsModeliDuration = amazonIsModeli.getText();

        if (amazonIsModeliDuration.equals("0 dk")) {
            System.out.println("Amazon Is Modeli video duration is 0");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Amazon Is Modeli video duration is 0");
        } else {
            System.out.println("Amazon Is Modeli video duration is: " + amazonIsModeliDuration);
        }


        WebElement sirketButce = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[3]"));
        sirketButce.click();
        ResuableMethods.waitFor(4);
        String sirketButceDuration = sirketButce.getText();

        if (sirketButceDuration.equals("0 dk")) {
            System.out.println("Sirket Butce video duration is 0");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Sirket Butce video duration is 0");
        } else {
            System.out.println("Sirket Butce video duration is: " + sirketButceDuration);
        }

        WebElement hesapAcma = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[4]"));
        hesapAcma.click();
        ResuableMethods.waitFor(4);
        String hesapAcmaDuration = hesapAcma.getText();

        if (hesapAcmaDuration.equals("0 dk")) {
            System.out.println("Hesap Acma video duration is 0");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Hesap Acma video duration is 0");
        } else {
            System.out.println("Hesap Acma video duration is: " + hesapAcmaDuration);
        }

        WebElement privateLabelUrunArastirma = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[5]"));
        privateLabelUrunArastirma.click();
        ResuableMethods.waitFor(4);
        String privateLabelUrunArastirmaDuration = privateLabelUrunArastirma.getText();

        if (privateLabelUrunArastirmaDuration.equals("0 dk")) {
            System.out.println("Private Label Urun Arastirma video duration is 0");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Private Label Urun Arastirma video duration is 0");
        } else {
            System.out.println("Private Label Urun Arastirma video duration is: " + privateLabelUrunArastirmaDuration);
        }

        WebElement privateLabelUrunAnalizi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[6]"));
        privateLabelUrunAnalizi.click();
        ResuableMethods.waitFor(4);
        String privateLabelUrunAnaliziDuration = privateLabelUrunAnalizi.getText();

        if (privateLabelUrunAnaliziDuration.equals("0 dk")) {
            System.out.println("Private Label Urun Analizi video duration is 0");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Private Label Urun Analizi video duration is 0");
        } else {
            System.out.println("Private Label Urun Analizi video duration is: " + privateLabelUrunAnaliziDuration);
        }
    }

    //TC39
    @When("Etsy baslangic egitimine tiklar")
    public void etsyBaslangicEgitimineTiklar() {
        egitimler_page.EtsyBaslangicEgitimi.click();
        ResuableMethods.waitFor(8);


        // video elementini locate etmek için uygun bir locator kullanın
        WebElement video = driver.findElement(By.xpath("//video[@id='videoPlayer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Video oynatma durumunu kontrol et
        String isVideoPlayed = js.executeScript("return arguments[0].played.length>0", video).toString();

        if (isVideoPlayed.equals("true")) {
            System.out.println("VİDEO İS PLAYED");
        } else {
            System.out.println("VİDEO İS NOT PLAYED");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Video playback failed");
        }

    }

    @And("Video iceriginde bulunan diger egitimlerin dogru calistigini teyit eder")
    public void videoIcerigindeBulunanDigerEgitimlerinDogruCalistiginiTeyitEder() {
        ResuableMethods.waitFor(2);
        WebElement EtsydeUymanizGerekenKurallar = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[2]"));
        EtsydeUymanizGerekenKurallar.click();
        ResuableMethods.waitFor(4);
        String EtsydeUymanizGerekenKurallarDuration = EtsydeUymanizGerekenKurallar.getText();


        if (EtsydeUymanizGerekenKurallarDuration.equals("0 dk")) {
            System.out.println("Etsy'de Uymaniz Gereken Kurallar video duration is 0");
            throw new RuntimeException("Etsy'de Uymaniz Gereken Kurallar video duration is 0");
        } else {
            System.out.println("Etsy'de Uymaniz Gereken Kurallar video duration is: " + EtsydeUymanizGerekenKurallarDuration);
        }

        WebElement EtsySuspend = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[3]"));
        EtsySuspend.click();
        ResuableMethods.waitFor(4);
        String EtsySuspendDuration = EtsySuspend.getText();

        if (EtsySuspendDuration.equals("0 dk")) {
            System.out.println("Etsy Suspend video duration is 0");
            throw new RuntimeException("Etsy Suspend video duration is 0");
        } else {
            System.out.println("Etsy Suspend video duration is: " + EtsySuspendDuration);
        }

        WebElement EtsydeKelimelerinOnemi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[4]"));
        EtsydeKelimelerinOnemi.click();
        ResuableMethods.waitFor(4);
        String EtsydeKelimelerinOnemiDuration = EtsydeKelimelerinOnemi.getText();

        if (EtsydeKelimelerinOnemiDuration.equals("0 dk")) {
            System.out.println("Etsy'de Kelimelerin Önemi video duration is 0");
            throw new RuntimeException("Etsy'de Kelimelerin Önemi video duration is 0");
        } else {
            System.out.println("Etsy'de Kelimelerin Önemi video duration is: " + EtsydeKelimelerinOnemiDuration);
        }

        WebElement EtsydeKelimeArastirmasiNasilYapilir = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[5]"));
        EtsydeKelimeArastirmasiNasilYapilir.click();
        ResuableMethods.waitFor(4);
        String EtsydeKelimeArastirmasiNasilYapilirDuration = EtsydeKelimeArastirmasiNasilYapilir.getText();

        if (EtsydeKelimeArastirmasiNasilYapilirDuration.equals("0 dk")) {
            System.out.println("Etsy'de Kelime Arastirmasi Nasıl Yapılır video duration is 0");
            throw new RuntimeException("Etsy'de Kelime Arastirmasi Nasıl Yapılır video duration is 0");
        } else {
            System.out.println("Etsy'de Kelime Arastirmasi Nasıl Yapılır video duration is: " + EtsydeKelimeArastirmasiNasilYapilirDuration);
        }

        WebElement EtsyListelemeFotograflar = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[6]"));
        EtsyListelemeFotograflar.click();
        ResuableMethods.waitFor(3);
        String EtsyListelemeFotograflarDuration = EtsyListelemeFotograflar.getText();

        if (EtsyListelemeFotograflarDuration.equals("0 dk")) {
            System.out.println("Etsy Listeleme Fotograflar video duration is 0");
            throw new RuntimeException("Etsy Listeleme Fotograflar video duration is 0");
        } else {
            System.out.println("Etsy Listeleme Fotograflar video duration is: " + EtsyListelemeFotograflarDuration);
        }
    }

    //TC40
    @When("İKAS baslangic egitimine tiklar")
    public void ikasBaslangicEgitimineTiklar() {
        egitimler_page.ikasBaslangicEgitimi.click();
        ResuableMethods.waitFor(8);

        // video elementini locate etmek için uygun bir locator kullanın
        WebElement video = driver.findElement(By.xpath("//video[@id='videoPlayer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Video oynatma durumunu kontrol et
        String isVideoPlayed = js.executeScript("return arguments[0].played.length>0", video).toString();

        if (isVideoPlayed.equals("true")) {
            System.out.println("VİDEO İS PLAYED");
        } else {
            System.out.println("VİDEO İS NOT PLAYED");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Video playback failed");
        }
    }

    @And("Video icerisinde bulunan diger diger egitimlerin dogru calistigini teyit eder")
    public void videoIcerisindeBulunanDigerDigerEgitimlerinDogruCalistiginiTeyitEder() {
        WebElement EticaretTemaSecimi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[2]"));
        EticaretTemaSecimi.click();
        ResuableMethods.waitFor(4);
        String EticaretTemaSecimiDuration = EticaretTemaSecimi.getText();

        if (EticaretTemaSecimiDuration.equals("0 dk")) {
            System.out.println("Eticaret Tema Seçimi video duration is 0");
            throw new RuntimeException("Eticaret Tema Seçimi video duration is 0");
        } else {
            System.out.println("Eticaret Tema Seçimi video duration is: " + EticaretTemaSecimiDuration);
        }

        WebElement MagazaAyarlariDuzenleme = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[3]"));
        MagazaAyarlariDuzenleme.click();
        ResuableMethods.waitFor(4);
        String MagazaAyarlariDuzenlemeDuration = MagazaAyarlariDuzenleme.getText();

        if (MagazaAyarlariDuzenlemeDuration.equals("0 dk")) {
            System.out.println("Mağaza Ayarları Düzenleme video duration is 0");
            throw new RuntimeException("Mağaza Ayarları Düzenleme video duration is 0");
        } else {
            System.out.println("Mağaza Ayarları Düzenleme video duration is: " + MagazaAyarlariDuzenlemeDuration);
        }

        WebElement EticaretYonetimPaneli = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[4]"));
        EticaretYonetimPaneli.click();
        ResuableMethods.waitFor(4);
        String EticaretYonetimPaneliDuration = EticaretYonetimPaneli.getText();

        if (EticaretYonetimPaneliDuration.equals("0 dk")) {
            System.out.println("Eticaret Yönetim Paneli video duration is 0");
            throw new RuntimeException("Eticaret Yönetim Paneli video duration is 0");
        } else {
            System.out.println("Eticaret Yönetim Paneli video duration is: " + EticaretYonetimPaneliDuration);
        }
    }

    //TC41

    @Then("sayfayi asagi indirir ve Amazon master egtimine tiklar")
    public void sayfayi_asagi_indirir_ve_amazon_master_egtimine_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        egitimler_page.AmazonMasterEgitimiKilitli.click();
        ResuableMethods.waitFor(2);

    }

    @Then("Aktif üye olmadığınız için egitimlerden faydalanamazsınız yazisini görür ve kapatir")
    public void aktif_üye_olmadığınız_için_egitimlerden_faydalanamazsınız_yazisini_görür_ve_kapatir() {
        WebElement closeButton = driver.findElement(By.xpath("//button[contains(@class, 'rounded-md')]"));
        actions.moveToElement(closeButton).click().perform();
        ResuableMethods.waitFor(2);
    }

    //TC42
    @Then("sayfayi asagi indirir ve Amazon Uzmanı egtimine tiklar")
    public void sayfayiAsagiIndirirVeAmazonUzmanıEgtimineTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        egitimler_page.AmazonUzmaniEgitimiKilitli.click();
        ResuableMethods.waitFor(2);
        WebElement closeButton = driver.findElement(By.xpath("//button[contains(@class, 'rounded-md')]"));
        actions.moveToElement(closeButton).click().perform();
        ResuableMethods.waitFor(1);
    }

    //TC43
    @Then("sayfayi asagi indirir ve Etsy master egitimine tiklar")
    public void sayfayiAsagiIndirirVeEtsyMasterEgitimineTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        egitimler_page.EtsyMasterEgitimiKilitli.click();
        ResuableMethods.waitFor(2);
    }

    @And("Satin al sekmesine tiklar Payment Sayfasina yönlendirdigini kontrol eder")
    public void satinAlSekmesineTiklarPaymentSayfasinaYönlendirdiginiKontrolEder() {
        WebElement SatinAl = driver.findElement(By.xpath("//a[.='Satın Al']"));
        actions.moveToElement(SatinAl).click().perform();
        ResuableMethods.waitFor(2);
        Driver.getDriver().get("https://community.rexven.com/topluluk-paketleri/");
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        WebElement EkosistemeKatil = driver.findElement(By.xpath("//li[@class='elementor-repeater-item-1f4b8d0']//li[@class='pricing-box yearly-box is-visible popular badge-1 ']//a[.='Ekosisteme Katıl']"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        EkosistemeKatil.click();
        Driver.getDriver().get("https://payment.rexven.com/payment/?sellerId=1&platform=iyzico&type=subs&productId=21&sepet-aylik");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);


    }

    //TC44

    @And("Video icerisinde bulunan diger diger egitimlerin acildigini teyit eder")
    public void videoIcerisindeBulunanDigerDigerEgitimlerinAcildiginiTeyitEder() {
        WebElement UreticilerIcinYolHaritasi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[2]"));
        UreticilerIcinYolHaritasi.click();
        ResuableMethods.waitFor(4);
        String UreticilerIcinYolHaritasiDuration = UreticilerIcinYolHaritasi.getText();

        if (UreticilerIcinYolHaritasiDuration.equals("0 dk")) {
            System.out.println("Üreticiler İçin Yol Haritası video duration is 0");
            throw new RuntimeException("Üreticiler İçin Yol Haritası video duration is 0");
        } else {
            System.out.println("Üreticiler İçin Yol Haritası video duration is: " + UreticilerIcinYolHaritasiDuration);
        }

        WebElement GirisimcilerIcinYolHaritasi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[3]"));
        GirisimcilerIcinYolHaritasi.click();
        ResuableMethods.waitFor(4);
        String GirisimcilerIcinYolHaritasiDuration = GirisimcilerIcinYolHaritasi.getText();

        if (GirisimcilerIcinYolHaritasiDuration.equals("0 dk")) {
            System.out.println("Girişimciler İçin Yol Haritası video duration is 0");
            throw new RuntimeException("Girişimciler İçin Yol Haritası video duration is 0");
        } else {
            System.out.println("Girişimciler İçin Yol Haritası video duration is: " + GirisimcilerIcinYolHaritasiDuration);
        }

        WebElement EgitimHangiPazarYerleriIcin = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[4]"));
        EgitimHangiPazarYerleriIcin.click();
        ResuableMethods.waitFor(4);
        String EgitimHangiPazarYerleriIcinDuration = EgitimHangiPazarYerleriIcin.getText();

        if (EgitimHangiPazarYerleriIcinDuration.equals("0 dk")) {
            System.out.println("Eğitim Hangi Pazar Yerleri İçin video duration is 0");
            throw new RuntimeException("Eğitim Hangi Pazar Yerleri İçin video duration is 0");
        } else {
            System.out.println("Eğitim Hangi Pazar Yerleri İçin video duration is: " + EgitimHangiPazarYerleriIcinDuration);
        }

        WebElement AmazondaDropshippingYapilirMi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[5]"));
        AmazondaDropshippingYapilirMi.click();
        ResuableMethods.waitFor(4);
        String AmazondaDropshippingYapilirMiDuration = AmazondaDropshippingYapilirMi.getText();

        if (AmazondaDropshippingYapilirMiDuration.equals("0 dk")) {
            System.out.println("Amazon'da Dropshipping Yapılır Mı video duration is 0");
            throw new RuntimeException("Amazon'da Dropshipping Yapılır Mı video duration is 0");
        } else {
            System.out.println("Amazon'da Dropshipping Yapılır Mı video duration is: " + AmazondaDropshippingYapilirMiDuration);
        }

        WebElement AmazonHikayesi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[6]"));
        AmazonHikayesi.click();
        ResuableMethods.waitFor(4);
        String AmazonHikayesiDuration = AmazonHikayesi.getText();

        if (AmazonHikayesiDuration.equals("0 dk")) {
            System.out.println("Amazon Hikayesi video duration is 0");
            throw new RuntimeException("Amazon Hikayesi video duration is 0");
        } else {
            System.out.println("Amazon Hikayesi video duration is: " + AmazonHikayesiDuration);
        }
    }

    //TC45
    @And("Video icerisinde bulunan diger diger egitimlerin acildigıni teyit eder")
    public void videoIcerisindeBulunanDigerDigerEgitimlerinAcildigıniTeyitEder() {
        WebElement HedefiniziBelirleyin = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[2]"));
        HedefiniziBelirleyin.click();
        ResuableMethods.waitFor(4);
        String HedefiniziBelirleyinDuration = HedefiniziBelirleyin.getText();

        if (HedefiniziBelirleyinDuration.equals("0 dk")) {
            System.out.println("Hedefinizi Belirleyin video duration is 0");
            throw new RuntimeException("Hedefinizi Belirleyin video duration is 0");
        } else {
            System.out.println("Hedefinizi Belirleyin video duration is: " + HedefiniziBelirleyinDuration);
        }

        WebElement SirketlerAmazonUzmaniAriyor = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[3]"));
        SirketlerAmazonUzmaniAriyor.click();
        ResuableMethods.waitFor(4);
        String SirketlerAmazonUzmaniAriyorDuration = SirketlerAmazonUzmaniAriyor.getText();

        if (SirketlerAmazonUzmaniAriyorDuration.equals("0 dk")) {
            System.out.println("Şirketler Amazon Uzmanı Arıyor video duration is 0");
            throw new RuntimeException("Şirketler Amazon Uzmanı Arıyor video duration is 0");
        } else {
            System.out.println("Şirketler Amazon Uzmanı Arıyor video duration is: " + SirketlerAmazonUzmaniAriyorDuration);
        }

        WebElement HedefKitleniziTaniyin = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[4]"));
        HedefKitleniziTaniyin.click();
        ResuableMethods.waitFor(4);
        String HedefKitleniziTaniyinDuration = HedefKitleniziTaniyin.getText();

        if (HedefKitleniziTaniyinDuration.equals("0 dk")) {
            System.out.println("Hedef Kitlenizi Tanıyın video duration is 0");
            throw new RuntimeException("Hedef Kitlenizi Tanıyın video duration is 0");
        } else {
            System.out.println("Hedef Kitlenizi Tanıyın video duration is: " + HedefKitleniziTaniyinDuration);
        }

        WebElement MesajiniziOlusturun = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[5]"));
        MesajiniziOlusturun.click();
        ResuableMethods.waitFor(4);
        String MesajiniziOlusturunDuration = MesajiniziOlusturun.getText();

        if (MesajiniziOlusturunDuration.equals("0 dk")) {
            System.out.println("Mesajınızı Oluşturun video duration is 0");
            throw new RuntimeException("Mesajınızı Oluşturun video duration is 0");
        } else {
            System.out.println("Mesajınızı Oluşturun video duration is: " + MesajiniziOlusturunDuration);
        }

        WebElement IsModeliniziBelirleyin = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[6]"));
        IsModeliniziBelirleyin.click();
        ResuableMethods.waitFor(4);
        String IsModeliniziBelirleyinDuration = IsModeliniziBelirleyin.getText();

        if (IsModeliniziBelirleyinDuration.equals("0 dk")) {
            System.out.println("İş Modelinizi Belirleyin video duration is 0");
            throw new RuntimeException("İş Modelinizi Belirleyin video duration is 0");
        } else {
            System.out.println("İş Modelinizi Belirleyin video duration is: " + IsModeliniziBelirleyinDuration);
        }
    }

    //TC46
    @Then("sayfayi asagi indirir ve Trendyol Master egitimine tiklar")
    public void sayfayiAsagiIndirirVeTrendyolMasterEgitimineTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        egitimler_page.TrendyolMasterUcretli.click();
        ResuableMethods.waitFor(6);

        // video elementini locate etmek için uygun bir locator kullanın
        WebElement video = driver.findElement(By.xpath("//video[@id='videoPlayer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Video oynatma durumunu kontrol et
        String isVideoPlayed = js.executeScript("return arguments[0].played.length>0", video).toString();

        if (isVideoPlayed.equals("true")) {
            System.out.println("VİDEO İS PLAYED");
        } else {
            System.out.println("VİDEO İS NOT PLAYED");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Video playback failed");
        }
    }


    @And("Video icerisinde bulunan diger egitimlerin acildiginı teyit eder")
    public void videoIcerisindeBulunanDigerDigerEgitimlerinAcildiginıTeyitEder() {
        WebElement NedenEticaretYapmaliyiz = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[2]"));
        NedenEticaretYapmaliyiz.click();
        ResuableMethods.waitFor(4);
        String NedenEticaretYapmaliyizDuration = NedenEticaretYapmaliyiz.getText();

        if (NedenEticaretYapmaliyizDuration.equals("0 dk")) {
            System.out.println("Neden E-ticaret Yapmalıyız video duration is 0");
            throw new RuntimeException("Neden E-ticaret Yapmalıyız video duration is 0");
        } else {
            System.out.println("Neden E-ticaret Yapmalıyız video duration is: " + NedenEticaretYapmaliyizDuration);
        }

        WebElement ETicaretPazarYerleriWebSitesi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[3]"));
        ETicaretPazarYerleriWebSitesi.click();
        ResuableMethods.waitFor(4);
        String ETicaretPazarYerleriWebSitesiDuration = ETicaretPazarYerleriWebSitesi.getText();

        if (ETicaretPazarYerleriWebSitesiDuration.equals("0 dk")) {
            System.out.println("E-Ticaret Pazar Yerleri Web Sitesi video duration is 0");
            throw new RuntimeException("E-Ticaret Pazar Yerleri Web Sitesi video duration is 0");
        } else {
            System.out.println("E-Ticaret Pazar Yerleri Web Sitesi video duration is: " + ETicaretPazarYerleriWebSitesiDuration);
        }

        WebElement OnceHangiPazarYeri = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[4]"));
        OnceHangiPazarYeri.click();
        ResuableMethods.waitFor(4);
        String OnceHangiPazarYeriDuration = OnceHangiPazarYeri.getText();

        if (OnceHangiPazarYeriDuration.equals("0 dk")) {
            System.out.println("Önce Hangi Pazar Yeri video duration is 0");
            throw new RuntimeException("Önce Hangi Pazar Yeri video duration is 0");
        } else {
            System.out.println("Önce Hangi Pazar Yeri video duration is: " + OnceHangiPazarYeriDuration);
        }

        WebElement FacebookGrubumuz = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[5]"));
        FacebookGrubumuz.click();
        ResuableMethods.waitFor(4);
        String FacebookGrubumuzDuration = FacebookGrubumuz.getText();

        if (FacebookGrubumuzDuration.equals("0 dk")) {
            System.out.println("Facebook Grubumuz video duration is 0");
            throw new RuntimeException("Facebook Grubumuz video duration is 0");
        } else {
            System.out.println("Facebook Grubumuz video duration is: " + FacebookGrubumuzDuration);
        }

        WebElement SosyalMedya = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[6]"));
        SosyalMedya.click();
        ResuableMethods.waitFor(4);
        String SosyalMedyaDuration = SosyalMedya.getText();

        if (SosyalMedyaDuration.equals("0 dk")) {
            System.out.println("Sosyal Medya video duration is 0");
            throw new RuntimeException("Sosyal Medya video duration is 0");
        } else {
            System.out.println("Sosyal Medya video duration is: " + SosyalMedyaDuration);
        }
    }

    //TC44
    @Then("sayfayi asagi indirir ve Amazon master egitimine tiklar")
    public void sayfayiAsagiIndirirVeAmazonMasterEgitimineTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        egitimler_page.AmazonMasterUcretli.click();
        ResuableMethods.waitFor(6);

        // video elementini locate etmek için uygun bir locator kullanın
        WebElement video = driver.findElement(By.xpath("//video[@id='videoPlayer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Video oynatma durumunu kontrol et
        String isVideoPlayed = js.executeScript("return arguments[0].played.length>0", video).toString();

        if (isVideoPlayed.equals("true")) {
            System.out.println("VİDEO İS PLAYED");
        } else {
            System.out.println("VİDEO İS NOT PLAYED");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Video playback failed");
        }

    }

    @Then("sayfayi asagi indirir ve Amazon Uzmani egtimine tiklar")
    public void sayfayiAsagiIndirirVeAmazonUzmaniEgtimineTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        egitimler_page.AmazonUzmaniUcretli.click();
        ResuableMethods.waitFor(6);

        // video elementini locate etmek için uygun bir locator kullanın
        WebElement video = driver.findElement(By.xpath("//video[@id='videoPlayer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Video oynatma durumunu kontrol et
        String isVideoPlayed = js.executeScript("return arguments[0].played.length>0", video).toString();

        if (isVideoPlayed.equals("true")) {
            System.out.println("VİDEO İS PLAYED");
        } else {
            System.out.println("VİDEO İS NOT PLAYED");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Video playback failed");
        }
    }

    //TC47
    @Then("sayfayi asagi indirir ve Canli Egitim Kayitlarina tiklar")
    public void sayfayiAsagiIndirirVeCanliEgitimKayitlarinaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        egitimler_page.CanliEgitimKayitlariUcretli.click();
        ResuableMethods.waitFor(10);

        // video elementini locate etmek için uygun bir locator kullanın
        WebElement video = driver.findElement(By.xpath("//video[@id='videoPlayer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Video oynatma durumunu kontrol et
        String isVideoPlayed = js.executeScript("return arguments[0].played.length>0", video).toString();

        if (isVideoPlayed.equals("true")) {
            System.out.println("VİDEO İS PLAYED");
        } else {
            System.out.println("VİDEO İS NOT PLAYED");
            // Hata oluştuğunda exception fırlat
            throw new RuntimeException("Video playback failed");
        }
    }

    @And("Video icerisinde bulunan diger egitimlerin acıldiginı teyit eder")
    public void videoIcerisindeBulunanDigerEgitimlerinAcıldiginıTeyitEder() {
        WebElement RexvenTanismaToplantisi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[2]"));
        RexvenTanismaToplantisi.click();
        ResuableMethods.waitFor(3);
        String RexvenTanismaToplantisiDuration = RexvenTanismaToplantisi.getText();

        if (RexvenTanismaToplantisiDuration.equals("0 dk")) {
            System.out.println("Rexven Tanışma Toplantısı video duration is 0");
            throw new RuntimeException("Rexven Tanışma Toplantısı video duration is 0");
        } else {
            System.out.println("Rexven Tanışma Toplantısı video duration is: " + RexvenTanismaToplantisiDuration);
        }

        WebElement AmazonVeEtsyYolHaritasiBelirleme = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[3]"));
        AmazonVeEtsyYolHaritasiBelirleme.click();
        ResuableMethods.waitFor(4);
        String AmazonVeEtsyYolHaritasiBelirlemeDuration = AmazonVeEtsyYolHaritasiBelirleme.getText();

        if (AmazonVeEtsyYolHaritasiBelirlemeDuration.equals("0 dk")) {
            System.out.println("Amazon ve Etsy Yol Haritası Belirleme video duration is 0");
            throw new RuntimeException("Amazon ve Etsy Yol Haritası Belirleme video duration is 0");
        } else {
            System.out.println("Amazon ve Etsy Yol Haritası Belirleme video duration is: " + AmazonVeEtsyYolHaritasiBelirlemeDuration);
        }

        WebElement AmazonVeEtsyIsModelleri = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[4]"));
        AmazonVeEtsyIsModelleri.click();
        ResuableMethods.waitFor(3);
        String AmazonVeEtsyIsModelleriDuration = AmazonVeEtsyIsModelleri.getText();

        if (AmazonVeEtsyIsModelleriDuration.equals("0 dk")) {
            System.out.println("Amazon ve Etsy İş Modelleri video duration is 0");
            throw new RuntimeException("Amazon ve Etsy İş Modelleri video duration is 0");
        } else {
            System.out.println("Amazon ve Etsy İş Modelleri video duration is: " + AmazonVeEtsyIsModelleriDuration);
        }

        WebElement AmazonArbitrajUrunArastirmaVeAnalizEgitimi = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[5]"));
        AmazonArbitrajUrunArastirmaVeAnalizEgitimi.click();
        ResuableMethods.waitFor(6);
        String AmazonArbitrajUrunArastirmaVeAnalizEgitimiDuration = AmazonArbitrajUrunArastirmaVeAnalizEgitimi.getText();

        if (AmazonArbitrajUrunArastirmaVeAnalizEgitimiDuration.equals("0 dk")) {
            System.out.println("Amazon Arbitraj Ürün Araştırma ve Analiz Eğitimi video duration is 0");
            throw new RuntimeException("Amazon Arbitraj Ürün Araştırma ve Analiz Eğitimi video duration is 0");
        } else {
            System.out.println("Amazon Arbitraj Ürün Araştırma ve Analiz Eğitimi video duration is: " + AmazonArbitrajUrunArastirmaVeAnalizEgitimiDuration);
        }

        WebElement EmparazonIleUygulamaliAmazonUrunArastirma = driver.findElement(By.xpath("(//span[@class='text-sm pl-2'])[6]"));
        EmparazonIleUygulamaliAmazonUrunArastirma.click();
        ResuableMethods.waitFor(12);
        String EmparazonIleUygulamaliAmazonUrunArastirmaDuration = EmparazonIleUygulamaliAmazonUrunArastirma.getText();

        if (EmparazonIleUygulamaliAmazonUrunArastirmaDuration.equals("0 dk")) {
            System.out.println("Emparazon ile Uygulamalı Amazon Ürün Araştırma video duration is 0");
            throw new RuntimeException("Emparazon ile Uygulamalı Amazon Ürün Araştırma video duration is 0");
        } else {
            System.out.println("Emparazon ile Uygulamalı Amazon Ürün Araştırma video duration is: " + EmparazonIleUygulamaliAmazonUrunArastirmaDuration);
        }

    }
}
