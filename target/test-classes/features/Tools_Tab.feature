@regresyon
@Tools_Tab
Feature: Tools Tab

  @tc14
  Scenario: TC14 Trendyol Kar Hesaplama

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Trendyol sekmesini tiklar
    And trendyol kar hesaplama secenegini tiklar
    And acilan sayfada  gerekli tum bilgileri girer ve hesaplama yapar
    Then cikan hesaplama sonucunun dogru oldugunu kontrol eder

  @tc15
  Scenario:TC15

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Trendyol sekmesini tiklar
    And trendyol kar hesaplama secenegini tiklar
    And acilan sayfada kategoriyi secer
    And satis fiyatini yazar
    And hesapla butonuna basar
    Then  gelen sonuclarin dogrulamasini yapar

  @tc16
  Scenario:TC16

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And Etsy kar hesaplama secenegini tiklar
    And acilan sayfada sadece Turkish Lira secer, satis fiyatını yazar  ve hesapla der
    And  gelen sonuclarin dogrulamasinı yapar


  @tc17
  Scenario:TC17

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And Etsy kar hesaplama secenegini tiklar
    And magaza para birimi olarak Turkish Lira secer
    And  vergi numarasi yok
    And  Offsite Ads  %12
    And ucretsiz listeleme var olarak secer
    Then gerekli tüm alanlara satis bilgileri girer
    And  hesapla butonuna tiklar
    And gelen sonuclarin dogrulamsını yapar

  @tc18
  Scenario:TC18

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    And acilan sayfada ETSY ÇOK SATAN SATİCİLAR yazisinin geldigini teyit eder


  @tc19
  Scenario:TC19

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    And acilan sayfada gerekli bilgileri  doldurur
    And filtreleri uygula secenegine tiklar
    And Satın al popup geldigini teyit eder dogrular.


  @tc20
  Scenario: TC20

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    And acilan sayfada gerekli bilgileri  doldurur
    And filtreleri uygula secenegine tiklar
    And Satın al popup'una tiklar
    And sayfayı asagi kaydirip paket iceriklerini okur
    And  yillik secenegine tiklar paket icerigini kontrol eder


  @tc21
  Scenario: TC21

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    And acilan sayfada gerekli bilgileri  doldurur
    And filtreleri uygula secenegine tiklar
    And Satın al popup'una tiklar
    And  yeni acilan sayfada ücretsiz üyelik butonuna tiklar
    And yeni acilan sayfada asagi-yukari yaparak sayfayı kontrol eder


  @tc22
  Scenario: TC22

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    And acilan sayfada gerekli bilgileri  doldurur
    And filtreleri uygula secenegine tiklar
    And Satın al popup'una tiklar
    And  yeni acilan sayfada Ekosistem üyeliği Ekosisteme katil butonuna tiklar
   # And yıllik fiyatını dogrular
   # Then KDV fiyatini dogrular.
   # Then odenecek tutari dogrular.


  @tc23
  Scenario: TC23

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    And acilan sayfada gerekli bilgileri  doldurur
    And filtreleri uygula secenegine tiklar
    And Satın al popup'una tiklar
    And  yeni acilan sayfada Ekosistem üyeliği Ekosisteme katil butonuna  tiklar
   # And en allta bulunan whatsapp'dan yazabilirsiniz secenegine tiklar ve kontol eder

  @tc24
  Scenario: TC24

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    And acilan sayfada gerekli bilgileri  doldurur
    And filtreleri uygula secenegine tiklar
    And Satın al popup'una tiklar
    And  sayfayı aşagı dogru kaydirir
    And sadece ilk 3 urunun bilgilerinin geldigini teyit eder ve konsola yazdirir

  @tc25
  Scenario: TC25

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli ücretli üyelik mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    Then acilan sayfayı asagi dogru indirir
    Then tüm saticilarin bilgilerinin göründügünü teyit eder.


  @tc26
  Scenario: TC26

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And Popüler saticilar sekmesine tiklar
    Then acilan sayfada ETSY POPÜLER SATİCİLAR yazisinin geldigini teyit eder yazdirir
    And sayfayi asagi dogru indirir ve sadece 3 satici bilgisinin geldigini teyit eder
    And bilgileri görünen saticiların bilgilerini yazdirir


  @tc27
  Scenario: TC27

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And Popüler saticilar sekmesine tiklar
    Then gerekli bilgileri doldurur
    And filtreleri uygula secenegine tiklar
    And sayfayi asagi indirir ve bilgilerin geldigini teyit eder


  @tc28
  Scenario: TC28

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli ücretli üyelik mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And Popüler saticilar sekmesine tiklar
    And sayfayi asagi indirir ve tüm bilgilerin geldigini teyit eder
    And ileri sekmesine basar ve satici bilgilerinin geldigini teyit eder


  @tc29
  Scenario: TC29

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    Then Cok Satan Urunler sekmesine tiklar
    Then acilan sayfada ETSY COK SATAN ÜRÜNLER yazisinin geldigini teyit eder yazdirir
    And sayfayi asagi dogru indirir ve sadece 3 satici bilgisinin geldigini  teyit eder
    And  bilgileri görünen saticilari konsola yazdirir

  @tc30
  Scenario: TC30

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli ücretli üyelik mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    Then Cok Satan Urunler sekmesine tiklar
    And sayfayi asagi indirir ve tüm urun bilgilerinin geldigini teyit eder

  @tc31
  Scenario: TC31

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    Then Populer Urunler sekmesine tiklar
    Then acilan sayfada ETSY POPÜLER ÜRÜNLER yazisinin geldigini teyit eder yazdirir
    And sayfayi asagi dogru indirir ve sadece 3 satici bilgisinin geldigini  teyit eder
    And  bilgileri görünen saticilari konsola  yazdirir

  @tc32
  Scenario: TC32

    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli ücretli üyelik mail adresi girer
    And  gecerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    Then Populer Urunler sekmesine tiklar
    And sayfayi asagi indirir ve tüm urun bilgilerinin geldigini teyit eder
