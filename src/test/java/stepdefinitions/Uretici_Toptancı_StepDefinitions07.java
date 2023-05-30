package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import static utilities.Driver.driver;

public class Uretici_Toptancı_StepDefinitions07 {

    Members_Page members_page=new Members_Page();

    @Then("urunler butonuna tıklar")
    public void urunleri_incele_butonuna_tıklar() {
        ResuableMethods.waitFor(3);
        members_page.urunlerButonu.click();
        ResuableMethods.waitFor(2);

    }
    @Then("sayfayı aşagı kaydırır tüm ürünleri görür")
    public void sayfayı_aşagı_yukarı_kaydırır_tüm_ürünleri_görür() {

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);


        //  JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0,0);");




    }
    @Then("iletişim kur butonuna tıklar ve whatsapp'a yönlendirdiğini teyit eder")
    public void iletişim_kur_butonuna_tıklar_ve_whatsapp_a_yönlendirdiğini_teyit_eder() {

        members_page.urunleriInceleIletisimKur.click();
        ResuableMethods.waitFor(3);
        ResuableMethods.switchToWindow("Whatsapp");
        ResuableMethods.waitFor(5);


    }
}
