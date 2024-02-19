package practiceTestNG;

import org.junit.Test;
import org.testng.Reporter;

public class TestThree extends TestOne {
@Test
public void posting() {
	Reporter.log("Running posting");
}

@Test
public void demo() {
	Reporter.log("Running demo");
}
}
