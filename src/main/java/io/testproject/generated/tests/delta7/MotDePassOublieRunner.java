package io.testproject.generated.tests.delta7;

import io.testproject.java.enums.AutomatedBrowserType;
import io.testproject.java.execution.results.StepExecutionResult;
import io.testproject.java.sdk.v2.Runner;
import java.lang.Exception;
import java.lang.String;

/**
 * This class was automatically generated by TestProject
 * Provides an example how to run coded TestProject tests
 */
public class MotDePassOublieRunner {
  public static String developerToken = "C_Aptv8juqSawM1NGHb-oP-A5_WqX8EoCmv3ti2Aa-c1";

  public static AutomatedBrowserType browserType = AutomatedBrowserType.Chrome;

  public static void main(String[] args) {
    try {
      runMotDePassOublieCase();
    }
    catch (Exception e) {
    }
  }

  /**
   * Runs "MotDePassOublieCase"
   */
  public static StepExecutionResult runMotDePassOublieCase() throws Exception {
    Runner runner = Runner.createWeb(developerToken,browserType);
    return runner.run(new MotDePassOublieCase(), true);
  }
}
