import javax.swing.JOptionPane;

public class Exemlpo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MENSAGEM
		// JOptionPane.showMessageDialog(null, "Bom dia, o sol j� nasceu l� na
		// fazendinha");
		
		//MENSAGEM COM TITULO
		//JOptionPane.showMessageDialog(null, "Conteudo da janela", "Titulo da Janela", 3);
		
		//RESGATANDO O QUE O USU�RIO DIGITOU
		//String nome = null;
		//nome = JOptionPane.showInputDialog("Qual seu nome?");
		//JOptionPane.showMessageDialog(null, "Seu nome � "+ nome);
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o outro numero"));
		int total = valor1+valor2;
		JOptionPane.showMessageDialog(null, "Resultado: "+ total);
		
	}

}