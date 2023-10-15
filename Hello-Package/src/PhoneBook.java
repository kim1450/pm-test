import java.util.Scanner;

class Store{ // class 1
    private String[][] info_arr;
    private String name;
    private String phone;

    public Store(int n) { //constructor 1
        Scanner scanner = new Scanner(System.in);
        info_arr = new String[n][2]; // name,phone_number가 있어야하므로 String 배열의 길이를 [n][2]로 설정.
        for (int i = 0; i < n; i++) { 
            System.out.print("Name and Phonenumber (ex. 홍길동 010-1234-5678) >> ");
            String info = scanner.nextLine(); // name,phone_number를 받는다.
            String[] info_spl = info.split(" "); // 공백을 기준으로 split해준다.
            info_arr[i] = info_spl; // split한 값을 info_arr에 넣어준다.
        }
        System.out.println("Store Done");
        
        
    }

    public Store(String name,String phone) { // constructor 2
        this.initialize(name, phone);
    }

    public void initialize(String name,String phone) {
        this.name = name;
        this.phone = phone;
    }
    

    public String[][] getInfoArr() {
        return info_arr;
    }
    
    public String search(String[][] infoarray , Store[] Obj_arr) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Name to search  >> ");
        	String search_name = scanner.next();

	            for (int i = 0; i < Obj_arr.length; i++) {
	                if (search_name.equals(infoarray[i][0])) { // input(search_name)의 값이 infoarray[i][0](0은 name,1은 phone_number)와 같다면 
	                    System.out.println(infoarray[i][0] + "'s number is " + infoarray[i][1]); 
	                    return search_name; // 일치하는 이름을 찾았을 때 메소드 종료
	                }
	            }
	
	            if ("Stop".equals(search_name)) {
	                return "Stop"; // Stop을 입력하면 메소드 종료
	            }
	
	            // 이름을 찾지 못한 경우
	            System.out.println(search_name + " not found");
	            return search_name;        
    }
    
    }

public class PhoneBook { // class 2

	public static void main(String[] args) {
		
        System.out.print("Number of Person>> "); // 인원수 input 받기
        Scanner scanner = new Scanner(System.in); 
        int num = scanner.nextInt();
        // nextInt()는 정수를 읽은후 \n을 그대로 남겨두기 때문에 nextLine()을 호출하면 아무 입력 없이 넘어가는것으로 처리됨.
        scanner.nextLine(); // 그렇기 때문에 \n 제거 
        Store store; // Store 클래스 객체 선언
        store = new Store(num);
        String[][] infoArray = store.getInfoArr(); // name과 phone_number 정보를 array에 저장하기 위해 2차원 배열에 넣어준다.
        
        
        Store[] Obj_arr = new Store[num]; // object array 선언
        for(int i=0;i<num;i++) { // Store(String name,String phone) constructor에 name, phone_number를 Obj_arr에 넣어준다.
        	Obj_arr[i] = new Store(infoArray[i][0],infoArray[i][1]);
        }
        
        
        while(true) {
        	String search_result = store.search(infoArray,Obj_arr); // search 메소드의 return값을 search_result 변수에 저장해준다.
        	if ("Stop".equals(search_result)) { // search_result에 저장된 값이 "Stop"이라면 코드 종료.
        		break;
        	}
        }             
	}		
}
