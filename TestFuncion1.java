import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

public class TestFuncion1 {

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
	//test realizado por Berny Jimenez Sanchez

	@Test
	@DisplayName("Test de Caja Negra Comprobación numero es divisible entre x")
	void testTrueBerny() {

		//Estamos comprobando si la salida es correcta.
		assertTrue(func.Funcion1(21));

	}

	@Test
	@DisplayName("Test de Caja Negra Comprobación numero no es divisible entre x")
	void testFalse() {

		//Estamos comprobando si la salida es correcta.
		assertFalse(func.Funcion1(20)); 

	}

	@Test
	@DisplayName("Test de Caja Negra Comprobación de la salida resultado")
	void testNull() {



		assertNotNull(func.Funcion1(7));

	}

	@Test//Prueba Realizada por Jose Manuel
	@DisplayName("Test de Caja Negra Comprobación de Rango.")
	void testTrue() {

	//Nos devolvera True ya que un numero negativo se puede dividir entre un positivo
		assertTrue(func.Funcion1(-210));
	}

	//Prueba realizada por Rafael Oliva Ramirez
	@Test
	@DisplayName("Test de Caja Negra Compruebo la salida del metodo")
	void testIgual() {
		assertSame(true, func.Funcion1(21));//la salida tiene que ser true
	}
	
	//Prueba realizada por Antonio Vladimir Ortega Chinchilla
	@Test
	@DisplayName("Test Correcto")
	void testCorrecto() {
		assertEquals(false, func.Funcion1(22));
	}

}

