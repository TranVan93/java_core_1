package train.vanvtt.example.buoi1;

public class ExamplePrivate {
	private String exPrivate = "private";
	String defaultStr = "default";
	protected String protectedStr = "protected";
	public String publicStr = "public";
	
	
	
	public String getExPrivate() {
		return exPrivate;
	}



	public void setExPrivate(String exPrivate) {
		this.exPrivate = exPrivate;
	}



	public void hienThi() {
		System.out.println(this.exPrivate);
		System.out.println(this.protectedStr);
		System.out.println(this.defaultStr);
		System.out.println(this.publicStr);
	}
}
