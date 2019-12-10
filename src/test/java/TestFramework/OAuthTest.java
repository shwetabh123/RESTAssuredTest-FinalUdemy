package TestFramework;
import static io.restassured.RestAssured.given;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;



public class OAuthTest {
	
	
	
	//actualrequest
	@Test
	public void oauthtest() throws InterruptedException
	{
		
		//Step1:-
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_78.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/oauth/identifier?client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&as=AEUknH6EhG00jyxNUCM87Q&destination=https%3A%2F%2Frahulshettyacademy.com&approval_state=!ChRwUDMxbmFVYnRCOEFRSERvR1gxbxIfUTZjbnRKS2U0N3NTOEhuU1JuY2dubXJlejQyMTdoWQ%E2%88%99AJDr988AAAAAXe--Q9-TF2V2sJjxj9NefA9qa5i5WnTn&oauthgdpr=1&xsrfsig=ChkAeAh8T5POBN1FkOvVqdqa4izqUuDcTt_YEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow");
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("shwetabh.srivastava@gmail.com");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Faridabad@12345");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		String url=driver.getCurrentUrl();
		
		
		
		String partialcode=url.split("code=")[1];
		
		String code=partialcode.split("&scope")[0];
		
		System.out.println(code);
		
		
		
		
		
		
		
	//	Step2:-
	
		String getaccesstoken=given().
				urlEncodingEnabled(false).
		queryParam("code",code)
		.queryParam("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
		.queryParam("grant_type","authorization_code")
		
		.when().log().all()		
		//Access token url/resource owner endpoint

		.post("https://www.googleapis.com/oauth2/v4/token").asString();	
		JsonPath js=new JsonPath(getaccesstoken);
		
		String accessToken=js.getString("access_token");
		
		
		
		//Step3:-
		
		
	Response res=given().
	queryParam("access_token",accessToken)
	.when().log().all()
	
	//redirect URL/Callback URL

	.get("https://rahulshettyacademy.com/getCourse.php");
	String responseString=res.asString();
	System.out.println(responseString);
	}
	
	
	
	
}
