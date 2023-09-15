import java.util.Scanner;

public class TernaryOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.println("한 개 숫자 입력: ");
		int a = stdin.nextInt();
		boolean flag;
		flag = (a % 2 == 0) ? true : false;
		System.out.println(a + "이 짝수입니까? : " );
		System.out.println(flag);

	}

}
