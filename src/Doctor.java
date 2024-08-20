public class Doctor {
    // atributes
    static int id;  //autoincrement
    String name;
    String speciality;

    Doctor(){
        id++;
    }

    // Methods
    public void showName() {
        System.out.println(name);
    }

    public void showID(){
        System.out.println("ID Doctor es:" + id);
    }

}