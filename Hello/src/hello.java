
public class hello { // class이름이랑 파일 이름이랑 같아야 코드가 잘될거임.
	public static int sum(int n, int m) {
		return n + m ;
	}
	
	//starting from main() method
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);
		a = '?';  // ''는 단 하나의 문자만 담을 수 있음. ""은 상관없음(문자열 담을수있음).
		System.out.println(a);
		System.out.println("hello!"); // 이거는 줄넘김 없음
		System.out.print("\n");
		System.out.println(s);
	}
}
