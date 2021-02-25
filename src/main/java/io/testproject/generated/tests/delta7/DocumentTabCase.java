package io.testproject.generated.tests.delta7;

import io.testproject.java.annotations.v2.Parameter;
import io.testproject.java.annotations.v2.Test;
import io.testproject.java.enums.ParameterDirection;
import io.testproject.java.enums.TakeScreenshotConditionType;
import io.testproject.java.sdk.v2.drivers.WebDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.reporters.TestReporter;
import io.testproject.java.sdk.v2.tests.WebTest;
import io.testproject.java.sdk.v2.tests.helpers.WebTestHelper;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

import java.lang.String;
import org.openqa.selenium.By;

/**
 * This class was automatically generated by TestProject
 * Project: Delta 7
 * Test: Document tab case
 * Generated by: Bharathwaj Ramesh (bharath@hello-pomelo.com)
 * Generated on Mon Feb 08 11:53:14 GMT 2021.
 */
@Test(
    name = "Document tab case",
    version = "1.0"
)
public class DocumentTabCase implements WebTest {
  @Parameter(
      description = "Auto generated application URL parameter",
      defaultValue = "http://delta7.francecentral.cloudapp.azure.com/",
      direction = ParameterDirection.INPUT
  )
  public String ApplicationURL;

  public ExecutionResult execute(WebTestHelper helper) throws FailureException {
    WebDriver driver = helper.getDriver();
    // set timeout for driver actions (similar to step timeout)
    driver.setTimeout(15000);
    TestReporter report = helper.getReporter();
    By by;
    boolean booleanResult;
    String result=null;
    try
    {
    // 1. Navigate to '{{ApplicationURL}}'
    //    Navigates the specified URL (Auto-generated)
    GeneratedUtils.sleep(500);
    booleanResult = driver.testproject().navigateToUrl(ApplicationURL);
    report.step(String.format("Navigate to '%s'",ApplicationURL), booleanResult, TakeScreenshotConditionType.Failure);

    // 2. Type 'ctcheng@delta7.org' in '_username'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#username2");
    booleanResult = driver.testproject().typeText(by,"ctcheng@delta7.org");
    report.step("Type 'ctcheng@delta7.org' in '_username'", booleanResult, TakeScreenshotConditionType.Failure);

    // 3. Click '_password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#password");
    booleanResult = driver.testproject().click(by);
    report.step("Click '_password'", booleanResult, TakeScreenshotConditionType.Failure);

    // 4. Type 'f%/R4Uk#](wUvM'V' in '_password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#password");
    booleanResult = driver.testproject().typeText(by,"f%/R4Uk#](wUvM'V");
    report.step("Type 'f%/R4Uk#](wUvM'V' in '_password'", booleanResult, TakeScreenshotConditionType.Failure);

    // 5. Click 'Je me connecte'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#login");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Je me connecte'", booleanResult, TakeScreenshotConditionType.Failure);

    // 6. Click 'Documents1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Documents']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Documents1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 7. Click 'modifier'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[1]/div/div/ul//a[. = 'modifier']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'modifier'", booleanResult, TakeScreenshotConditionType.Failure);

    // 8. Scroll window by ('0','57')
    GeneratedUtils.sleep(500);
    booleanResult = driver.testproject().scrollWindow(0,57);
    report.step("Scroll window by ('0','57')", booleanResult, TakeScreenshotConditionType.Failure);

    // 9. Click 'documentbundle_contract[submit]'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#documentbundle_contract_submit");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'documentbundle_contract[submit]'", booleanResult, TakeScreenshotConditionType.Failure);

    //TestLink Results
   	result = TestLinkAPIResults.TEST_PASSED;
   }
    catch (Exception e) {
	   	
	   	result = TestLinkAPIResults.TEST_FAILED;
	   }
    
   finally {

   	try {
   		TestLink.updateTestLinkResult("Document tab case" , null, result);
   	} catch (TestLinkAPIException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}

   }

    return ExecutionResult.PASSED;
  }
}