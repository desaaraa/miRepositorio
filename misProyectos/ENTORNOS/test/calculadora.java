package test;

import org.junit.jupiter.api.Test;

import utilidadesClases.Calculadora;

class calculadora {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		AssertEquals(5, calc.suma(2, 3));
	}

	private void AssertEquals(int i, Object suma) {
		// TODO Auto-generated method stub

	}

}
