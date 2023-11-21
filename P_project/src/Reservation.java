import java.util.InputMismatchException;
import java.util.Scanner;

public class Reservation extends Seat {
	private String seatType; 
	private int seatNum; 
	private int reserve_n;
	private String reserve_Num;
	private String res_name;
	private String res_phonenum;
	private int count_res;

	public Reservation() {
		this.seatType = "false";
		this.seatNum = 0;
		this.reserve_n = 0;
		this.reserve_Num = null;
		this.count_res = 0;
	}
	
	public Reservation(String date) {
		this.seatType = "false";
		this.seatNum = 0;
		this.reserve_n = 0;
		this.reserve_Num = null;
		this.count_res = 0;
		System.out.println(date);
	}
	
	public boolean getInput() { 	
		Scanner scanner = new Scanner(System.in); 
		System.out.print("좌석 타입(V,S,A,B)을 입력해주세요. 뒤로 가려면 back : ");
		try {
		    if (scanner.hasNextInt()) {
		        throw new InputMismatchException("잘못된 입력입니다. 좌석 타입은 V,S,A,B 중 하나여야 합니다.");
		    }

		    this.seatType = scanner.next();
		    
			switch(this.seatType) {
			case "V":
				break;
			case "S":
				break;
			case "A":
				break;
			case "B":
				break;
			case "back":
				return false;
			default:
				System.out.println("잘못된 입력입니다. V,S,A,B 중 하나를 선택해주세요."); 
			    scanner.nextLine();
			    return getInput();
			}
		    if(this.seatType.equals("back")) {
		        return false;
		    }
		    System.out.print("예약 매수(최대 2장)를 입력해주세요. : ");
		    this.reserve_n = scanner.nextInt();
		    if(this.reserve_n <= 0) {
		        throw new IllegalArgumentException("유효하지 않은 수량입니다.");
		    }else if(this.reserve_n > 2) {
		    	throw new IllegalArgumentException("최대 2장까지 구매 가능합니다.");
		    }
			System.out.print("좌석 번호(번호 상관없다면 0로)를 입력 해주세요(같은 좌석 타입내에서 1인 2좌석 까지 동시예약 가능). : ");
		    this.seatNum = scanner.nextInt();
		} catch (InputMismatchException e) {
			if(e.getMessage() == null){ 
				System.out.println("예약 매수,좌석 번호에는 숫자만 입력해주세요.");
			}else {
		    System.out.println(e.getMessage());
			}
		    scanner.nextLine();
		    return getInput();
		} catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		    System.out.println();
		    scanner.nextLine();
		    return getInput();
		}
		



		int n = this.reserve_n;
		
		if((seatNum < 0 )||(seatNum >30)){
			System.out.println("1~30 사이 좌석을 선택해주세요. 좌석이 상관없다면 0을 입력해주세요(남아있는 좌석 중 앞자리에 예약됩니다. 좌석 선택 화면으로 돌아갑니다. ");
			return getInput();
		}
		if(seatNum == 30 && n == 2) {
			System.out.println("2매 구매시 30번 좌석을 앉으시려면, 29번을 예매하시면 29,30번이 예매 됩니다. 좌석 선택 화면으로 돌아갑니다.");
			return getInput();
		}

		System.out.print("예약자 이름과 전화번호('-'제외)를 입력해주세요(1인 최대 2매 예약 가능) : ");

