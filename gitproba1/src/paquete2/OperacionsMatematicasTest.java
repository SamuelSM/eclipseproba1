package paquete2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperacionsMatematicasTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultiplicacion() {
		OperacionsMatematicas operacions= new OperacionsMatematicas();
		assertEquals(6,operacions.multiplicacion(2, 3));
		assertEquals(6,operacions.multiplicacion(-2, -3));
		assertEquals(-6,operacions.multiplicacion(2, -3));
		assertEquals(-6,operacions.multiplicacion(-2, 3));
		assertEquals(0,operacions.multiplicacion(2, 0));
		assertEquals(0,operacions.multiplicacion(0, 3));
	}

	@Test
	public void testDivision() {
		OperacionsMatematicas operacions= new OperacionsMatematicas();
		assertEquals(5,operacions.division(10, 2));
		assertEquals(-5,operacions.division(-10, 2));
		assertEquals(5,operacions.division(-10,-2));
		assertEquals(-5,operacions.division(10, -2));
		assertEquals(0,operacions.division(10, 0));
		assertEquals(3,operacions.division(10, 3));
	}

	@Test
	public void testFactorial() {
		OperacionsMatematicas operacions= new OperacionsMatematicas();
		assertEquals(24,operacions.factorial(4));
		assertEquals(120,operacions.factorial(5));
		assertEquals(1,operacions.factorial(0));
		assertEquals(-1,operacions.factorial(-2));
		assertEquals(-1,operacions.factorial(-1));
	}

}
