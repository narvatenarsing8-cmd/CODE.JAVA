public class DivisibilityCheck {
    public static void main(String[] args) {

        int n = 221;

        if (n % 13 == 0) {
            if (n % 17 == 0) {
                System.out.println("221 is divisible by both 13 and 17");
            } 
            else {
                System.out.println("221 is divisible by 13 but not by 17");
            }
        } 
        else {
            System.out.println("221 is not divisible by 13");
        }
    }
}
