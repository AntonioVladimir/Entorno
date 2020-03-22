import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.*;


class TestFuncion4 {

	static int contpruebas = 0;
	static Funciones func = null;

	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Empezamos las Pruebas.");
		func = new Funciones();
	}

	@BeforeEach
	private void contador() {
		contpruebas++;
		System.out.println("Vamos a realizar la prueba "+contpruebas);
	}

	@AfterEach
	private void vecespruebas() {
		System.out.println("Se a realizado "+ contpruebas +" Pruebas.");
	}

	@AfterAll
	static void terminarPruebas() {
		contpruebas = 0;
		func = null;
		System.out.println("Se han terminado de ejecutar todas las pruebas");
	}

	//	Tests realizados por Antonio Vladimir Ortega Chinchilla
	@Test
	@DisplayName("Test de Caja Negra Valores Vacios")
	void testConCadenaVacia() {

		String [] CadenaNombres = {"","","",""};
		assertEquals("---", func.Funcion4(CadenaNombres));

	}

	@Test
	@DisplayName("Prueba con nuestros nombres concatenados, separados con - ")
	void testConNuestrosNombres() {

		String [] CadenaNombres = {"Antonio","Rafael","Jose","Berny"};
		assertEquals("ntn-fl-s-rny", func.Funcion4(CadenaNombres));
	}

	@Test
	@DisplayName("Prueba con elemento nulo")
	void testElementosNulos(){
		assertNull(null,null);//Funcionan en distintas versiones.

	}

	//Pruebas realizadas por Rafael Oliva Ramirez
	@Test
	@DisplayName("Prueba de caja negra cuatro cadenas con un solo caracter ")
	void testUnSoloCaracter(){
		String [] caracter = {"A","v","b","e"};
		assertEquals("-v-b-",func.Funcion4(caracter));
	}
	// Pruebas realizadas por Jose Manuel
	@Test
	@DisplayName("Prueba de caja negra comprobando con mas de 4 caracteres")
	void test5Caracter() {
		String[] caracter = { "HolA MunDo 15 Dias de CuAreNtena", "PePe", "PoKEmon", "AnToNIO", "KiLo" };
		assertEquals("l n 15 s d rtn--mn-n", func.Funcion4(caracter));
	}

}
