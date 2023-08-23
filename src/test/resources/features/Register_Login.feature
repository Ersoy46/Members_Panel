@regresyon
@

Feature: Register-Login Olma

  @tc55
  Scenario:TC55
    Given kullanıcı members.rexven.com sayfasına gider
    Then gecerli mail adresi girer
    And gecerli password girer


  @tc56
  Scenario:TC56
    Given kullanıcı members.rexven.com sayfasına gider
    Then gecerli mail adresi girer
    And gecersiz password girer
    Then yanlis sifre ve mail yazisini görür

  @tc57
  Scenario:TC57
    Given kullanıcı members.rexven.com sayfasına gider
    Then gecersiz mail adresi girer
    And gecerli password girer
    Then yanlis sifre ve mail yazisıni görür

  @tc58
  Scenario:TC58
    Given kullanıcı members.rexven.com sayfasına gider
    Then gecersiz mail adresi girer
    And gecersiz password girer
    Then yanlis sifre ve mail yazısini görür

  @tc59
  Scenario:TC59
    Given kullanıcı members.rexven.com sayfasına gider
    Then kayit ol sekmesine tiklar
    And gelen sayfada gerekli bilgileri doldurur
    Then bu email kullanılyor yazisini görür

  @tc60
  Scenario:TC60
    Given kullanıcı members.rexven.com sayfasına gider
    Then kayit ol sekmesine tiklar
    And gelen sayfada gerekli bilgileri eksik doldurur
    Then boş alan bırakılamaz uyari yazisini görür
    And  kvkk butonunu işaretlemez ve uyarı yazisini görür

  @tc61
  Scenario:TC61
    Given kullanıcı members.rexven.com sayfasına gider
    Then kayit ol sekmesine tiklar
    And gelen sayfada gerekli  bilgileri doldurur
    Then şifre ve şifre tekrari birbiri ile farklı girer
    And Geçersiz giriş: Parola alanları eşleşmiyor yazisini görür




