package suiteDemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



	@RunWith(Suite.class)
	@SuiteClasses({JuintTest1.class,JuintTest2.class})
	public class SuiteDemo {

}
