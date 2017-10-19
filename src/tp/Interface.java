package tp;
public class Interface {
	public static void main(String [] str){
		Materials materials = new Materials();
		materials.setCle(3);
		Sezar se = new Sezar(materials);
		se.setDecode(false);
		se.code_or_decode("aaabcyzx1234é%:,?&");
		System.out.println(se.getMessage_result());
	
		se.setDecode(true);
		se.code_or_decode(se.getMessage_result());
		System.out.println(se.getMessage_result());
	}
}
