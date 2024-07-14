package org.example.inheritance.model1;

public class Student {
    public int id;

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        //return super.toString();
        String result = "id value: "+id;
        return result;
    }
}
