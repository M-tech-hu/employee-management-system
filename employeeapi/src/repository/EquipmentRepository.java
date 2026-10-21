package repository;

import model.Employee;
import model.Equipment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipmentRepository {

    private final Map<Integer, Equipment> equipmentMap = new HashMap<>();

    public void save(Equipment equipment){

        equipmentMap.put(equipment.getId(),equipment);
    }

    public List<Equipment> findAll(){
        return new ArrayList<>(equipmentMap.values());

    }
    public Equipment findById (int id){

        return equipmentMap.get(id);
    }
}
