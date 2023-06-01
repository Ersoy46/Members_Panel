@test
Feature: Üretici ve Toptancılar

  @tc06
  Scenario: TC06

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail bir adresi girer
    And  geçerli password girer
    And  uretici ve toptancılar sekmesine tıklar
    Then sayfayı aşagı-yukarı kaydırır tüm saticilari görür
    And iletişim kur butonuna tıklar
    And  telefon numarası girer ve doğrulama kodu geldiğini teyit eder


  @tc07
  Scenario: TC07
    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And  uretici ve toptancılar sekmesine tıklar
    And urunler butonuna tıklar
    Then sayfayı aşagı kaydırır tüm ürünleri görür
    And  iletişim kur butonuna tıklar ve whatsapp'a yönlendirdiğini teyit eder
   # And sayfayı kapatır.


  @tc08
  Scenario: TC08
    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And  uretici ve toptancılar sekmesine tıklar
    And search butonuna eşofman yazar
    Then ara sekmesine tıklar
    And Mossi isimli firmanın urunleri incele sekmesine tıklar
    And sayfa URL'sinin Mossi isimli firmaya ait olduğunu teyit eder
    Then sayfayı aşagı kaydırıp tüm ürünleri görür
    And ikinci sayfaya gecer tüm ürünleri kontrol eder
    And ucuncu sayfaya gecer tüm urunleri kontrol eder
   # And sayfayı kapatır.

    @tc09
    Scenario: TC09
      Given kullanıcı members.rexven.com sayfasına gider
      Then  geçerli mail adresi girer
      And  geçerli password girer
      And  uretici ve toptancılar sekmesine tıklar
      Then Uretici veya Toptancı ol sekmesine tıklar
      And acilan sayfada gerekli bilgileri doldurur
      And kayıt ol sekmesine tıklar
      And  Kullanıcı magaza bilgileri gecersiz. Lütfen kontrol ediniz yazısını görür
     # And sayfayı kapatır.



