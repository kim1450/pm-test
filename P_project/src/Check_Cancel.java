import java.util.InputMismatchException;
import java.util.Scanner;

public class Check_Cancel extends Reservation{
	public Check_Cancel() {
	}
	
	public void check_seat(String[][] all_seat) {
        for(int i=0;i < all_seat.length;i++){
        	if(i % 30 == 0) {
        		if(i / 30 ==0) { System.out.println("------------------V석-----------------");}
        		if(i / 30 ==1) { System.out.println("------------------S석-----------------");}
        		if(i / 30 ==2) { System.out.println("------------------A석-----------------");}
        		if(i / 30 ==3) { System.out.println("------------------B석-----------------");}
        	}
        	if(!(all_seat[i][0] == null)) {
        		int j = (i % 30)+1;
        		System.out.print(j +"번 좌석 : " +all_seat[i][0]+"  ");
        		System.out.print(all_seat[i][2]+"  ");
        		System.out.println();
        	}
        }
	}
	
	
	
	public void check_seat(String seatType,String[][] seatInfo) {
		switch(seatType) {
		case "V":
			System.out.println("V석 좌석 예약 현황");
			for(int i =0; i<30;i++) {
				if(seatInfo[i][0]==null && seatInfo[i][1] == null && seatInfo[i][2] == null) {
					continue;
				}
				System.out.println("V석 "+(i+1)+"번 좌석 예약자명 : " + seatInfo[i][0] + " ,  예약 번호 : "+ seatInfo[i][2]);
			}
			break;
		case "S":
			System.out.println("S석 좌석 예약 현황");
			for(int i =0; i<30;i++) {
				if(seatInfo[i][0]==null && seatInfo[i][1] == null && seatInfo[i][2] == null) {
					continue;
				}
				System.out.println("S석 "+(i+1)+"번 좌석 예약자명 : " + seatInfo[i][0] + " ,  예약 번호 : "+ seatInfo[i][2]);
			}
			break;
		case "A":
			System.out.println("A석 좌석 예약 현황");
			for(int i =0; i<30;i++) {
				if(seatInfo[i][0]==null && seatInfo[i][1] == null && seatInfo[i][2] == null) {
					continue;
				}
				System.out.println("A석 "+(i+1)+"번 좌석 예약자명 : " + seatInfo[i][0] + " ,  예약 번호 : "+ seatInfo[i][2]);

			}
			break;
		case "B":
			System.out.println("B석 좌석 예약 현황");
			for(int i =0; i<30;i++) {
				if(seatInfo[i][0]==null && seatInfo[i][1] == null && seatInfo[i][2] == null) {
					continue;
				}
				System.out.println("B석 "+(i+1)+"번 좌석 예약자명 : " + seatInfo[i][0] + " ,  예약 번호 : "+ seatInfo[i][2]);
			}
			break;
	}
	}
	public void cancel(String[][] all_seat) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇개의 좌석을 삭제하실건가요? (1개를 삭제한다면 V,S,A,B 순으로 삭제됩니다.) : ");
		int delete_n = 0;
		try {
			delete_n = scanner.nextInt();
		    if(delete_n <= 0) {
		        throw new IllegalArgumentException("유효하지 않은 수량입니다. 메뉴 화면으로 돌아갑니다. 다시 시도해주세요.");
		    }else if(delete_n > 2) {
		    	throw new IllegalArgumentException("최대 2장까지 취소 가능합니다. 메뉴 화면으로 돌아갑니다. 다시 시도해주세요.");
		    }
		}catch(IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		    return;
		}catch(InputMismatchException e) {
			System.out.println("좌석 개수는 숫자로 구성되어 있습니다. 메뉴화면으로 돌아갑니다. 다시 시도해주세요");
			return;
		}
		
		System.out.print("삭제하고 싶은 예약번호를 입력해주세요.(잘못된 예약번호 입력 시 메뉴 화면으로 돌아갑니다. 다시 시도해주세요.) : ");
		String delete_Num =scanner.next(); 
		try { 
			int delete_Num_int = Integer.parseInt(delete_Num); 
		}catch(NumberFormatException e){
			System.out.println("예약 번호는 숫자로 구성되어 있습니다. 메뉴 화면으로 돌아갑니다. 다시 시도해주세요.");
			scanner.nextLine();
			return;
		}
		int count = 0;
		
		for(int i=0;i<120;i++) {
			if(delete_Num.equals(all_seat[i][2])) {
				
				System.out.println("삭제완료, 삭제된 예약 번호 : " + all_seat[i][2]); 
				all_seat[i][0] = null;
				all_seat[i][1] = null;
				all_seat[i][2] = null; 
				count += 1; 
				if (delete_n == count) {
					break;
				}

			}
		}
}
}

