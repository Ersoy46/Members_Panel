Feature: Members Home Page
  @TC03
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