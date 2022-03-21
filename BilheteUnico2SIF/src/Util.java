import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Util {
	
	
	
	public void menuPrincipal() {

		String aux = "Escolha uma opera��o: \n1. Administrador \n2. Usu�rio\n3. Finalizar";

		int opcao;

		do {
			opcao = parseInt(showInputDialog(null, aux));

			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Op��o Inv�lida!");
			} else {
				if (opcao == 1) {
					menuAdministrador();
				}else if(opcao == 2) {
					menuUsuario();
				}
			}

		} while (opcao != 3);
		showMessageDialog(null, "Acesso finalizado!");

	}

	public void menuAdministrador() {
		String adm = "Opera��es: \n";
		adm += "1. Cadastrar Bilhete \n";
		adm += "2. Consultar Bilhete \n";
		adm += "3. Sair";

		int opcao;

		do {
			opcao = parseInt(showInputDialog(adm));

			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Op��o Inv�lida!");
			} else {

			}

		} while (opcao != 3);

	}

	public void menuUsuario() {
		String user = "Opera��es: \n";
		user += "1 - Consultar Saldo \n";
		user += "2 - Carregar Bilhete \n";
		user += "3 - Passar na catraca \n";
		user += "4 - Sair";
		
		int opcao;
		
		do{
			opcao = parseInt(showInputDialog(user));
			
			if(opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Op��o Inv�lida!");
			}else {
				
			}
			
		}while(opcao != 4);
	}
}