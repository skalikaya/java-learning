package day3_Conditions;

public class switchCondition {

    public static void main(String[] args) {
        int day = 7;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("friday");
                break;

            default:
                System.out.println("Weekend");
        }
    }
}