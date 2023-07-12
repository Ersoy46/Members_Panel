@regresyon
  @integration

Feature: integration page

  @tc33
  Scenario:TC33
    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And Entegrasyon sekmesine tiklar
    Then Entegrasyon ayarlari kısmında bulunan bilgileri girer ve kayit ol der
    When  sag üst tarafda Kullanici magaza bilgileri gecersiz yazisini görür

  @tc34
  Scenario:TC34
    Given kullanıcı members.rexven.com sayfasına gider
    Then  gecerli mail adresi girer
    And  gecerli password girer
    And Entegrasyon sekmesine tiklar
    And sayfayi asagi indirir ve Entegrasyon videosunun sesini acar
    And Videonun calistigini dogrular

