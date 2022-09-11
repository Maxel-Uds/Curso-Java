package service;

import model.Address;

public class AddressService extends GenericService<Address> {

    @Override
    public void printClass(Address clazz) {
        System.out.println(clazz);
    }
}
