package Module3;

public class Module3 {
    public static void main(String[] args) {

        //1.1
        String alienColour = "green";

        if (alienColour.equals("green")) {
            System.out.println("player just earned 5 points");
        }

        //1.2
        if (alienColour.equals("Red")) {
            System.out.println("player just earned 10 points");
        }

        if (alienColour.equals("Yellow")) {
            System.out.println("player just earned 15 points");
        }

        //1.3

        if (alienColour.equals("green")) {
            System.out.println("green");
        } else if (alienColour.equals("Red")) {
            System.out.println("player just earned 10 points");
        } else if(alienColour.equals("Yellow")) {
            System.out.println("player just earned 15 points");
        } else {
            System.out.println("invalid color");
        }


        //1.4
        int age = 23;
        if (age < 2) {
            System.out.println("the person is a baby");
        } else if (age >= 2 && age < 4) {
            System.out.println("that the person is a toddler");
        } else if (age >= 4 && age < 13) {
            System.out.println("that the person is a toddler");
        } else if (age >= 13 && age < 20) {
            System.out.println("that the person is a toddler");
        } else if (age >= 20 && age < 65) {
            System.out.println("that the person is a toddler");
        } else {
            System.out.println("the person is an pensioner");
        }

        //1.5
        int salary = 10;
        if (salary > 150_000) {
            System.out.println("45%");
        } else if (salary > 50_000 && salary <= 150_000) {
            System.out.println("40%");
        } else if (salary > 125_000 && salary <= 50_000) {
            System.out.println("20%");
        } else if (salary > 12500) {
            System.out.println("0%");
        }

        //2.1
        int accountNumber = 99999;
        if (accountNumber < 99999999 && accountNumber > 10000000) {
            System.out.println("it is valid");
        } else {
            System.out.println("invalid account number");
        }

        //2.2
        String flightCode = "FR5432";
        String alCode = flightCode.substring(0, 2);

        if(alCode.equals("BA")) {
            System.out.println("British Airways");
        } else {
            System.out.println("Not British Airways");
        }

        //2.3
        if (alCode.equals("LH") || alCode.equals("BA") || alCode.equals("FR")) {
            System.out.println("valid airline");
        } else {
            System.out.println("unrecognised");
        }

        //2.4
        if (!alCode.equals("LH") && !alCode.equals("BA") && !alCode.equals("FR")) {
            System.out.println("“unrecognised");
        }


        //2.5
        boolean validPassport = true;
        boolean validDrivingLicence = true;

        if (validDrivingLicence || validPassport) {
            System.out.println("id verified");
        } else {
            System.out.println("unable to verify id");
        }


        //2.6
        boolean hasLicence = true;
        boolean isDead = true;
        boolean hasPassedEyeTest = true;

        if (hasLicence && !isDead && hasPassedEyeTest) {
            System.out.println("can still drive");
        } else {
            System.out.println("not licenced to drive");
        }

    }
}
