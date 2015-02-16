package test;

import org.junit.Test;

public class MathHelperTest {
	@Test
	public void testDiv() {
		org.junit.Assert.assertEquals(10.0/5.0,MathHelper.div(10,5),0.1);
	}
}