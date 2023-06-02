@smoke
Feature: Tools Tab

  @tc14
  Scenario: TC14 Trendyol Kar Hesaplama

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And araclar sekmesinde bulunan Trendyol sekmesini tiklar
    And kar hesaplama secenegini tiklar
    And acilan sayfada  gerekli tum bilgileri girer ve hesaplama yapar
    Then cikan hesaplama sonucunun dogru oldugunu kontrol eder

    @tc15
    Scenario:TC15

      Given kullanıcı members.rexven.com sayfasına gider
      Then  geçerli mail adresi girer
      And  geçerli password girer
      And araclar sekmesinde bulunan Trendyol sekmesini tiklar
      And kar hesaplama secenegini tiklar
      And acilan sayfada kategoriyi secer
      And satis fiyatini yazar
      And hesapla butonuna basar
      Then  gelen sonuclarin dogrulamasini yapar



