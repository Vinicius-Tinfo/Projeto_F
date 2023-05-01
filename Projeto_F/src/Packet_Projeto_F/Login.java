package Packet_Projeto_F;
import java.util.Scanner;
public class Login {
	
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		 Menu_Principal Menu =new Menu_Principal();
	System.out.println("Bem vindo ao Sistema");
	System.out.print("");
	System.out.println("Insira seu Usuario");
	String  usuario=Sc.nextLine();
	System.out.println("");
	System.out.println("Insira a sua Senha");
	int senha=Sc.nextInt();

	if(usuario=="adm" || senha==123)
// Aqui na parte de cima quando ouve a integração com 
//o banco de  dados so mudar para true//
	{
	System.out.println("Login Efetuado com Sucesso");
	Menu.Menu();
	}
	else
	{
	System.out.println("Usuario ou Senha ou corretos.");	
	}
	}
}