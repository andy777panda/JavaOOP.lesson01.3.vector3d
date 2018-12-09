package net.ukr.andy777;

/*
 Описать класс "Vector3d" (т.е. он должен описывать вектор в 3-х мерной декартовой системе координат). 
 В качестве свойств этого класса - взять координаты вектора. 
 Для этого класса реализовать методы сложения, скалярного и векторного произведения векторов. 
 Создать несколько объектов класса и протестрировать их.
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("Lesson1 Task3");
		Vector3d();
	}

	private static void Vector3d() {

		Vector3d v1= new Vector3d(1.1, 2.2, 3.3);
		System.out.println(v1.toString("v1"));

		Vector3d v2= new Vector3d(-1, 5.2, 0);
		System.out.println(v2.toString("v2"));

		Vector3d vSum= v1.vectorSum(v2);
		System.out.println(vSum.toString("vSum"));

		Vector3d vMult= v1.vectorMultiply(v2);
		System.out.println(vMult.toString("vMult"));

		double vScalarMult= v1.vectorScalarMultiply(v2);
		System.out.println("vScalarMult = "+vScalarMult);
	}
}