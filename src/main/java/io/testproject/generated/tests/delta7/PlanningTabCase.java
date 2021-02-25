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
 * Test: Planning tab case
 * Generated by: Bharathwaj Ramesh (bharath@hello-pomelo.com)
 * Generated on Mon Feb 08 10:43:43 GMT 2021.
 */
@Test(
    name = "Planning tab case",
    version = "1.0"
)
public class PlanningTabCase implements WebTest {
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

    // 2. Click 'Connexion'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Connexion']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Connexion'", booleanResult, TakeScreenshotConditionType.Failure);

    // 3. Click '_username'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#username2");
    booleanResult = driver.testproject().click(by);
    report.step("Click '_username'", booleanResult, TakeScreenshotConditionType.Failure);

    // 4. Type 'ctcheng@delta7.org' in '_username'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#username2");
    booleanResult = driver.testproject().typeText(by,"ctcheng@delta7.org");
    report.step("Type 'ctcheng@delta7.org' in '_username'", booleanResult, TakeScreenshotConditionType.Failure);

    // 5. Click '_password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#password");
    booleanResult = driver.testproject().click(by);
    report.step("Click '_password'", booleanResult, TakeScreenshotConditionType.Failure);

    // 6. Type 'f%/R4Uk#](wUvM'V' in '_password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#password");
    booleanResult = driver.testproject().typeText(by,"f%/R4Uk#](wUvM'V");
    report.step("Type 'f%/R4Uk#](wUvM'V' in '_password'", booleanResult, TakeScreenshotConditionType.Failure);

    // 7. Click 'Je me connecte'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#login");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Je me connecte'", booleanResult, TakeScreenshotConditionType.Failure);

    // 8. Click 'Créer un nouveau slot'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = ' Cr�er un nouveau slot']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Cr�er un nouveau slot'", booleanResult, TakeScreenshotConditionType.Failure);

    // 9. Click 'Choisir un département'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-session_department-container");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choisir un d�partement'", booleanResult, TakeScreenshotConditionType.Failure);

    // 10. Type 'par' in 'INPUT'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span/span/input");
    booleanResult = driver.testproject().typeText(by,"par");
    report.step("Type 'par' in 'INPUT'", booleanResult, TakeScreenshotConditionType.Failure);

    // 11. Click 'UL'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div/span//ul");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'UL'", booleanResult, TakeScreenshotConditionType.Failure);

    // 12. Click 'UL1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div[3]//ul");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'UL1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 13. Click 'SPAN'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[3]/div[1]/div/span/span/span");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'SPAN'", booleanResult, TakeScreenshotConditionType.Failure);

    // 14. Click 'SPAN1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[3]/div[2]/div/span/span/span");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'SPAN1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 15. Click 'UL2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[3]/div[3]//ul");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'UL2'", booleanResult, TakeScreenshotConditionType.Failure);

    // 16. Scroll window by ('0','555')
    GeneratedUtils.sleep(500);
    booleanResult = driver.testproject().scrollWindow(0,555);
    report.step("Scroll window by ('0','555')", booleanResult, TakeScreenshotConditionType.Failure);

    // 17. Click 'Choisir un formateur'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-session_trainer-container");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choisir un formateur'", booleanResult, TakeScreenshotConditionType.Failure);

    // 18. Click 'session[comment]'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#session_comment");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'session[comment]'", booleanResult, TakeScreenshotConditionType.Failure);

    // 19. Scroll window by ('0','448')
    GeneratedUtils.sleep(500);
    booleanResult = driver.testproject().scrollWindow(0,448);
    report.step("Scroll window by ('0','448')", booleanResult, TakeScreenshotConditionType.Failure);

    // 20. Type 'Testing' in 'session[comment]'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#session_comment");
    booleanResult = driver.testproject().typeText(by,"Testing");
    report.step("Type 'Testing' in 'session[comment]'", booleanResult, TakeScreenshotConditionType.Failure);

    // 21. Click 'Cycle Personnalisé'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#button_custom");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Cycle Personnalis�'", booleanResult, TakeScreenshotConditionType.Failure);

    // 22. Scroll window by ('0','129')
    GeneratedUtils.sleep(500);
    booleanResult = driver.testproject().scrollWindow(0,129);
    report.step("Scroll window by ('0','129')", booleanResult, TakeScreenshotConditionType.Failure);

    // 23. Click 'referent_trainer_contact_check'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[18]/div[2]//input");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'referent_trainer_contact_check'", booleanResult, TakeScreenshotConditionType.Failure);

    // 24. Click 'financier_info_check'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#financier_info_check");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'financier_info_check'", booleanResult, TakeScreenshotConditionType.Failure);

    // 25. Click 'checktrainer'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#checktrainer");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'checktrainer'", booleanResult, TakeScreenshotConditionType.Failure);

    // 26. Click 'session[appliquer]'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#session_appliquer");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'session[appliquer]'", booleanResult, TakeScreenshotConditionType.Failure);

  //TestLink Results
   	result = TestLinkAPIResults.TEST_PASSED;
   }
    catch (Exception e) {
	   	
	   	result = TestLinkAPIResults.TEST_FAILED;
	   }
    
   finally {

   	try {
   		TestLink.updateTestLinkResult("Planning tab case" , null, result);
   	} catch (TestLinkAPIException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}

   }

    return ExecutionResult.PASSED;
  }
}