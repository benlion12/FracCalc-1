
public class test {

	public static void main(String[] args) {
		fracCalc(2, 3, 4, 3);
	}
	public static void fracCalc(int num1, int den1, int num2, int den2 ){
		FracNumber fracNum1 = new FracNumber(num1, den1);
		FracNumber fracNum2 = new FracNumber(num2, den2);
		System.out.print(fracNum1 + " " + "+" + " " + fracNum2);
	}
}