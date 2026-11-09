public class Doctor extends MedicalStaff{
    private String specialization;

    public Doctor(String id, String name, String dept, int hours, String specialization){
        super(id, name, dept, hours);
        this.specialization = specialization;
    }

    @Override
    public void performDuties(){
        System.out.println("Dr. " + getName() + " (" + specialization
                + ") diagnoses patients and prescribes treatment.");
    }
}
