/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSProject;

/**
 *
 * @author amirul
 */
public class Student {
    private String name;
    private int matric;
    private int age;

    public Student(String name, int matric, int age) {
        this.name = name;
        this.matric = matric;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getMatric() {
        return matric;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatric(int matric) {
        this.matric = matric;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
}
