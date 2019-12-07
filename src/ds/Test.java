package ds;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myBuffer b = new myBuffer(100);
		Processor p1 = new Processor("p1",b);
		Processor p2 = new Processor("p2",b);
		Lecteur l1 = new Lecteur("l1","fichier1.txt",b);
		Lecteur l2 = new Lecteur("l2","fichier2.txt",b);

	}

}
