package repository;

import model.Employee;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {

    private final Map<Integer,Employee> employees = new HashMap<>();

    public void  save(Employee employee){

        employees.put(employee.getId(),employee);
    }

    public List<Employee> findAll(){

        return new ArrayList<Employee>(employees.values());
    }

    public Employee findById (int id){

        return employees.get(id);
    }

}
