package aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> clientes = new ArrayList<>();
		boolean repetir=false; 
		System.out.println("Bem vindo ao invent�rio de tamanho question�vel: InvQuest!");
		System.out.print("Primeiramente, digite o item que gostaria de adicionar ao seu invent�rio: ");
		String item0=sc.nextLine();
		clientes.add(item0);
		
		System.out.print("Gostaria de adicionar um novo item?(s/n): ");
		String resp0=sc.next();
		sc.nextLine();
		if(resp0.toLowerCase().equals("s")) {
			repetir=true;
		}else if(resp0.toLowerCase().equals("n")) {
			repetir=false;
		}else {
			System.out.println("Digite uma alternativa v�lida!");
		}
		while(repetir) {
			System.out.print("Digite o nome do item que deseja adicionar ao invent�rio: ");
			String item=sc.nextLine();
			clientes.add(item);
			System.out.print("Excelente! Gostaria de adicionar um novo item?(s/n): ");
			String resp=sc.next();
			sc.nextLine();
			if(resp.toLowerCase().equals("s")) {
				repetir=true;
			}else if(resp.toLowerCase().equals("n")) {
				System.out.println("Com isso, encerramos nossa adi��o de itens ao invent�rio.");
				repetir=false;
				break;
			}else {
					System.out.println("Digite uma alternativa v�lida!");
					repetir=true;
			}
		}
		
		boolean repet2=true;
		while(repet2) {
			System.out.print("Gostaria de checar os itens que possui em seu invent�rio?(s/n): ");
			String resp3=sc.next();
			sc.nextLine();
			if(resp3.toLowerCase().equals("s")) {
				System.out.println("Em seu invent�rio, voc� possui:");
				System.out.println();
				for(String i : clientes) {
					System.out.println("- "+i);
				}
				System.out.println();

				System.out.println("Com isso, o programa realizou sua opera��o completa.");
				System.out.println("Deseja finalizar o programa ou adicionar novos itens ao invent�rio?");
				System.out.println("Digite 1 - Acrescentar novos itens. Digite 2 - Encerrar o programa.");
				int resp5=sc.nextInt();
				boolean repet3=false;
				sc.nextLine();
				if(resp5==1){
					repet3=true;
				}else if(resp5==2) {
					System.out.println("Com isso, encerramos nosso programa de invent�rio InvQuest! Agradecemos pela prefer�ncia!");
					repet2=false;	
					repet3=false;
				}else {
					System.out.println("Digite uma alternativa v�lida!");
				}
				while(repet3) {
					System.out.print("Digite o nome do item que deseja adicionar ao invent�rio: ");
					String item=sc.nextLine();
					clientes.add(item);
					System.out.print("Excelente! Gostaria de adicionar um novo item?(s/n): ");
					String resp6=sc.next();
					sc.nextLine();
					if(resp6.toLowerCase().equals("s")) {
						repet3=true;
					}else if(resp6.toLowerCase().equals("n")) {
						System.out.println("Com isso, encerramos nossa adi��o de itens ao invent�rio.");
						repet3=false;
						break;
					}else {
							System.out.println("Digite uma alternativa v�lida!");
							repet3=true;
					}
				}
			}else if(resp3.toLowerCase().equals("n")) {
				System.out.println("Com isso, encerramos nosso programa de invent�rio InvQuest! Agradecemos pela prefer�ncia!");
				repet2=false;
				break;
			}else {
				System.out.println("Digite uma alternativa v�lida!");
				repet2=true;
			}
		}
	}
}
