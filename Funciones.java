public class Funciones {
	
	public static void main(String[] args) {

		System.out.println(Funcion3(21));
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


}
