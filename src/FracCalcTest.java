

import static org.junit.Assert.*;

import org.junit.Test;

public class FracCalcTest {
	
	@Test
	public void testIntegerAddition() {
		assertEquals("2", FracCalc.checkFrac("1 + 1"));
	}

	@Test
	public void testAdditionBasic() {
		assertEquals("2/5", FracCalc.checkFrac("1/5 + 1/5"));
		assertEquals("1_1/5", FracCalc.checkFrac("3/5 + 3/5"));
		assertEquals("1_1/5", FracCalc.checkFrac("4/5 + 2/5"));
		assertEquals("1/4", FracCalc.checkFrac("1/8 + 1/8"));
	}
	
	@Test
	public void testAdditionIntermediate() {
		assertEquals("2/5", FracCalc.checkFrac("3/5 + -1/5"));
		assertEquals("5_5/6", FracCalc.checkFrac("20/8 + 3_1/3"));
		assertEquals("1", FracCalc.checkFrac("3/5 + 2/5"));
		assertEquals("1_1/20", FracCalc.checkFrac("4/5 + 2/8"));
		assertEquals("452", FracCalc.checkFrac("452 + 0"));
		assertEquals("2", FracCalc.checkFrac("1 + 1"));
		assertEquals("4", FracCalc.checkFrac("1 + 3"));
		assertEquals("254", FracCalc.checkFrac("0 + 254"));
		assertEquals("1021778", FracCalc.checkFrac("124543 + 897235"));
		assertEquals("900", FracCalc.checkFrac("978 + -78"));
	}
	
	@Test
	public void testAdditionAdvanced() {
		assertEquals("-9035", FracCalc.checkFrac("-9035 + 0"));
		assertEquals("-64", FracCalc.checkFrac("64 + -128"));
		assertEquals("-133", FracCalc.checkFrac("-98 + -35"));
		assertEquals("62_11/19", FracCalc.checkFrac("0 + 34_543/19"));
		assertEquals("-44_229/888", FracCalc.checkFrac("-38_3/72 + -4_82/37"));
		assertEquals("-7/8", FracCalc.checkFrac("5_3/4 - 6_5/8"));
	}

	@Test
	public void testSubtractionBasic() {
		assertEquals("1/5", FracCalc.checkFrac("3/5 - 2/5"));
		assertEquals("4/5", FracCalc.checkFrac("9/10 - 1/10"));
		assertEquals("0", FracCalc.checkFrac("1/5 - 1/5"));
		assertEquals("0", FracCalc.checkFrac("4_1/2 - 4_1/2"));
	}
	
	@Test
	public void testSubtractionIntermediate() {
		assertEquals("0", FracCalc.checkFrac("68591 - 68591"));
		assertEquals("-36891", FracCalc.checkFrac("48623 - 85514"));
		assertEquals("-9284", FracCalc.checkFrac("0 - 9284"));
		assertEquals("-2/5", FracCalc.checkFrac("2/5 - 4/5"));
		assertEquals("-1_5/8", FracCalc.checkFrac("4_1/2 - 5_9/8"));
		assertEquals("-1_1/8", FracCalc.checkFrac("3_3/4 - 4_7/8"));
	}
	
	@Test
	public void testSubtractionAdvanced() {
		assertEquals("12_3/8", FracCalc.checkFrac("5_3/4 - -6_5/8"));
		assertEquals("8_5/21", FracCalc.checkFrac("-12_3/7 - -20_2/3"));
		assertEquals("-1_5/12", FracCalc.checkFrac("-2/3 - 3/4"));
	}

	@Test
	public void testMultiplicationBasic() {
		assertEquals("3", FracCalc.checkFrac("1_1/2 * 2"));
		assertEquals("6/25", FracCalc.checkFrac("3/5 * 2/5"));
		assertEquals("0", FracCalc.checkFrac("0 * 0"));
		assertEquals("0", FracCalc.checkFrac("0 * 9321"));
		assertEquals("0", FracCalc.checkFrac("0 * -5902"));
		assertEquals("164268", FracCalc.checkFrac("234 * 702"));
		assertEquals("216", FracCalc.checkFrac("12 * 18"));
		assertEquals("8", FracCalc.checkFrac("12/3 * 2/1"));
	}
	
	@Test
	public void testMultiplicationIntermediate() {
		assertEquals("2", FracCalc.checkFrac("16 * 1/8"));
		assertEquals("0", FracCalc.checkFrac("0 * 4/5"));
		assertEquals("2", FracCalc.checkFrac("3 * 2/3"));
		assertEquals("1_1/2", FracCalc.checkFrac("6 * 1/4"));
		assertEquals("8994872", FracCalc.checkFrac("1 * 8994872"));
	}
	
	@Test
	public void testMultiplicationAdvanced() {
		assertEquals("-842346", FracCalc.checkFrac("1 * -842346"));
		assertEquals("-75421", FracCalc.checkFrac("-1 * 75421"));
		assertEquals("37953", FracCalc.checkFrac("-1 * -37953"));
		assertEquals("8", FracCalc.checkFrac("-12/3 * -2/1"));
	}
	
	@Test
	public void testDivisionBasic() {
		assertEquals("9/16", FracCalc.checkFrac("3/4 / 4/3"));
		assertEquals("2_1/4", FracCalc.checkFrac("3/2 / 2/3"));
		assertEquals("9457", FracCalc.checkFrac("9457 / 1"));
		assertEquals("0", FracCalc.checkFrac("0 / 37569"));
		assertEquals("6/11", FracCalc.checkFrac("6 / 11"));
		assertEquals("4/9", FracCalc.checkFrac("4 / 9"));
		assertEquals("1", FracCalc.checkFrac("23 / 23"));
		assertEquals("2_6/7", FracCalc.checkFrac("20 / 7"));
		assertEquals("13/24", FracCalc.checkFrac("1_1/12 / 2"));
	}
	
	@Test
	public void testDivisionIntermediate() {
		assertEquals("2_2/3", FracCalc.checkFrac("16/4 / 3/2"));
		assertEquals("0", FracCalc.checkFrac("0 / -98701"));
		assertEquals("1", FracCalc.checkFrac("3/4 / 3/4"));
		assertEquals("-2_2/3", FracCalc.checkFrac("16/4 / -3/2"));
	}
	
	@Test
	public void testDivisionAdvanced() {
		assertEquals("1_5/8", FracCalc.checkFrac("-13 / -8"));
		assertEquals("-5/21", FracCalc.checkFrac("1_2/3 / -5_6/3"));
		assertEquals("6_661/5520", FracCalc.checkFrac("-38_3/72 / -4_82/37"));
		assertEquals("-2803", FracCalc.checkFrac("-2803 / 1"));
		assertEquals("-12457", FracCalc.checkFrac("12457 / -1"));
		assertEquals("45236", FracCalc.checkFrac("-45236 / -1"));
		assertEquals("-2_6/7", FracCalc.checkFrac("-20 / 7"));
	}


}
