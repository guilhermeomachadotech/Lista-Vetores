import java.util.Scanner;
public class OrdemInversa {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int i,j=9, TAM=10, a[], b[];
		a=new int [TAM];
		b=new int[TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			a[i]=ler.nextInt();
			b[j]=a[i];
			j--;
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
