import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Exemplo {
	public static void main(String[] args) {

		double num1, num2, resultado;

		try {
			num1 = parseDouble(showInputDialog("Digite um valor"));
			num2 = parseDouble(showInputDialog("Digite um valor"));

			resultado = num1 / num2;

			showMessageDialog(null, "Resultado: " + resultado);
		} catch (NumberFormatException e) {
			showMessageDialog(null, "Você deve digitar um número!");
		} catch (NullPointerException e) {
			showMessageDialog(null, "Programa Finalizado!");
		} catch (Exception e) {
			showMessageDialog(null, "Como vc chegou aqui?");
		}

	}
}
