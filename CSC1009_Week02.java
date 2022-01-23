package Main;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Main main = new Main();

        System.out.println("--- CSC1009 - Week 02 Tutorial Question 01 ---");
        main.tutQuestion01("Koh Ding Yuan");

        System.out.println("\n--- CSC1009 - Week 02 Tutorial Question 02 ---");
        main.tutQuestion02();
        
        System.out.println("\n--- CSC1009 - Week 03 Tutorial Question 03 ---");
        main.tutQuestion03();

        System.out.println("\n--- CSC1009 - Week 04 Tutorial Question 04 ---");
        main.tutQuestion04();
    }

    public void lecSlide19() {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle (" + circle1.radius + "): " + circle1.getArea());

        Circle circle2 = new Circle(10);
        System.out.println("The area of the circle (" + circle2.radius + "): " + circle2.getArea());

        Circle circle3 = new Circle(50);
        System.out.println("The area of the circle (" + circle3.radius + "): " + circle3.getArea());

        circle3.setRadius(100);
        System.out.println("The area of the circle (" + circle3.radius + "): " + circle3.getArea());
    }
    public void lecSlide26() {
        Time time1 = new Time();
        time1.showTime();

        Time time2 = new Time();
        time2.setHour(14);
        time2.setMinute(30);
        time2.showTime();
    }

    public void tutQuestion01(){
        System.out.print("Enter a number for radius: ");
        double inputRadius, area, pi = 3.14159;
        try{
            Scanner input = new Scanner(System.in);
            inputRadius = input.nextDouble();
            input.close();
        }
        catch(Exception e){
            //Too lazy to implement error handling
            System.out.print("Error: Invalid input...");
            return;
        }
        area = pi * Math.pow(inputRadius, 2);
        System.out.print("The area for the circle of radius " + inputRadius + " is " + area);
    }
    public void tutQuestion02(){
        System.out.print("Enter three numbers: ");
        String userInput = "";
        double[] inputValues = new double[3];
        double total = 0;
        int inputCounter = 0;
        try{
            Scanner input = new Scanner(System.in);
            while(inputCounter < inputValues.length){
                userInput = input.nextLine();
                String[] subStrings = userInput.split("\\s", inputValues.length);
                for(int i = 0; i < subStrings.length && (inputCounter + i) < inputValues.length; i++)
                    inputValues[inputCounter + i] = Double.parseDouble(subStrings[i]);
                inputCounter += subStrings.length;
            }
            input.close();
        }
        catch(Exception e){
            //Too lazy to implement error handling
            System.out.print("Error: Invalid input...");
            return;
        }

        userInput = "";
        for(double value: inputValues){
            total += value;
            userInput += value + " ";
        }
        System.out.print("The average of " + userInput + "is " + (total/inputValues.length));
    }
    public void tutQuestion03(){
        long currentMillis = System.currentTimeMillis();
        long currentSec = currentMillis / 1000, displaySec = currentSec % 60;
        long currentMin = currentSec / 60, displayMin = currentMin % 60;
        long currentHr = currentMin / 60, displayHr = currentHr % 60;

        System.out.format("Current time is %d:%d:%d GMT", 
            displayHr,
            displayMin,
            displaySec);
    }
    public void tutQuestion04(){
        int inputYear = 0, yearCase = 0;

        System.out.print("Enter a year: ");
        try{
            Scanner input = new Scanner(System.in);
            inputYear = input.nextInt();
            input.close();
        }
        catch(Exception e){
            //Too lazy to implement error handling
            System.out.print("Error: Invalid input...");
            return;
        }
        
        yearCase = inputYear % 12;
        switch(yearCase){
            case 0:
                System.out.print("monkey");
                break;
            case 1:
                System.out.print("rooster");
                break;
            case 2:
                System.out.print("dog");
                break;
            case 3:
                System.out.print("pig");
                break;
            case 4:
                System.out.print("rat");
                break;
            case 5:
                System.out.print("ox");
                break;
            case 6:
                System.out.print("tiger");
                break;
            case 7:
                System.out.print("rabbit");
                break;
            case 8:
                System.out.print("dragon");
                break;
            case 9:
                System.out.print("snake");
                break;
            case 10:
                System.out.print("horse");
                break;
            default:
                System.out.print("sheep");
                break;
        }
    }

    class Circle {
        double radius;

        Circle() {
            radius = 1;
        }

        Circle(double newRadius) {
            radius = newRadius;
        }

        double getArea() {
            return radius * radius * Math.PI;
        }

        double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        void setRadius(double newRadius) {
            radius = newRadius;
        }
    }
    class Time {
        private int hour, minute;

        public Time() {
            hour = 12;
            minute = 0;
        }

        public void setHour(int h) {
            hour = h;
        }

        public int getHour() {
            return hour;
        }

        public void setMinute(int m) {
            minute = m;
        }

        public int getMinute() {
            return minute;
        }

        public void showTime() {
            System.out.println("Time is: " + hour + ":" + minute);
        }
    }
}