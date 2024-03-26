package artur.matos;
import java.util.Scanner;

public class AprovadoReprovado {
	

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Olá, insira suas notas, receba o resultado da sua média e saiba se está APROVADO, DE RECUPERAÇÃO ou REPROVADO");
			
			System.out.println("Insira sua primeira nota: ");
			int nota1 = s.nextInt();
			
			System.out.println("Insira sua segunda nota: ");
			int nota2 = s.nextInt();
			
			System.out.println("Insira sua terceira nota: ");
			int nota3 = s.nextInt();
			
			System.out.println("Insira sua quarta nota: ");
			int nota4 = s.nextInt();
			
			int media = (nota1 + nota2 + nota3 + nota4) /4;
			
			System.out.println("Sua média é: " + media);
			if(media >=7) {
				System.out.print("Está aprovado!");
				
			}
			else if (media>=5) {
				System.out.print("Está de recuperação!");
				
			}
			
			else {
				System.out.print("Está reprovado!");
			}
			
		
		
			

		
		

		}


}
