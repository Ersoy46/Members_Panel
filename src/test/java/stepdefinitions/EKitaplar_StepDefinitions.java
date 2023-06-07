package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EKitaplar_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import java.io.File;
import java.io.IOException;

public class EKitaplar_StepDefinitions {

    EKitaplar_Page eKitaplar_page = new EKitaplar_Page();

    Actions actions = new Actions(Driver.getDriver());

    @Given("E-Kitaplar sekmesine tiklar")
    public void e_kitaplar_sekmesine_tiklar() {
        eKitaplar_page.EKitaplarSekmesi.click();
        ResuableMethods.waitFor(2);

    }

    @Then("{int} adet E-Kitap oldugunu teyit eder ve isimlerini yazdirir")
    public void adet_e_kitap_oldugunu_teyit_eder_ve_isimlerini_yazdirir(Integer int1) {

        String actualAmazondaYolHaritasi = eKitaplar_page.AmazondaYolHaritasiEKitabi.getText();
        String expectedAmazondaYolHaritasi = "Amazon'da Yol Haritası E-Kitabı";
        Assert.assertEquals("Amazon'da Yol Haritası E-Kitabı GORUNMUYOR", expectedAmazondaYolHaritasi, actualAmazondaYolHaritasi);
        System.out.println(eKitaplar_page.AmazondaYolHaritasiEKitabi.getText());
        ResuableMethods.waitFor(1);

        String actualAmazonEgitimiEkitabi = eKitaplar_page.AmazonEgitimiEKitabi.getText();
        String expectedAmazonEgitimiEkitabi = "Amazon Eğitimi E-Kitabı";
        Assert.assertEquals("Amazon Eğitimi E-Kitabı GORUNMUYOR", expectedAmazonEgitimiEkitabi, actualAmazonEgitimiEkitabi);
        System.out.println(eKitaplar_page.AmazonEgitimiEKitabi.getText());
        ResuableMethods.waitFor(1);

        String actualAdanZyeTrendyolEgitimi = eKitaplar_page.AdanZyeTrendyolEkitabi.getText();
        String expectedAdanZyeTrendyolEgitimi = "A'dan Z'ye Trendyol Eğitimi E-Kitabı";
        Assert.assertEquals("A'dan Z'ye Trendyol Eğitimi E-Kitabı GORUNMUYOR", expectedAdanZyeTrendyolEgitimi, actualAdanZyeTrendyolEgitimi);
        System.out.println(eKitaplar_page.AdanZyeTrendyolEkitabi.getText());
        ResuableMethods.waitFor(1);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        String actualEtsyHesapKurallariRehberi = eKitaplar_page.EtsyHesapKurallariRehberi.getText();
        String expectedEtsyHesapKurallariRehberi = "Etsy Hesap Kuralları Rehberi";
        Assert.assertEquals("Etsy Hesap Kuralları Rehberi GORUNMUYOR", expectedEtsyHesapKurallariRehberi, actualEtsyHesapKurallariRehberi);
        System.out.println(eKitaplar_page.EtsyHesapKurallariRehberi.getText());

    }

    //TC49
    @And("Amazonda Yol Haritasi Ekitabina tiklar ve indirir")
    public void amazondaYolHaritasiEkitabinaTiklarVeIndirir() {
        eKitaplar_page.EkitapIndir1.click();
        ResuableMethods.waitFor(4);


    }

