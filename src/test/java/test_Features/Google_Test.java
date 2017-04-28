package test_Features;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tngtech.jgiven.annotation.IsTag;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.junit.SimpleScenarioTest;

import jbehave_Tests.Google_Test_Steps;

public class Google_Test extends SimpleScenarioTest<Google_Test_Steps> {
	
	@ProvidedScenarioState
	static WebDriver driver;
	
	@IsTag
	@Retention(RetentionPolicy.RUNTIME)
	public @interface GoogleCategory {}
		
	@BeforeClass
	public static void SetupDriver() {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void CloseDriver() {
				
		driver.quit();
		driver = null;
	}
		
	@GoogleCategory
    @Test
    public void visit_google_site() {
        when().I_visit_site("https://google.hu");
        then().I_check_the_logo();
    }
    
	@GoogleCategory
    @Test
    public void failing_test() {
    	when().I_visit_site("https://www.google.hu");
    	then().I_get_a_failed_result();
    }
    
}
