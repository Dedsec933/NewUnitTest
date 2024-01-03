import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseArrayTest {

	@Test
		
		void testReverseArr() {
	        ReverseArray a = new ReverseArray();
	        int[] arr = {1, 2, 3, 4, 5};
	        int[] expected = {5, 4, 3, 2, 1};
	        int[] actual = a.reverseArr(arr);
	        assertArrayEquals(expected, actual);

	}

}
