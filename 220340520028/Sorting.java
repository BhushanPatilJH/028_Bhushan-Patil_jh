import java.util.*;

class Sorting {
	public static void insertinSort(int[] a1, int n) {
			int m = n-1;
		for(int i = n-2; i >= 0; i--){
			
			if(a1[i] > a1[m]){
				int temp = a1[i];
				a1[i] = a1[m];
				a1[m] =temp;
				m--;
			}
			for(int j = 0; j < n; j++){
				System.out.print(a1[j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a1[] = new int[n];
	for(int i = 0; i < n; i++){
		a1[i] = sc.nextInt();
	}
	insertinSort(a1,n);
	
	}
}