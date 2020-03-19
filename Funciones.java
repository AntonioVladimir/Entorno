public class Funciones {

	public static void main(String[] args) {


                int [] numero = {2,8,16,48};


		System.out.println(Funcion5(numero));
	}

	public static Boolean Funcion1(int num) {

		Boolean resp = null;

		int x = 7;

		if (num % x == 0) {

			resp = true;

		} else {
			resp = false;
		}

		return resp;

	}


	public static Boolean Funcion2(int num) {

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

	public static int Funcion3(int num) {


		int x = 7;
		int ymenos = 250-50;
		int ymas = 250+50;
		int rang = (int)Math.floor(Math.random()*(ymas+ymenos));
		int result = 0;

		if (num%x == 0) {
			result = rang%num;
		}

		return result;

	}

	public static String Funcion4(String[] CadenaNombres) {

		String CadenaConcatenada = null;
		for (int i = 0; i < CadenaNombres.length; i++) {

			CadenaConcatenada = CadenaNombres[0] + "-" + CadenaNombres[1] + "-" + CadenaNombres[2] + "-"
					+ CadenaNombres[3];
		}
		CadenaConcatenada = CadenaConcatenada.replaceAll("[AaEeIiOoUu]", "");
		CadenaConcatenada = CadenaConcatenada.replaceAll("[A-Z]", "");
		System.out.println(CadenaConcatenada);
		return CadenaConcatenada;

	}
	public int Funcion5(int [] num) {

		int tam = num.length;
		int sum = 0; 
		int [] numarray = new int [tam];

		for (int cont = 0; cont < tam; cont++) {
			numarray[cont] = num[cont];
			sum = sum + numarray[cont];
		}

		return sum;

	}
}
