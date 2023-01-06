package tests.day14_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_NutellaTesti {
    @Test
    public void test01(){
        // amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");
        //nutella için arama yapın
        AmazonPage amazonPage=new AmazonPage();
     amazonPage.amazonAramaKutusu.sendKeys ("Nutella"+ Keys.ENTER);
        // sonucların nutella içerdiğini test edin

        String expectedSonuc="Nutella";
        String actualSonuc=Driver.getDriver().findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).getText();

        Assert.assertTrue(actualSonuc.contains(expectedSonuc));

        Driver.closeDriver();

    }
}
