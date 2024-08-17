package org.example.exceptions;

// user defined exceptions
public class App18 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 0;
        EmployeeService employeeService = new EmployeeService();
        try {
            employeeService.save(e);
        } catch (PersistenceException ex) {
//            throw new RuntimeException(ex);
            ex.printStackTrace();
            System.out.println("PE");
        }
        catch (IdValidationException e1){
            e1.printStackTrace();
            System.out.println("IVE");
        }
        catch (RuntimeException e2){
            e2.printStackTrace();
        }
        finally {
            System.out.println("finally complete");
        }
    }

    // un-checked exception
    private static class IdValidationException extends RuntimeException{
        public IdValidationException(String message) {
            super(message);
        }
    }

    // checked exception
    private static class PersistenceException extends Exception{
        public PersistenceException(String message) {
            super(message);
        }
    }

    private static class Employee{
        int id;
        String name;
    }

    private static class EmployeeService{
        public Employee save(Employee e) throws PersistenceException {
            if(e.id <=0 ){
                throw new IdValidationException("the id is invalid");
            }
            if(e.name == null) {
                // some code
                throw new PersistenceException("Unable to perists the data");
            }
            return e;
        }
    }
}
