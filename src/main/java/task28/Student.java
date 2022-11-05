package task28;

public class Student {
    private final int id;
    private String fullname;
    private String group;
    private Date dateOfBirth;
    private float averageMark;
    private static int incrementedUniqId = 1;

    public Student(String fullname, String group, Date dateOfBirth, float averageMark) {
        this.id = incrementedUniqId++;
        this.fullname = fullname;
        this.group = group;
        this.dateOfBirth = dateOfBirth;
        this.averageMark = averageMark;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfBirth() {
        return dateOfBirth.getFullDate();
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }
}
