package paquete2;

public class OperacionsMatematicas {
	public int multiplicacion(int factor1, int factor2){
		//Iniciamos variables
		int resultado=0;
		int signo=1;
		
		//Calculamos o signo do resultado
		if(factor1>0 && factor2<0) signo=-1;
		else if(factor2>0 && factor1<0)signo= -1;
		
		//Calculamos o valor absoluto dos factores
		int factor1Abs=valorAbsoluto(factor1);
		int factor2Abs=valorAbsoluto(factor2);
		
		//Calculamos a multiplicacion con valores absolutos
		for(int i=1;i<=factor2Abs;i++){
			resultado=resultado+factor1Abs;
		}
		//Devolvemos o resultado da multiplicación co signo
		return resultado*signo;
	}
	public int division(int dividendo, int divisor){
		if (divisor==0) return 0;
		return dividendo/divisor;
	}

	public int factorial(int valor){
		
		//Comprobamos que no numero non sexa negativo
		if(isNegative(valor)) return -1;
		
	if (valor==1 ||valor==0) return 1;
	else return valor*factorial(valor-1);
	}
	
	//Calculamos o valor absoluto
	private int valorAbsoluto(int valor){
		if (valor<0) return valor*-1;
		return valor;
	}
	
	// Indica se e un enteiro negativo
	private boolean isNegative(int valor){
		if(valor<0) return true;
		return false;
	}
}
