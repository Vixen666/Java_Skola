package laboration2;

import java.util.LinkedList;

public class Exercise10 {
	private LinkedList<String> list = new LinkedList<String>();
	
	public void add(String text) {
		list.add(text);
	}
	public void remove(String text) {
		list.remove(text);
	}
	public void print() {
		for (String str : list) {
			System.out.println(str);
		}
	}
	public void printReverse() {
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}
	public int size() {
		return list.size();
	}
	
	public void print6() {
		for (String str : list) {
			if (str.length() >= 6) {
				System.out.println(str);
			}
		}
	}
	public int count(char chr) {
		int counter = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).charAt(0) == chr) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		Exercise10 ex10 = new Exercise10();
		
		ex10.add("hej");
		ex10.add("nisseman");
		for(int i = 0; i < 100; i++){
			ex10.add("tesT"+i);
		}
		
		ex10.print();
		ex10.print6();
		ex10.remove("tesT99");
		ex10.print();
		ex10.printReverse();
		System.out.println(ex10.size());
		System.out.println(ex10.count('n'));
	}
}
