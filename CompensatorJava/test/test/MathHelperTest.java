package test;

import org.junit.Test;import static org.junit.Assert.*;

public class MathHelperTest {
	@Test
	public void testDiv() {
		assertEquals(10.0/5.0,MathHelper.div(10,5),0.1);
	}
}