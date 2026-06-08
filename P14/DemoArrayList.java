package P14;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();//ArrayList masih bisa diinstansiasi meskipun tidak menentukan ukuran awal.

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4, "Cica"));//Obek baru ditambahkan di urutan paling belakang.

        customers.add(2, new Customer(100, "Rosa")); //Index pada ArrayList dimulai dari indes 0, terbukti dari penambahan obyek dengan index 2 yang berada pada urutan ke 3.

        System.out.print("Index untuk customer kedua: " + customers.indexOf(customer2));
        System.out.println();

        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer (201, "Della"));
        newCustomers.add(new Customer (202, "Victor"));
        newCustomers.add (new Customer (203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}
