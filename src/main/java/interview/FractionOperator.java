package interview

public class FractionOperator {

	public void calculateFraction(String expression) {

		if (expression == null || expression.equals("") || expression.length() < 5) {
			System.out.println("Invalid expression");
			return;
		}
		if (expression.contains(" * ")) {
			if (expression.contains(" + ") || expression.contains(" - ") || expression.contains(" / ")) {
				System.out.println("invalid expression ");
				return;
			}
			String[] exArr = expression.split(" \\* ");
			System.out.println(getComplexFraction(multiply(getSimpleFraction(exArr[0]), getSimpleFraction(exArr[1]))));

		} else if (expression.contains(" + ")) {
			if (expression.contains(" * ") || expression.contains(" - ") || expression.contains(" / ")) {
				System.out.println("invalid expression ");
				return;
			}
			String[] exArr = expression.split(" \\+ ");
			System.out.println(getComplexFraction(addition(getSimpleFraction(exArr[0]), getSimpleFraction(exArr[1]))));

		} else if (expression.contains(" - ")) {
			if (expression.contains(" + ") || expression.contains(" * ") || expression.contains(" / ")) {
				System.out.println("invalid expression ");
				return;
			}
			String[] exArr = expression.split(" \\- ");
			System.out
					.println(getComplexFraction(substrction(getSimpleFraction(exArr[0]), getSimpleFraction(exArr[1]))));

		} else if (expression.contains(" / ")) {
			if (expression.contains(" + ") || expression.contains(" * ") || expression.contains(" - ")) {
				System.out.println("invalid expression ");
				return;
			}
			String[] exArr = expression.split(" \\/ ");
			System.out.println(getComplexFraction(division(getSimpleFraction(exArr[0]), getSimpleFraction(exArr[1]))));

		}
	}

	private String division(String firstExp, String secondExp) {
		String result = "";
		if (firstExp != null && firstExp != "" && secondExp != null && secondExp != "") {
			String[] firstArr = firstExp.split("/");
			String[] secArr = secondExp.split("/");
			String firstNum = firstArr[0];
			String firstDen = firstArr[1];
			String secNum = secArr[0];
			String secDen = secArr[1];
			result = String.valueOf(Integer.valueOf(firstNum) * Integer.valueOf(secDen)) + "/"
					+ String.valueOf(Integer.valueOf(firstDen) * Integer.valueOf(secNum));
		}

		return result;
	}

	private String substrction(String firstExp, String secondExp) {
		String result = "";
		if (firstExp != null && firstExp != "" && secondExp != null && secondExp != "") {
			String[] firstArr = firstExp.split("/");
			String[] secArr = secondExp.split("/");
			String firstNum = firstArr[0];
			String firstDen = firstArr[1];
			String secNum = secArr[0];
			String secDen = secArr[1];
			result = String.valueOf((Integer.valueOf(firstNum) * Integer.valueOf(secDen)
					- (Integer.valueOf(firstDen) * Integer.valueOf(secNum))) + "/"
					+ ((Integer.valueOf(firstDen) * Integer.valueOf(secDen))));
		}

		return result;
	}

	private String addition(String firstExp, String secondExp) {
		String result = "";
		if (firstExp != null && firstExp != "" && secondExp != null && secondExp != "") {
			String[] firstArr = firstExp.split("/");
			String[] secArr = secondExp.split("/");
			String firstNum = firstArr[0];
			String firstDen = firstArr[1];
			String secNum = secArr[0];
			String secDen = secArr[1];
			result = String.valueOf((Integer.valueOf(firstNum) * Integer.valueOf(secDen))
					+ (Integer.valueOf(firstDen) * Integer.valueOf(secNum)) + "/"
					+ ((Integer.valueOf(firstDen) * Integer.valueOf(secDen))));
		}

		return result;
	}

	public static String multiply(String firstExp, String secondExp) {
		String result = "";
		if (firstExp != null && firstExp != "" && secondExp != null && secondExp != "") {
			String[] firstArr = firstExp.split("/");
			String[] secArr = secondExp.split("/");
			String firstNum = firstArr[0];
			String firstDen = firstArr[1];
			String secNum = secArr[0];
			String secDen = secArr[1];
			result = String.valueOf(Integer.valueOf(firstNum) * Integer.valueOf(secNum)) + "/"
					+ String.valueOf(Integer.valueOf(firstDen) * Integer.valueOf(secDen));
		}

		return result;
	}

	public static String getComplexFraction(String expression) {
		String result = "";
		String[] arr = expression.split("/");
		String num = arr[0];
		String den = arr[1];
		if (Math.abs(Integer.valueOf(num)) >= Integer.valueOf(den)) {

			int division = Integer.valueOf(num) / Integer.valueOf(den);
			int remender = Integer.valueOf(num) % Integer.valueOf(den);
			if (remender != 0) {
				String frac = reduceFraction(remender, Integer.valueOf(den));

				result = division + "_" + frac;
			} else
				result = "" + division;
			return result;
		}

		return expression;

	}

	static String reduceFraction(int num, int den) {
		String fraction = "";
		int d;
		d = gcd(num, den);
		num = num / d;
		den = den / d;

		return fraction + num + "/" + den;
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);

	}

	public static void main(String[] args) {
		String ex1 = "1/2 * 3_3/4";
		String ex2 = "1_1/7 * 2_1/9";
		String ex3 = "1_1/7 + 2_1/7";
		String ex4 = "8/7 - 15/7";
		FractionOperator f1 = new FractionOperator();
		f1.calculateFraction(ex1);
		f1.calculateFraction(ex2);
		f1.calculateFraction(ex3);
		f1.calculateFraction(ex4);
	}

	public static String getSimpleFraction(String frac) {
		if (frac.contains("_")) {
			String[] arr = frac.split("_");
			String main = arr[0];

			String[] numDen = arr[1].split("/");
			String numerator = numDen[0];
			String denominator = numDen[1];
			numerator = String
					.valueOf(Integer.valueOf(numerator) + (Integer.valueOf(denominator) * Integer.valueOf(main)));
			frac = numerator + "/" + denominator;

		}

		return frac;
	}

}
