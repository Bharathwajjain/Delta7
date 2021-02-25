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
 * Test: Liste d'attente tab
 * Generated by: Bharathwaj Ramesh (bharath@hello-pomelo.com)
 * Generated on Mon Feb 08 11:03:52 GMT 2021.
 */
@Test(
    name = "Liste d'attente tab",
    version = "1.0"
)
public class ListeDattenteTab implements WebTest {
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

    // 2. Click '_username'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#username2");
    booleanResult = driver.testproject().click(by);
    report.step("Click '_username'", booleanResult, TakeScreenshotConditionType.Failure);

    // 3. Type 'ctcheng@delta7.org' in '_username'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#username2");
    booleanResult = driver.testproject().typeText(by,"ctcheng@delta7.org");
    report.step("Type 'ctcheng@delta7.org' in '_username'", booleanResult, TakeScreenshotConditionType.Failure);

    // 4. Click '_password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#password");
    booleanResult = driver.testproject().click(by);
    report.step("Click '_password'", booleanResult, TakeScreenshotConditionType.Failure);

    // 5. Type 'f%/R4Uk#](wUvM'V' in '_password'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#password");
    booleanResult = driver.testproject().typeText(by,"f%/R4Uk#](wUvM'V");
    report.step("Type 'f%/R4Uk#](wUvM'V' in '_password'", booleanResult, TakeScreenshotConditionType.Failure);

    // 6. Click 'Je me connecte'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#login");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Je me connecte'", booleanResult, TakeScreenshotConditionType.Failure);

    // 7. Click 'Liste d'attente'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = concat('  Liste d', \"'\", 'attente')]");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Liste d'attente'", booleanResult, TakeScreenshotConditionType.Failure);

    // 8. Click 'Choisir un departement1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-filter_department-container");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choisir un departement1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 9. Click 'Choisir une ville'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#select2-filter_city-container");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Choisir une ville'", booleanResult, TakeScreenshotConditionType.Failure);

    // 10. Click 'filter[submit]'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#filter_submit");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'filter[submit]'", booleanResult, TakeScreenshotConditionType.Failure);

//    // 11. Click 'Retour à la page d'accueil'
//    GeneratedUtils.sleep(500);
//    by = By.xpath("//a[. = concat(' Retour à la page d', \"'\", 'accueil')]");
//    booleanResult = driver.testproject().click(by);
//    report.step("Click 'Retour à la page d'accueil'", booleanResult, TakeScreenshotConditionType.Failure);

    // 12. Click 'Liste d'attente1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//span[. = concat('Liste d', \"'\", 'attente')]");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'Liste d'attente1'", booleanResult, TakeScreenshotConditionType.Failure);

    // 13. Click 'Télécharger'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = ' T�l�charger']");
    booleanResult = driver.testproject().click(by);
    report.step("Click 'T�l�charger'", booleanResult, TakeScreenshotConditionType.Failure);

  //TestLink Results
   	result = TestLinkAPIResults.TEST_PASSED;
   }
    catch (Exception e) {
	   	
	   	result = TestLinkAPIResults.TEST_FAILED;
	   }
    
   finally {

   	try {
   		TestLink.updateTestLinkResult("Liste d'attente tab" , null, result);
   	} catch (TestLinkAPIException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}

   }

    return ExecutionResult.PASSED;
  }
}
