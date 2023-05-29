Feature: Members Home Page
@TC02
  Scenario: TC02

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And  dashboard sayfasını aşagı-yukarı kaydırır tüm sayfayı görür
    And dashboard da bulunan entegrasyon butonuna tıklar
    And sayfayı aşagı kaydırır entegrasyon videosunun çalıştığını teyit eder.
    Then sayfayı kapatır.