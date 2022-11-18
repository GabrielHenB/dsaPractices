package arraysStuff;

public class Main {
	
	public static void imprimir(int[] arr, int n) {
		System.out.print("Array: < ");
		for(int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println(" >");
	}
	
	public static void subsetFind(int[] arr, int n, int k) {
		int auxiliar = k-1;
		int anterior = arr[0];
		int j = auxiliar;
		for(int i = 0; i < n; i++) {
			if(j >= i) {
				//troca elementos
				anterior = arr[i];
				arr[i] = arr[j];
				arr[j] = anterior;
				j--;
			}
			else {
				if(i == auxiliar) {
					//Incremente auxiliar para proximo pivo
					auxiliar = auxiliar + k;
					
					if(auxiliar >= n) auxiliar = n-1;
					
					j = auxiliar;
				}
			}
			//System.out.print("Debug it " + i + " aux " + auxiliar + "results: "); imprimir(arr,n);
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int k = 3;
		
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) arr[i] = i+1;
		
		System.out.println("Ordenar array em conjuntos reversos de k a k números: ");
		System.out.println("N = " + n + "| K = " + k + " | Array Inicial: ");
		imprimir(arr,n);
		
		subsetFind(arr,n,k);
		
		imprimir(arr,n);
		
		
	}

}
