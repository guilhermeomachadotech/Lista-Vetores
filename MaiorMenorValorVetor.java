import java.util.Scanner;
public class MaiorMenorValorVetor {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int i, a[], TAM=10, menorValor=10000, maiorValor=-1;
		a=new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			a[i]=ler.nextInt();
			if (a[i]>maiorValor) {
				maiorValor=a[i];
			}else if (a[i]<menorValor) {
				menorValor=a[i];
			}
		}
		System.out.println("O maior valor é "+maiorValor+" e o menor valor é "+menorValor);
		ler.close();
	}
}
