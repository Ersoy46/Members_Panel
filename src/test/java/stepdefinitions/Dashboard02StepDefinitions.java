package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import static utilities.Driver.driver;

public class Dashboard02StepDefinitions {

    Members_Page members_page = new Members_Page();

    @Then("dashboard da bulunan entegrasyon butonuna tıklar")
    public void dashboard_da_bulunan_entegraasyon_butonuna_tıklar() {
       members_page.dashboardentegrasyon.click();
       ResuableMethods.waitFor(2);
    }
    @Then("sayfayı aşagı kaydırır entegrasyon videosunun çalıştığını teyit eder.")
    public void sayfayı_aşagı_kaydırır_entegrasyon_videosunun_çalıştığını_teyit_eder() {

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(8);
    }
    @Then("sayfayı kapatır.")
    public void sayfayı_kapatır() {

        Driver.closeDriver();

    }

}
