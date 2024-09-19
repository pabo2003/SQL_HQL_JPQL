package lk.ijse.gdse;

import lk.ijse.gdse.Entity.Address;
import lk.ijse.gdse.Entity.Customer;
import lk.ijse.gdse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

/*//        all data from Customer
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();
        for (Customer customer:customerList){
            System.out.println(customer.getId());
        }*/

//        unique one data form Customer
/*//        My code
        Query query = session.createQuery("from Customer where id in (1,2)");
        List<Customer> customerList = query.list();
        for (Customer customer:customerList){
            System.out.println(customer.getName());
        }*/

/*//        sir's code
        Query query = session.createQuery("from Customer where id=?1");
        query.setParameter(1,1);
        Customer customer = (Customer) query.uniqueResult();
        System.out.println(customer.getName());*/


//        load onily one column
       /* Query query = session.createQuery("from Address name");
        List<Address> addressList = query.list();
        for (Address address:addressList){
            System.out.println(address.getCity());
        }*/
        /*Query query = session.createQuery("name from Customer");
        List<String> namelist = query.list();
        for (String name:namelist){
            System.out.println(name);
        }*/


/*Insert*//*
        //Address
        NativeQuery query = session.createNativeQuery("INSERT INTO Address (id, street, city, cuId) VALUES (:1,:2,:3,:4)");
        query.setParameter("1", 4);
        query.setParameter("2", "kulathunga road");
        query.setParameter("3", "panadura");
        query.setParameter("4", 1);
        query.executeUpdate();

        //Customer
        NativeQuery query1 = session.createNativeQuery("INSERT INTO Customer (id, name) VALUES (:1,:2)");
        query1.setParameter("1", 3);
        query1.setParameter("2", "kamal");
        query1.executeUpdate();*/

/*update*/
        /*//Customer
        Query query = session.createQuery("UPDATE Customer SET name = :name WHERE id = :id");
        query.setParameter("name","sunil");
        query.setParameter("id",1);
        query.executeUpdate();

        //Address
        Query query1 = session.createQuery("UPDATE Address SET street = :street WHERE id = :id");
        query1.setParameter("street","kumudu road");
        query1.setParameter("id",1);
        query1.executeUpdate();*/

/*delete*/
        /*//Customer
        Query query = session.createQuery("DELETE FROM Customer where id =:id");
        query.setParameter("id",3);
        query.executeUpdate();

        //Address
        Query query1 = session.createQuery("DELETE FROM Address where id =:id");
        query1.setParameter("id",3);
        query1.executeUpdate();*/

/*select*/
        /*Query query=session.createQuery("select id,name from Customer where id=?1");
        query.setParameter(1,1);
        List<Object[]> resultList = query.getResultList();
        for (Object[] objects : resultList){
            System.out.println("ID :"+objects[0] + "Name :"+objects[1]);
        }

        Query query1=session.createQuery("select id,name from Customer");
        List<Object[]> resultList1 = query1.getResultList();
        for (Object[] objects : resultList1){
            System.out.println("ID: "+objects[0]+"Name: "+objects[1]);
        }

        Query query2=session.createQuery("select a.id,c.name from Address a inner join Customer c on a.id = c.id");
        List<Object[]> resultList2 = query2.getResultList();
        for (Object[] objects : resultList2){
            System.out.println("AddressID: "+objects[0]+"Name: "+objects[1]);
        }*/


        transaction.commit();
        session.close();
    }
}