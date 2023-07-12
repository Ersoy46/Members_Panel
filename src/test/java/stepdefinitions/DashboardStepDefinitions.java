package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

import java.io.IOException;

import static utilities.Driver.driver;

public class DashboardStepDefinitions {

    Members_Page members_page = new Members_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanıcı members.rexven.com sayfasına gider")
    public void kullanıcı_members_rexven_com_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("Members.rexvenURL"));
        ResuableMethods.waitFor(3);


    }

    @Then("gecerli mail adresi girer")
    public void geçerli_mail_adresi_girer() {
        members_page.email.sendKeys("rexvendeneme@gmail.com" + Keys.ENTER);
        ResuableMethods.waitFor(2);


    }

    @Then("gecerli password girer")
    public void geçerli_password_girer() {
        members_page.password.sendKeys("rexven30194" + Keys.ENTER);
        ResuableMethods.waitFor(2);

    }

    @Then("Giriş yap sekmesine tıklar")
    public void giriş_yap_sekmesine_tıklar() {
        members_page.girişyap.click();

    }

    @Then("dashboard sayfasını aşagı-yukarı kaydırır tüm sayfayı görür")
    public void dashboard_sayfasını_aşagı_kaydırır_tüm_sayfayı_görür() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(3);
    }

    @Then("dashboard da bulunan profil butonuna tıklar")
    public void dashboard_da_bulunan_profil_butonuna_tıklar() {
        members_page.dashboardprofilbutonu.click();
        ResuableMethods.waitFor(3);

    }

    @When("Ad Soyad bölümüne gerekli bilgileri girer")
    public void ad_soyad_bölümüne_gerekli_bilgileri_girer() {
        members_page.profilAd.clear();
        ResuableMethods.waitFor(2);
        members_page.profilAd.sendKeys("Members" + Keys.ENTER);

        members_page.profilSoyad.clear();
        ResuableMethods.waitFor(2);
        members_page.profilSoyad.sendKeys("Test Deneme" + Keys.ENTER);
        ResuableMethods.waitFor(1);

    }

    @Then("Onayla der ve sayfayı kapatır.")
    public void onayla_der_ve_sayfayı_kapatır() {
        members_page.profilOnayla.click();
    }

    //TC02
    @Then("dashboard da bulunan entegrasyon butonuna tıklar")
    public void dashboard_da_bulunan_entegraasyon_butonuna_tıklar() {
        members_page.dashboardentegrasyon.click();
        ResuableMethods.waitFor(3);
    }

    @Then("sayfayı aşagı kaydırır entegrasyon videosunun çalıştığını teyit eder.")
    public void sayfayı_aşagı_kaydırır_entegrasyon_videosunun_çalıştığını_teyit_eder() {

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(8);
    }

    @Then("sayfayı kapatır.")
    public void sayfayı_kapatır() {

        Driver.closeDriver();

    }

    //TC03
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
        String fixedFirstName = "Ertuğrul";
        String fixedLastName = "Ersoy";
        String fixedCity = "İstanbul";
        String fixedCountry = "Türkiye";
        String fixedPhoneNumber = "542 542 42 42";

        actions.sendKeys(faker.lorem().sentence())
                .sendKeys(Keys.TAB)
                .sendKeys(fixedFirstName).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB)
                .sendKeys(fixedLastName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().streetAddress())
                .sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(faker.address().secondaryAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(fixedCity)
                .sendKeys(Keys.TAB).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(fixedCountry)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(fixedPhoneNumber)
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

    //TC04
    @Then("dashboard da bulunan discord sekmesine tıklar")
    public void discord_sekmesine_tıklar() {
        ResuableMethods.waitFor(2);
        members_page.dashboarddiscord.click();
        ResuableMethods.waitFor(5);
    }
    @Then("yeni açılan pencereye gider ve  hayır,teşekkürler sekmesine tıklar")
    public void yeni_açılan_pencereye_gider_ve_hayıt_teşekkürler_sekmesine_tıklar() {

        ResuableMethods.switchToWindow("https://discord.com/invite/YYG6N7xrNC");
        ResuableMethods.waitFor(5);
    }

    //TC05


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
        actions.sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP).perform();
        ResuableMethods.waitFor(3);


    }
    @Then("indirim al butonuna tıklar ve tamam sekmesine tıklar")
    public void indirim_al_butonuna_tıklar_ve_tamam_sekmesine_tıklar() {
        WebElement ifasTurkİndirimAl = driver.findElement(By.xpath("//div[@class='bg-white p-6 grid gap-4 overflow-hidden text-center sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 min-[2000px]:grid-cols-5 rounded-2xl']/div[1]//span[@class='flex']"));

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
