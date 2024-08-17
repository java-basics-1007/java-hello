package org.example.exceptions;


// any exception class (other than RuntimeException) -> Exception called as checked(compile-time) exception
// any exception class -> RuntimeException called as un-checked(runtime) exception

/**
 * Any kind of exception occurs only during the code execution.
 * As exception is an object, it stays inside JVM.
 * while writing code you dont have JVM.
 *
 * Our IDE are smart enough to report us about checked exception while writing the code. If we dont fix it our code wont compile.
 * In such a case we have to below things:
 * 1.  we have to add that checked exception in method signature
 * 1.  wrap with try / catch
 */

/**
 *
 * checked exception:
 *
 * AccessDeniedException -> FileSystemException -> IOException -> Exception
 * FileSystemException -> IOException -> Exception
 * IOException -> Exception
 * ClassNotFoundException -> ReflectiveOperationException-> Exception
 * ReflectiveOperationException-> Exception
 *
 * For checked exception your class should be child of java.lang.Exception
 * ------------------------------------------------------------------------------
 * un-checked exception:
 * ArithmeticException -> RuntimeException -> Exception
 *
 * For un-checked exception your class should be child of java.lang.RuntimeException
 *
 * Any Exception other than un-checked exception are called checked exception.
 *
 */
public class App17 {
//    public static void main(String[] args) throws ClassNotFoundException {
//
//        Class.forName("java.lang.String");
//    }

    public static void main(String[] args) throws RuntimeException {

        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
