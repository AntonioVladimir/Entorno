import java.util.Arrays;

public class Funciones {
	public Funciones() {
	}

	public Boolean Funcion1(int num) {

		Boolean resp = null;

		int x = 7;

		if (num % x == 0) {

			resp = true;

		} else {
			resp = false;
		}

		return resp;

	}

	public Boolean Funcion2(int num) {

		Boolean resp = null;

		int y = 250 - 50;
		int x = 250 + 50;

		if (num <= x && num >= y) {

			resp = true;

		} else {
			resp = false;
		}

		return resp;

	}

	public int Funcion3(int num) {

		int x = 7;
		int ymenos = 250 - 50;
		int ymas = 250 + 50;
		int rang = (int) Math.floor(Math.random() * (ymas + ymenos));
		int result = 0;

		if (num % x == 0) {
			result = rang % num;
		}

		return result;

	}

	public String Funcion4(String[] CadenaNombres) {

		String CadenaConcatenada = null;
		if (CadenaNombres != null) {
			for (int i = 0; i < CadenaNombres.length; i++) {
				// Separaré los nombres con guiones para que el resultado sea leguible,
				// si desdeasemos que no hubieran guiones quitariamos los "-"
				CadenaConcatenada = CadenaNombres[0] + "-" + CadenaNombres[1] + "-" + CadenaNombres[2] + "-"
						+ CadenaNombres[3];
			}
			;

		} else {
			CadenaNombres = null;
		}

		CadenaConcatenada = CadenaConcatenada.replaceAll("[AaEeIiOoUu]", "");
		CadenaConcatenada = CadenaConcatenada.replaceAll("[A-Z]", "");
		System.out.println(CadenaConcatenada);
		return CadenaConcatenada;

	}

	public static int Funcion5(int[] num) {

		int tam = num.length;
		int sum = 0;
		int[] numarray = new int[tam];

		for (int cont = 0; cont < tam; cont++) {
			numarray[cont] = num[cont];
			sum = sum + numarray[cont];
		}

		return sum;

	}

	public String Funcion6(double[] num1) {

		double[] num2 = new double[num1.length];
		double z = 4;
		double w = 4;

		for (int cont = 0; cont < num1.length; cont++) {
			if (num1[cont] % 2 == 0) {
				num2[cont] = num1[cont] * z;

			} else {
				num2[cont] = num1[cont] * w;

			}
		}

		return Arrays.toString(num2);

	}
}
