package org.zhouhy.java.entity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private Integer Id;
    private String name;
    private String password;
    transient private Classroom classroom;
    
    public Student(Integer Id,String name,String password,Classroom classroom){
        super();
        this.Id = Id;
        this.name = name;
        this.password = password;
        this.classroom = classroom;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", classroom=" + classroom +
                '}';
    }

    
    private void writeObject(ObjectOutputStream oos)throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(classroom.getId());
        oos.writeObject(classroom.getName());
        //oos.writeObject(classroom);
    }

    private void readObject(ObjectInputStream ois)throws IOException, ClassNotFoundException{
        ois.defaultReadObject();
        Integer Id = (Integer) ois.readObject();
        String name = (String) ois.readObject();
        classroom = new Classroom(Id,name);
        //classroom = (Classroom)ois.readObject();
    }
}
