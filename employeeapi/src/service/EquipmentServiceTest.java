package service;

import exception.EmployeeNotFoundException;
import model.Employee;
import model.Equipment;
import org.junit.jupiter.api.Test;
import repository.EmployeeRepository;
import repository.EquipmentRepository;
import service.EquipmentService;



import static org.junit.jupiter.api.Assertions.*;

class EquipmentServiceTest {

    @Test
    void shouldAssignEquipmentToEmployee() {

        EmployeeRepository employeeRepository = new EmployeeRepository();
        EquipmentRepository equipmentRepository = new EquipmentRepository();

        employeeRepository.save(new Employee(101, "Pranav", "IT"));
        equipmentRepository.save(new Equipment(501, "Dell Laptop", "Laptop"));

        EquipmentService service = new EquipmentService(employeeRepository,equipmentRepository);
        service.assignEquipment(101, 501);

        Equipment equipment = equipmentRepository.findById(501);
        assertTrue(equipment.isAssigned());
        assertEquals(101,equipment.getAssignedEmployeeId());
    }

    @Test
    void shouldThrowExceptionWhenEmployeeNotFound() {

        EmployeeRepository employeeRepository = new EmployeeRepository();
        EquipmentRepository equipmentRepository = new EquipmentRepository();
        equipmentRepository.save(new Equipment(501, "Dell Laptop", "Laptop"));

        EquipmentService service = new EquipmentService(employeeRepository,equipmentRepository);
        assertThrows(EmployeeNotFoundException.class,() -> service.assignEquipment(999, 501));
    }
}
