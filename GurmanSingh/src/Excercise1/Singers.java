package Excercise1;

public class Singers {
	 int singerID;
	 String singerName;
	 String singerAddress;
	 String singerDOB;
	 int numOFalbum;
	 
	 //Constructors
	 public Singers()
	 {
		 
	 }
	 
	 public Singers(int singerID)
	 {
		 this.singerID= singerID;
	 }
	 
	 public Singers(int singerID,String singerName)
	 {
		 this.singerID= singerID;
		 this.singerName= singerName;
    }
	 
	 public Singers(int singerID,String singerName,String singerAddress)
	 {
		 this.singerID= singerID;
		 this.singerName= singerName;
		 this.singerAddress= singerAddress;
	 }
	 
	 public Singers(int singerID,String singerName,String singerAddress,String singerDOB)
	 {
		 this.singerID= singerID;
		 this.singerName= singerName;
		 this.singerAddress= singerAddress;
		 this.singerDOB= singerDOB;
	 }
	 
	 public Singers(int singerID,String singerName,String singerAddress,String singerDOB,int numOFalbum)
	 {
		 this.singerID= singerID;
		 this.singerName= singerName;
		 this.singerAddress= singerAddress;
		 this.singerDOB= singerDOB;
		 this.numOFalbum= numOFalbum;
	 }
	 
	 //Setters
	 public void setID(int id) {
		 this.singerID= id;
	 }
	 
	 public void setName(String name)
	 {
		 this.singerName= name;
	 }
	 
	 public void setAddress(String address)
	 {
		 this.singerAddress= address;
	 }
	  
	 public void setDOB(String dob)
	 {
		 this.singerDOB= dob;
	 }
	 
	 public void setNumofALbum(int noOFalbum)
	 {
		 this.numOFalbum=  noOFalbum;
	 }
	 
	 public void setALL(int id, String name, String address, String dob, int noOFalbum) {
		 this.singerID= id;
		 this.singerName= name;
		 this.singerAddress= address;
		 this.singerDOB= dob;
		 this.numOFalbum=  noOFalbum;
	 }
	 //Getters 
	 public int getID() {
		 return singerID;
	 }
	 
	 public String getName() {
    	 return singerName;
	 }
	 
	 public String getAddress() {
		 return singerAddress;
	 }
	 
	 public String getDOB() {
		 return singerDOB;
	 }
	 
	 public int getNumofAlbum() {
		 return numOFalbum;
	 }
	 
	 
}

