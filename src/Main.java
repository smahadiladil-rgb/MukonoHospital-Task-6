public class Main {
    public static void main(String[] args) {
        System.out.println(" MUKONO HOSPITAL STAFF MANAGEMENT SYSTEM \n");

        MedicalStaff[] staffList = {
                new Doctor("D001", "Okello James", "Surgery", 8, "Surgeon"),
                new Nurse("N001", "Nabirye Sarah", "Maternity", 10, "Maternity Ward"),
                new Pharmacist("P001", "Mugisha Peter", "Pharmacy", 8, "PH-2045"),
                new LabTechnician("L001", "Achieng Grace", "Laboratory", 8, "blood")
        };

        for (MedicalStaff staff : staffList){
            staff.displayInfo();
            staff.performDuties();
            System.out.println();
        }
    }
}
