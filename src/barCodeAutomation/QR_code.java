package barCodeAutomation;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QR_code {

	public static void main(String[] args) throws InterruptedException, IOException, NotFoundException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    String qrcode=driver.findElement(By.xpath("//*[@id='HTML4']/div[1]/img")).getAttribute("src");
	    System.out.println(qrcode);
	    URL url = new URL(qrcode);
	    BufferedImage bufferedimage=ImageIO.read(url);
	    LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedimage);
	    BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
	    Result result=new MultiFormatReader().decode(binarybitmap);
	    System.out.println(result.getText());
	    

	}

}
