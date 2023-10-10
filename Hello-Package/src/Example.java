import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 이름 입력 받기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.next();

        // 사용자로부터 나이 입력 받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // 입력 받은 정보 출력
        System.out.println("입력한 이름: " + name);
        System.out.println("입력한 나이: " + age);

        // Scanner 객체 닫기
        scanner.close();
    }
}
