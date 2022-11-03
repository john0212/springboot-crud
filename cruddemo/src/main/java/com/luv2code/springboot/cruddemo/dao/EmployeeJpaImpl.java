package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

// 這個 class 是用 JPA 方法來取得資料庫數據
@Repository
public class EmployeeJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        // create a query
        Query theQuery =
                entityManager.createQuery("from Employee");

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return the lists
        return employees;
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void save(Employee theEmployee) {

    }

    @Override
    public void deleteById(int id) {

    }
}
