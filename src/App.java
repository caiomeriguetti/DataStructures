
public class App {
	public static void main(String[] args) {
		List l = new List();
		l.append(1);
		l.append(2);
		l.append(3);
		l.append("X");
		l.append("Y");
		l.append("Z");
		l.append("Z");
		l.append("T");
		l.append("Z");
		l.append("U");
		
		System.out.println(l.toString());
		
		l.deleteAllByValue("Z");
		
		System.out.println(l.toString());
		
		System.out.println(l.toString());
		
		l.inject(2, "A");
		l.inject(2, "B");
		
		System.out.println(l.toString());
		
		l.deleteByValue("A");
		
		l.deleteByIndex(0);
		
		System.out.println(l.toString());
		
		l.deleteByIndex(0);
		
		System.out.println(l.toString());
		
		l.deleteByValue("B");
		
		System.out.println(l.toString());
		
	}
}
