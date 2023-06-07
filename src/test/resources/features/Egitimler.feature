@regresyon
  @egitimler

  Feature: Egitimler Page

    @tc37
    Scenario: TC37
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      When  sayfayi asagi indirir 8 adet egitim oldugunu teyit eder konsola yazdidir

    @tc38
    Scenario: TC38
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      When amazon baslangic egitimine tiklar
      And Video iceriginde bulunan diger egitimlerin calistigini teyit eder

    @tc39
    Scenario: TC39
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      When Etsy baslangic egitimine tiklar
      And Video iceriginde bulunan diger egitimlerin dogru calistigini teyit eder

    @tc40
    Scenario: TC40
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      When İKAS baslangic egitimine tiklar
      And Video icerisinde bulunan diger diger egitimlerin dogru calistigini teyit eder

    @tc41
    Scenario: TC41
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      Then sayfayi asagi indirir ve Amazon master egtimine tiklar
      And  Aktif üye olmadığınız için egitimlerden faydalanamazsınız yazisini görür ve kapatir

    @tc42
    Scenario: TC42
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      Then sayfayi asagi indirir ve Amazon Uzmanı egtimine tiklar
      And  Aktif üye olmadığınız için egitimlerden faydalanamazsınız yazisini görür ve kapatir

    @tc43
    Scenario: TC43
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      Then sayfayi asagi indirir ve Etsy master egitimine tiklar
      And Satin al sekmesine tiklar Payment Sayfasina yönlendirdigini kontrol eder

      @tc44
      Scenario: TC44
        Given kullanıcı members.rexven.com sayfasına gider
        Then  gecerli ücretli üyelik mail adresi girer
        And  gecerli password girer
        Then Egitimler sekmesine tiklar
        Then sayfayi asagi indirir ve Amazon master egitimine tiklar
        And Video icerisinde bulunan diger diger egitimlerin acildigini teyit eder

    @tc45
    Scenario: TC45
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli ücretli üyelik mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      Then sayfayi asagi indirir ve Amazon Uzmani egtimine tiklar
      And Video icerisinde bulunan diger diger egitimlerin acildigıni teyit eder

    @tc46
    Scenario: TC46
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli ücretli üyelik mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      Then sayfayi asagi indirir ve Trendyol Master egitimine tiklar
      And Video icerisinde bulunan diger egitimlerin acildiginı teyit eder

    @tc47
    Scenario: TC47
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli ücretli üyelik mail adresi girer
      And  gecerli password girer
      Then Egitimler sekmesine tiklar
      Then sayfayi asagi indirir ve Canli Egitim Kayitlarina tiklar
      And Video icerisinde bulunan diger egitimlerin acıldiginı teyit eder