package javaprogram;

public class EncapProg {

	public static void main(String[] args) {
		Encap en=new Encap();
		en.setname("Sanjay");
		en.setid("EMP001");
		en.setage(23);
		System.out.println("Name "+en.getname()+"\n"+"ID "+en.getid()+"\n"+"Age "+en.getage()+"\n");
	}

}
