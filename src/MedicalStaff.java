public abstract class MedicalStaff {
    private String employeeId;
    private String name;
    private String department;
    private int workingHours;

    public MedicalStaff(String employeeId, String name, String department, int workingHours){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.workingHours = workingHours;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Working Hours : " + workingHours + "hrs/day");
        System.out.println("Role : " + getClass().getSimpleName());
    }

    public abstract void performDuties();

    public String getName(){
        return name;
    }
}
