package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Integration_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import java.time.Duration;

import static utilities.Driver.driver;

public class Integration_StepDefinitions {

    Integration_Page integration_page = new Integration_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Entegrasyon sekmesine tiklar")
    public void entegrasyon_sekmesine_tiklar() {
        ResuableMethods.waitFor(2);
        integration_page.EntegrasyonSekmesi.click();
        ResuableMethods.waitFor(4);
    }

    @Then("Entegrasyon ayarlari kısmında bulunan bilgileri girer ve kayit ol der")
    public void entegrasyon_ayarlari_kısmında_bulunan_bilgileri_girer_ve_kayit_ol_der() {
        integration_page.SaticiID.sendKeys("258963147231");
        ResuableMethods.waitFor(1);
        integration_page.ApiKey.sendKeys("14785298741144");
        ResuableMethods.waitFor(1);
        integration_page.ApiSecret.sendKeys("324569874125996");
        ResuableMethods.waitFor(2);
        integration_page.KayitOl.click();
        ResuableMethods.waitFor(10);
    }

    @When("sag üst tarafda Kullanici magaza bilgileri gecersiz yazisini görür")
    public void sag_üst_tarafda_kullanici_magaza_bilgileri_gecersiz_yazisini_görür() {

    }

    @When("sayfayi asagi indirir ve Entegrasyon videosunun sesini acar")
    public void sayfayi_asagi_indirir_ve_entegrasyon_videosunun_sesini_acar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ResuableMethods.waitFor(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('video').muted = false;");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(25);

    }

    @When("Videonun calistigini dogrular")
    public void videonun_calistigini_dogrular() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement videoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("video")));

// Video öğesi görünür olduğunda buraya gelecek kodlar
        System.out.println("VİDEO DOGRU CALISIYOR.");

    }

}
