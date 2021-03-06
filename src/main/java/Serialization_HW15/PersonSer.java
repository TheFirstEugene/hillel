package Serialization_HW15;

import java.io.Serializable;

public class PersonSer implements Serializable {
    private int id;
    private String name;

    public PersonSer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return id + " : " + name;
    }
}
