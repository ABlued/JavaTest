package Generic;

public class Main {
//	---Point.java와 연동된다---
	public static <T, V> double makeRectangle(Point<T, V> p1 ,Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
//		---Point.java와 연동된다---
	
	public static void main(String[] args) {
		
//		---GenericPrinter.java와 연동된다---
//		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
//		
//		powderPrinter.setMaterial(new Powder());
//		powderPrinter.printing();
//		Powder powder = powderPrinter.getMaterial();
//		System.out.println(powderPrinter);
//		
//		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
//		
//		plasticPrinter.setMaterial(new Plastic());
//		plasticPrinter.printing();
//		Plastic plastic = plasticPrinter.getMaterial();
//		System.out.println(plasticPrinter);
//
//		---GenericPrinter.java와 연동된다---	
		
//		---Point.java와 연동된다---
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);
		
		double rect = Main.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어지 사각형의 넓이는 " + rect + "입니다.");
//		---Point.java와 연동된다---
	}
}
