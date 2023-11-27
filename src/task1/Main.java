package task1;

public class Main {
    public static void main(String[] args) {

        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();
        Patient patient = new Patient();

        switch(therapist.course(patient)){
            case 1:{
                surgeon.heal();
                break;
            }
            case 2:{
                dentist.heal();
                break;
            }
            default:{
                therapist.heal();
                break;
            }
        }
    }
}