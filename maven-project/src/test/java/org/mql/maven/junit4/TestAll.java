package org.mql.maven.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({
	TestCalculator.class,
	TestExcepetion.class
})
public class TestAll {

}
