package application;

public class Program {

	public static void main(String[] args) {
		
		Integer[] numeros = {334, 568, 123, 796, 225};
		
		System.out.println("O maior numero do array é: " + maiorNumero(numeros));

	}
	
	public static int maiorNumero (Integer[] num) {
		
		int maior = num[0];
		for (int i = 1; i < num.length; i++ ) {
			if (maior < num[i]) {
				maior = num[i];
			}
		}
		return maior;
	}

}
