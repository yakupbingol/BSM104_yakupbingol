
public class main {

	public static void main(String[] args) {
		Point p1 = new Point();
        p1.x = 5;
        p1.y = -7;

        Point p2 = new Point();
        p2.x = 10;
        p2.y = 3;

        System.out.println("(" + p1.x + "," + p1.y + ")");
        double dist = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        System.out.println("Distance From Orijin "+dist);
        
        p1.x += 10;
        p1.y += 15;
        
        System.out.println("(" + p1.x + "," + p1.y + ")");
        
        
        System.out.println("(" + p2.x + "," + p2.y + ")");
	}

	 

}
