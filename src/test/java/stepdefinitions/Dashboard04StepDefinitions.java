package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.Members_Page;
import utilities.ResuableMethods;

public class Dashboard04StepDefinitions {
    Members_Page members_page=new Members_Page();

    @Then("dashboard da bulunan discord sekmesine tıklar")
    public void discord_sekmesine_tıklar() {
        members_page.dashboarddiscord.click();
        ResuableMethods.waitFor(5);
    }
    @Then("yeni açılan pencereye gider ve  hayır,teşekkürler sekmesine tıklar")
    public void yeni_açılan_pencereye_gider_ve_hayıt_teşekkürler_sekmesine_tıklar() {

       ResuableMethods.switchToWindow("https://discord.com/invite/YYG6N7xrNC");
       ResuableMethods.waitFor(5);



    }

}
