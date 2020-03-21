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

	@Test
	@DisplayName("Test de Caja Negra Comprobación numero es divisible entre x")
	void testTrue() {

		//Estamo comprobando si la salida es correcta, True si esta en el Rango y False si no esta.
		assertTrue(func.Funcion2(230));//Tiene que salir True

	}

	@Test
	@DisplayName("Test de Caja Negra Comprobación numero no es divisible entre x")
	void testFalse() {

		//Estamo comprobando si la salida es correcta, True si esta en el Rango y False si no esta.
		assertFalse(func.Funcion2(20));//Tiene que salir False

	}

	@Test
	@DisplayName("Test de Caja Negra Comprobación de la salida resultado")
	void testNull() {

		//Estamo comprobando si la salida sale nula.
		assertNotNull(func.Funcion2(289));

	}

}

