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
 * Test: General page case
 * Generated by: Bharathwaj Ramesh (bharath@hello-pomelo.com)
 * Generated on Mon Feb 08 11:40:43 GMT 2021.
 */
@Test(
    name = "General page case",
    version = "1.0"
)
public class GeneralPageCase implements WebTest {
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

    // 2. Click 'Connexion1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#open-connexion-modal");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Connexion1'", booleanResult, TakeScreenshotConditionType.Failure);

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

    // 8. Click 'Liste participants'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Liste participants']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Liste participants'", booleanResult, TakeScreenshotConditionType.Failure);

    // 9. Click 'Tablettes'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Tablettes']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Tablettes'", booleanResult, TakeScreenshotConditionType.Failure);

    // 10. Click 'Mes rapports'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Mes rapports']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Mes rapports'", booleanResult, TakeScreenshotConditionType.Failure);

    // 11. Click 'Questionnaires'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Questionnaires']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Questionnaires'", booleanResult, TakeScreenshotConditionType.Failure);

    // 12. Click 'Liste d'attente1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = concat('Liste d', \"'\", 'attente')]");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Liste d'attente1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 13. Click 'Documents'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '  Documents']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Documents'", booleanResult, TakeScreenshotConditionType.Failure);

    // 14. Click 'Gestion des comptes'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = 'Gestion des comptes']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Gestion des comptes'", booleanResult, TakeScreenshotConditionType.Failure);

    // 15. Click 'Notification'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '\n                    \n                    Notification\n                    \n                    ']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Notification'", booleanResult, TakeScreenshotConditionType.Failure);

    // 16. Click 'Monsieur DIRECTION Delta_7'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[2]//span[. = 'Monsieur DIRECTION Delta_7']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Monsieur DIRECTION Delta_7'", booleanResult, TakeScreenshotConditionType.Failure);

  //TestLink Results
   	result = TestLinkAPIResults.TEST_PASSED;
   }
    catch (Exception e) {
	   	
	   	result = TestLinkAPIResults.TEST_FAILED;
	   }
    
   finally {

   	try {
   		TestLink.updateTestLinkResult("General page case" , null, result);
   	} catch (TestLinkAPIException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}

   }

    return ExecutionResult.PASSED;
  }
}
