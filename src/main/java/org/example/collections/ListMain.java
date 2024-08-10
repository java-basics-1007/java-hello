package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMain {

    public static void main(String[] args) {
        ArrayListMain.execute();
    }

    private static class ArrayListMain{
        /**
         *
         * java.util
         *
         *  C: CREATE, R: READ, U: UPDATE, D: DELETE
         *  CRUD
         *
         * element:
         *    add
         *    addMany
         *    read
         *    readLoop
         *    delete
         *    deleteMany
         *    update
         *    updateMany
         *
         *  Iterable -> Collection -> List
         *
         *
         *  List-> AbstractList -> ArrayList
         *
         *
         *  List-> ArrayList
         *
         *
         *  Collection->AbstractCollection-> AbstractList
         */
        public static void execute() {
            // List<T> list = new ArrayList();

            List<Integer> list = new ArrayList<>();
            System.out.println(list);
            list.add(10); // 0th index// add
            System.out.println(list);
            list.add(0, 20); // 20, 10
            list.add(1, 30); // index, add
            System.out.println(list);

            List<Integer> list1 = new ArrayList<>();
            list1.add(15);
            list1.add(25);
            list1.add(35);

            list.addAll(list1); // addMany
            System.out.println(list);

            list.addAll(1, list1); // index, addMany
            System.out.println(list);

            /******************** read start *****************/
            System.out.println("read by index");
            System.out.println(list.get(5)); // read
            System.out.println("index for loop");
            for(int index=0; index < list.size(); index++){
                Integer item = list.get(index);
                System.out.println(index+":"+item);
            }

            System.out.println("for each loop");
            for(Integer item: list){
                if(item % 10 == 0){ // dont want to display item that divisible by 10
                    continue;
                }
                System.out.println(item);
            }

            System.out.println("while loop");

            System.out.println("do while loop");

            System.out.println("iterator");

            Iterator<Integer> it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

            System.out.println("list iterator next");
            ListIterator<Integer> lit1 = list.listIterator();
            while(lit1.hasNext()){
                System.out.println(lit1.nextIndex()+":"+lit1.next());
            }

            System.out.println("list iterator prev");
            int size = list.size();
            ListIterator<Integer> lit2 = list.listIterator(size);
            while(lit2.hasPrevious()){
                System.out.println(lit2.previousIndex()+":"+lit2.previous());
            }

            /******************* read end ******************/

            /** delete ***/

            System.out.println("delete");
            list.remove(1);
            System.out.println(list);

            for(int index = 0; index< list.size(); index++){
              list.remove(index);
              System.out.println(list);
            }
            System.out.println(list);

            /** retain all **/
            System.out.println("retain all");
           // list.retainAll(list1); // retain all elements in the list given in list1
            System.out.println(list);

            /** remove all **/
            System.out.println("remove all");
            System.out.println(list);
           // list.removeAll(list1);
            System.out.println(list);


            System.out.println("removing elements with iterator");
            System.out.println(list);
            Iterator<Integer> removeIterator = list.iterator();
            while(removeIterator.hasNext()){
                removeIterator.next();
                removeIterator.next();
                removeIterator.remove(); // removes last returned value by the next method
                System.out.println(list);
            }
            System.out.println(list);

            list.set(1, 1); // update
            System.out.println(list);

            list.add(1);
            list.add(5);
            list.add(5);
            list.add(10);
            list.add(10);
            System.out.println(list);
            list.remove(1);
            System.out.println(list);

            System.out.println(list.indexOf(10)); // returns index of first occurance from first
            System.out.println(list.lastIndexOf(5)); // retur ns index of first occurance from last

            System.out.println(list.size());
            list.clear();
            System.out.println(list);

        }
    }
}
