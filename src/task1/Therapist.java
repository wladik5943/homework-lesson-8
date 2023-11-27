package task1;

import java.util.Scanner;

public class Therapist implements Heal{

    public int course(Patient patient){
        int n;
        System.out.println("введите код курса лечения");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        switch (n){
            case 1:{
                System.out.println("назначено лечение у хирурга");
                patient.setPlan("лечение у хирурга");
                return 1;
            }
            case 2:{
                System.out.println("назначено лечение у дантиста");
                patient.setPlan("лечение у дантиста");
                return 2;
            }
            default:{
                System.out.println("назначено лечение у терапевта");
                patient.setPlan("лечение у терапевта");
                return 0;
            }
        }
    }

    @Override
    public void heal() {
        System.out.println("Лечение терапевтом");
    }
}
