package train.vanvtt.example.buoi1;

public class Example extends ExamplePrivate {

	public static void main(String[] args) {
		ExamplePrivate ex = new ExamplePrivate();
		
		System.out.println(ex.defaultStr);
		
		System.out.println(ex.protectedStr);
		
		System.out.println(ex.publicStr);
		

//		System.out.println(ex.exPrivate);
		
		ex.hienThi();
	}

}
