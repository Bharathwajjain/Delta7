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
 * Test: Choix du compte case
 * Generated by: Bharathwaj Ramesh (bharath@hello-pomelo.com)
 * Generated on Mon Feb 08 16:54:47 GMT 2021.
 */
@Test(
    name = "Choix du compte case",
    version = "1.0"
)
public class ChoixDuCompteCase implements WebTest {
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

    // 8. Click 'Choix du compte'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = ' Choix du compte']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choix du compte'", booleanResult, TakeScreenshotConditionType.Failure);

    // 9. Click 'Annuler1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Annuler']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Annuler1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 10. Click 'Choix du compte'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = ' Choix du compte']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choix du compte'", booleanResult, TakeScreenshotConditionType.Failure);

    // 11. Scroll window by ('0','177')
    GeneratedUtils.sleep(500);
    booleanResult = driver.testproject().scrollWindow(0,177);
    report.step("Scroll window by ('0','177')", booleanResult, TakeScreenshotConditionType.Failure);

    // 12. Click 'Choisir1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[1]/div/div/div/a[. = 'Choisir']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choisir1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 13. Click 'Revenir en Admin'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Revenir en Admin']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Revenir en Admin'", booleanResult, TakeScreenshotConditionType.Failure);

    // 14. Click 'Choix du compte'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = ' Choix du compte']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choix du compte'", booleanResult, TakeScreenshotConditionType.Failure);

    // 15. Click 'Choisir2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]/div/div/div/a[. = 'Choisir']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choisir2'", booleanResult, TakeScreenshotConditionType.Failure);

    // 16. Click 'Revenir en Admin1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Revenir en Admin']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Revenir en Admin1'", booleanResult, TakeScreenshotConditionType.Failure);

    //TestLink Results
   	result = TestLinkAPIResults.TEST_PASSED;
   }
    catch (Exception e) {
	   	
	   	result = TestLinkAPIResults.TEST_FAILED;
	   }
    
   finally {

   	try {
   		TestLink.updateTestLinkResult("Choix du compte case" , null, result);
   	} catch (TestLinkAPIException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}

   }

    return ExecutionResult.PASSED;
  }
}
