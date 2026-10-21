package model;

public class Equipment {

    private int id;
    private String name;
    private String type;
    private boolean assigned;
    private Integer assignedEmployeeId;

    public Integer getAssignedEmployeeId() {
        return assignedEmployeeId;
    }

    public Equipment(){
        super();
    }
    public Equipment(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public void assignTo(int employeeId){
        assigned =true;
        assignedEmployeeId = employeeId;

    }

    public void returnEquipment(){

        assigned = false;
        assignedEmployeeId = null;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", assigned=" + assigned +
                ", assignedEmployeeId=" + assignedEmployeeId +
                '}';
    }

    public boolean isAssigned() {

        return assigned;
    }
}
