package jbehave_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.Pending;
import com.tngtech.jgiven.annotation.Quoted;

public class Index_Test_Steps extends Stage<Index_Test_Steps> {
	
	@ExpectedScenarioState(required = true)
    WebDriver driver;
	
	public void I_visit_site(@Quoted String url) {
		driver.get(url);
	}

	public void I_check_the_header() {
		driver.findElement(By.xpath("//div[@class='index-header-wrapper']"));
	}
	
	@Pending
	public void I_click_on_index2_button() {

	}
	
		
}