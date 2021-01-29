package jUnitDemo;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.runners.model.TestTimedOutException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAdditionUnit {

	@Test
	public void testAdditon() {
		Addition ad1 = new Addition();
		int val = ad1.additionTest();
		
		assertEquals(5,val);
	}

	@Test(timeout = 7000)
	public void testSubstration() throws Exception {
		Thread.sleep(4000);
		Substration s1 = new Substration();
		int sub = s1.substrationTest();
		
		assertEquals(-1, sub);
	}

}
