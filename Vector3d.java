package net.ukr.andy777;

/* 
 Описать класс "Vector3d" (т.е. он должен описывать вектор в 3-х мерной декартовой системе координат). 
 В качестве свойств этого класса - взять координаты вектора. 
 Для этого класса реализовать методы сложения, скалярного и векторного произведения векторов. 
 */

public class Vector3d {

	private double x;
	private double y;
	private double z;

	public Vector3d() {
		super();
	}

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3d vectorSum(Vector3d vector) {
		Vector3d result = new Vector3d();
		result.setX(this.getX() + vector.getX());
		result.setY(this.getY() + vector.getY());
		result.setZ(this.getZ() + vector.getZ());
		return result;
	}

	public double vectorScalarMultiply(Vector3d vector) {
		return this.getX() * vector.getX() + this.getY() + vector.getY()
				+ this.getZ() + vector.getZ();
	}

	public Vector3d vectorMultiply(Vector3d vector) {
		Vector3d result = new Vector3d();
		result.setX(this.getY() * vector.getZ() - vector.getY() * this.getZ());
		result.setY(this.getZ() * vector.getX() - vector.getZ() * this.getX());
		result.setZ(this.getX() * vector.getY() - vector.getX() * this.getY());
		return result;
	}

	public String toString() {
		return "Vector3d [" + "x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public String toString(String vectorName) {
		return "Vector3d " + vectorName + " [" + "x=" + x + ", y=" + y + ", z="
				+ z + "]";
	}
}
