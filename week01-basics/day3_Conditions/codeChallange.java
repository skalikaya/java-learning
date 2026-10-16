package day3_Conditions;
//System access control example - You must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2) to get access:
public class codeChallange {
    public static void main(String[] args) {
        boolean isLoogedIn = true;
        boolean isAdmin = false;
        int securityLevel = 1;

        if (isLoogedIn && (isAdmin||securityLevel>=3)){
            System.out.println("Logged IN");
        }else{
            System.out.println("Access denied");
        }
    }
}
