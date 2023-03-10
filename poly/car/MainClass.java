package oop.poly.car;
/** 
230307 
 */
public class MainClass {

	public static void main(String[] args) {

		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		s1.run();s2.run();s3.run();
//		p1.run();p2.run();p3.run();
//		t1.run();t2.run();t3.run();t4.run();
		
		/*
		Sonata[] sonatas = {s1, s2, s3}; 
		for(Sonata s : sonatas) {
			s.run();
		}
		
		Tesla[] teslas = {t1, t2, t3, t4};
		for(Tesla t : teslas) {
			t.run();
		}
		*/
		
		//다형성을 적용해서 이종모음(서로 다른 모음) 배열을 선언할 수 있다.
		Car[] cars = {s1,s2,s3, p1,p2,p3, t1,t2,t3,t4};
		for(Car c : cars) {
			c.run();
		}

		
		System.out.println("-----------------------");
		
		System.out.println("***타이어 교체 작업***");
		t1.frontLeft = new HTire();
		t1.frontRight = new HTire();
		t1.rearLeft = new HTire();
		t1.rearRight = new HTire();
		
		System.out.println("-----------------------");
		
		Driver kim = new Driver();
		kim.drive(p1);
		kim.drive(s2);
		kim.drive(t3);
		
		System.out.println("-----------------------");

		
		Car c = (Tesla) kim.buyCar("테슬라");  //형변환
		c.run();
		Tesla t5 =  (Tesla) c;
		t5.enterMembership();
		
		CarShop shop = new CarShop();
		shop.carPrice(s3);
		shop.carPrice(new Tesla());
		shop.carPrice(kim.buyCar("포르쉐"));
		
	}
}
