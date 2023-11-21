import java.util.Scanner;


public class Perform_Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Reservation reserve_x = new Reservation("2023년 11월 15일 공연 예약");
		reserve_x = new Check_Cancel();
		String[][] all_seat = reserve_x.all_seat_Info();
		
		while (true) {
			System.out.print("메뉴 선택(예약,조회,취소,통합). 종료하려면 out : ");
			String a = scanner.next();
			if ((a.equals("out"))||(a.equals("Out"))){
				break;
			}
			switch(a) {
			case "예약":
				if(reserve_x.getInput() == false) {
					break;
				}
				break;
			case "조회":
				reserve_x.check_seat(all_seat);
				break;
			case "취소":
				reserve_x.cancel(all_seat);
				break;
			case "통합":
				reserve_x.run();
				break;
			default:
				System.out.println("잘못된 입력입니다. 예약,조회,취소,통합,out 중 하나를 선택해주세요.");
			}	
		}
	}

}
