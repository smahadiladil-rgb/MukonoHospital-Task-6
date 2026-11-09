public class Pharmacist extends MedicalStaff{
    private String licenseNumber;

    public Pharmacist(String id, String name, String dept, int workingHours, String licenseNumber){
        super(id, name, dept, workingHours);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void performDuties(){
        System.out.println("Pharmacist " + getName() + " (License: " + licenseNumber
                + ") dispenses prescribed medicine and advises patients safe on drug use.");
    }
}
