
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion5 {

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
	//Prueba realizada por Rafael Oliva Ramirez
	@Test
	@DisplayName("Test de Caja Negra Prueba Comprobacion Resultado (Rafael)")
	void Rafael() {

		int [] num = {6,2,2001};

		assertEquals(2009, func.Funcion5(num));//La salida tiene que ser 2009

	}

	@Test
	@DisplayName("Test de Caja Negra Prueba Comprobacion Resultado (Jose)")
	void Jose() {


		int [] num = {18,07,1993};

		assertEquals(2018, func.Funcion5(num));//La salida tiene que ser 2018

	}

	@Test
	@DisplayName("Test de Caja Negra Prueba Comprobacion Resultado (Berny)")
	void Berny() {

		int [] num = {12,9,1989};

		assertEquals(2010, func.Funcion5(num));//La salida tiene que ser 2010

	}

	@Test
	@DisplayName("Test de Caja Negra Prueba Comprobacion Resultado (Vladi)")
	void  Vladi() {

		int [] num = {25,4,1998};

		assertEquals(2027, func.Funcion5(num));//La salida tiene que ser 2027

	}

}