			this.res_name = scanner.next(); 
			this.res_phonenum = scanner.next(); 
		try {
			int res_phonenum_int = Integer.parseInt(this.res_phonenum);
		}catch(NumberFormatException e){
			System.out.println("전화번호에는 숫자만 입력 가능합니다. 좌석 선택 화면으로 돌아갑니다.");
			scanner.nextLine();
			return getInput();
		}
		if(n == 2) {
			if(seatNum == 0) {
				for(int i=0;i<n;i++) {
					if (!(store())) {
						break;}}
			}else {
				for(int i=0;i<n;i++) {
					if(!(store(seatNum+i))){
						break;}}}
		}else {
			if(seatNum == 0) {
				store();
			}else {
				store(seatNum);}}
		return true;
	}

	private boolean store(){
		this.count_res = 0;
		try {
		for(int i =0;i<120;i++) {
			if (all_seat[i][0] != null && all_seat[i][0].equals(this.res_name) && all_seat[i][1] != null && all_seat[i][1].equals(this.res_phonenum)) {
			    this.count_res += 1;
			    if (this.count_res == 2) {
			    	this.count_res = 0;
			    	throw new IllegalArgumentException("최대 2장까지 구매 가능합니다. 메뉴 화면으로 돌아갑니다.");

			    }
			}

			}
		}catch(NullPointerException e) {

		}catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		    System.out.println();
		    return false;
		}
		
		int count = 0;
		switch(this.seatType) {
			case "V": 
				for(int i=0;i<30;i++) {
					if(v_seat[i][0] == null && v_seat[i][1] == null && v_seat[i][2] == null) {
						v_seat[i][0] = this.res_name;
						v_seat[i][1] = this.res_phonenum;
						v_seat[i][2] = this.res_phonenum.substring(3);
						count += 1;
						break;
					}

				}
				if(count == 0) {
					System.out.println("현재 남은 좌석이 없습니다. 다른 좌석 타입을 확인해주십시오. 좌석 선택 화면으로 돌아갑니다.");
					System.out.println();
					return getInput();
				}
				
				break;
			case "S":
				for(int i=0;i<30;i++) {
					if(s_seat[i][0] == null && s_seat[i][1] == null && s_seat[i][2] == null) { 
						s_seat[i][0] = this.res_name;
						s_seat[i][1] = this.res_phonenum;
						s_seat[i][2] = this.res_phonenum.substring(3);

						count += 1;
						break;
					}

				}
				if(count == 0) {
					System.out.println("현재 남은 좌석이 없습니다. 다른 좌석 타입을 확인해주십시오. 좌석 선택 화면으로 돌아갑니다.");
					System.out.println();
					return getInput();}
				break;
			case "A":
				for(int i=0;i<30;i++) {
					if(a_seat[i][0] == null && a_seat[i][1] == null && a_seat[i][2] == null) { 
						a_seat[i][0] = this.res_name;
						a_seat[i][1] = this.res_phonenum;
						a_seat[i][2] = this.res_phonenum.substring(3);
						count += 1;
						break;
					}
				}
				if(count == 0) {
					System.out.println("현재 남은 좌석이 없습니다. 다른 좌석 타입을 확인해주십시오. 좌석 선택 화면으로 돌아갑니다.");
					System.out.println();
					return getInput();}
				break;
			case "B":
				for(int i=0;i<30;i++) {
					if(b_seat[i][0] == null && b_seat[i][1] == null && b_seat[i][2] == null) { 
						b_seat[i][0] = this.res_name;
						b_seat[i][1] = this.res_phonenum;
						b_seat[i][2] = this.res_phonenum.substring(3);
						count += 1;
						break;
					}
				}
				if(count == 0) {
					System.out.println("현재 남은 좌석이 없습니다. 다른 좌석 타입을 확인해주십시오. 좌석 선택 화면으로 돌아갑니다.");
					return getInput();}
				break;
		}

		get_Reserve_Num();
		return true;
	}
	
	private boolean store(int seatNum) { 
		this.count_res = 0;
		int seatNum1 = seatNum - 1; 
		try {
		for(int i =0;i<120;i++) {
			if (all_seat[i][0] != null && all_seat[i][0].equals(this.res_name) && all_seat[i][1] != null && all_seat[i][1].equals(this.res_phonenum)) {
			    this.count_res += 1;
			    if (this.count_res == 2) {
			    	this.count_res = 0;
			    	throw new IllegalArgumentException("최대 2장까지 구매 가능합니다. 메뉴 화면으로 돌아갑니다.");
			    }
			}
			}
		}catch(NullPointerException e) {
	
		}catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		    System.out.println();
		    return false;
		}
		switch(seatType) {
		case "V": 
				if(v_seat[seatNum1][0] == null && v_seat[seatNum1][1] == null && v_seat[seatNum1][2] == null) {
					v_seat[seatNum1][0] = this.res_name;
					v_seat[seatNum1][1] = this.res_phonenum;
					v_seat[seatNum1][2] = this.res_phonenum.substring(3);
				}else {
					System.out.println("이미 예약되어있거나 만석입니다. 메뉴 화면에서 '조회' 기능을 통해 현재 좌석 예약 현황을 확인할 수 있습니다.");
					System.out.println();
					return false;  
				}
			
			break;
		case "S":
			if(s_seat[seatNum1][0] == null && s_seat[seatNum1][1] == null && s_seat[seatNum1][2] == null) { 
				s_seat[seatNum1][0] = this.res_name;
				s_seat[seatNum1][1] = this.res_phonenum;
	            s_seat[seatNum1][2] = this.res_phonenum.substring(3);

			}else {
				System.out.println("이미 예약되어있거나 만석입니다. 메뉴 화면에서 '조회' 기능을 통해 현재 좌석 예약 현황을 확인할 수 있습니다.");
				System.out.println();
				return false; 

			}
			break;
			
		case "A":
			if(a_seat[seatNum1][0] == null && a_seat[seatNum1][1] == null && a_seat[seatNum1][2] == null) { 
				a_seat[seatNum1][0] = this.res_name;
				a_seat[seatNum1][1] = this.res_phonenum;
	            a_seat[seatNum1][2] = this.res_phonenum.substring(3);

			}else {
				System.out.println("이미 예약되어있거나 만석입니다. 메뉴 화면에서 '조회' 기능을 통해 현재 좌석 예약 현황을 확인할 수 있습니다.");
				System.out.println();
				return false;

			}
			break;
			
		case "B":
			if(b_seat[seatNum1][0] == null && b_seat[seatNum1][1] == null && b_seat[seatNum1][2] == null) {
				b_seat[seatNum1][0] = this.res_name;
				b_seat[seatNum1][1] = this.res_phonenum;
				b_seat[seatNum1][2] = this.res_phonenum.substring(3);
			}else {
				System.out.println("이미 예약되어있거나 만석입니다. 메뉴 화면에서 '조회' 기능을 통해 현재 좌석 예약 현황을 확인할 수 있습니다.");
				System.out.println();
				return false; 

			}
			break;
	}

		get_Reserve_Num();
	    return true;
}
	private void get_Reserve_Num() {
	    String[] seatTypes = {"V", "S", "A", "B"};
	    String[][][] seatArrays = {v_seat, s_seat, a_seat, b_seat};
		Check_Cancel check = new Check_Cancel();
        for (int i = 0; i < seatTypes.length; i++) {
            if (this.seatType.equals(seatTypes[i])) {
                check.check_seat(this.seatType, seatArrays[i]);
                break;
            }
        }
		
		String res_phonenum2 = this.res_phonenum.substring(3);
		this.reserve_Num  = res_phonenum2; 
		System.out.println("예약 완료. 예약번호(0일 경우 아직 등록되지 않은 것입니다) : " + this.reserve_Num); 
		System.out.println();
	}	
	public String[][] all_seat_Info() {
		return all_seat;
	}
	
	public void run() {
	    String[] seatTypes = {"V", "S", "A", "B"};
	    String[][][] seatArrays = {v_seat, s_seat, a_seat, b_seat};
	    Check_Cancel check = new Check_Cancel();
	    while (true) {
	        if (this.seatNum == 0) {
	            if (getInput() == false) {
	                break;
	            }
	            for (int i = 0; i < seatTypes.length; i++) {
	                if (this.seatType.equals(seatTypes[i])) {
	                    check.check_seat(this.seatType, seatArrays[i]);
	                    check.check_seat(all_seat);
	                    check.cancel(all_seat);
	                    break;
	                }
	            }
	        } else {
	            if (getInput() == false) {
	                break;
	            }
	            for (int i = 0; i < seatTypes.length; i++) {
	                if (this.seatType.equals(seatTypes[i])) {
	                    check.check_seat(this.seatType, seatArrays[i]);
	                    check.check_seat(all_seat);
	                    check.cancel(all_seat);
	                    break;
	                }
	            }
	        }
	    }
	}
}