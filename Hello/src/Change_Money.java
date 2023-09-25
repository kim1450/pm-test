import java.util.Scanner;
public class Change_Money {

	public static void main(String[] args) {
		
		System.out.println("Output\n");
		Scanner scanner = new Scanner(System.in); // input 받기.
		System.out.print("input price(won) : ");
		
		int price = scanner.nextInt(); // input 값을 price 변수에 넣는다.
		int[] unit = {50000,10000,5000,1000,500,100,50,10,1}; // cash unit
		int[] result = new int[unit.length]; // unit과 length가 같은 result 배열 선언.
		for(int i=0;i < unit.length;i++) { 
			if (price/unit[i] != 0) { // price를 unit[i]로 나눴을 때 몫이 0이 아니라면
				result[i] = price / unit[i];  // result[i]에 몫을 넣어준다. 67123이라면 50000원(unit[0])은 1장(result[0])이 필요하다.  
				price = price % unit[i]; // price를 unit으로 나누고 난 값을 다시 price에 넣어준다. 67123 - 50000 = 17123이 price값이 된다.
				
			}else {
				result[i] = 0; //몫이 0이라면 result[i]에 0을 넣어준다.
			}
		}//이 과정을 unit.length만큼 반복한다.
		
		for(int i=0;i < unit.length;i++) {
			if (result[i] != 0) {  // 몫이 0인 것들을 출력하지 않기 위해 if문을 사용.
				System.out.printf("%d: %d %n",unit[i],result[i]);
			}else {
				continue;
			}
		}
		scanner.close();
	}

}
