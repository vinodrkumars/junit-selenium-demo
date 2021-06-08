package org.work.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.work.demo.pages.HomePage;

public class SampleJUnitTest extends JUnitTestBase {

  private HomePage homepage;

  @BeforeEach
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
	driver.get(baseUrl);
	
	System.out.println("VK: baseUrl " + baseUrl);
	System.out.println("VK: header.getText() " + homepage.header.getText());
	System.out.println(driver.findElement(By.tagName("title")).getText());
	
    Assertions.assertFalse("".equals(homepage.header.getText()));
  }
  
}
