package zadanka3;

public class kalkulator {
	public static void main(String[] args) {
		
		String zmienna1;
		String znak;
		String zmienna2;
		zmienna1 = args[0];
		znak = args[1];
		zmienna2 = args[2];
		double zmienna111 = Double.parseDouble(zmienna1); 
		double zmienna211 = Double.parseDouble(zmienna2);

		
		String plus = "+";
		String minus = "-";
		String dzielenie = "/";
		String mnozenie = "x";
		String potega = "^";
		String pierwiastek = "sqrt";
		
		System.out.println(zmienna111);
		System.out.println(znak);
		System.out.println(zmienna211);
		
		if (znak.contentEquals(plus)) {
			double result = zmienna111 + zmienna211;
			System.out.println(result);
		}
		if (znak.contentEquals(minus)) {
			double result = zmienna111 - zmienna211;
			System.out.println(result);
		}
		if (znak.contentEquals(dzielenie)) {
			double result = zmienna111/zmienna211;
			System.out.println(result);
		}
		if (znak.contentEquals(mnozenie)) {
			double result = zmienna111*zmienna211;
			System.out.println(result);
		}
		if (znak.contentEquals(potega)) {
			double result = Math.pow(zmienna111, zmienna211);
			System.out.println(result);
		}
		if (znak.contentEquals(pierwiastek)) {
			double result = Math.sqrt(zmienna111);
			System.out.println(result);
		}

	}

}
