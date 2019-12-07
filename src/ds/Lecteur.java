package ds;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Lecteur extends Thread {
	private String threadName;
	private String fileName;
	private myBuffer buff;
	public Lecteur(String theadName, String fileName, myBuffer buff){
		this.threadName=  theadName;
		this.fileName = fileName;
		this.buff= buff;
	}
	public synchronized void run() {
		buff.addWord(this.readWord());		
	}
	public String readWord() {
		String word = "";
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(new File(this.fileName)));
			int n = 0;
			while(bis.available() > 0) {
if((char)bis.read() == ' ' || (char)bis.read() == ',' || (char)bis.read() == ';' || (char)bis.read() == '?' || (char)bis.read() == ':' || (char)bis.read() == '!' || (char)bis.read() == '.'  ) {
	return word;
	}else {
		word+=(char)bis.read();
	}

}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return word;

	}
	

}
