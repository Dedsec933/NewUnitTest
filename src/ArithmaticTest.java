import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmaticTest {

	@Test
	void test() {
	Arithmatic a=new Arithmatic();
	int expected=15;
	int actual=a.add(10,5);
	assertEquals(expected,actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void test1() {
	Arithmatic a=new Arithmatic();
	int expected=50;
	int actual=a.mul(10,5);
	assertEquals(expected,actual);
		//fail("Not yet implemented");
	}
	@Test
	void test2() {
	Arithmatic a=new Arithmatic();
	int expected=2;
	int actual=a.div(10,5);
	assertEquals(expected,actual);
		//fail("Not yet implemented");
	}
}
