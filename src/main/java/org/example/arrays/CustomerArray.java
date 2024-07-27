package org.example.arrays;

import java.util.Arrays;
import java.util.UUID;

public class CustomerArray {


    public static void main(String[] args) {
        Customer c1 = new Customer(null, "Alex", "Petrov", "alex.petrov@gmail.com");
        Customer c2 = new Customer(null, "Sam", "Newman", "sam.newman@gmail.com");
        Customer c3 = new Customer(null, "Kube", "Lukas", "kube.luka@gmail.com");

        Customer[] customers = {c1, c2, c3};
        System.out.println(Arrays.toString(customers));

        for(Customer element: customers){
            System.out.println(element);
        }
        // iterate using index
    }

    private static class Customer{
        private String id;
        private String firstName;
        private String lastName;
        private String email;

        public Customer(String id, String firstName, String lastName, String email) {
            this.id = UUID.randomUUID().toString();
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id='" + id + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

}
