package Excercise1;

import java.util.Scanner;

public class SingersTest {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		Singers singer1= new Singers(101, "Drake","Toronto","24-08-1986",6);
		
		System.out.println("Singer's ID :" + singer1.getID());
		System.out.println("Singer's name i=:" + singer1.getName());
		System.out.println("Singer's coutnry:" + singer1.getAddress());
		System.out.println("Singer's date of birth is:" + singer1.getDOB());
		System.out.println("Number of albums this artist has done :" + singer1.getNumofAlbum());
		
		System.out.println("\n");
		
		System.out.println("Enter the singer's ID:");
		int id = input.nextInt();
		System.out.println("Enter the singer's Name:");
		String name = input.next();
		System.out.println("Enter the singer's Address:");
		String address = input.next();
		System.out.println("Enter the singer's Date of Birth:");
		String dob= input.next();
		System.out.println("Enter the number of album the singer has done:");
		int nofAlb= input.nextInt();
		
		singer1.setID(id);
		singer1.setName(name);
		singer1.setAddress(address);
		singer1.setDOB(dob);
		singer1.setNumofALbum(nofAlb);
		singer1.setALL(id, name, address, dob, nofAlb);
		System.out.println("Singer's ID :" + singer1.getID());
		System.out.println("Singer's name i=:" + singer1.getName());
		System.out.println("Singer's coutnry:" + singer1.getAddress());
		System.out.println("Singer's date of birth is:" + singer1.getDOB());
		System.out.println("Number of albums this artist has done :" + singer1.getNumofAlbum());
		
	}
}

