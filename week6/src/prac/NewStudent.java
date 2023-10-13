package prac;

class NewStudent extends Person {
	public void set(int weight1) {
		setWeight(weight1);
		age = 15;
		height = 180;
		name = "김경민";
//		weight = 60; // 오류 발생. 부모 클래스에서 private로 선언해서 오류발생
	}
}
