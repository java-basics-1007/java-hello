21st July 2024
## Q and A discussion 

### abstract methods forces a class to declare as abstract 
```java
public abstract class B implements K {
  public abstract m2(); // a single abstract method forces to declare the class as abstract 
}
```

### making class as abstract 

```java 
public interface K {
  public void m1();
}

public abstract class B implements K {
  // if you dont want give implementation for m1() in this 
  // class, then must declare class B as abstract
}
```
### 1 or more param based super(..) constructor call
```java 
public class A {
// this class has no more default constructor 
  public A(int id){
    sop("hi");
  }
}

public class B extends A{
  int id ;
  
  public B(int id){
  // compiler  adds a super() call here, 
  // but parent class has no constrtuctor that takes 0 argument. This will give compilation error.
  // so the developer has to fix this by adding a super param constructor that matches to parent class 
  // constructor 
   super(id);
   this.id = id;
   sop("hello");
  }
}

B bvar = new B(10); // hi , hello
sop(bvar.id); // 10
```

### 0 param based super() constructor call, by default by compiler
```java 
public class A {
  
}

public class B extends A{
  int id ;
  
  public B(int id){
  // compiler adds a super() call here 
   this.id = id;
  }
}

B bvar = new B(10);
sop(bvar.id); // 10
```

### constructors and super(): 0 argument parent class constructor invocation

```java 
public class A{
  public A(){
   super();
   sop("hello");
  }
}

public class B extends A {
  public B(){
   super();
   sop("hi");
  }
}
public class C extends B{
  public C(){
   super();
   sop("bye");
  }
}
A aVar = new C(); // hello, hi, bye
// parent to child execution of constructor when child object is created, i.e from top to bottom 
```


### constructors and inheritance

```java 
public class A{
  public A(){
   sop("hello");
  }
}

public class B extends A {
  public B(){
   sop("hi");
  }
}
public class C extends B{
  public C(){
   sop("bye");
  }
}
A aVar = new C(); // hello, hi, bye
// parent to child execution of constructor when child object is created, i.e from top to bottom 
```

### 2. interface , abstract class, concrete class
```java 
public interface K {
  public void m1();
  public void m2();
}
public abstract class B implements K{
  // the interface methods no need to implement in abstract class 
  // but you can implement those interface methods in abstract class if you want
  
  public void m2(){
   sout("hello");
   m1();
   m3();
  }
  
  public abstract void m3();
  
}
public class A extends B { // A is a concrete class 
  public void m1(){ // m1 must be implemented by A, as B being abstract class did not implement m1
   sop("hi");
  }
  
   public void m3(){// m3 must be implemented by A, as B being abstract class declared m3 as abstract 
   sop("bye");
  }
}

A aVar = new A();
aVar.m2();  // hello, hi , bye 
```

### 1. interface , abstract class, concrete class
```java 
public interface K {
  public void m1();
  public void m2();
}
public abstract class B implements K{
  // the interface methods no need to implement in abstract class 
  // but you can implement those interface methods in abstract class if you want
}
public class A extends B { // A is a concrete class 
  public void m1(){
   sop("hi");
  }
  
   public void m2(){
   sop("hello");
  }
}
```

### interface and implementation by concrete class

```java 
public interface K {
  public void m1();
  public void m2();
}

public class A implements K { // A is a concrete class 
  public void m1(){
   sop("hi");
  }
  
   public void m2(){
   sop("hello");
  }
}

K kVar = new A();
kVar.m1(); // hi
kVar.m2(); // hello
```


### abstract class can also have abstract method , concrete method

```java 
public abstract class A{
  public abstract void m1(); // abstract method
  public void m2(){ // concrete method
   sop("hi");
  }
}

public class B extends A{
 // compilation wont succedd, 
 // so it is mandatory to provide implementation for m1() abstract method of parent class A 
 public void m1(){
  sop("hello");
 }
 
}

A aVar = new B();
aVar.m1();
aVar.m2();
```

### abstract class have no object

```java 
public abstract class A{

}

// you cant create object for abstract class .

A aVar = new A(); // compilation error
```

### Override The toString() method of object class

```java
public class A{
  public int id;
  
  public A(){ // default constructor 
    id = 10;
  }
  
  public String toString(){
    return "id="+id;
  }
}

public class Test {
  public static void main(String[] args){
    A aVar = new A();
	sop(aVar); // A@hexaDecimalHashCode
	sop(aVar.toString()); // A@hexaDecimalHashCode
  }
}
```


### The toString() method of object class

```java
public class A{
  public int id;
  
  public A(){ // default constructor 
    id = 10;
  }
}

public class Test {
  public static void main(String[] args){
    A aVar = new A();
	sop(aVar); // A@hexaDecimalHashCode
	sop(aVar.toString()); // A@hexaDecimalHashCode
  }
}
```



### Overloading

```java
public class A{
  public void m1(){ // 0 arguments
    sop("hi");
  }
  
  public void m1(int x){ // 1 arguments i.e x 
    sop("hi");
  }
  
  public void m1(int x, int y){ // 2 arguments , i.e x , y
    sop("hi");
  }
}
```

### Cant define same method again in same class
```java
public class A{
  public void m1(){
    sop("hi");
  }
  
  public void m1(){
    sop("hi");
  }
}
```

### Overriding
```java
public class A{
  public void m1(){
    sop("hi");
  }
}

public class B extends A{
  
  @Overidding
  public void m1(){
    sop("hello");
  }
}
```

20th July 2024

1. Object class methods
2. Constructor, Constructor Overloading
3. Overriding & Overloading concept
4. Interfaces and Sub class implementation
5. Abstract Classes


## Object class methods

```
class: java.lang.Object

public String toString();
public int native hashCode();
public boolean equals(Object object);
public Class getClass();

```

## Constructors
- Name of constructor is always the class name.
- Constructor doesnt have any return type
- Always keep init logic inside the constructor.
- The intention of having a constructor to initialize its fields
- Because the constructor of the class that executes just immediately after object creation

### Default Constructor
When no constructors defined in the class, 
then we have default constructor is present in
the class.
```
public class Employee{
  public int id;
}
Employee e = new Employee(); // default constructor
System.out.println(e.id); // 0
```
### Defining our own default constructor
```
public class Employee{
  public int id;
  public Employee(){ // defining constructor
    id = 100;
  }
}
Employee e = new Employee(); // default constructor
System.out.println(e.id); // 100
```
### Defining param constructor
```
public class Employee{
  public int id; // field
  public Employee(int id){ // defining constructor
    this.id = id;// this.fieldName = paramName
  }
}
Employee e = new Employee(200); // param constructor
System.out.println(e.id); // 200
```

### Constructor Overloading
- The class can have one or more constructors with dfnt arguments
- Once param constructors defined then by default , default constructor not added automatically, developer must add it manually

## Overloading of methods ( static , instance methods it is allowed)
- Methods in a class can have same name but difnt arguments
## Overriding of methods (not for static methods)
- Implementing or re-defining parent class method in child class with dfnt logic