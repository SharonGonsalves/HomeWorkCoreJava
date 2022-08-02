package hw5Q2Constructor;



public class Computer {
//Global variable or class variable	
//variables declared 	
public String brand;
public String model;
public String OperatingSystem;
public double price;
public char grade;
public boolean madeInUSA;


//Constructors are 2 types --
//default constructor (no argument constructor) and parameterized constructor
// A class can contain one default and one or more than one parameterized constructor
// Default Constructor must be declared before parameterized constructor
// you shouldn't write a parameterized constructor without writing a default constructor. It's a norm.
//default constructor (no argument constructor) declared 


public Computer() {
	System.out.println("This default Constructoris from Computer class");

}
// Parameterized Constructor 01 declared
// Here computerBrand is a parameter
public Computer(String brand , String model , String operatingSystem ,double price, char grade, boolean madeInUsa) {
	this.brand = brand;
	this.model= model;
	this.OperatingSystem =operatingSystem;
	this.price =price;
	this.grade =grade;
	this.madeInUSA =madeInUsa;

	System.out.println("My Brand:" + brand + "\nModel:" + model +"\nOperating system:" + operatingSystem +"\nPrice:" + price +"\nGrade:"+ grade +"\nMadeInUsa:" + madeInUsa);}
	
	public Computer(double price, String model , String brand , String operatingSystem , char grade ,boolean madeInUsa) {
	this.price=price;
	this.model=model;
	this.brand=brand;
	this.OperatingSystem = operatingSystem;
	this.grade=grade;
	this.madeInUSA=madeInUsa;
	
	System.out.println("My Brand:" + brand + "\nModel:" +model + "\nOperating system:" + operatingSystem + "\nPrice:" +price + "\nGrade:" + grade + "\nMadeInUsa:" + madeInUsa);
	
	
}
	
}
