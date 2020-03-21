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
	void testTrue() {

		//Estamos comprobando si la salida es correcta.
		assertTrue(func.Funcion1(230));

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

}

