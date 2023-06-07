@regresyon
  @SoruCevap

  Feature: Soru Cevap Kütüphanesi

    @tc53
    Scenario: TC53
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      And  Soru Cevap Kutuphanesi sekmesine tiklar
      And search kismina Emparazon yazar ara der
      Then gelen sonucların emparazon ile ilgili oldugunu teyit eder.

    @tc54
    Scenario: TC54
      Given kullanıcı members.rexven.com sayfasına gider
      Then  gecerli mail adresi girer
      And  gecerli password girer
      And  Soru Cevap Kutuphanesi sekmesine tiklar
      And sayfayi asagi dogru indirir
      Then ileri tusuna tiklar diger sayfalarin dogru acildigini teyit eder