package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import static utilities.Driver.driver;

public class Dashboard05StepDefinitions {
    Members_Page members_page = new Members_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Then("dashboard da bulunan indirimleri keşfet sekmesine tıklar")
    public void dashboard_da_bulunan_indirimleri_keşfet_sekmesine_tıklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(4);
        members_page.dashboardindirimlerikesfet.click();
        ResuableMethods.waitFor(6);
    }

    @Then("sayfayı aşagı kaydırır ve tüm hizmet saglayıcıları görür")
    public void sayfayı_aşagı_kaydırır_ve_tüm_hizmet_saglayıcıları_görür() {


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(2);


    }

    @Then("indirim al butonuna tıklar ve tamam sekmesine tıklar")
    public void indirim_al_butonuna_tıklar_ve_tamam_sekmesine_tıklar() {
        WebElement ifasTurkİndirimAl = driver.findElement(By.xpath("//div[@class='bg-white p-6 grid gap-6 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-4 min-[2000px]:grid-cols-5 rounded-2xl']/div[1]//span[@class='flex']"));

        ifasTurkİndirimAl.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //  JavascriptExecutor js = (JavascriptExecutor) driver;
        //  js.executeScript("document.body.style.zoom='80%';");
        ResuableMethods.waitFor(2);

        WebElement indirimTamamButonu = driver.findElement(By.xpath("//button[@class='mt-3  text-white justify-center rounded-md bg-primary px-8 py-2 text-sm font-semibold  shadow-sm ring-1 ring-inset ring-gray-300 hover:bg-gray-50 hover:text-primary sm:col-start-1 sm:mt-0']"));
        indirimTamamButonu.click();
        ResuableMethods.waitFor(2);


    }
}
