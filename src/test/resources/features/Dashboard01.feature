Feature: Members Home Page

  @TC01
  Scenario: TC01

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And  dashboard sayfasını aşagı-yukarı kaydırır tüm sayfayı görür
    And dashboard da bulunan profil butonuna tıklar
    When Ad Soyad bölümüne gerekli bilgileri girer
    Then Onayla der ve sayfayı kapatır.

