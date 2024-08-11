package org.example.collections;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ListMain {

    public static void main(String[] args) {
//        ArrayListMain.execute();
//        LinkedListMain.execute();
        // VectorMain.execute();

//        SetMain.execute();

        //  MapMain.execute();

        try {
            propertiesReader();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void propertiesReader() throws IOException {
        String classPathConfigFile = "mysql/connection.config";
        InputStream inputStream = ListMain.class.getClassLoader().getResourceAsStream(classPathConfigFile);
        Properties properties = new Properties();
        properties.load(inputStream);

        System.out.println(properties.get("db.username"));
        Set<Object> keys = properties.keySet();
        for (Object key : keys) {
            Object value = properties.get(key);
            System.out.println(key + ":" + value);
        }
    }

    private static class MapMain {
        /**
         * 10 - AVNISH
         * 11 - RABI
         * 13 - JOHN
         * 15 - AVNISH
         * <p>
         * rollNum: key
         * name: value
         * <key, value> collection
         */

        /**
         * map: hashmap(no ordering, soriting), linkedhashmap(ordering of insertion), treemap (sorted order keys)
         * <p>
         * map: hashtable (similar to hashmap but treadsafe), threadsafe in nature due to its synchronized method allows only one thread to perform add or remove operation
         */
        public static void execute() {


            System.out.println(".... hash table ....");
            Map<Integer, String> hashTable = new Hashtable<>();
            mapExample(hashTable);

            System.out.println(".... hashmap ....");
            Map<Integer, String> hashmap = new HashMap<>();
            mapExample(hashmap);
            System.out.println(".... linked hashmap ....");
            Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
            mapExample(linkedHashMap);
            System.out.println(".... treemap  ....");
            Map<Integer, String> treeMap = new TreeMap<>();
            mapExample(treeMap);
            System.out.println(".... treemap reverse order of keys ....");
            Map<Integer, String> treeMapReverse = new TreeMap<>(new SetMain.ReverseComparator());
            mapExample(treeMapReverse);
        }

        private static void mapExample(Map<Integer, String> map) {
            System.out.println(map.getClass());
            map.put(11, "RABI");
            map.put(13, "JOHN");
            map.put(13, "ALEX"); // alex replaces JOHn as key is same
            map.put(15, "AVNISH");
            map.put(10, "AVNISH");


            // map : key must unique
            System.out.println(map.containsKey(10)); // true
            System.out.println(map.containsKey(16)); // false
            System.out.println(map.get(10)); // AVNISH
            System.out.println(map.get(16)); // null
            System.out.println(map);

            loopEntrySet(map);
            loopEntrySetIterator(map);
            keySet(map);

            map.remove(11);
            System.out.println(map.containsKey(11)); // false
            System.out.println(map.get(11)); // null

            System.out.println("size: " + map.size()); // 3
            map.clear();
            System.out.println("size: " + map.size()); // 0
        }

        private static void loopEntrySet(Map<Integer, String> map) {
            System.out.println("....  loop entry set .....");
            Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
            for (Map.Entry<Integer, String> entry : entrySet) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

        private static void loopEntrySetIterator(Map<Integer, String> map) {
            System.out.println("....  loop entry set iterator.....");

            Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
            Iterator<Map.Entry<Integer, String>> entrySetIt = entrySet.iterator();
            while (entrySetIt.hasNext()) {
                Map.Entry<Integer, String> entry = entrySetIt.next();
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

        private static void keySet(Map<Integer, String> map) {
            System.out.println("....  loop key set iterator.....");

            Set<Integer> keys = map.keySet();
            for (Integer key : keys) {
                String value = map.get(key);
                System.out.println(key + ":" + value);
            }
        }

        // loop key set iterator
    }

    private static class SetMain {
        // list: 10, 10, 20, 30, 20 (ordered)
        // set: 10, 20, 30 (not always ordered)

        // set: hashset, linked hash set, tree set
        public static void execute() {
            // hashset
            /** no guarantee on ordreing or sorting
             * 20, 10, 30, 20
             *
             * 10, 20, 30
             * 20, 30, 10
             */
            System.out.println("... hashset ....");
            setExample(new HashSet<>());


            // linked hashset

            /**  guarantee on ordreing but not on sorting
             * 20, 10, 30, 20
             *
             * 20, 10, 30
             * 20, 10, 30
             */
            System.out.println("... linked hashset ....");
            setExample(new LinkedHashSet<>());
            // treeset

            /**  guarantee on  sorting
             * 20, 10, 30, 20
             *
             * 10, 20, 30
             * 10, 20, 30
             */

            System.out.println("... tree set ....");
            setExample(new TreeSet<>());

            System.out.println("... tree set reverse order....");
            setExample(new TreeSet<>(new ReverseComparator()));
        }

        private static class ReverseComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        }

        private static void setExample(Set<Integer> set) {
            System.out.println(set.getClass());
            set.add(20);
            set.add(10);
            set.add(30);
            set.add(20);
            System.out.println(set.add(20)); // false
            System.out.println(set.add(50));
            System.out.println(set);
            System.out.println(set.contains(40)); // false
            System.out.println(set.contains(50)); // true
            loopSet(set);
            iterateSet(set);
        }

        private static void loopSet(Set<Integer> elements) {
            System.out.println("..... foreach loop ....");
            for (Integer element : elements) {
                System.out.println(element);
            }
        }

        private static void iterateSet(Set<Integer> elements) {
            System.out.println(".... itertator ....");
            Iterator<Integer> it = elements.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    private static class VectorMain {

        // methods of vector is synchronized , so it is thread safe in multi threaded access
        public static void execute() {
            Vector<Integer> nums = new Vector<>();
            nums.add(10);
            nums.add(20);
            nums.add(30);
            System.out.println(nums);
            Enumeration<Integer> enumerations = nums.elements();

            while (enumerations.hasMoreElements()) {
                System.out.println(enumerations.nextElement());
            }

        }
    }

    private static class LinkedListMain {

        // for - each
        // for with index
        // while
        // do while
        // iterator
        public static void execute() {
            List<Integer> list = new LinkedList<>();
            LinkedList<Integer> list1 = new LinkedList<>();
            list1.add(10);
            list1.addFirst(20);
            list1.addFirst(40);
            list1.addLast(30);
            System.out.println(list1); // 40, 20, 10, 30
            System.out.println(list1.getFirst());
            System.out.println(list1.getLast());
            list1.removeLast();
            System.out.println(list1); // 40, 20, 10
            list1.remove();
            System.out.println(list1); // 20, 10
            list1.removeFirst();
            System.out.println(list1); // 10
        }
    }

    private static class ArrayListMain {
        /**
         * java.util
         * <p>
         * C: CREATE, R: READ, U: UPDATE, D: DELETE
         * CRUD
         * <p>
         * element:
         * add
         * addMany
         * read
         * readLoop
         * delete
         * deleteMany
         * update
         * updateMany
         * <p>
         * Iterable -> Collection -> List
         * <p>
         * <p>
         * List-> AbstractList -> ArrayList
         * <p>
         * <p>
         * List-> ArrayList
         * <p>
         * <p>
         * Collection->AbstractCollection-> AbstractList
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
            for (int index = 0; index < list.size(); index++) {
                Integer item = list.get(index);
                System.out.println(index + ":" + item);
            }

            System.out.println("for each loop");
            for (Integer item : list) {
                if (item % 10 == 0) { // dont want to display item that divisible by 10
                    continue;
                }
                System.out.println(item);
            }

            System.out.println("while loop");

            System.out.println("do while loop");

            System.out.println("iterator");

            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            System.out.println("list iterator next");
            ListIterator<Integer> lit1 = list.listIterator();
            while (lit1.hasNext()) {
                System.out.println(lit1.nextIndex() + ":" + lit1.next());
            }

            System.out.println("list iterator prev");
            int size = list.size();
            ListIterator<Integer> lit2 = list.listIterator(size);
            while (lit2.hasPrevious()) {
                System.out.println(lit2.previousIndex() + ":" + lit2.previous());
            }

            /******************* read end ******************/

            /** delete ***/

            System.out.println("delete");
            list.remove(1);
            System.out.println(list);

            for (int index = 0; index < list.size(); index++) {
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
            while (removeIterator.hasNext()) {
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

            System.out.println("sub list");
            List<String> names = new ArrayList<>();
            names.add("rabi");
            names.add("avnish");
            names.add("saroj");
            names.add("subha");
            names.add("ali");
            names.add("aman"); // in a call
            names.add("dinesh"); // in a call

            List<String> subList = names.subList(1, 4);
            System.out.println(subList);

            String[] namesArr = names.toArray(new String[0]);
            System.out.println(Arrays.toString(namesArr));

            names.remove("aman");
            System.out.println(names);

        }
    }
}