    @And("İndirilen Kitabı acip dogru indigini teyit eder")
    public void indirilenKitabıAcipDogruIndiginiTeyitEder() {
        String fileLocation = "C:/Users/Ertuğrul/Downloads/amazon-100sf-ebook.pdf";
        File file = new File(fileLocation);

        if (file.exists()) {
            // Dosyayı tarayıcıda açın
            Driver.getDriver().get("file:///" + fileLocation);
            ResuableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ResuableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();

            PDDocument document = null;
            try {
                // Dosyayı açın
                document = PDDocument.load(file);

                // Dosyanın içeriğini okuyun
                PDFTextStripper pdfStripper = new PDFTextStripper();
                String text = pdfStripper.getText(document);
                System.out.println("Dosya içeriği: " + text);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (document != null) {
                    try {
                        // Dosyayı kapatın
                        document.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Dosya indirilmedi.");
        }
    }

    //TC50
    @And("Amazon Egitimi Ekitabina tiklar ve indirir")
    public void amazonEgitimiEkitabinaTiklarVeIndirir() {
        eKitaplar_page.EkitapIndir2.click();
        ResuableMethods.waitFor(15);
    }

    @And("İndirilen Kitabı acıp dogru indigini teyit eder")
    public void indirilenKitabıAcıpDogruIndiginiTeyitEder() {
        String fileLocation = "C:/Users/Ertuğrul/Downloads/amazon-ebook2022.pdf";
        File file = new File(fileLocation);

        if (file.exists()) {
            // Dosyayı tarayıcıda açın
            Driver.getDriver().get("file:///" + fileLocation);
            ResuableMethods.waitFor(4);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ResuableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();

            PDDocument document = null;
            try {
                // Dosyayı açın
                document = PDDocument.load(file);

                // Dosyanın içeriğini okuyun
                PDFTextStripper pdfStripper = new PDFTextStripper();
                String text = pdfStripper.getText(document);
                System.out.println("Dosya içeriği: " + text);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (document != null) {
                    try {
                        // Dosyayı kapatın
                        document.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Dosya indirilmedi.");
        }
    }

    //TC51
    @And("A dan Z ye Trendyol Egitimine tiklar ve indirir")
    public void aDanZYeTrendyolEgitimineTiklarVeIndirir() {
        eKitaplar_page.EkitapIndir3.click();
        ResuableMethods.waitFor(3);
    }

    @And("İndirilen Kitabi acip dogru indigini teyit eder")
    public void indirilenKitabiAcipDogruIndiginiTeyitEder() {
        String fileLocation = "C:/Users/Ertuğrul/Downloads/trendyol-egitimi-ekitap.pdf";
        File file = new File(fileLocation);

        if (file.exists()) {
            // Dosyayı tarayıcıda açın
            Driver.getDriver().get("file:///" + fileLocation);
            ResuableMethods.waitFor(3);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ResuableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();

            PDDocument document = null;
            try {
                // Dosyayı açın
                document = PDDocument.load(file);

                // Dosyanın içeriğini okuyun
                PDFTextStripper pdfStripper = new PDFTextStripper();
                String text = pdfStripper.getText(document);
                System.out.println("Dosya içeriği: " + text);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (document != null) {
                    try {
                        // Dosyayı kapatın
                        document.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Dosya indirilmedi.");
        }
    }

    //TC52
    @And("Sayfayi asagi indirip Etsy Kurallar Rehberi Egitimine tiklar ve indirir")
    public void sayfayiAsagiIndiripEtsyKurallarRehberiEgitimineTiklarVeIndirir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        eKitaplar_page.EkitapIndir4.click();
        ResuableMethods.waitFor(3);
    }

    @And("İndirilen EKitabi acip dogru indigini teyit eder")
    public void indirilenEKitabiAcipDogruIndiginiTeyitEder() throws Exception {
        String fileLocation = "C:/Users/Ertuğrul/Downloads/etsy-kurallari.pdf";
        File file = new File(fileLocation);

        if (!file.exists()) {
            throw new Exception("Dosya indirilmedi."); // Eğer dosya yoksa, Exception fırlatıyoruz.
        }

        // Dosyayı tarayıcıda açın
        Driver.getDriver().get("file:///" + fileLocation);

        // Bekleme süresi eklenir
       ResuableMethods.waitFor(4);

        // Sayfayı aşağı kaydırma işlemi
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        PDDocument document = null;
        try {
            // Dosyayı açın
            document = PDDocument.load(file);

            // Dosyanın içeriğini okuyun
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(document);
            System.out.println("Dosya içeriği: " + text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (document != null) {
                try {
                    // Dosyayı kapatın
                    document.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
