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