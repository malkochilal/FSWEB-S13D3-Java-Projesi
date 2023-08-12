package com.workintech.model;

public class Person {
    //instances variables(field)
     String firstname;
     String lastname;
     int age;
     double salary;
     boolean isMarried;
     String[] pets;


     //constructor'ın dönüş değeri(void gibi) yok.
     public Person(String firstname,String lastname,int age){
         this.firstname=firstname;
         this.lastname=lastname;
         this.age=age;
     }
     //Constructor overloading
     public Person(String firstname,String lastname,int age,double salary,boolean isMarried,String[]pets){
       this(firstname, lastname, age);  //chaining
         this.salary=salary;
         this.isMarried=isMarried;
         this.pets=pets;
     }

    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }

    public int getAge(){
         return age;
     }
     public boolean isTeen(){
         return age>=13 && age<=19;
     }
     public String toString(){
         return String.format("Firstname:%s,Lastname:%s,Age:%d,salary:%.2f",firstname,lastname,age,salary);
     }

}
