package jUnitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("this is before class");
	}
	
	@Before
	public void before() {
		System.out.println("this is before");
	}
	
	@Ignore
	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("this is test 2");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("this is after class");
	}
	@After
	public void after() {
		System.out.println("this is after");
	}

}
