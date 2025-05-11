package Sayfalar;

import org.openqa.selenium.WebDriver;

public class Anasayfa extends Sayfa {
    public final String hesabım = "myAccount";
    public final String girisyap = "login";
    public final String urunArama = "[placeholder='Ürün, kategori veya marka ara']";

    public Anasayfa(WebDriver driver) {
        super(driver);
    }
}
