@tools
Feature: Tools Tab

  @tc14
  Scenario: TC14 Trendyol Kar Hesaplama

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And araclar sekmesinde bulunan Trendyol sekmesini tiklar
    And kar hesaplama secenegini tiklar
    And acilan sayfada  gerekli bilgileri girer ve hesaplama yapar
    Then cikan hesaplama sonucunun dogru oldugunu kontrol eder

