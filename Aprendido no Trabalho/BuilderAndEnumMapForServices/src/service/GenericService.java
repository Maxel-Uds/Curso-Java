package service;

import model.Type;

public abstract class GenericService<C extends Type> {

    public abstract void printClass(C clazz);
}
