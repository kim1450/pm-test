package prac;

class Calc{
	public static int abs(int a) {return a>0?a:-a;}
	public static int max(int a,int b) {return (a>0)?a:b;}
	public static int min(int a,int b) {return (a>0)?b:a;}
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-3));
		System.out.println(Calc.max(6,4));
		System.out.println(Calc.min(6,4));
	}
}
