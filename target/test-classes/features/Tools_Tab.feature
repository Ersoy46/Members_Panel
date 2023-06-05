@smoke
Feature: Tools Tab

  @tc14
  Scenario: TC14 Trendyol Kar Hesaplama

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And araclar sekmesinde bulunan Trendyol sekmesini tiklar
    And trendyol kar hesaplama secenegini tiklar
    And acilan sayfada  gerekli tum bilgileri girer ve hesaplama yapar
    Then cikan hesaplama sonucunun dogru oldugunu kontrol eder

    @tc15
    Scenario:TC15

      Given kullanıcı members.rexven.com sayfasına gider
      Then  geçerli mail adresi girer
      And  geçerli password girer
      And araclar sekmesinde bulunan Trendyol sekmesini tiklar
      And trendyol kar hesaplama secenegini tiklar
      And acilan sayfada kategoriyi secer
      And satis fiyatini yazar
      And hesapla butonuna basar
      Then  gelen sonuclarin dogrulamasini yapar

  @tc16
  Scenario:TC16

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And Etsy kar hesaplama secenegini tiklar
    And acilan sayfada sadece Turkish Lira secer, satis fiyatını yazar  ve hesapla der
    And  gelen sonuclarin dogrulamasinı yapar


  @tc17
  Scenario:TC17

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
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
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And araclar sekmesinde bulunan Etsy sekmesini tiklar
    And cok satan saticilar sekmesine tiklar
    And acilan sayfada gerekli bilgileri  doldurur
    And filtreleri uygula secenegine tiklar
    Then sayfayi asagi dogru kaydırır ve sadece ilk 3 urunun fotografının geldigini kontrol eder















