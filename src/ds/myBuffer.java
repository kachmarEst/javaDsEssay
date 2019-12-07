package ds;

import java.util.LinkedList;

public class myBuffer {
	private int size;
	private LinkedList<String> data = new LinkedList<String>();
	public myBuffer(int size) {
		this.size = size;
	}
	public void addWord(String word) {
		if(this.size> this.data.size()) {
			this.data.removeFirst();
			this.data.add(word);

		}else {
			this.data.add(word);

		}
	}
	public String getData(){
		String word = this.data.getLast();
		this.data.removeLast();
		return word;
	}
	
}
