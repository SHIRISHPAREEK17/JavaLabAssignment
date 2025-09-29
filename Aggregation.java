/*
 * Program Name : Aggregation Example
 * Description  : Demonstrates the concept of Aggregation (HAS-A relationship).
 * Key Points:
 * 1. The Employee class "has an" Address object, but both can exist independently.
 * 2. An Address may be shared by multiple Employees.
 * 3. An Employee can exist without an Address (address can be null).
 */

class Address {
    String city, state, country;

    Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee {
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.print("Information of employee " + id + " -> " + name);
        if (address != null) {
            System.out.println(" belongs to " +
                    address.city + ", " +
                    address.state + ", " +
                    address.country);
        } else {
            System.out.println(" (Address is empty)");
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address add1 = new Address("Jaipur", "Rajasthan", "India");
        Address add2 = new Address("Mumbai", "Maharashtra", "India"); // not linked to any employee
        Address add3 = new Address("New York", "New York", "USA");
        Address add4 = new Address("Tokyo", "Tokyo Prefecture", "Japan");

        Employee emp1 = new Employee(1, "Mahesh", add4);
        Employee emp2 = new Employee(2, "Arpit", add1);
        Employee emp3 = new Employee(3, "Shobit", add3);
        Employee emp4 = new Employee(4, "Madan", add4); // same address as Mahesh
        Employee emp5 = new Employee(5, "Hari", null);  // no address

        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
        emp5.display();
    }
}
