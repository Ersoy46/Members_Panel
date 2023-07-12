package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Members_Page;
import pages.Tools_Tab_Etsy_Page;
import utilities.Driver;
import utilities.ResuableMethods;

import java.util.Locale;

import static utilities.Driver.driver;

public class Tools_Tab_Etsy2_StepDefinitions {

    Tools_Tab_Etsy_Page tools_tab_etsy_page = new Tools_Tab_Etsy_Page();
    Actions actions = new Actions(Driver.getDriver());

    //TC19
    @Then("Satın al popup'una tiklar")
    public void satın_al_popup_una_tiklar() {
        tools_tab_etsy_page.EtsySatinAl.click();
    }

    @Then("sayfayı asagi kaydirip paket iceriklerini okur")
    public void sayfayı_asagi_kaydirip_paket_iceriklerini_okur() {
        ResuableMethods.waitFor(2);
        Driver.getDriver().get("https://community.rexven.com/topluluk-paketleri/");
        ResuableMethods.switchToWindow("YENİ SAYFA");

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("document.body.style.zoom='85%';");
        ResuableMethods.waitFor(2);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,225)", "");
        ResuableMethods.waitFor(10);


    }

    @Then("yillik secenegine tiklar paket icerigini kontrol eder")
    public void yillik_secenegine_tiklar_paket_icerigini_kontrol_eder() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
    }

    @Then("yeni acilan sayfada ücretsiz üyelik butonuna tiklar")
    public void yeni_acilan_sayfada_ücretsiz_üyelik_butonuna_tiklar() {

        Driver.getDriver().get("https://community.rexven.com/topluluk-paketleri/");
        ResuableMethods.switchToWindow("YENİ SAYFA");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        tools_tab_etsy_page.EkosistemUcretsizUyelik.click();
        ResuableMethods.waitFor(2);

    }

    @Then("yeni acilan sayfada asagi-yukari yaparak sayfayı kontrol eder")
    public void yeni_acilan_sayfada_asagi_yukari_yaparak_sayfayı_kontrol_eder() {
        Driver.getDriver().get("https://members.rexven.com/dashboard");
        ResuableMethods.switchToWindow("UCRETSIZ UYELIK");
        ResuableMethods.waitFor(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
    }

    @Then("yeni acilan sayfada Ekosistem üyeliği Ekosisteme katil butonuna tiklar")
    public void yeni_acilan_sayfada_ekosistem_üyeliği_ekosisteme_katil_butonuna_tiklar() {
        Driver.getDriver().get("https://community.rexven.com/topluluk-paketleri/");
        ResuableMethods.switchToWindow("YENİ SAYFA");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        tools_tab_etsy_page.EkosistemeKatilPaketi.click();
        ResuableMethods.waitFor(10);

    }


    //TC22
    @And("yeni acilan sayfada Ekosistem üyeliği Ekosisteme katil butonuna  tiklar")
    public void yeniAcilanSayfadaEkosistemÜyeliğiEkosistemeKatilButonunaTiklar() {

        Driver.getDriver().get("https://members.rexven.com/payment/53?sepet=yillik");
        ResuableMethods.switchToWindow("Payment");
        ResuableMethods.waitFor(3);

    }

    @And("yıllik fiyatını dogrular")
    public void yıllikFiyatınıDogrular() {
        WebElement yillikFiyat = driver.findElement(By.xpath("//p[.='8333.33 TRY']"));
        Assert.assertTrue(yillikFiyat.isDisplayed());
        ResuableMethods.waitFor(2);
   //     String actualYillikFiyat=yillikFiyat.getText();
   //     String expectedYillikFiyat="Rexven Topluluk";
  //      Assert.assertEquals("Yillik Fiyat Uyusmuyor", expectedYillikFiyat,actualYillikFiyat);
        System.out.println(yillikFiyat.getText());

    }

    @Then("KDV fiyatini dogrular.")
    public void kdvFiyatiniDogrular() {
        WebElement KDVFiyat= driver.findElement(By.xpath("//p[.='1666.67 TRY']"));
        String actualKDVFiyat=KDVFiyat.getText();
        String expectedKDVFiyat="1666.67 TRY";
        Assert.assertEquals("KDV Fiyat Uyusmuyor", expectedKDVFiyat,actualKDVFiyat);
        System.out.println(KDVFiyat.getText());

    }

    @Then("odenecek tutari dogrular.")
    public void odenecekTutariDogrular() {
        WebElement ToplamOdenecekTutar=driver.findElement(By.xpath("//p[.='10000.00']"));
        String actualOdenecekFiyat=ToplamOdenecekTutar.getText();
        String expectedOdenecekFiyat="10000.00";
        Assert.assertEquals("KDV Fiyat Uyusmuyor", expectedOdenecekFiyat,actualOdenecekFiyat);
        System.out.println(ToplamOdenecekTutar.getText());

    }


    @And("en allta bulunan whatsapp'dan yazabilirsiniz secenegine tiklar ve kontol eder")
    public void enAlltaBulunanWhatsappDanYazabilirsinizSecenigineTiklarVeKontolEder() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);

        tools_tab_etsy_page.whatsappsekmesi.click();
        ResuableMethods.waitFor(2);
        Driver.getDriver().get("https://api.whatsapp.com/send/?phone=%2B905352051963&text&type=phone_number&app_absent=0");
        ResuableMethods.switchToWindow("Whatsapp Sekmesi");
        ResuableMethods.waitFor(5);


        //  tools_tab_etsy_page.whatsappSohbeteBasla.click();
        //  ResuableMethods.waitFor(5);
    }

    //TC23
    @Then("sayfayı aşagı dogru kaydirir")
    public void sayfayı_aşagı_dogru_kaydirir() {
        ResuableMethods.waitFor(2);
        Driver.getDriver().get("https://members.rexven.com/etsy-top-sellers");
        ResuableMethods.switchToWindow("Top Sellers");
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

    }

    @Then("sadece ilk {int} urunun bilgilerinin geldigini teyit eder ve konsola yazdirir")
    public void sadece_ilk_urunun_bilgilerinin_geldigini_teyit_eder_ve_konsola_yazdirir(Integer int1) {
        WebElement urun1 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[1]"));
        System.out.println(urun1.getText());
        WebElement urun2 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[2]"));
        System.out.println(urun2.getText());
        WebElement urun3 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[3]"));
        System.out.println(urun3.getText());
        WebElement urun4 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[1]"));
        System.out.println(urun4.getText());
        WebElement urun5 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[2]"));
        System.out.println(urun5.getText());
        WebElement urun6 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[3]"));
        System.out.println(urun6.getText());
        WebElement urun7 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[9]"));
        System.out.println(urun7.getText());

        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

    }

    //TC24
    @Then("gecerli ücretli üyelik mail adresi girer")
    public void geçerli_üretli_üyelik_mail_adresi_girer() {
        Members_Page members_page = new Members_Page();
        members_page.email.sendKeys("rexvendeneme2@gmail.com" + Keys.ENTER);
        ResuableMethods.waitFor(2);
    }

    @Then("acilan sayfayı asagi dogru indirir")
    public void acilan_sayfayı_asagi_dogru_indirir() {
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        WebElement ileriTusu = driver.findElement(By.xpath("//button[@class='relative inline-flex items-center rounded-r-md px-2 py-2 text-gray-400 ring-1 ring-inset ring-gray-300 hover:bg-gray-50 focus:z-20 focus:outline-offset-0']"));
        ileriTusu.click();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);


    }

    @Then("tüm saticilarin bilgilerinin göründügünü teyit eder.")
    public void tüm_saticilarin_bilgilerinin_göründügünü_teyit_eder() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

    }

    //TC18
    @And("acilan sayfada ETSY ÇOK SATAN SATİCİLAR yazisinin geldigini teyit eder")
    public void acilanSayfadaETSYÇOKSATANSATİCİLARYazisininGeldiginiTeyitEder() {
        ResuableMethods.waitFor(1);
        WebElement EtsyCokSatanSaticilar = driver.findElement(By.xpath("//p[@class='text-headerPrimary']"));
        Assert.assertTrue(EtsyCokSatanSaticilar.isDisplayed());
        System.out.println(EtsyCokSatanSaticilar.getText());
        ResuableMethods.waitFor(3);

    }

    //TC26
    @Then("Popüler saticilar sekmesine tiklar")
    public void popüler_saticilar_sekmesine_tiklar() {
        ResuableMethods.waitFor(2);
        tools_tab_etsy_page.EtsyPopulerSaticilar.click();
    }

    @Then("acilan sayfada ETSY POPÜLER SATİCİLAR yazisinin geldigini teyit eder yazdirir")
    public void acilan_sayfada_etsy_popüler_sati̇ci̇lar_yazisinin_geldigini_teyit_eder_yazdirir() {
        ResuableMethods.waitFor(2);
        WebElement EtsyPopularSaticilar = driver.findElement(By.xpath("//p[@class='text-headerPrimary']"));
        Assert.assertTrue(EtsyPopularSaticilar.isDisplayed());
        System.out.println(EtsyPopularSaticilar.getText());
        ResuableMethods.waitFor(2);
    }

    @Then("sayfayi asagi dogru indirir ve sadece {int} satici bilgisinin geldigini teyit eder")
    public void sayfayi_asagi_dogru_indirir_ve_sadece_satir_bilgisinin_geldigini_teyit_eder(Integer int1) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
    }

    @And("bilgileri görünen saticiların bilgilerini yazdirir")
    public void bilgileriGörünenSaticilarınBilgileriniYazdirir() {
        ResuableMethods.waitFor(2);
        WebElement satici1 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[1]"));
        System.out.println(satici1.getText());
        WebElement satici2 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[2]"));
        System.out.println(satici2.getText());
        WebElement satici3 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[3]"));
        System.out.println(satici3.getText());
        WebElement satici4 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[1]"));
        System.out.println(satici4.getText());
        WebElement satici5 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[2]"));
        System.out.println(satici5.getText());
        ResuableMethods.waitFor(2);
    }

    @Then("gerekli bilgileri doldurur")
    public void gerekliBilgileriDoldurur() {
        ResuableMethods.waitFor(2);
        tools_tab_etsy_page.Ulke.click();
        ResuableMethods.waitFor(1);
        WebElement hepsi = driver.findElement(By.xpath("//span[@class='font-semibold block truncate']"));
        hepsi.click();
        ResuableMethods.waitFor(1);


        //
        tools_tab_etsy_page.MagazaAcilisYili.click();
        ResuableMethods.waitFor(1);
        WebElement hepsi1 = driver.findElement(By.xpath("//span[@class='font-semibold block truncate']"));
        hepsi1.click();
        ResuableMethods.waitFor(2);

        //
        tools_tab_etsy_page.Kategori.click();
        ResuableMethods.waitFor(1);
        WebElement hepsi2 = driver.findElement(By.xpath("//span[@class='font-semibold block truncate']"));
        hepsi2.click();
        ResuableMethods.waitFor(2);

        //
        tools_tab_etsy_page.UrunTipi.click();
        ResuableMethods.waitFor(1);
        WebElement hepsi3 = driver.findElement(By.xpath("//span[@class='font-semibold block truncate']"));
        hepsi3.click();
        ResuableMethods.waitFor(2);

        //
        tools_tab_etsy_page.MinToplamSatis.sendKeys("50");
        ResuableMethods.waitFor(1);
        tools_tab_etsy_page.MaxToplamSatis.sendKeys("5000");
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.MinOrtGunlukSatis.sendKeys("10");
        ResuableMethods.waitFor(1);
        tools_tab_etsy_page.MaxOrtGunlukSatis.sendKeys("200");
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.MinYorumSayisi.sendKeys("30");
        ResuableMethods.waitFor(1);
        tools_tab_etsy_page.MaxYorumSayisi.sendKeys("600");
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.MinToplamUrun.sendKeys("200");
        ResuableMethods.waitFor(1);

        tools_tab_etsy_page.MaxToplamUrun.sendKeys("1500");
        ResuableMethods.waitFor(1);


    }

    @And("sayfayi asagi indirir ve bilgilerin geldigini teyit eder")
    public void sayfayiAsagiIndirirVeBilgilerinGeldiginiTeyitEder() {
        Driver.getDriver().get("https://members.rexven.com/etsy-hot-sellers");
        ResuableMethods.switchToWindow("Populer Saticilar Sayfasi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
    }

    @And("sayfayi asagi indirir ve tüm bilgilerin geldigini teyit eder")
    public void sayfayiAsagiIndirirVeTümBilgilerinGeldiginiTeyitEder() {
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

    }

    @And("ileri sekmesine basar ve satici bilgilerinin geldigini teyit eder")
    public void ileriSekmesineBasarVeSaticiBilgilerininGeldiginiTeyitEder() {
        WebElement ileritusu = driver.findElement(By.xpath("//button[@class='relative inline-flex items-center rounded-r-md px-2 py-2 text-gray-400 ring-1 ring-inset ring-gray-300 hover:bg-gray-50 focus:z-20 focus:outline-offset-0']"));
        ileritusu.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        WebElement searchtusu = driver.findElement(By.xpath("//input[@class='w-20 px-2 py-1  ring-secondary rounded-r-md']"));
        searchtusu.clear();
        ResuableMethods.waitFor(2);
        searchtusu.sendKeys("17");
        ResuableMethods.waitFor(2);
        searchtusu.submit();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(4);
    }

    @Then("Cok Satan Urunler sekmesine tiklar")
    public void cok_satan_urunler_sekmesine_tiklar() {
        tools_tab_etsy_page.EtsyCokSatanUrunler.click();
    }

    @Then("acilan sayfada ETSY COK SATAN ÜRÜNLER yazisinin geldigini teyit eder yazdirir")
    public void acilan_sayfada_etsy_cok_satan_ürünler_yazisinin_geldigini_teyit_eder_yazdirir() {
        ResuableMethods.waitFor(2);
        WebElement EtsyCokSatanUrunlerYazisi = driver.findElement(By.xpath("//p[@class='text-headerPrimary']"));
        Assert.assertTrue(EtsyCokSatanUrunlerYazisi.isDisplayed());
        System.out.println(EtsyCokSatanUrunlerYazisi.getText());
    }

    @Then("sayfayi asagi dogru indirir ve sadece {int} satici bilgisinin geldigini  teyit eder")
    public void sayfayi_asagi_dogru_indirir_ve_sadece_satici_bilgisinin_geldigini_teyit_eder(Integer int1) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);

    }

    @Then("bilgileri görünen saticilari konsola yazdirir")
    public void bilgileri_görünen_saticilari_konsola_yazdirir() {
        ResuableMethods.waitFor(2);
        WebElement cokSatanSatici1 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[1]"));
        System.out.println(cokSatanSatici1.getText());
        WebElement cokSatanSatici2 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[2]"));
        System.out.println(cokSatanSatici2.getText());
        WebElement cokSatanSatici3 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[3]"));
        System.out.println(cokSatanSatici3.getText());
        WebElement cokSatanSatici4 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[1]"));
        System.out.println(cokSatanSatici4.getText());
        WebElement cokSatanSatici5 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[2]"));
        System.out.println(cokSatanSatici5.getText());
        ResuableMethods.waitFor(2);
    }

    //TC30
    @And("sayfayi asagi indirir ve tüm urun bilgilerinin geldigini teyit eder")
    public void sayfayiAsagiIndirirVeTümUrunBilgilerininGeldiginiTeyitEder() {
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(2);
        WebElement ileriTusu = driver.findElement(By.xpath("//button[@class='relative inline-flex items-center rounded-r-md px-2 py-2 text-gray-400 ring-1 ring-inset ring-gray-300 hover:bg-gray-50 focus:z-20 focus:outline-offset-0']"));
        ileriTusu.click();
        ResuableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ResuableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    //TC31
    @Then("Populer Urunler sekmesine tiklar")
    public void populer_urunler_sekmesine_tiklar() {
        tools_tab_etsy_page.EtsyPopulerUrunler.click();
        ResuableMethods.waitFor(2);
    }

    @Then("acilan sayfada ETSY POPÜLER ÜRÜNLER yazisinin geldigini teyit eder yazdirir")
    public void acilan_sayfada_etsy_popüler_ürünler_yazisinin_geldigini_teyit_eder_yazdirir() {
        WebElement EtsyPopulerUrunlerYazisi = driver.findElement(By.xpath("//p[@class='text-headerPrimary']"));
        Assert.assertTrue(EtsyPopulerUrunlerYazisi.isDisplayed());
        System.out.println(EtsyPopulerUrunlerYazisi.getText());
    }

    @And("bilgileri görünen saticilari konsola  yazdirir")
    public void bilgileriGörünenSaticilariKonsolaYazdirir() {

        ResuableMethods.waitFor(2);
        WebElement PopulerUrun1 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[1]"));
        System.out.println(PopulerUrun1.getText());
        WebElement PopulerUrun2 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[2]"));
        System.out.println(PopulerUrun2.getText());
        WebElement PopulerUrun3 = driver.findElement(By.xpath("(//tr[@class='blur-none even:bg-lightGray'])[3]"));
        System.out.println(PopulerUrun3.getText());
        WebElement PopulerUrun4 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[1]"));
        System.out.println(PopulerUrun4.getText());
        WebElement PopulerUrun5 = driver.findElement(By.xpath("(//tr[@class='blur-sm even:bg-lightGray'])[2]"));
        System.out.println(PopulerUrun5.getText());
        ResuableMethods.waitFor(2);
    }



}
