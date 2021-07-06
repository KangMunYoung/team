
public class Y extends X {

	Y(){super(6); System.out.print(3);}
	Y(int y){this(); System.out.println(4);}
	public static void main(String[] args) {
		new Y(5);
	}

}
