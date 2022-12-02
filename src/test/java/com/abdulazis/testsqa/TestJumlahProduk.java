package com.abdulazis.testsqa;

import com.abdulazis.testsqa.drivers.DriverSingleton;
import com.abdulazis.testsqa.pages.JumlahProduk;
import com.abdulazis.testsqa.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestJumlahProduk {

    public static WebDriver driver;
    private JumlahProduk jumlahproduk;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void page() {
        jumlahproduk = new JumlahProduk();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Test(priority = 1)
    public void user_di_halaman_beranda_tokopedia(){
        driver.get(Constants.URL);
        delay(1);
    }

    @Test(priority = 2)
    public void user_input_celana_chino(){
        jumlahproduk.searchProduk();
        delay(1);
    }

    @Test(priority = 3)
    public void user_pilih_kategori_celana(){
        jumlahproduk.filterKategori();
        System.out.println("User pilih kategori celana harga maksimum Rp 100.000");
        delay(1);
    }


    @Test(priority = 4)
    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,1000)", "");
        js.executeScript("window.scrollBy(0,500)", "");
        js.executeScript("window.scrollBy(0,500)", "");
        System.out.println("Test Case Scroll Halaman Pencarian");
    }

    @Test(priority = 5)
    public void getTxtJumlahProduk(){
        List<WebElement> allTextChino = driver.findElements(By.xpath("//*[contains(@data-testid, 'spnSRPProdName')]"));
        if (allTextChino.size() != 0){
            System.out.println(allTextChino.size() + " total chino product found");

            for (WebElement productElements : allTextChino) {
                System.out.println(productElements.getText());

            }
        }
    }

    static void delay(int detik) {
        try {
            Thread.sleep(3000 * detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
