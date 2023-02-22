package view;

import controller.RestoDivisaoController;

public class PrincipalRestoDivisao {

	public static void main(String[] args) {
		//instanciando a classe e criando um objeto
		RestoDivisaoController r = new RestoDivisaoController();
		
		int dividendo = 20;
		int divisor = 5;
		
		int restoDivisao = r.restoDivisao(dividendo, divisor);
		System.out.println("Resto da divisão de " + dividendo + " por " + divisor + ": " + restoDivisao);

	}

}
