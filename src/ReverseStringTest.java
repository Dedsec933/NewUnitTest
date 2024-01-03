import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	 @Test
	    void Test() {
	        //fail("Not yet implemented");
	            ReverseString a = new ReverseString();
	            String expected = "7RC";
	            String actual = a.reverse("CR7");
	            assertEquals(expected, actual);
	            }
	}
