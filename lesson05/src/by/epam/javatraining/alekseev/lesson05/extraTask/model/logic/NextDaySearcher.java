package by.epam.javatraining.alekseev.lesson05.extraTask.model.logic;

public class NextDaySearcher {

    private static final int ZERO = 0;
    private static final int NUMBER_OF_MONTHS = 12;

    // Number of days in different months.
    private static final int NUMBER_OF_DAYS_IN_SHORT_MONTH = 30;
    private static final int NUMBER_OF_DAYS_IN_LONG_MONTH = 31;
    private static final int NUMBER_OF_DAYS_IN_LEAP_FEBRUARY = 29;
    private static final int NUMBER_OF_DAYS_IN_NON_LEAP_FEBRUARY = 28;

    // Indexes of long months.
    private static final int INDEX_OF_JANUARY = 1;
    private static final int INDEX_OF_MARCH = 3;
    private static final int INDEX_OF_MAY = 5;
    private static final int INDEX_OF_JULY = 7;
    private static final int INDEX_OF_AUGUST = 8;
    private static final int INDEX_OF_OCTOBER = 10;
    private static final int INDEX_OF_DECEMBER = 12;

    private static final int INDEX_OF_FEBRUARY = 2;

    // Сhecks whether the year is a leap year.
    public static boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    // Checks if the entered date is correct.
    private static boolean isDateCorrect(int day, int month, int year) {
        boolean isCorrect = false;
        if (day > ZERO && day <= NUMBER_OF_DAYS_IN_LONG_MONTH
                && month > ZERO && month <= NUMBER_OF_MONTHS
                && year >= ZERO) {
            
            // Check for situation: 29/02/2019 --> 2019 is non leap year,
            // it's mean that in february of year 2019 only 28 days.
            if (month != INDEX_OF_FEBRUARY) {
                isCorrect = true;
            } else {
                boolean isLeap = isLeap(year);
                if (isLeap && day <= NUMBER_OF_DAYS_IN_LEAP_FEBRUARY) {
                    isCorrect = true;
                } else if (!isLeap 
                        && day <= NUMBER_OF_DAYS_IN_NON_LEAP_FEBRUARY) {
                    isCorrect = true;
                }
            }
        }
        return isCorrect;
    }

    // Сreates a string representation of the date.
    private static String convertToDate(int day, int month, int year) {
        return (day < 10 ? "0" : "") + day + "/"
                + (month < 10 ? "0" : "") + month + "/" + year;
    }

    public static int parse(String value) {
        return Integer.parseInt(value);
    }

    public static String getNextDay(String date) {

        String[] parts = date.split("/");
        if (parts.length == 3) {
            int day = parse(parts[0]);
            int month = parse(parts[1]);
            int year = parse(parts[2]);

            if (isDateCorrect(day, month, year)) {

                day++;
                boolean isLeap = isLeap(year);

                // Check for a long month.
                if (month == INDEX_OF_JANUARY || month == INDEX_OF_MARCH
                        || month == INDEX_OF_MAY || month == INDEX_OF_JULY
                        || month == INDEX_OF_AUGUST
                        || month == INDEX_OF_OCTOBER) {
                    if (day > NUMBER_OF_DAYS_IN_LONG_MONTH) {
                        day %= NUMBER_OF_DAYS_IN_LONG_MONTH;
                        month++;
                    }
                    // Check for february.
                } else if (month == INDEX_OF_FEBRUARY) {
                    if (isLeap) {
                        if (day > NUMBER_OF_DAYS_IN_LEAP_FEBRUARY) {
                            day %= NUMBER_OF_DAYS_IN_LEAP_FEBRUARY;
                            month++;
                        }
                    } else {
                        if (day > NUMBER_OF_DAYS_IN_NON_LEAP_FEBRUARY) {
                            day %= NUMBER_OF_DAYS_IN_NON_LEAP_FEBRUARY;
                            month++;
                        }
                    }
                    // Check for december.
                } else if (month == INDEX_OF_DECEMBER) {
                    if (day > NUMBER_OF_DAYS_IN_LONG_MONTH) {
                        day %= NUMBER_OF_DAYS_IN_LONG_MONTH;
                        month = 1;
                        year++;
                    }
                    // Otherwise month is short.
                } else {
                    if (day > NUMBER_OF_DAYS_IN_SHORT_MONTH) {
                        day %= NUMBER_OF_DAYS_IN_SHORT_MONTH;
                        month++;
                    }
                }

                return convertToDate(day, month, year);

            } else {
                return "Wrong date!";
            }
        }
        return "Invalid format!";
    }
}