/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycop;
import core.*;
import gui.*;
import control.*;

/**
 *
 * @author ms
 */
public class MyCoP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SchedulingProblem problem = new SchedulingProblem();
        MyCoPGui gui = new MyCoPGui();
        Controller controller = new Controller(gui, problem);
        gui.setVisible(true);
    }
    
}
