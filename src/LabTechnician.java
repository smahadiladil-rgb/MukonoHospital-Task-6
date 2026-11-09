public class LabTechnician extends MedicalStaff{
    // type of laboratory test the technician performs
    private String labType;

    public LabTechnician(String id, String name, String dept, int hours, String labType){
        super(id, name, dept, hours);
        this.labType = labType;
    }

    @Override
    public void performDuties(){
        System.out.println("Lab Technician " + getName() + " performs " + labType
                + " tests and reports results to doctors.");
    }
}
