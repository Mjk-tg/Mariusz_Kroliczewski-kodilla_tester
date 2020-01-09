public class LeapYear {

    public boolean checkLeapYear(int year){

        boolean ifItsLeapYear;

        if (year % 4 > 0) {
            ifItsLeapYear = false;
        } else {
            if (year % 100 > 0) {
                ifItsLeapYear = true;
            } else {
                if (year % 400 == 0) {
                    ifItsLeapYear = true;
                } else {
                    ifItsLeapYear = false;
                }
            }
        }
        if (ifItsLeapYear) {
            System.out.println("Year " + year + " is leap year");
        } else {
            System.out.println("Year " + year + " is not leap year");
        }
        return ifItsLeapYear;
    }
}



