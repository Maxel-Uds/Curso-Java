package service;

import model.People;

public class PeopleService extends GenericService<People>{

    @Override
    public void printClass(People clazz) {
        System.out.println(clazz);
    }
}
