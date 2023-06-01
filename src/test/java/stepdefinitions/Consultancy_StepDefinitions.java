package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Consultancy_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import static utilities.Driver.driver;

public class Consultancy_StepDefinitions {

    Consultancy_Page consultancy_page = new Consultancy_Page();
    Actions actions = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    @Then("Danısmanlik sekmesine tiklar")
    public void danısmanlik_sekmesine_tiklar() {
        consultancy_page.danismanlıkSekmesi.click();
        ResuableMethods.waitFor(3);

    }

    @Then("{int} tane danismanlik paketinin oldugunu kontrol eder")
    public void tane_danismanlik_paketinin_oldugunu_kontrol_eder(Integer int1) {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='60%';");
        ResuableMethods.waitFor(3);

    }

    //TC12
    @Then("sayfayı asagi indirip Amazon paketindeki avantajlari görüntüleye tıklar")
    public void sayfayı_asagi_indirip_amazon_paketindeki_avantajlari_görüntüleye_tıklar() {


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);


        consultancy_page.danismanlıkAmazonAvantajlariGoruntule.click();
        ResuableMethods.waitFor(2);


    }

    @Then("sayfayı asagi indirip Rexven Exclusive paketindeki avantajlari görüntüleye tıklar")
    public void sayfayı_asagi_indirip_rexven_exclusive_paketindeki_avantajlari_görüntüleye_tıklar() {

        consultancy_page.danismanlıkRexvenAvantajlariGoruntule.click();
        ResuableMethods.waitFor(2);


    }

    @Then("sayfayı asagİ indirip ETSY paketindeki avantajlari görüntüleye tıklar")
    public void sayfayı_asag_i̇_indirip_etsy_paketindeki_avantajlari_görüntüleye_tıklar() {

        consultancy_page.danismanlıkETSYAvantajlariGoruntule.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='65%';");
        ResuableMethods.waitFor(10);

    }

    @Then("sayfayı asagi indirip Amazon paketindeki iletisim kur sekmesine tıklar")
    public void sayfayı_asagi_indirip_amazon_paketindeki_iletisim_kur_sekmesine_tıklar() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        consultancy_page.danismanlıkAmazonIletisimKur.click();
        ResuableMethods.waitFor(2);

    }

    @Then("yeni acilan sayfada gerekli bilgileri doldurur ileri der")
    public void yeni_acilan_sayfada_gerekli_bilgileri_doldurur_ileri_der() {

        Driver.getDriver().get("https://form.jotform.com/230192653920958");
        ResuableMethods.switchToWindow("Yeni Sayfa");

        ResuableMethods.waitFor(4);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(faker.name().lastName()).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(faker.numerify("90"))
                .sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(faker.phoneNumber().phoneNumber()).perform();
        ResuableMethods.waitFor(2);

        WebElement ileriButonu = driver.findElement(By.xpath("//button[@id='form-pagebreak-next_25']"));
        ileriButonu.click();
    }

    @Then("pazaryeri olarak Amazonu isaretler ileri der")
    public void pazaryeri_olarak_amazonu_isaretler_ileri_der() {
        ResuableMethods.waitFor(2);
        WebElement formAmazonSecenegi = driver.findElement(By.xpath("//label[.='Amazon']"));
        formAmazonSecenegi.click();
        ResuableMethods.waitFor(2);

        WebElement ileriTusu = driver.findElement(By.xpath("//button[@id='form-pagebreak-next_40']"));
        ileriTusu.click();
        ResuableMethods.waitFor(2);

        WebElement pazarYeri = driver.findElement(By.xpath("//label[.='Evet, Yurt dışında (Amazon)']"));
        pazarYeri.click();
        ResuableMethods.waitFor(2);
        WebElement ileriTusuPazarYeri = driver.findElement(By.xpath("//button[@id='form-pagebreak-next_49']"));
        ileriTusuPazarYeri.click();

        ResuableMethods.waitFor(2);
        WebElement danismanlikSebebi = driver.findElement(By.xpath("//label[.=\"Türkiye'deki e-ticaretimi yurt dışına taşımak\"]"));
        danismanlikSebebi.click();
        ResuableMethods.waitFor(2);
        WebElement ileriTusuDanismanlikSebebi = driver.findElement(By.xpath("//button[@id='form-pagebreak-next_55']"));
        ileriTusuDanismanlikSebebi.click();

    }

    @Then("bütce sekmesinde {int}-{int}$ isaretler ve formu gönder yazısını görür")
    public void bütce_sekmesinde_$_isaretler_ve_formu_gönder_yazısını_görür(Integer int1, Integer int2) {
        ResuableMethods.waitFor(2);
        WebElement butce1 = driver.findElement(By.xpath("//label[.='0 - $1.000']"));
        butce1.click();
        ResuableMethods.waitFor(2);
        WebElement ileriTusuButce = driver.findElement(By.xpath("//button[@id='form-pagebreak-next_67']"));
        ileriTusuButce.click();
        ResuableMethods.waitFor(2);


        WebElement formGonder = driver.findElement(By.xpath("(//button[@class='form-submit-button submit-button jf-form-buttons jsTest-submitField'])[1]"));
        Assert.assertTrue(formGonder.isDisplayed());

        ResuableMethods.waitFor(3);

        WebElement geriTusu = driver.findElement(By.xpath("//button[@class='form-pagebreak-back   jf-form-buttons']"));
        geriTusu.click();
        ResuableMethods.waitFor(2);

    }

    @Then("{int}-{int}$ sekmesine tıklar ve acilan sayfada randevu al butonuna tıklar")
    public void $_sekmesine_tıklar_ve_acilan_sayfada_randevu_al_butonuna_tıklar(Integer int1, Integer int2) {

        ResuableMethods.waitFor(2);
        WebElement butce2 = driver.findElement(By.xpath("//label[.='$5.000 - $10.000']"));
        butce2.click();
        ResuableMethods.waitFor(2);
        WebElement ileriTusu = driver.findElement(By.xpath("//button[@id='form-pagebreak-next_67']"));
        ileriTusu.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%';");

        ResuableMethods.waitFor(8);

    }
}
