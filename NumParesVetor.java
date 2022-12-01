import java.util.Scanner;
public class NumParesVetor {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int i, a[], qtdd=0, TAM=10;
		a=new int [TAM];
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			a[i]=ler.nextInt();
			if (a[i]%2==0) {
				qtdd=qtdd+1;
			}
		}
		for(i=0;i<TAM; i++) {
			if (a[i]%2==0) {
				System.out.print (a[i]+" ");
			}
		}
		System.out.println();
		System.out.println ("Têm "+qtdd+" elementos pares.");
		ler.close();
	}
}
