/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.*;
//import org.jacop.constraints.*;
import org.jacop.core.*;
import org.jacop.search.*;

/**
 *
 * @author ms
 */
public abstract class CProblem {
    
    public int cost;
    
    public ArrayList<IntVar> vars;
    
    /**
     * It specifies the constraint store responsible for holding information 
     * about constraints and variables.
    */
    public Store store;
    /**
     * It specifies the search procedure used by a given example.
     */
    public Search search;	    
    
    public CProblem(){
        this.cost = 20;
    }
    /**
     * Modeling constrain problem function
     */
    public abstract void model();

    public boolean search() {
		
	long T1, T2;
	T1 = System.currentTimeMillis();
		
	SelectChoicePoint select = new SimpleSelect(vars.toArray(new IntVar[1]), null,
			new IndomainMin());

	search = new DepthFirstSearch();

	boolean result = search.labeling(store, select);

	if (result)
		store.print();

	T2 = System.currentTimeMillis();

	System.out.println("\n\t*** Execution time = " + (T2 - T1) + " ms");
		
	System.out.println();
	System.out.print(search.getNodes() + "\t");
	System.out.print(search.getDecisions() + "\t");
	System.out.print(search.getWrongDecisions() + "\t");
	System.out.print(search.getBacktracks() + "\t");
	System.out.print(search.getMaximumDepth() + "\t");
		
    	return result;
		
    }
    
    public int get_cost(){
        return cost;
    }
    
}
