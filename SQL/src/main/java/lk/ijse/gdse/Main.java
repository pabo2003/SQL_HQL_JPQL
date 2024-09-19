package lk.ijse.gdse;

import lk.ijse.gdse.Entity.Address;
import lk.ijse.gdse.Entity.Customer;
import lk.ijse.gdse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /*NativeQuery query = session.createNativeQuery("select * from Customer");
        query.addEntity(Customer.class);
        List<Customer> customerList = query.list();
        for (Customer customer:customerList){
            System.out.println(customer);
        }*/

//        insert
       /* NativeQuery query = session.createNativeQuery("INSERT INTO Customer VALUES (?,?)");
        query.setParameter(1,3);
        query.setParameter(2,"Sahan");
        query.executeUpdate();
        */

//        update
        /*NativeQuery query = session.createNativeQuery("UPDATE Customer SET name = ? WHERE id = ? ");
        query.setParameter(1,"Dhanujaya");
        query.setParameter(2,2);
        query.executeUpdate();
       */

//        delete
        /*NativeQuery query = session.createNativeQuery("DELETE FROM Customer WHERE id = ?");
        query.setParameter(1,3);
        query.executeUpdate();*/

//        select
        /*NativeQuery query = session.createNativeQuery("SELECT * FROM Customer WHERE name = ?");
        query.setParameter(1,"Dhanu");
        List<Object[]> resultList = query.getResultList();
        for (Object[] customer : resultList){
            System.out.println(Arrays.toString(customer));
        }*/

//        join
        /*NativeQuery query = session.createNativeQuery("select a.aId,c.name from Address a inner join Customer c on a.customer_id = c.customer_id");
        List<Object[]> resultList = query.getResultList();
        for (Object[] objects : resultList){
            System.out.println("Name: "+objects[0] + "AddressID: "+objects[1]);
        }*/



        transaction.commit();
        session.close();
    }
}