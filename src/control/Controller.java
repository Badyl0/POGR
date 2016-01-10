/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import gui.*;
import core.*;
import java.awt.event.*;
/**
 *
 * @author ms
 */
public class Controller {
    private MyCoPGui theProblemGui;
    private CProblem theProblem;
    private javax.swing.JPanel currentPanel;
    
    public Controller(MyCoPGui theGui, CProblem theProblem){
        this.theProblemGui = theGui;
        this.theProblem = theProblem;
       /* this.theProblemGui.kombPanel1.printLine("Opis Problemu");
        this.theProblemGui.harmPanel1.printLine("Opis Problemu");
        this.theProblemGui.optPanel1.printLine("Opis Problemu");*/
    }
    
    class SearchListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent arg0){
            //do some model stuff
            theProblem.model();
            //theProblemGui.harmPanel1.printLine("Action");
//            theProblemGui.setCostValue(theProblem.get_cost());       
        }
        
    }
    
}
