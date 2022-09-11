import enums.ClassType;
import model.Address;
import model.Builder;
import model.People;
import model.Vehicle;
import service.AddressService;
import service.GenericService;
import service.PeopleService;
import service.VehicleService;

import java.util.EnumMap;
import java.util.Map;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Application {

    public static void main(String[] args) {

        Map<ClassType, GenericService> services = new EnumMap<>(ClassType.class);
        services.put(ClassType.PEOPLE, new PeopleService());
        services.put(ClassType.ADDRESS, new AddressService());
        services.put(ClassType.VEHICLE, new VehicleService());

        People people = (People) new Builder(ClassType.PEOPLE)
                .withName("Maxel Udson")
                .withEmail("maxellopes32@gmail.com")
                .build();

        Address address = (Address) new Builder(ClassType.ADDRESS)
                .withStreet("Alameda Dr Carlos de Carvalho")
                .withNumber(40)
                .build();

        Vehicle vehicle = (Vehicle) new Builder(ClassType.VEHICLE)
                .withVehicleModel("Mustang Shelby")
                .withPrice(400.00)
                .build();

        services.get(people.getType()).printClass(people);
        services.get(address.getType()).printClass(address);
        services.get(vehicle.getType()).printClass(vehicle);
    }
}
