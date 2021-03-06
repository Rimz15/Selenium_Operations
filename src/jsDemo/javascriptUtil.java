package jsDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptUtil {
	
	public static void flash(WebElement element,WebDriver driver){
	JavascriptExecutor js = (JavascriptExecutor)driver;
	String bgcolor = element.getCssValue("backgroundcolor");
	for(int i=0;i<=500;i++){
		changecolor("#000000",element,driver);
		changecolor(bgcolor,element,driver);
	}

}
	
//Flashing
	public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		
		try{
			Thread.sleep(2000);
		}
		
		catch(InterruptedException e){
		
	}
}

//Drawing border
public static void drawborder(WebElement element,WebDriver driver){
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='3px solid red'", element);
	
}

public static String getTitleByJS(WebDriver driver){
	JavascriptExecutor js = (JavascriptExecutor)driver;
	String title= js.executeScript("return document.title;").toString();
	return title;
}

public static void clickElementByJS(WebElement element,WebDriver driver){
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",element);
}

public static void generateAlert(WebDriver driver, String message){
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("alert('" + message + "')");
}

public static void refreshPage(WebDriver driver){
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("history.go(0)");
}
}
	

