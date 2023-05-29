@smoke
Feature: Members Home Page


  Scenario: TC01

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And  dashboard sayfasını aşagı-yukarı kaydırır tüm sayfayı görür
    And dashboard da bulunan profil butonuna tıklar
    When Ad Soyad bölümüne gerekli bilgileri girer
    Then Onayla der ve sayfayı kapatır.

  Scenario: TC02

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And  dashboard sayfasını aşagı-yukarı kaydırır tüm sayfayı görür
    And dashboard da bulunan entegrasyon butonuna tıklar
    And sayfayı aşagı kaydırır entegrasyon videosunun çalıştığını teyit eder.
    Then sayfayı kapatır.

  Scenario:TC03
    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And  dashboard sayfasını aşagı-yukarı kaydırır tüm sayfayı görür
    And dashboard da bulunan paket bilgisi butonuna tıklar
    And  fatura bilgileri sekmesine tıklar
    Then buradaki bilgileri doldurur ve onayla sekmesine tıklar.
    And  sayfayı küçülterek ekran kaydı alır
    And sayfayı kapatır.


