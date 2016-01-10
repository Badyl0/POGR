/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import org.jacop.constraints.*;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMin;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;
import org.jacop.search.SimpleSelect;
import org.jacop.search.SmallestDomain;

/**
 *
 * @author ms
 */
public class SchedulingProblem extends CProblem{
    
    public SchedulingProblem(){
        super();
    }
    
    @Override
    public void model(){
        System.out.println("Scheduling Problem:");
    }
}
