package org.mql.maven;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestAll extends TestSuite{
	public static Test suite() {
		final TestSuite suite = new TestSuite();
		/*suite.addTestSuite(TranslatorFrTest.class);
		suite.addTestSuite(TranslatorEsTest.class);
		suite.addTest(new TranslatorEsTest("testTranslateWorkToEs"));
		suite.addTest(new TranslatorFrTest("testTranslateWorkToFr"));*/
		suite.addTestSuite(TestCaclculator.class);
		suite.addTestSuite(TestCaclculator2.class);
		return suite;
	}

}
