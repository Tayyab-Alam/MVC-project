/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author TAYYAB ALAM
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model("Initial Data");
        View view = new View();
        Controller controller = new Controller(model, view);

        // Update the data in the model
        controller.setData("Welcome to MVC");

        // Update the view to display the new data
        controller.updateView();
    }
}
