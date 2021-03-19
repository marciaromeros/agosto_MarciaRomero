package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.concurrent.TimeUnit;

public class prueba_mailchimp {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        GetProperties properties = new GetProperties();
        String chromeURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcia Romero\\IdeaProjects\\TestAutomation\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://login.mailchimp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    //Caso de prueba 1
    @Test
    public void validarTituloTest() {
        String title = "Login | Mailchimp";
        Assert.assertEquals(driver.getTitle(), title, "Títulos no coinciden");
        driver.close();
    }

    //Caso de prueba 2
    @Test
    public void iniciarSesionPageTest() {
        WebElement iniciarSesion = driver.findElement(By.xpath("//button[@type='submit'='log in']"));
        Assert.assertEquals(iniciarSesion, "Iniciar sesión", "Los textos no coinciden");

        driver.findElement(By.cssSelector("input.Need a Mailchimp account?"));
        driver.close();
    }

    //Caso de prueba 3
    @Test
    public void loginErrorTest() throws InterruptedException {
        String email = "XXXXX@gmail.com";
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.xpath("//button[@type='submit'='log in']")).click();
        Thread.sleep(2000);

        WebElement mensaje = driver.findElement(By.cssSelector("input.media-body"));
        WebElement checkbox = driver.findElement(By.cssSelector("input.dijitReset dijitCheckBoxInput"));
        driver.close();
    }

    //Caso de Prueba 4
    @Test
    public void fakeEmailTest() throws InterruptedException {
        driver .navigate().to( "https://login.mailchimp.com/signup/" );

        Thread.sleep(2000);
        String email = "123@gmail.com";
        driver.findElement(By.id("email")).sendKeys(email);
        driver.close();
    }


    //Caso de prueba5
    @Test
    public void dataProviderEmailTest(){

    }
}
