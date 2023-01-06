package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    /*
    TestNG test method'larını ısım sırasına gore calıştırır

    priotity degeri verilen method'lar priority degeri kuçukten büyüğe doğru çalışır.

    esit olan priority degerlerınde harf sırasına gore çalışır
    eger priority degeri yazmazsak priority=0 kabul edilir.

     */

    @Test(priority = 6)
    public void ilkTest(){
        System.out.println("Ilk test calisti");
    }
    @Test
    public void ikinciTest(){
        System.out.println("Ikinci test calisti");
    }
    @Test(priority = -9)
    public void ucuncuTest(){
        System.out.println("Ucuncu test calisti");
    }

}
