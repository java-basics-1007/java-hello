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