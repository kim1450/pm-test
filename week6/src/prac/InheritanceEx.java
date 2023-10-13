package prac;

public class InheritanceEx {
	public static void main(String[] args) {
		NewStudent s = new NewStudent();
		s.set(80);
		int get_weight = s.getWeight();
		System.out.println("몸무게는 "+get_weight);
	}

}
