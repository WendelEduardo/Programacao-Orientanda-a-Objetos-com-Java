import javax.swing.JOptionPane;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja finalizar?");
		
		if(opcao == 0) 
			JOptionPane.showMessageDialog(null, "Finalizado!");
		else
			JOptionPane.showMessageDialog(null, "Permanecemos no sistema!");
		
		
	}

}
