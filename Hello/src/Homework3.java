import java.util.Scanner;
public class Homework3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input price(won) : ");
		int sale = scanner.nextInt();
		int[] unit = {50000,10000,5000,1000,500,100,50,10,1};
		int[] result = {0,0,0,0,0,0,0,0,0}; 
		for(int i=0;i < unit.length;i++) {
			if (sale/unit[i] != 0) {
				result[i] = sale / unit[i];  
				sale = sale % unit[i];
//				System.out.println(sale);
			}else {
				result[i] = 0;
			}
		}
		
		for(int i=0;i < unit.length;i++) {
			if (result[i] != 0) {
				System.out.printf("%d: %d %n",unit[i],result[i]);
			}else {
				continue;
			}
		}
	}

}
