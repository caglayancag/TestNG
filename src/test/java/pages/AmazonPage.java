package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class AmazonPage {
    /*
    Page sayfaları o web sayfasında kullanılacak locate'ler ve varsa
    login işlemi gibi  basit method'lar için kullanılır.


     */
   public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="twotabsearchtextbox")
            public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuElementi;

}
