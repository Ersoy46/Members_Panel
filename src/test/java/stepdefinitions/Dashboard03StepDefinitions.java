package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import java.io.IOException;

import static utilities.Driver.driver;

public class Dashboard03StepDefinitions {

    Members_Page members_page = new Members_Page();

    @Then("dashboard da bulunan paket bilgisi butonuna tıklar")
    public void dashboard_da_bulunan_paket_bilgisi_butonuna_tıklar() {

        members_page.dashboardpaketbilgisi.click();
        ResuableMethods.waitFor(3);
    }

    @Then("fatura bilgileri sekmesine tıklar")
    public void fatura_bilgileri_sekmesine_tıklar() {
        members_page.faturaBilgisi.click();
        ResuableMethods.waitFor(3);
    }

    @Then("buradaki bilgileri doldurur ve onayla sekmesine tıklar.")
    public void buradaki_bilgileri_doldurur_ve_onayla_sekmesine_tıklar() {

        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        actions.sendKeys(faker.lorem().sentence())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName()).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().streetAddress())
                .sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(faker.address().secondaryAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(faker.address().country())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(faker.numerify("12345678901"))
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().industry())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("123456789"))
                .sendKeys(Keys.PAGE_DOWN).perform();

        ResuableMethods.waitFor(3);

    }

    @Then("sayfayı küçülterek ekran kaydı alır")
    public void sayfayı_küçülterek_ekran_kaydı_alır() throws IOException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%';");

     ResuableMethods.waitFor(3);

     ResuableMethods.getScreenshot("Ekran Resmi");
    }
}
