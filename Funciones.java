public class Funciones {
	public Funciones() {}
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

}
