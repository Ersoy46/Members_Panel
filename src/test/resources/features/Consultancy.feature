@consultancy

Feature: Danışmanlık Bölümü

  @tc11
  Scenario:TC11

    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And Danısmanlik sekmesine tiklar
    Then 3 tane danismanlik paketinin oldugunu kontrol eder

  @tc12
  Scenario:TC12
    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And Danısmanlik sekmesine tiklar
    And sayfayı asagi indirip Amazon paketindeki avantajlari görüntüleye tıklar
    And sayfayı asagi indirip Rexven Exclusive paketindeki avantajlari görüntüleye tıklar
    And sayfayı asagİ indirip ETSY paketindeki avantajlari görüntüleye tıklar


  @tc13
  Scenario:TC13
    Given kullanıcı members.rexven.com sayfasına gider
    Then  geçerli mail adresi girer
    And  geçerli password girer
    And Danısmanlik sekmesine tiklar
    And sayfayı asagi indirip Amazon paketindeki iletisim kur sekmesine tıklar
    And yeni acilan sayfada gerekli bilgileri doldurur ileri der
    And  pazaryeri olarak Amazonu isaretler ileri der
    And  bütce sekmesinde 0-1000$ isaretler ve formu gönder yazısını görür
    And 5000-10000$ sekmesine tıklar ve acilan sayfada randevu al butonuna tıklar





