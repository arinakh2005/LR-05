package task28;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(String date) {
        String[] parts = date.split("\\.");
        this.day = Integer.parseInt(parts[0]);
        this.month = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public String getFullDate() {
        return this.day + "." + this.month + "." + this.year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
