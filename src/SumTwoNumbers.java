// sample code for addition using JOptionPane

import javax.swing.JOptionPane;

public class SumTwoNumbers {

    public static void main(String[] args) {

        String firstNumber = JOptionPane.showInputDialog("Input <First Integer>");

        String secondNumber = JOptionPane.showInputDialog("Input <Second Integer>");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "Sum is " + sum);
    }
}