import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class TestFuncion6 {

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
		//assertTrue(func.Funcion6(50));//Tiene que salir True
		double [] coas = {64.3,6.8,2};  
		assertEquals("[257.2, 27.2, 8.0]", func.Funcion6(coas));	
		
	}
/*
	@Test
	@DisplayName("Test de Caja Negra Comprobación numero no es divisible entre x")
	void testFalse() {

		//Estamo comprobando si la salida es correcta, True si esta en el Rango y False si no esta.
		double [] num1 = {2,8,16,48};
		assertFalse(func.Funcion6(num1));//Tiene que salir False

	}

	@Test
	@DisplayName("Test de Caja Negra Comprobación de la salida resultado")
	void testNull() {

		//Estamo comprobando si la salida sale nula.
		assertNotNull(func.Funcion6(250));

	}
*/
}

