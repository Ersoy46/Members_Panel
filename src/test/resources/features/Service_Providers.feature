@serviceproviders

Feature: Hizmet Saglayıcılar

  @tc10
  Scenario:TC10

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And  hizmet saglayıcılar sekmesine tıklar
    Then  acılan sayfayı asagı-yukarı kaydırır tüm sayfayi görür
    And clemta isimli sirketin altında bulunan indirim al butonuna basar ve tamam der
    And vidyoner isimli sirketin altında bulunan indirim al butonuna basar ve tamam der
    And shıppıng garage isimli sirketin altında bulunan indirim al butonuna basar ve tamam der
   # And sayfayı kapatır.
