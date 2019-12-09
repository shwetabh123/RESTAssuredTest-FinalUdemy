package TestFramework;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import googleAPIs.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class basics2 {

	
	
	//POST Request--GoogleAPI
	
	@Test
	public void createPlaceAPI()
	{
		
		//add google map api is depricated...use below baseurl api created by rahul shetty
		
	//	RestAssured.baseURI="https://maps.googleapis.com";//This URL wont work as it is depricated
		

		
    	RestAssured.baseURI="http://216.10.245.166";
		
		given().
				
				
		queryParam("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
	//	queryParam("key","qaclick123").
		
	
		body(payLoad.createPlaceData()).
		
		when().
		post("/maps/api/place/add/json").
		
		
		then().
		
		assertThat().statusCode(200).and().
		contentType(ContentType.JSON).and().
		body("status",equalTo("OK"));

		
		
	// Create a place =response (place id)
		
		// delete Place = (Request - Place id)	
		

	}
}
