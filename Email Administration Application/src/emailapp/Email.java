package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {

      
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int defaultPasswordLength = 8;
    private String department;
    private int mailBoxCapacity = 1000;
    private String alternateEmail;
    private String company = "ot.com";

    // Constructor to receive the first and last name
        public Email(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;

            // Call a method asking for the department - return the department
                this.department = setDepartment();
                System.out.println("DEPARTMENT: "+this.department);

            // Combine elements to generate email
            email = firstName.toLowerCase()  +"."+ lastName.toLowerCase() +"@"+ department.toLowerCase() +"."+ company;

            // Call a method that return the password
                this.password = randomPassword(defaultPasswordLength);
        }

    // Ask for the department
        private String setDepartment(){
            System.out.print("Hello Mr "+lastName.toUpperCase()+",\n"+ "Please choose a department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if(depChoice == 1){return "Sales";}
            else if(depChoice == 2){return "Development";}
            else if(depChoice == 3){return "Accounting";}
            else {return "";}
        }

    // Generate a random password
        private String randomPassword(int length){
            String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_@!?#%$*/+";
            char[] password = new char[length];
            for (int i = 0; i<length; i++){
                int rand = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }
            return new String(password);
        }

    // Set the mailbox Capacity
        public void setMailBoxCapacity(int mailBoxCapacity) {
            this.mailBoxCapacity = mailBoxCapacity;
    }


    // Set the alternate email
        public void setAlternateEmail(String alternateEmail) {
            this.alternateEmail = alternateEmail;
    }


    // Change the password
        public void changePassword(String password){
            this.password = password;
        }

    public String getPassword() {
        return password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String showInfos() {
        return
                "\nNAME: " + firstName +" "+ lastName +"\n"+
                "EMAIL: " + email + "\n" +
                "PASSWORD: " + password + "\n" +
                "MAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}
