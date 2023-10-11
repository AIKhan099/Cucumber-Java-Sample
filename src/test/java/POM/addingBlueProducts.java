package POM;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class addingBlueProducts {
	
	By contShoppong = By.xpath( "(//button[normalize-space()='Continue Shopping'])[1]");
	By cartBtn  = By.xpath("(//div[@class=\"shop-menu pull-right\"]/ul/li/a)[3]");
	By allCartPrdct = By.xpath("//table[@id=\"cart_info_table\"]/tbody/tr/td/h4");
	String eachPrdctName = "(//table[@id=\"cart_info_table\"]/tbody/tr/td/h4)[]";
	By accDel = By.xpath("(//ul[@class=\"nav navbar-nav\"]/li)[5]/a");
	
	WebDriver driver;
	public addingBlueProducts(WebDriver driver) {
		this.driver=driver;
	}
	public void AddingBlueProducts() throws IOException, ParseException, InterruptedException {
		JSONParser parser = new JSONParser();
		 FileReader reader = new FileReader(".\\JsonFiles\\blueProduct.json");
		 Object obj = parser.parse(reader);
		 JSONObject jsonObject = (JSONObject) obj;
		 
		 String op =(String) jsonObject.get("Blue Top");
//		 System.out.println(op);
		
		 Set arr = jsonObject.keySet(); 
//		 System.out.println(arr);
		 String[] stringArray = (String[]) arr.toArray(new String[0]);
		 
//		 JSONArray arr  = (JSONArray) jsonObject.get("");
		 for(int i=0; i<arr.size(); i++){   
			 String o = (String) jsonObject.get(stringArray[i]);  
			  System.out.println(o);  
//			  System.out.println(stringArray[i]);
			  driver.findElement(By.xpath(o)).click();
			  Thread.sleep(5000);
			  driver.findElement(contShoppong).click();
			}
	}
	public void checkingAllProductRBlue() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(cartBtn).click();
		Thread.sleep(2000);
		
//		 int iCount = 0;
		 int iCount = driver.findElements(allCartPrdct).size();
		 
		 System.out.println("Here is the dimention");
		 System.out.println(iCount);
		for (int i=1; i<= iCount; i++){
////            
			StringBuffer stringBuffer = new StringBuffer(eachPrdctName);
			 
	        // insert() method where position of character to be
	        // inserted is specified as in arguments
			StringBuffer ss = stringBuffer.insert(48, i);
			String str2 = ss.toString();  
	        System.out.println(str2);
	        String prduct = driver.findElement(By.xpath(str2)).getText();
	        System.out.println(prduct);
	        assert prduct.toLowerCase().contains("blue");
        }
	}
	
	public void accountDeletion() {
		driver.findElement(accDel).click();
	}
}
