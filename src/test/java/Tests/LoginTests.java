package Tests;

import Sayfalar.Anasayfa;
import Sayfalar.GirisYapSayfasi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests {


    private WebDriver driver;
    private Anasayfa anasayfa;
    private GirisYapSayfasi girisYapSayfasi;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anasayfa = new Anasayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
        driver.get("https://www.hepsiburada.com");
    }

    @Test
    void hepsiburadaLoginTesti() throws InterruptedException{

        anasayfa.elementGozukeneKadarBekle(anasayfa.hesabım);
        anasayfa.tusaBas(anasayfa.hesabım);
        anasayfa.elementGozukeneKadarBekle(anasayfa.girisyap);
        Thread.sleep(500);
        anasayfa.tusaBas(anasayfa.girisyap);

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.emailAdresi);
        girisYapSayfasi.alanaYazıYaz(girisYapSayfasi.emailAdresi, "seleniumotomasyonu@gmail.com");

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.emailSifresi);
        girisYapSayfasi.alanaSifreYaz(girisYapSayfasi.emailSifresi, "123456");

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisYapTusu);
    }
    @Test
    void urunAramaTest(){
        anasayfa.elementGozukeneKadarBekleCss(anasayfa.urunArama);
        anasayfa.alanaYaziYazCss(anasayfa.urunArama, "anahtarlık");
        anasayfa.klavyeTusuBas(anasayfa.urunArama, Keys.ENTER);
    }

    @AfterEach
    void tearDown(){
        driver.close();
    }
}
