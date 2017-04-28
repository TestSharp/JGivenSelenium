package test_Features;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tngtech.jgiven.annotation.IsTag;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.junit.SimpleScenarioTest;

import jbehave_Tests.Index_Test_Steps;

public class Index_Test extends SimpleScenarioTest<Index_Test_Steps> {
	
	@ProvidedScenarioState
	static WebDriver driver;
	
	@IsTag
	@Retention(RetentionPolicy.RUNTIME)
	public @interface IndexCategory {}
		
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
	
	@IndexCategory
    @Test
    public void visit_google_site() {
        when().I_visit_site("http://index.hu");
        then().I_check_the_header();
    }
	
	@IndexCategory
    @Test
    public void get_skipped_result() {
		when().I_visit_site("http://index.hu");
		then().I_click_on_index2_button();
	}
    
}