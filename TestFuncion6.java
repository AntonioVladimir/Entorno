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
	//pueba realizada por Berny Jimenez Sanchez

	@Test
	@DisplayName("Test de Caja Negra Comprobación numero es divisible entre x")
	void testTrue() {

		//Estamo comprobando si la salida es correcta, True si esta en el Rango y False si no esta.
		//assertTrue(func.Funcion6(50));//Tiene que salir True
		double [] coas = {64.3,6.8,2};  
		assertEquals("[257.2, 27.2, 8.0]", func.Funcion6(coas));	
		
	}

	

}

