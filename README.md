
# 🧪 Test Otomasyon Projesi – Hepsiburada UI Testleri

## 📌 Proje Açıklaması (Türkçe)

Bu proje, Hepsiburada web sitesine yönelik hazırlanmış basit bir Selenium tabanlı test otomasyon projesidir. Java ve JUnit 5 kullanılarak yazılmıştır.

**Test Senaryoları:**
1. **Login Testi (hepsiburadaLoginTesti):**  
   Kullanıcı ana sayfada "Giriş Yap" butonuna tıklayıp geçerli kullanıcı adı ve şifre ile giriş yapar.
2. **Ürün Arama Testi (urunAramaTest):**  
   Kullanıcı arama çubuğuna "anahtarlık" yazar ve arama yapar.

## 💡 Özellikler
- `Selenium WebDriver` ile web etkileşimi
- `JUnit 5` ile test framework desteği
- Sayfa nesne modeli (Page Object Model) yaklaşımı
- Türkçe isimlendirilmiş klasör ve metotlar (bilerek yapılmıştır)

## 📁 Proje Yapısı
```
├── Tests/
│   └── LoginTests.java
├── Sayfalar/
│   ├── Anasayfa.java
│   └── GirisYapSayfasi.java
```

## 🚀 Başlamak İçin
1. Projeyi klonlayın:
   ```bash
   git clone https://github.com/kullaniciAdi/projeAdi.git
   ```
2. IDE’nizde açın (örneğin IntelliJ IDEA)
3. `chromedriver` bilgisayarınızda kurulu olmalı ve sistem PATH'inde olmalı
4. `LoginTests` sınıfını çalıştırarak testleri başlatabilirsiniz

## ⚠️ Not
Projenin bazı kısımlarında `Thread.sleep()` metodu kullanılmıştır.  
Bu, sistemimde bazı elementlerin dinamik olarak geç yüklenmesinden dolayı geçici bir çözüm olarak uygulanmıştır.  
Daha stabil ve sistemler arası uyumlu çalışması için `WebDriverWait` gibi dinamik beklemelerin kullanılması tavsiye edilir.

---

# 🧪 Test Automation Project – Hepsiburada UI Tests

## 📌 Project Description (English)

This is a basic Selenium-based UI test automation project for the Hepsiburada website. The project is written in Java using JUnit 5.

**Test Cases:**
1. **Login Test (hepsiburadaLoginTesti):**  
   Simulates clicking "Login" on the homepage and signing in using valid credentials.
2. **Product Search Test (urunAramaTest):**  
   Types “anahtarlık” into the search bar and submits the search.

## 💡 Features
- Web interaction with `Selenium WebDriver`
- Test structure using `JUnit 5`
- Page Object Model pattern
- Folder and method names are intentionally written in Turkish

## 📁 Project Structure
```
├── Tests/
│   └── LoginTests.java
├── Sayfalar/
│   ├── Anasayfa.java
│   └── GirisYapSayfasi.java
```

## 🚀 Getting Started
1. Clone the project:
   ```bash
   git clone https://github.com/yourUsername/projectName.git
   ```
2. Open it in your IDE (e.g., IntelliJ IDEA)
3. Make sure `chromedriver` is installed and added to your system PATH
4. Run `LoginTests` to execute the test cases

## ⚠️ Note
In some parts of the project, `Thread.sleep()` is used as a static wait.  
This is a temporary workaround due to some dynamic loading issues on my system.  
For better cross-system compatibility, dynamic waits such as `WebDriverWait` are recommended.
