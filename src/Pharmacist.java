public class Pharmacist extends MedicalStaff{
    private String licenseNumber;

    public Pharmacist(String id, String name, String dept, int hours, String licenseNumber){
        super(id, name, dept, hours);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void performDuties(){
        System.out.println("Pharmacist " + getName() + " (License: " + licenseNumber
                + ") dispenses medicine and advises patients on drug use.");
    }
}
