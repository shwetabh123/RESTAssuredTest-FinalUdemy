package TestFramework;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import googleAPIs.payLoad;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import resources.*;


public class exceldriven {

	  private static Logger log =LogManager.getLogger(basics3.class.getName());
	Properties prop=new Properties();
	
	
	
	@Test(dataProvider="booksdata")
	
	
	public void addbook(String isbn ,String aisle) throws IOException
	{
		

        log.info("Host information"+prop.getProperty("HOST"));
		
        
        
		RestAssured.baseURI= "http://216.10.245.166";
		
		
		Response resp=given().
		
			header("Content-Type","application/json").
	
		
		//body(payLoad.addbook("bcd123eeee","2277")).
			
			
		body(payLoad.addbook(isbn,aisle)).
		
		
		
		when().
		post("/Library/Addbook.php").
		
		
		then().assertThat().statusCode(200).
		and().contentType(ContentType.JSON).
		
		extract().response();
		
		
		
	
		String response=resp.asString();// Convert Raw to String
		System.out.println(response);
	
		JsonPath js=new JsonPath(response);//Convert String to Json
		   String id=js.get("ID");
		   System.out.println(id);
		   
		   

		
	}
	
	
	@DataProvider(name="booksdata")
	
	public Object[][] getdata() {
		
	return	new   Object[][] { {"bcd123eeeee","2277"},{"bcd123eeeeee","2277"}    ,{"bcd123eeeeeeff","2277"}             };
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
