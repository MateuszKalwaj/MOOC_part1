
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    //advances the date by one
    public void advance() {
        day++;
        if (day > 30) {
            day = 1;
            month++;
        }
        if (month > 12) {
            year++;
            month = 1;
        }
    }

    //it advances the day by the number given as parameter
    public void advance(int numberOfDays) {
        int i = 0;
        while (i < numberOfDays) {
            advance();
            i++;
        }
    }


    /*
     returns a new MyDate-object that has the date which equals the date of the object
      for which the method was called advance by the parameter of the method days     */
    public MyDate afterNumberOfDays(int days) {

        MyDate myDate = new MyDate(day, month, year);
        myDate.advance(days);
        return myDate;

    }

}
