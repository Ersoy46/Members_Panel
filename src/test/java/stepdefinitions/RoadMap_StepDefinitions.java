package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RoadMap_Page;
import utilities.Driver;
import utilities.ResuableMethods;

public class RoadMap_StepDefinitions {

    RoadMap_Page roadMap_page=new RoadMap_Page();
    Actions actions=new Actions(Driver.getDriver());

    @When("yol haritasi sekmesine tiklar")
    public void yol_haritasi_sekmesine_tiklar() {
       actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        roadMap_page.yolHaritasiSekmesi.click();
        ResuableMethods.waitFor(2);
    }
    @When("stage kisminda bulunan sekmeleri dogrulamasini yapar")
    public void stage_kisminda_bulunan_sekmeleri_dogrulamasini_yapar() {
        Assert.assertTrue(roadMap_page.egitimlereBasladim.isDisplayed());
        System.out.println(roadMap_page.egitimlereBasladim.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(2);

        Assert.assertTrue(roadMap_page.amazonEtsyHesabimiActim.isDisplayed());
        System.out.println(roadMap_page.amazonEtsyHesabimiActim.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(1);

        Assert.assertTrue(roadMap_page.ilkSatisimiYaptim.isDisplayed());
        System.out.println(roadMap_page.ilkSatisimiYaptim.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(1);

        Assert.assertTrue(roadMap_page.binDolaraUlastim.isDisplayed());
        System.out.println(roadMap_page.binDolaraUlastim.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(1);

        Assert.assertTrue(roadMap_page.onBinDolaraUlastim.isDisplayed());
        System.out.println(roadMap_page.onBinDolaraUlastim.getText());
        ResuableMethods.waitFor(1);
    }


    @And("sayfayi asagi indirir ve {int} adet yol haritasi yazisi oldugunu dogrular")
    public void sayfayiAsagiIndirirVeAdetYolHaritasiYazisiOldugunuDogrular(int arg0) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);

        Assert.assertTrue(roadMap_page.urunuOlmayanPrivateLabel.isDisplayed());
        System.out.println(roadMap_page.urunuOlmayanPrivateLabel.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(2);

        Assert.assertTrue(roadMap_page.amazondaArbirraj.isDisplayed());
        System.out.println(roadMap_page.amazondaArbirraj.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(2);

        Assert.assertTrue(roadMap_page.urunuOlanPrivateLabel.isDisplayed());
        System.out.println(roadMap_page.urunuOlanPrivateLabel.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(roadMap_page.sermayesiAzAmazonUzmani.isDisplayed());
        System.out.println(roadMap_page.sermayesiAzAmazonUzmani.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(2);

        Assert.assertTrue(roadMap_page.urunuOlmayanEtsySatis.isDisplayed());
        System.out.println(roadMap_page.urunuOlmayanEtsySatis.getText());
        System.out.println(" ");
        ResuableMethods.waitFor(2);

        Assert.assertTrue(roadMap_page.urunuOlanEtsySatıs.isDisplayed());
        System.out.println(roadMap_page.urunuOlanEtsySatıs.getText());
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);




    }
}
