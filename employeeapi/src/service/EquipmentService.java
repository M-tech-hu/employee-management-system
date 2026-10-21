package service;
import exception.EmployeeNotFoundException;
import exception.EquipmentNotFoundException;
import exception.EquipmentAlreadyAssignedException;
import model.Employee;
import model.Equipment;
import repository.EmployeeRepository;
import repository.EquipmentRepository;


import java.security.PublicKey;

public class EquipmentService {
    private final EmployeeRepository employeeRepository;
    private final EquipmentRepository equipmentRepository;

    public EquipmentService(EmployeeRepository employeeRepository, EquipmentRepository equipmentRepository){

        this.employeeRepository = employeeRepository;
        this.equipmentRepository = equipmentRepository;
    }
    public void assignEquipment(int employeeId, int equipmentId){

        Employee employee = employeeRepository.findById(employeeId);
        if (employee == null){

            throw  new EmployeeNotFoundException("Employee not found: " +employeeId);
        }

        Equipment equipment = equipmentRepository.findById(equipmentId);{
            if (equipment == null) {

                throw new EquipmentNotFoundException("Equipment not found: " + equipmentId);
            }
            if (equipment.isAssigned()){

                throw new EquipmentAlreadyAssignedException("Equipment Already assigned.."+ equipmentId);
            }

            equipment.assignTo(employeeId);
        }
    }
}
