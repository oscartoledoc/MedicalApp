public class Main {
    public static void main(String[] args) {
        
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Oscar Toledo";
        myDoctor.showName();
        myDoctor.showID();
        System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.name = "Bruno Palacios";
        myDoctorAnn.showName();
        myDoctorAnn.showID();
        System.out.println(Doctor.id);


    }
}
