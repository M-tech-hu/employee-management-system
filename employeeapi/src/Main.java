import controller.EquipmentController;
import exception.EmployeeNotFoundException;
import exception.EquipmentNotFoundException;
import model.Employee;
import model.Equipment;
import repository.EmployeeRepository;
import repository.EquipmentRepository;
import service.EquipmentService;

public class Main {

    public static void main(String[] args){
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EquipmentRepository equipmentRepository = new EquipmentRepository();

        employeeRepository.save(new Employee(101,"Pranav","IT"));
        employeeRepository.save(new Employee(102,"Sandy","HR"));

        equipmentRepository.save(new Equipment(501,"Dell","Laptop"));
        equipmentRepository.save(new Equipment(502,"Zebronics","Mouse"));

        EquipmentService service = new EquipmentService(employeeRepository,equipmentRepository);
        EquipmentController controller = new EquipmentController(service);

        try {
            controller.assign(101, 501);
            System.out.println(equipmentRepository.findById(501));

            controller.assign(102, 501);
        }
        catch (EmployeeNotFoundException | EquipmentNotFoundException e){

            System.out.println(e);
        }
        catch (RuntimeException r){

            System.out.println(r);
        }

    }
}
