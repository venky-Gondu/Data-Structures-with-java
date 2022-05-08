//finding area and perimeter.
public class beast {
	int length;
	int breath;
	public beast(int ln, int br) {
	
	length = ln;
	breath = br;
	
}public void perimeter() {
	int pm = 2*(breath+length);
	System.out.println(pm);
	
}public void area() {
	int ar = (breath*length);
	System.out.println(ar);
}public static void main(String[] args) {
	beast myobj = new beast(5,2);
	myobj.perimeter();
	myobj.area();
	
}

	
}
		
		
	
	


