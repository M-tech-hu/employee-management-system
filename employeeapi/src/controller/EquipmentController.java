package controller;

import service.EquipmentService;

public class EquipmentController {

    private final EquipmentService service;

    public  EquipmentController(EquipmentService service){

        this.service=service;

    }

    public void assign(int employeeId, int equipmentId){
        service.assignEquipment(employeeId,equipmentId);
    }
}
