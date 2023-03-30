import java.util.Scanner;

public class Aula_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float numero, media, soma;
		int cont;
		cont = 0;
		soma = 0;
		
		for (cont = 0; cont < 3; cont++) {

			System.out.println("Digite o número ");
			numero = sc.nextFloat();

			soma = soma + numero;
		}
			media = soma/cont;
			
		System.out.println("A média é:" + media);
		sc.close();
	};
}
