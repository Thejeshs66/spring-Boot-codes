package com.example.adhar;

public class adhar {

     private int adharId;
     private String name;
     private int age;
     private String Address;
     
     public adhar() {
    	 
     }
     
	 public adhar(int adharId, String name, int age, String address) {
		super();
		this.adharId = adharId;
		this.name = name;
		this.age = age;
		Address = address;
	}
	 public int getAdharId() {
		 return adharId;
	 }
	 public String getName() {
		 return name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public String getAddress() {
		 return Address;
	 }
     
}
