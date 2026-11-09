public class Nurse extends MedicalStaff{
    // Ward where the nurse is assigned 
    private String ward;

    public Nurse(String id, String name, String dept, int hours, String ward){
        super(id, name, dept, hours);
        this.ward = ward;
    }

    @Override
    public void performDuties(){
        System.out.println("Nurse " + getName()
                + " monitors patients, gives medication and assists doctors in " + ward + ".");
    }
}
