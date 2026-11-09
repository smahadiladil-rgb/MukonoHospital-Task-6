public class LabTechnician extends MedicalStaff{
    private String labType;

    public LabTechnician(String id, String name, String dept, int hours, String labType){
        super(id, name, dept, hours);
        this.labType = labType;
    }

    @Override
    public void performDuties(){
        System.out.println("Lab Technician " + getName() + " carries out " + labType
                + " tests and reports results to doctors.");
    }
}
