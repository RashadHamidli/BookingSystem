package com.company.database;

import com.company.entity.Booking;
import com.company.entity.Flight;
import com.company.entity.User;
import com.company.exceptions.MyException;

import java.util.ArrayList;
import java.util.List;


import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class DataBase {
    private List<User> users = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private static final File usersFile = new File("C:\\com.company\\BookingSystem\\src\\main\\java\\com\\database", "users.txt");

    private static DataBase database;

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (database == null) {
            database = new DataBase();
        }
        return database;
    }
    public void read(){
        readToFile(usersFile, users);
    }
    public void write(){
        writeToFile(usersFile, users);
    }
    private void writeToFile(File file, List list){

        try{
            file.getParentFile().mkdirs();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void readToFile(File file, List list){

        try{
            FileInputStream fis = new FileInputStream(file);
            if(fis.available() > 0){
                ObjectInputStream ois = new ObjectInputStream(fis);
                List data = (List) ois.readObject();
                list.addAll(data);
                ois.close();
                fis.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Object readFile(String fileName) throws FileNotFoundException {
        Object obj = null;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            obj = objectInputStream.readObject();
        } finally {
            return obj;
        }
    }

    public void writeFile(Serializable object, String name) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(name);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //    public void saveToFile() {
//        try (FileChannel channel = new RandomAccessFile(files, "rw").getChannel()) {
//            ByteBuffer buffer = ByteBuffer.allocate(1024);
//            String data = serializeDataBase(this);
//
//            buffer.put(data.getBytes());
//            buffer.flip();
//            channel.write(buffer);
//            System.out.println("Verilənlər fayla yazıldı. Fayl yolu: " + files.getPath());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public DataBase loadFromFile() {
//        try (FileChannel channel = new RandomAccessFile(files, "r").getChannel()) {
//            ByteBuffer buffer = ByteBuffer.allocate((int) channel.size());
//            channel.read(buffer);
//            buffer.flip();
//
//            String readData = new String(buffer.array());
//            return deserializeDataBase(readData);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public void save() {
//        saveToFile();
//    }
//
//    public DataBase load() {
//        return loadFromFile();
//    }
//
//    private String serializeDataBase(DataBase database) {
//        return "";
//    }
//
//    private DataBase deserializeDataBase(String data) {
//        return DataBase.getInstance();
//    }
    public List<User> getUsers() {
        return users;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
