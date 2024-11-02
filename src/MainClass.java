package com.mycompany.csc325_oop_designreview_lab;
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Freshman and Senior instance
        Freshman std1 = new Freshman("James", (short) 18, 12);
        Senior std2 = new Senior("John", (short) 21, 90);

        // A set GPA determined by the user
        System.out.print("Enter GPA for Freshman " + std1.getName() + ": ");
        double gpa1 = scanner.nextDouble();
        std1.setGPA(gpa1);

        System.out.print("Enter GPA for Senior " + std2.getName() + ": ");
        double gpa2 = scanner.nextDouble();
        std2.setGPA(gpa2);

        // Output of data
        System.out.println(std1);
        System.out.println(std2);

        scanner.close();
    }
}