package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa {
    public final String emailAdresi = "txtUserName";
    public final String emailSifresi = "txtPassword";
    public final String girisYapTusu = "btnLogin";

    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
