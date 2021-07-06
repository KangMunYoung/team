
public class Sample{
 		public static void main(String[] args) {
 			Ex o = new Ex();
 			Test i = new Test();
 			int n =10;
 			i.setX(n);
 			o.setY(i);
 			System.out.println(o.getY().getX());
	}

}
