package com.abdulazis.testsqa.pages;

import com.abdulazis.testsqa.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JumlahProduk {
    private WebDriver driver;
    public JumlahProduk() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Cari di Tokopedia']")
    WebElement searchForm;

    @FindBy(xpath = "//span[@title='Celana Pria']")
    WebElement btnCelanaPria;

    @FindBy(xpath = "//span[@title='Celana Chino Pria']")
    WebElement btnCelanaChinoPria;

    @FindBy(xpath = "//span[normalize-space()='Official Store']")
    WebElement btnOfficialStore;

    @FindBy(xpath = "//input[@placeholder='Harga Maksimum']")
    WebElement inputHargaMaksimum;


    public void searchProduk(){
        searchForm.sendKeys("celana chino");
        searchForm.sendKeys(Keys.ENTER);
    }

    public void filterKategori(){
        btnCelanaPria.click();
        delay(1);
        btnCelanaChinoPria.click();
        delay(1);
        btnOfficialStore.click();
        delay(1);
        inputHargaMaksimum.sendKeys("100000");
        delay(1);
        inputHargaMaksimum.sendKeys(Keys.ENTER);
    }

    public void txtJumlahProduk(){

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
