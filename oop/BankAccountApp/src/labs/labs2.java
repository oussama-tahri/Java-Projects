package labs;


public class labs2 {
    public static void main(String[] args){
            Student std1 = new Student("Oussama","Tahri","1772205770");

            std1.enroll("Compilation");
            std1.enroll("Java");
            std1.payTuition(500);
            System.out.println(std1.toString());
    }
}

class Student {
    // properties
    private static int iD = 10;
    private String userId;
    private String name;
    private String ssn;
    private String email;
    private String phone;
    private String city;
    private String state;
    private String lname;
    private String courses = "";
    private static final int costOfCourse = 800;
    private int balance = 0;



    public Student(String name, String lname, String ssn){
        iD++;
        this.name = name;
        this.lname = lname;
        this.ssn = ssn;
        setEmail();
        setUserId();
    }

    private void setEmail() {
        email = lname.toLowerCase() + "_" + name.toLowerCase() + "@emsi-edu.ma";
        System.out.println("Your email : " +email);
    }

    public String getEmail(){
        return email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private void setUserId() {
        int max = 90;
        int min = 10;
        int rand = (int) (Math.random() * ((max - min)));
        rand = rand + min;
        userId = iD + "" + rand + ssn.substring(3);
        System.out.println("Your User ID : " +userId);
    }

    public void enroll(String course){
        this.courses = this.courses + " " + course;
        balance = balance + costOfCourse;
    }

   public void payTuition(int amount){
        System.out.println("Payment : $" +amount);
        balance = balance - amount;
   }

   public void checkBalance(){
       System.out.println("Balance : $" +balance);
   }

   public void showCourses(){
       System.out.println(courses);
   }

    @Override
    public String toString() {
        return "Student{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                ", courses='" + courses + '\'' +
                ", balance=" + balance +
                '}';
    }
}
