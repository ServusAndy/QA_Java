package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCase2 {
	static int[] ar;

	@BeforeClass //находятся методы которые будут выполнены при начале теста
	public static void setUpBeforeClass() throws Exception {
		ar = new int[10];
		System.out.println("Before Class");
	}

	@AfterClass//единажды после класса
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before //
	public void setUp() throws Exception {
		ar[0] = 1;
		ar[1] = 2;
		ar[2] = 3;
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}
	//@Ignore // инотация пропускает выполнения теста
	@Test
	public void test() {
		ar[0] = 33;
		assertEquals(33, ar[0]);
		System.out.println("test");
	}
	
	@Test
	public void test2() {
		assertEquals(1, ar[0]);
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@Test(expected = ArithmeticException.class)
	public void test4() {
		assertEquals(4, 4/0);
	}
	
	@Test(expected = NullPointerException.class)
	public void test5() {
		Object o1 = null;
		Object o2 = "Hello";
		assertEquals(o2.hashCode(), o1.hashCode());
	}
	
	@Test(timeout = 5000)
	public void test6() {
		while(true);
	}

}
