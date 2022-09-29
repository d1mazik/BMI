import javax.swing.*;

public class BMI {
    public static void main(String[] args) {
          /***
           * BMI(BodyMassIndex) program som räknar ut persons
           * undervikt
           * normalvikt
           * övervikt
           * fetma klass 1
           * fetma klass 2
           * fetma klass 3
           */
             char fun = '\u263a';
             String inputKg = JOptionPane.showInputDialog(null, fun + " WELCOME TO BMI CALCULATOR"
                     + fun + "\nEnter your weight: ");
                    double kg = Double.parseDouble(inputKg);
                    String inputCm = JOptionPane.showInputDialog(null, "Enter your height: ");
                    double cm = Double.parseDouble(inputCm);
                    double result = bmiFormula(kg,cm); // här skapade jag egen metod som räknar ut BMI
                    result = Math.round(result *100)/100.0; // för att avrunda till 20.01

             if (result  < 18.5 ){
                 JOptionPane.showMessageDialog(null,"Your weight is: " + kg + " kg." +
                         "\nYour height is: " + cm + " cm." + "\nYour BMI is: " + result + ". " + "\nUnderweight.");
             }
             else if (result < 25){
                 JOptionPane.showMessageDialog(null,"Your weight is: " + kg + " kg." +
                         "\nYour height is: " + cm + " cm." + "\nYour BMI is: " + result + ". " + "\nHealthy weight.");
             }
             else if (result < 30){
                 JOptionPane.showMessageDialog(null,"Your weight is: " + kg + " kg." +
                         "\nYour height is: " + cm + " cm." + "\nYour BMI is: " + result + ". " + "\nOverweight.");
             }
             else if (result < 35){
                 JOptionPane.showMessageDialog(null,"Your weight is: " + kg + " kg." +
                         "\nYour height is: " + cm + " cm." + "\nYour BMI is: " + result + ". " + "\nObesity 1.");
             }
             else if (result < 40){
                 JOptionPane.showMessageDialog(null,"Your weight is: " + kg + " kg." +
                         "\nYour height is: " + cm + " cm." + "\nYour BMI is: " + result + ". " + "\nObesity 2.");
             }
             else {
                 JOptionPane.showMessageDialog(null,"Your weight is: " + kg + " kg." +
                         "\nYour height: " + cm + " cm." + "\nYour BMI is: " + result + ". " + "\nObesity 3.");
        }
    }
    static double bmiFormula(double a, double b){
        return (a * 10000)/(b * b);
    } // a * 10000 för att få bort nollor gramför
}