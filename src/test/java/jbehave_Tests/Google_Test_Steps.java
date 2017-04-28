package jbehave_Tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.Quoted;

public class Google_Test_Steps extends Stage<Google_Test_Steps> {
	
	@ExpectedScenarioState(required = true)
    WebDriver driver;
	
	public void I_visit_site(@Quoted String url) {
		driver.get(url);
	}
	
	public void I_check_the_logo() {
		driver.findElement(By.xpath("//div[@id='hplogo']"));
	}
	
	public void I_get_a_failed_result() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://wikipedia.com" );
	}

		
}