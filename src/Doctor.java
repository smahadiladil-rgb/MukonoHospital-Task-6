public class Doctor extends MedicalStaff{
    private String specialization;

    public Doctor(String id, String name, String department, int hours, String specialization){
        super(id, name, department, hours);
        this.specialization = specialization;
    }

    @Override
    public void performDuties(){
        System.out.println("Dr. " + getName() + " (" + specialization
                + ") diagnoses patients and prescribes treatment.");
    }
}
