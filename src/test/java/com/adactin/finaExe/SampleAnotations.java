package com.adactin.finaExe;
import org.junit.*;
import java.util.Date;

public class SampleAnotations {
	@BeforeClass
	public static void beforeClass() {
	System.out.println("@BeforeClass");
	}
	@Before
	public void beforeTest() {
		
		Date d=new Date();
		System.out.println(d);
		}
	@After
	public void afterTest() {
		System.out.println("@afterTest");
		}
	@Test
	public void Test1() {
		System.out.println("@Test1");
		String s="JunitCase";
		Assert.assertEquals("JunitCase", s);
		}
	@Test
	public void Test2() {
		System.out.println("@Test2");
		String s="Junit";
		Assert.assertEquals("Junit", s);
		}
	@Test
	public void Test3() {
		System.out.println("@Test3");
		String s="Case";
		Assert.assertEquals("Case", s);
		}
	
	@AfterClass
	public static void afterClass() {
		Date d=new Date();
		System.out.println(d);
		}

}
