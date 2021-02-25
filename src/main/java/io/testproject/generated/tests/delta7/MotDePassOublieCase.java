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
import java.lang.String;
import org.openqa.selenium.By;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

/**
 * This class was automatically generated by TestProject
 * Project: Delta 7
 * Test: Mot de pass oublie case
 * Generated by: Bharathwaj Ramesh (bharath@hello-pomelo.com)
 * Generated on Wed Dec 02 16:54:00 GMT 2020.
 */
@Test(
    name = "Mot de pass oublie case",
    version = "1.0"
)
public class MotDePassOublieCase implements WebTest {
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
    booleanResult = driver.testproject().navigateToUrl(ApplicationURL);
    report.step(String.format("Navigate to '%s'",ApplicationURL), booleanResult, TakeScreenshotConditionType.Inherit);

    // 2. Click 'Connexion'
    by = By.xpath("//a[. = 'Connexion']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Connexion'", booleanResult, TakeScreenshotConditionType.Inherit);

    // 3. Click '_username'
    by = By.cssSelector("#username2");
    booleanResult = driver.testproject().click(by);
    report.step("Click '_username'", booleanResult, TakeScreenshotConditionType.Inherit);

    // 4. Type 'dcoudurier@delta7.org' in '_username'
    by = By.cssSelector("#username2");
    booleanResult = driver.testproject().typeText(by,"dcoudurier@delta7.org");
    report.step("Type 'dcoudurier@delta7.org' in '_username'", booleanResult, TakeScreenshotConditionType.Inherit);

    // 5. Click 'Mot de passe oublié ?'
    by = By.cssSelector("#showResetpwForm");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Mot de passe oublié ?'", booleanResult, TakeScreenshotConditionType.Inherit);

    // 6. Click 'username'
    by = By.cssSelector("#username");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'username'", booleanResult, TakeScreenshotConditionType.Inherit);

    // 7. Type 'dcoudurier@delta7.org' in 'username'
    by = By.cssSelector("#username");
    booleanResult = driver.testproject().typeText(by,"dcoudurier@delta7.org");
    report.step("Type 'dcoudurier@delta7.org' in 'username'", booleanResult, TakeScreenshotConditionType.Inherit);

    // 8. Click 'Envoyer'
    by = By.cssSelector("#reset-password");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Envoyer'", booleanResult, TakeScreenshotConditionType.Inherit);

    // 9. Click '×'
    by = By.xpath("//div[3]/div/button[. = '�']");
    booleanResult = driver.testproject().click(by);
    report.step("Click '�'", booleanResult, TakeScreenshotConditionType.Inherit);
  //TestLink Results
   	result = TestLinkAPIResults.TEST_PASSED;
   }
    catch (Exception e) {
	   	
	   	result = TestLinkAPIResults.TEST_FAILED;
	   }
    
   finally {

   	try {
   		TestLink.updateTestLinkResult("Mot de pass oublie case" , null, result);
   	} catch (TestLinkAPIException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}

   }

    return ExecutionResult.PASSED;
  }
}