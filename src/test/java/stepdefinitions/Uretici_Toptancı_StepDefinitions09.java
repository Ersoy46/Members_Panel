package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Producer_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import static utilities.Driver.driver;

public class Uretici_Toptancı_StepDefinitions09 {

    Producer_Page producer_page = new Producer_Page();

    @Then("Uretici veya Toptancı ol sekmesine tıklar")
    public void uretici_veya_toptancı_ol_sekmesine_tıklar() {
        ResuableMethods.waitFor(2);
        producer_page.producerUreticiveyaToptancıOl.click();
        ResuableMethods.waitFor(3);
    }

    @Then("acilan sayfada gerekli bilgileri doldurur")
    public void acilan_sayfada_gerekli_bilgileri_doldurur() {
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("123456321365241")).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("123123123")).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("123123123")).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB)

                .sendKeys(faker.numerify("27")).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.numerify("542 542 42 42")).perform();
        ResuableMethods.waitFor(5);

        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @Then("kayıt ol sekmesine tıklar")
    public void kayıt_ol_sekmesine_tıklar() {
        producer_page.producerKvkk.click();
        ResuableMethods.waitFor(2);

        producer_page.producerKayitOl.click();
        ResuableMethods.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='85%';");
        ResuableMethods.waitFor(3);

    }

    @Then("Kullanıcı magaza bilgileri gecersiz. Lütfen kontrol ediniz yazısını görür")
    public void kullanıcı_magaza_bilgileri_gecersiz_lütfen_kontrol_ediniz_yazısını_görür() {

    }

}
