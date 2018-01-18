package laboration2;

import javax.swing.JOptionPane;

public class Exercise9 {
	private Exercise6 ex6;
	private Exercise7 ex7;
	
	public Exercise9(String filepath){
		ex6 = new Exercise6(filepath);
		ex7 = new Exercise7(filepath);
	}
	
	public void translate(){
		String text = JOptionPane.showInputDialog("ööh, mata in ett ord");
		if(ex6.translate(text) != null){
			JOptionPane.showMessageDialog(null, ex7.translate(ex6.translate(text)));
		}else{
			JOptionPane.showMessageDialog(null, "nope");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Exercise9 ex9 = new Exercise9("files/SkSvEn.txt");
		ex9.translate();
	}
}
