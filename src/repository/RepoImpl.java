package repository;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class RepoImpl {

    private List<Person> persons = new ArrayList<Person>();

    public RepoImpl(List<Person> persons) {
        this.persons = persons;
    }

    public static void method1(){
        System.out.println("1111");
    }

    public static void method2(){
        System.out.println("2222");
    }


}
