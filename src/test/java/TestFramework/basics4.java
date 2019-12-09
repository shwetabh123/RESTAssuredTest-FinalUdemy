package TestFramework;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import resources.*;
public class basics4 {

	  private static Logger log =LogManager.getLogger(basics3.class.getName());
	Properties prop=new Properties();
	
	
	@BeforeTest
	public void getData() throws IOException
	{
		//C:\work\RESTAssuredTest\env.properties
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//env.properties");
		prop.load(fis);
		
	
	}
	
	@Test
	public void postDataXML() throws IOException
	{
		String postdata=GenerateStringFromResource("D:\\RestAssuredWorkspace\\RESTAssuredTest-FinalUdemy\\postdata.xml");
	
	//add google map api is depricated...use below baseurl api (HOST) created by rahul shetty
		
		//	RestAssured.baseURI="https://maps.googleapis.com";//This URL wont work as it is depricated
			
		
	//  RestAssured.baseURI="https://maps.googleapis.com";
        log.info("Host information"+prop.getProperty("HOST"));
		
        
        //working for HOST not HOST1
        
		//HOST=http://216.10.245.166
        //HOST1 =https://maps.googleapis.com
		RestAssured.baseURI= prop.getProperty("HOST");
		
		
		Response resp=given().
		
				//WORKING with both key & key 1
	   //KEY=qaclick123
	   //KEY1=AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y
	//	queryParam("key",prop.getProperty("KEY")).
		queryParam("key",prop.getProperty("KEY1")).
	//	queryParam("key","qaclick123").
		
	//	queryParam("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
		
		body(postdata).
		
		
		when().
		post("/maps/api/place/add/xml").
		then().assertThat().statusCode(200).and().contentType(ContentType.XML).
		
		extract().response();
		
		
		String response=resp.asString();
		System.out.println(response);
		
		
		
		XmlPath x=ReusableMethods.rawToXML(resp);
		System.out.println(x.get("PlaceAddResponse.place_id"));
		System.out.println(x.get("status"));
		
		
		
	// Create a place =response (place id)
		
		// delete Place = (Request - Place id)	
		

	}
	
	public static String GenerateStringFromResource(String path) throws IOException {

	    return new String(Files.readAllBytes(Paths.get(path)));

	}
}
