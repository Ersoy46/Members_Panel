@regresyon
  @ekitaplar

  Feature: Ekitaplar Page

    @tc48
    Scenario: TC48
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Given E-Kitaplar sekmesine tiklar
      Then 4 adet E-Kitap oldugunu teyit eder ve isimlerini yazdirir


    @tc49
    Scenario: TC49
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Given E-Kitaplar sekmesine tiklar
      And Amazonda Yol Haritasi Ekitabina tiklar ve indirir
      And İndirilen Kitabı acip dogru indigini teyit eder

    @tc50
    Scenario: TC50
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Given E-Kitaplar sekmesine tiklar
      And Amazon Egitimi Ekitabina tiklar ve indirir
      And İndirilen Kitabı acıp dogru indigini teyit eder

    @tc51
    Scenario: TC51
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Given E-Kitaplar sekmesine tiklar
      And A dan Z ye Trendyol Egitimine tiklar ve indirir
      And İndirilen Kitabi acip dogru indigini teyit eder

    @tc52
    Scenario: TC52
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Given E-Kitaplar sekmesine tiklar
      And Sayfayi asagi indirip Etsy Kurallar Rehberi Egitimine tiklar ve indirir
      And İndirilen EKitabi acip dogru indigini teyit eder