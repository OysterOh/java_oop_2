package oop.static_.singleton;
/** 
230308 싱글톤
 */
public class MainClass {

	public static void main(String[] args) {

//		Singleton s1 = new Singleton();
//		s1.method1();
//		s1.method2();
		
//		Singleton s1 = Singleton.s;
//		Singlelton.s = null;
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
//		s1.method1();
//		s1.method2();
	}

}
