package org.example.arrays;

import java.util.Arrays;
import java.util.UUID;

public class SearchCustomer {

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

    public static void main(String[] args) {
        Customer c1 = new Customer(null, "Alex", "Petrov", "alex.petrov@gmail.com");
        Customer c2 = new Customer(null, "Sam", "Newman", "sam.newman@gmail.com");
        Customer c3 = new Customer(null, "Kube", "Lukas", "kube.luka@gmail.com");

        Customer[] customers = {c1, c2, c3};

        Customer customerSearch1 = findCustomer(customers, "kube.luka@gmail.com");
        System.out.println(customerSearch1);
        Customer customerSearch2 = findCustomer(customers, "kube1.luka@gmail.com");
        System.out.println(customerSearch2); // null

        Customer customerSearch3 = findByFirstName(customers, "Kube");
        System.out.println(customerSearch3);

        Customer deletedCustomer = removeByEmail(customers, "kube.luka@gmail.com");
        System.out.println(deletedCustomer);
        System.out.println(Arrays.toString(customers));

    }

    /**
     *
     * @param customers the array of customers
     * @param email search the customer using the email in the array
     * @return the customer whose email matches
     */
    private static Customer findCustomer(Customer[] customers, String email){

        for(Customer element: customers){
            String customerEmail = element.email;
            if(customerEmail.equals(email)){
                return element;
            }
        }

        return null;
    }

    private static Customer findByFirstName(Customer[] customers, String firstName){
        for(Customer element: customers){
            String customerFirstName = element.firstName;
            if(customerFirstName.equals(firstName)){
                return element;
            }
        }
        return null;
    }

    private static Customer removeByEmail(Customer[] customers, String email){

        int index = -1;
        for(int i = 0; i< customers.length; i++){
            Customer element = customers[i];
            String customerEmail = element.email;
            if (customerEmail.equals(email)) {
                index = i;
                break;
            }
        }
        if(index!=-1) {
            Customer customerToBeDelete = customers[index];
            customers[index] = null;
            return customerToBeDelete;
        }
        return null;
    }
}
