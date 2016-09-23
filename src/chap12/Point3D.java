package chap12;

public class Point3D extends Point2D {
	int z;

	Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;}
	void zetZ(int z){this.z = z;}
	int getZ(){return z;}

}
