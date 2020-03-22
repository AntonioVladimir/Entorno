import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TestFuncion7 {

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
		
		String[] listaDeCadenas = {""};
		assertEquals("",func.Funcion7(listaDeCadenas));
	}
	
	@Test
	@DisplayName("Test de Caja Negra Valores Correctos")
	void testDeStrings() {
		
		String [] listaDeCadenas = {"Hipopotamo","Rinoceronte","Melocoton","Sacapuntas"};
		assertEquals("[pot, cer, cot, pun]", func.Funcion7(listaDeCadenas));
	}
	
	@Test
	@DisplayName("Prueba Con elemento No Nulo") 
	void testElementosNoNulos(){
		String [] PruebaValorNoNulo = {"Jose Luis","Amapolo El Del Bolo"};
		assertNotNull(func.Funcion7(PruebaValorNoNulo));
		
	}
	@Test
	@DisplayName("Test de Caja Negra Valor 1 Elemento")
	void probarFuncioCadenaAlreves5() {
		String [] cadenaUnElemento = {"Hipopotamo"};
		assertEquals("[pot]",func.Funcion7(cadenaUnElemento)); 
	}

	//Tests realizados por Rafael Oliva Ramirez
	@Test
	@DisplayName("Test de Caja Negro Comprobación de salida nula")
	void testnulo() {
		String [] listaDeCadenas = {"Hipopotamo","Rinoceronte","Melocoton","Sacapuntas"};
		String[] nulo = {null};
		assertNotSame(nulo,func.Funcion7(listaDeCadenas));
	}

}

