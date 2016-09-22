package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	int even = 12;
	MyInteger first = new MyInteger(even);
	int prime = 17;
	MyInteger second = new MyInteger(prime);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(even,first.getiValue());
		assertEquals(true,first.isEven());
		assertEquals(false,first.isOdd());
		assertEquals(false,first.isPrime());
		assertEquals(true,MyInteger.isEven(even));
		assertEquals(false,MyInteger.isOdd(even));
		assertEquals(false,MyInteger.isPrime(even));
		assertEquals(true,MyInteger.isEven(first));
		assertEquals(false,MyInteger.isOdd(first));
		assertEquals(false,MyInteger.isPrime(first));
		assertEquals(true,first.equals(even));
		assertEquals(false,first.equals(second));
	}
	
	@Test
	public void testTwo() {
		assertEquals(prime,second.getiValue());
		assertEquals(false,second.isEven());
		assertEquals(true,second.isOdd());
		assertEquals(true,second.isPrime());
		assertEquals(false,MyInteger.isEven(prime));
		assertEquals(true,MyInteger.isOdd(prime));
		assertEquals(true,MyInteger.isPrime(prime));
		assertEquals(false,MyInteger.isEven(second));
		assertEquals(true,MyInteger.isOdd(second));
		assertEquals(true,MyInteger.isPrime(second));
		assertEquals(false,second.equals(even));
		assertEquals(true,second.equals(new MyInteger(prime)));
	}
	
	

}
