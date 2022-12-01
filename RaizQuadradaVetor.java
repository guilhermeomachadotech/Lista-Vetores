import java.util.Scanner;
public class RaizQuadradaVetor {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int i, TAM=10;
		double a[], b[];
		a= new double [TAM];
		b=new double [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println ("Digite o "+(i+1)+"° valor:");
			a[i]=ler.nextDouble();
			b[i]=Math.sqrt(a[i]);
		}
		for (i=0; i<TAM; i++) {
			if (i==0) {
				System.out.print("["+a[i]+", ");
			}else if(i==TAM-1) {
				System.out.print (a[i]+"]");
			}else {
				System.out.print(a[i]+", ");
			}
		}
		System.out.println();
		for (i=0; i<TAM; i++) {
			if (i==0) {
				System.out.print("["+b[i]+", ");
			}else if(i==TAM-1) {
				System.out.print (b[i]+"]");
			}else {
				System.out.print(b[i]+", ");
			}
		}
		ler.close();
	}
}
