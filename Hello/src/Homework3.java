import java.util.Scanner;
public class Homework3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력 : ");
		int sale = scanner.nextInt();
		int[] a = {50000,10000,5000,1000,500,100,50,10,1};
		int[] b = {0,0,0,0,0,0,0,0,0}; 
		for(int i=0;i < a.length;i++) {
			if (sale/a[i] != 0) {
				b[i] = sale / a[i];  
				sale = sale % a[i];
//				System.out.println(sale);
			}else {
				b[i] = 0;
			}
		}
		for(int i=0;i < a.length;i++) {
			System.out.printf("%d: %d %n",a[i],b[i]);
		}
	}

}
