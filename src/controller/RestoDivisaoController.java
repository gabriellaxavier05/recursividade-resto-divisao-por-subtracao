package controller;

public class RestoDivisaoController {
	
	//função recursiva
	public int restoDivisao (int dividendo, int divisor) {
		if (dividendo < divisor) {
			return dividendo;
		}
		else {
			return restoDivisao(dividendo - divisor, divisor);
		}
		
	}
}
