package ru.aasmc;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterMain {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Foo Bar");

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setName("Four");

        Employee employee2 = new Employee();
        employee2.setId(3);
        employee2.setName("Three");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaStarter");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        entityManager.persist(employee1);
        entityManager.persist(employee2);
        transaction.commit();
    }
}
