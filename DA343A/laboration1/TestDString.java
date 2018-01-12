package laboration1;

public class TestDString {
	public static void main(String[] args) {
		DString ds = new DString("123456789");
		DString ds2 = new DString("123456789");
		ds.append('a');
		System.out.println(ds.length());
		ds.append('b');
		System.out.println(ds.length());
		ds.append(ds2);
		System.out.println(ds.length());
		ds.delete(7,9);
		System.out.println(ds.length());
		ds.delete(7);
		System.out.println(ds.substring(1,12));
		System.out.println(ds.substring(1));
		System.out.println(ds.indexOf('b'));
		
		DString str1 = new DString("Laboration"); 
		str1.append(' ').append('1').append(new DString("\nUppgift3")); 
		System.out.println(str1.substring(0)); 
		str1.delete(2).delete(4,6).delete(8); 
		System.out.println(str1.substring(0)); 
	}

}
