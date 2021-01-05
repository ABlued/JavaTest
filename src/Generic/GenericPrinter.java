package Generic;
//제네릭 클래스는 static으로 사용할 수 없다.
//static메소드나 변수는 클래스가 선언되기 전에도 존재하는 것인데
//제네릭 클래스는 T의 자료형이 정한 후 사용할 수 있기 때문이다.
public class GenericPrinter<T extends Material> {		//T의 extends예약어로 사용할 수 있는 자료형에 제한을 둘 수 있다
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}

abstract class Material{
	public abstract void doPrinting();
}

class Powder extends Material{
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Powder입니다";
	}
}

class Plastic extends Material{
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Plastic입니다";
	}
}
