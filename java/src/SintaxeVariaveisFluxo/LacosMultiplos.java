// Utilize um la�o do tipo for para imprimir todos os m�ltiplos de 3, entre 1 e 100.
package SintaxeVariaveisFluxo;

public class LacosMultiplos {
	public static void main(String[] args) {

		for (int contador = 1; contador <= 100; contador++) {
			if (contador % 3 == 0) {
				System.out.print(" "+contador);
			}
		}
	}
}
