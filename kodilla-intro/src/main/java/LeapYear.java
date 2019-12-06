public class LeapYear {

    int year;
    public LeapYear(int year) {
        this.year=year;
    }

    public boolean checkLeapYear(){

        int leapFactor1 = 4;
        int leapFactor2 = 100;
        int leapFactor3 = 400;
        boolean ifItsLeapYear;

        if (year % leapFactor1 > 0) {
            ifItsLeapYear = false;
        } else {
            if (year % leapFactor2 > 0) {
                ifItsLeapYear = true;
            } else {
                if (year % leapFactor3 == 0) {
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



