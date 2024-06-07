/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lastname.application;

/**
 *
 * @author AscentUser
 */
public class Application {
    public static void Calculate(Calculator Calculate, String Operator) {
        switch (Operator) {
            case "+" -> System.out.println(String.format("%.2f", Calculate.GetSum()));
            case "-" -> System.out.println(String.format("%.2f", Calculate.GetDifference()));
            case "*" -> System.out.println(String.format("%.2f", Calculate.GetProduct()));
            case "/" -> System.out.println(String.format("%.2f", Calculate.GetQuotient()));
            default -> System.out.print("Operator only accepted ( + , - , * , / )");
        } 
    }
}
