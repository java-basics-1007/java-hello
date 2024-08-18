package org.example.files;

import java.io.*;


/**
 *
 *   42 characters:
 * FileWriter (3) : 14
 * BufferedWriter (10) : 4 to 5
 */
public class App1 {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.home");
        System.out.println(path);

        String fileName = "cos1.txt";

        //        fileBasics(path);
        //  FileWriteExample.write(path, fileName);
      //  FileReaderExample.read(path, fileName);

//        BufferWriterExample.write(path, fileName);
    //    BufferReaderExample.read(path, fileName);

//        SerializationUtils.serialize(path, "employee.ser");
        SerializationUtils.deserialize(path, "employee.ser");
    }


    // serialization: write object to file
    // de-serialization: read from file and make java object



    private static class Employee implements Serializable{
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    private static class SerializationUtils
    {
        // write
        public static void serialize(String location, String fileName) {
            Employee e = new Employee(10, "John");
            String resource  = location +"/"+fileName;
            System.out.println(e.hashCode());
            System.out.println(e);
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                fos = new FileOutputStream(new File(resource));
                oos = new ObjectOutputStream(fos);
                oos.writeObject(e);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } finally {
                try {
                    oos.close();
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        public static void deserialize(String location, String fileName) {
            String resource  = location +"/"+fileName;

            FileInputStream fis = null;
            ObjectInputStream ois = null;

            try {
                fis = new FileInputStream(new File(resource));
                ois = new ObjectInputStream(fis);
                Object o =  ois.readObject();

                Employee e = (Employee) o;
                System.out.println(e.hashCode());
                System.out.println(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    ois.close();
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    private static class BufferReaderExample{
        public static void read(String location, String fileName){
            String resource = location + "/"+fileName;
            System.out.println("writing into the resource: "+ resource);
            BufferedReader reader = null;

            try {
                reader = new BufferedReader(new FileReader(resource));
               while(true){
                   int x = reader.read();
                   if( x == -1){break;}
                   System.out.println(x+":"+(char)x);
               }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if(reader!=null){
                    try {
                        reader.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }
    }

    private static class BufferWriterExample{
        public static void write(String location, String fileName){
            String resource = location + "/"+fileName;
            System.out.println("writing into the resource: "+ resource);
            BufferedWriter writer = null;

            try {
                writer = new BufferedWriter(new FileWriter(resource));
                writer.write("Hello World");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if(writer!=null){
                    try {
                        writer.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }
    }

    private static class FileReaderExample{
        public static void read(String location, String fileName){
            String resource = location + "/"+fileName;
            System.out.println("reading from the resource: "+ resource);
            FileReader reader = null;

            try {
                reader = new FileReader(resource);
                int x = 0;
                while(true){
                    x = reader.read();
                    if(x == -1){
                        break;
                    }
                    System.out.println(x+":"+(char)x);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if(reader!=null){
                    try {
                        reader.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }
    }

    private static class FileWriteExample{
        public static void write(String location, String fileName){
            String resource = location + "/"+fileName;
            System.out.println("writing into the resource: "+ resource);
            FileWriter writer = null;

            try {
                writer = new FileWriter(resource);
                writer.write("Hello World");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if(writer!=null){
                    try {
                        writer.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }
    }

    private static void fileBasics(String path) throws IOException {
        String fileName="abc.txt";

        String filePath = path +"/"+fileName;
        File file=new File(filePath);

        file.createNewFile();

        File dir = new File(path);
        String[] elements = dir.list();
        for(String item: elements){
            System.out.println(item);
        }

        File[] files = dir.listFiles();
        for(File f: files){
            System.out.println(f.getAbsolutePath()+":"+f.getName() +":"+f.isDirectory());
        }
    }
}
