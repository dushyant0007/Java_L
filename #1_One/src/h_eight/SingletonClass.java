package h_eight;

//In Java, Singleton is a design pattern that ensures that a class can only have one object.

import static h_eight.Database.getInstance;

class Database {
    private static Database dbObject;

    private Database() {
    }

    public static Database getInstance() {

        // create object if it's not already created
        if (dbObject == null) {
            dbObject = new Database();
        }

        // returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        Database db1;
        Database db2;

        //static material called by class and non-static with object
        db2 = Database.getInstance();
        db2.getConnection();

        // refers to the only object of Database
        db1 = getInstance();
        db1.getConnection();
    }
}
