package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Домашнее задание
        Создайте класс Студент, определите в нем поля: имя, курс, есть ли у него стипендия.
        Создайте в классе несколько конструкторов, для возможности задания сразу всех указанных
        параметров или нескольких при создании экземпляров.
        */
        Student Kate = new Student("Kate Middlton", 4);
        System.out.println(Kate.getName());
        System.out.println(Kate.getHasStipend());
        System.out.println("Курс " + Kate.getCourse());      // 4
        System.out.print("Спроба перевести на 3-й курс: ");
        Kate.setCourse(3);
        System.out.println("Курс " + Kate.getCourse());      // 3
        System.out.print("Спроба перевести на 50-й курс: ");
        Kate.setCourse(50);
        System.out.println("Курс " + Kate.getCourse());      // 3
        System.out.println("==========================================");
        Student Taras = new Student("Taras Budurovych", true);
        System.out.println("Студент " + Taras.getName());      // Taras
        System.out.println("Курс " + Taras.getCourse());      // 1
        System.out.println(Taras.getHasStipend());      // "Стипендія є"
        System.out.println("==========================================");
        Student NoName1 = new Student(true);
        System.out.println("Студент " + NoName1.getName());      // "NoName"
        System.out.println("Курс " + NoName1.getCourse());      // 1
        System.out.println(NoName1.getHasStipend());      // "Стипендія є"
        System.out.println("==========================================");
        Student NoName2 = new Student(6, true);
        System.out.println("Студент " + NoName2.getName());      // "NoName"
        System.out.println("Курс " + NoName2.getCourse());      // 1
        System.out.println(NoName2.getHasStipend());      // "Стипендія є"
        System.out.println("Спроба перейменувати на Valera Osipov: ");
        NoName2.setName("Valera Osipov");
        System.out.println("Студент " + NoName2.getName());      // Valera Osipov
        System.out.println("Спроба перевести на 5-й курс: ");
        NoName2.setCourse(5);
        System.out.println("Курс " + NoName2.getCourse());      // 5
        System.out.println("==========================================");
        Student NoName3 = new Student(2, true);
        System.out.println("Студент " + NoName3.getName());      // "NoName"
        System.out.println("Курс " + NoName3.getCourse());      // 2
        System.out.println(NoName3.getHasStipend());      // "Стипендія є"

    }
}

class Student{

    private String name;
    private int course = 1;
    private boolean hasStipend;

    public Student(){ /* new Student()*/
        this.name = "noName";
        this.course = 1;
        this.hasStipend = false;
    }
    public Student(String name){ /* new Student("Vasya Pupkin")*/
        setName(name);
        this.course = 1;
        this.hasStipend = false;
    }
    public Student(int course){ /* new Student(3)*/
        this.name = "noName";
        setCourse(course);
        this.hasStipend = false;
    }
    public Student(boolean hasStipend){ /* new Student(true)*/
        this.name = "noName";
        this.course = 1;
        setHasStipend(hasStipend);
    }
    public Student(String name, int course){ /* new Student("Vasya Pupkin", 5)*/
        setName(name);
        setCourse(course);
        this.hasStipend = false;
    }
    public Student(String name, boolean hasStipend){ /* new Student("Vasya Pupkin", true)*/
        setName(name);
        this.course = 1;
        setHasStipend(hasStipend);
    }
    public Student(int course, boolean hasStipend){ /* new Student(4, true)*/
        setName(name);
        setCourse(course);
        setHasStipend(hasStipend);
    }
    public Student(String name, int course, boolean hasStipend){ /* new Student("Vasya Pupkin", 5, false)*/
        setName(name);
        setCourse(course);
        setHasStipend(hasStipend);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCourse(){
        return this.course;
    }
    public void setCourse(int course){
        if(course > 0 && course < 6)
            this.course = course;
    }
    public String getHasStipend(){
        return this.hasStipend ? "Стипендія є" : "Стипендії немає";
    }
    public void setHasStipend(boolean hasStipend){
        this.hasStipend = hasStipend;
    }
}

