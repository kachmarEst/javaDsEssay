package ds;

import java.util.HashMap;

public class Processor extends Thread {
	
	private myBuffer buff;
	private String Pname;
	private HashMap<String,Integer> wordsCounts = new HashMap<String,Integer>();
	
	public  Processor(String PName, myBuffer buff) {
		this.Pname = PName;
		this.buff = buff;
	}
		
	public synchronized void run() {
		processe();
	}
	/* 
	 	Void run(): retirer tous les mots de data à l'aide de processe
	 Void processe() : retirer un mot de data puis ajuste les compte dans wordsCounts
	 HashMap<String, Integer> getWordsCounts()*/

	public void processe() {
		String word = buff.getData();
		
		if(wordsCounts.containsKey(word)) {
			wordsCounts.put(word, wordsCounts.get(word) + 1);
		}else {
			wordsCounts.put(word, 1);
		}
		
	}
	HashMap<String, Integer> getWordsCounts(){
		return wordsCounts;
		
	}
}
	
