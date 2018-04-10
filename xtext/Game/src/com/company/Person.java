package com.company;

import java.io.PrintStream;
import java.util.Dictionary;
import java.util.Hashtable;

public class Person implements IPerson
{
    private String name;
    private String location;
    private Dictionary<String, IObject> inventory;

    public Person() {
        inventory = new Hashtable<>();
    }

    public Person(String name, String location) {
        this.name = name;
        this.location = location;
        this.inventory = new Hashtable<>();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return location;
    }

    @Override
    public void move(String newLocation) {
        location = newLocation;
    }

    @Override
    public void say(PrintStream stream, String string) {
        stream.println(string.format("%s: %s", name, string));
    }

    @Override
    public void onDiscovered(IContext context) {

    }

    @Override
    public void take(IObject object) {
        inventory.put(object.getName(), object);
    }

    @Override
    public boolean hasObject(String name) {
        return inventory.get(name) != null;
    }

    @Override
    public IObject use(String name) {
        if(!hasObject(name)) throw new RuntimeException("person does not have that object");

        IObject object = inventory.get(name);
        inventory.remove(name);

        return object;
    }
}
