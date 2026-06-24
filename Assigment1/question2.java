//Write a program to calculate simple interest. The formula for simple interest is SI = (P * R * T) / 100, where P is the principal amount, R is the rate of interest, and T is the time in years. The program should take three command line arguments: principal amount, rate of interest, and time in years, and then calculate and print the simple interest.

public class question2 {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double si = (p*r*t)/100;
        System.out.println("Simple Interest is: "+si);
    }
}
