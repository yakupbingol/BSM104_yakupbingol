package week4;

public class Point {
	private int x;
	private int y;
	
	public Point(int initialX, int initialY) {
		setLocation(initialX,initialY);
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double distanceFromOrigin() {
		return Math.sqrt(x*x+y*y);
	}
	public void  translate(int dx, int dy) {
		setLocation(x+dx,y+dy);
		// p1(4,6)  (2,3)  p1(4+2, 6+3) p1(6,9) nokta öteleme
	}
	public void setLocation(int newX , int newY) {
		x=newX;
		y=newY;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}
