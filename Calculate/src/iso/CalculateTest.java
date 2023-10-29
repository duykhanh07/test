package iso;

import static org.junit.Assert.assertEquals;
import junit.framework.*;

import org.junit.Test;

public class CalculateTest {
	
	Calculate cal;

	public CalculateTest() {
		cal=new Calculate();
		
	}
	@Test
	public void testAdd() {
		int rs=cal.add(5, 6);
		int ex=11;
		assertEquals(ex, rs);
	}
}