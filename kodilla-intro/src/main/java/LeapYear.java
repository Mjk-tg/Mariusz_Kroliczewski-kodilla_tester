public class LeapYear {
    public static void main(String[] args) {
    }
    public static boolean leapjearcheck() {
        int year = 2018;
        int leapFactor1 = 4;
        int leapFactor2 = 100;
        int leapFactor3 = 400;
        boolean ifItsLeapYear = false;

        if (year % leapFactor1 == 0) {
            if (year % leapFactor2 == 0) {
                if (year % leapFactor3 == 0) {
                    ifItsLeapYear = true;
                } else {
                    ifItsLeapYear = false;
                }
            } else {
                ifItsLeapYear = true;
            }
        } else {
            ifItsLeapYear = false;
        }
        return ifItsLeapYear;
     }
}
