package com.aim.lab01;


import java.util.Random;

import com.aimframework.domains.chesc2014_SAT.SAT;
import com.aimframework.satheuristics.SATHeuristic;


public class SteepestDescentHC extends SATHeuristic {

	public SteepestDescentHC(Random random) {
		
		super(random);
	}

	/**
	  * STEEPEST DESCENT HILL CLIMBING LECTURE SLIDE PSEUDO-CODE
	  *
	  * bestEval = evaluate(currentSolution);
	  * improved = false;
	  * 
	  * for(j = 0; j < length[currentSolution]; j++) {
	  * 
	  *     bitFlip(currentSolution, j); 				//flips j^th bit of current solution
	  *     tmpEval = evaluate(currentSolution);
	  *
	  *     if(tmpEval < bestEval) { 					// remember the bit which yields the best value after evaluation
	  *
	  *         bestIndex = j;
	  *         bestEval = tmpEval; 					//record best achievable solution objective value
	  *         improved = true;
	  *     }
	  *
	  *     bitFlip(currentSolution, j); 				//go back to the initial current solution
	  * }
	  *
	  * if(improved) { bitFlip(currentSolution, bestIndex); }
	  *
	  * @param problem The problem to be solved.
	  */
	public void applyHeuristic(SAT problem) {
		
		// TODO implementation of Steepest Descent Hill Climbing 		
	}

	public String getHeuristicName() {
		
		return "Steepest Descent HC";
	}

}
