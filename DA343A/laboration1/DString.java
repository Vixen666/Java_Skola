package laboration1;

public class DString implements DynamicString { // implementera metoderna i DynamicString - se lab
	private char[] text;
	private int length = 0;

	public DString() {
		this(10);
	}

	public DString(int size) {
		size = (size<=0) ? 10 : size;
		text = new char[size];
		length = 0;
	}

	public DString(String str) {
		text = str.toCharArray();
		length = text.length;
	}

	public DString(DString str) {
		text = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			text[i] = str.charAt(i);
		}
		length = text.length;
	}

	private void grow() {
		char[] newArr = new char[length*2];
		System.arraycopy(text, 0, newArr, 0, text.length);
		text = newArr;
	}

	public DynamicString  append(char chr) {
		if(length==text.length) {
			grow();
		}
		text[length++] = chr;
		return this;
	}

	@Override
	public int length() {
		return this.length;
	}

	@Override
	public char charAt(int index) {
		return this.text[index];
	}

	@Override
	public DynamicString  append(DString str) {

		char[] newArr = new char[length + str.length()];
		System.arraycopy(text, 0, newArr, 0, length);
		for(int i = 0; i < str.length(); i++) {
			newArr[this.length()+i] = str.charAt(i);
		}
		this.length += str.length();
		this.text = newArr;
		return this;

	}

	@Override
	public DynamicString  delete(int start, int end) {
		int diff= end -start;
		char[] newArr = new char[this.length-diff];
		System.arraycopy(text, 0, newArr, 0, start);
		System.arraycopy(text, end, newArr, start, this.length-end);
		this.length -= diff;
		text = newArr;
		return this;
	}

	@Override
	public DynamicString  delete(int index) {
		this.delete(index, index+1);
		return this;
	}

	@Override
	public String substring(int start, int end) {
		return new String(text,start,end-start);
	}

	@Override
	public String substring(int start) {

		return substring(start,this.text.length);
	}

	@Override
	public int indexOf(char chr) {
		// TODO Auto-generated method stub
		return substring(0).indexOf(chr);
	}
}