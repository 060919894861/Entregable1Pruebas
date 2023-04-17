package com.mycompany.projectprueba;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectPrueba {

    public WebDriver driver;
    public Map<String, Object> vars;
    public JavascriptExecutor js;

    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Navegamos hasta la url de la página a la cual queremos hacer la prueba 
        driver.get("https://testpages.herokuapp.com");
        //Le damos dimensiones a la página
        driver.manage().window().setSize(new Dimension(1054, 672));
        //Buscamos nuestro elemento llamado color y hacemos un click en él
        driver.findElement(By.name("colour")).click();
        //Escribirmos dentro del elemento encontrado, el código del color que deseamos elegir
        driver.findElement(By.name("colour")).sendKeys("#ec13da");
        // Se da click sobre la pantalla para esconder el recuadro de colores anterior
        driver.findElement(By.id("HTMLFormElements")).click();
        // Click sobre el elemento llamado date 
        driver.findElement(By.name("date")).click();
        // Ponemos la fecha elegida sobre el elemento date
        driver.findElement(By.name("date")).sendKeys("2004-07-12");
        // Buscamos y damos click sobre el elemanto datetime
        driver.findElement(By.name("datetime")).click();
        // Introducimos los datos para el elemento datetime
        driver.findElement(By.name("datetime")).sendKeys("2004-07-12T21:12");
        // De nuevo, un click sobre la pantalla 
        driver.findElement(By.id("HTMLFormElements")).click();
        // Click sobre el elemento email
        driver.findElement(By.name("email")).click();
        //Introducimos los datos para el elemento email
        driver.findElement(By.name("email")).sendKeys("aleja.13@gmail.com");
        // Buscamos y damos click sobre el elemento month 
        driver.findElement(By.name("month")).click();
        // Introducimos un año y mes para el elemento month
        driver.findElement(By.name("month")).sendKeys("2004-07");
        // En elemento number introducimos el número 18
        driver.findElement(By.name("number")).sendKeys("18");
        // Damos un click sobre el boton submit
        driver.findElement(By.name("submitbutton")).click();
    }
}
