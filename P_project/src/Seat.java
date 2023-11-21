
public class Seat {
	protected String[][] v_seat;
	protected String[][] s_seat;
	protected String[][] a_seat;
	protected String[][] b_seat;
	protected String[][] all_seat;
	
	public Seat() {
	v_seat = new String[30][3]; // 예약자명,예약자 전화번호, 예약번호
	s_seat = new String[30][3];
	a_seat = new String[30][3];
	b_seat = new String[30][3];
	all_seat = new String[120][3];

	System.arraycopy(v_seat, 0, all_seat, 0, v_seat.length); 
	System.arraycopy(s_seat, 0, all_seat, v_seat.length, s_seat.length); 
	System.arraycopy(a_seat, 0, all_seat, v_seat.length + s_seat.length, a_seat.length);
	System.arraycopy(b_seat, 0, all_seat, v_seat.length + s_seat.length + a_seat.length, b_seat.length);
	}
	
	public boolean getInput() {
		return true;
	}
	public void check_seat(String[][] all_seat) {	
	}
	public void run() {	
	}
	public void cancel(String[][] all_seat) {
	}
}
