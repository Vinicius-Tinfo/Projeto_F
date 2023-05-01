package Packet_Projeto_F;
import java.util.Scanner;

public class Menu_Principal {
		public void Menu() {
		Scanner Sc = new Scanner (System.in);	
System.out.print("");		
System.out.println("Bem vindo ao menu");
System.out.println("");
System.out.println("1 - Iniciar menu de vendas");
System.out.println("2 - Abrir Estoque");
System.out.println("3 - Fechar o programa");
int op_menu =Sc.nextInt();
switch(op_menu) 
{
	case 1:
		
	System.out.println("1 - Iniciar menu de vendas");
	break;
	case 2:

		 
		System.out.println("1 - Vizualizar Estoque");
		System.out.println("2 - Adicionar Produtos");
		System.out.println("3 - Excluir Produtos");
				
		int opc =Sc.nextInt();	
		switch(opc) {
	case 1:
			System.out.println("teste");
			break;
		case 2:
			System.out.println("teste");
			break;
		case 3:
			System.out.println("teste");
			break;
		}
}	
	}
	}