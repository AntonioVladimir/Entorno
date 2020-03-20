public class Funciones {

public static void main(String[] args) {

		System.out.println(Funcion1(98));
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
