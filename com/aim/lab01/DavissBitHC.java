package com.aim.lab01;

import java.util.Random;
import java.util.stream.IntStream;

import com.aimframework.domains.chesc2014_SAT.SAT;
import com.aimframework.helperfunctions.ArrayMethods;
import com.aimframework.satheuristics.SATHeuristic;

public class DavissBitHC extends SATHeuristic {

	public DavissBitHC(Random random) {
		
		super(random);
	}

	/**
	  * DAVIS's BIT HILL CLIMBING LECTURE SLIDE PSEUDO-CODE
	  *
	  * bestEval = evaluate(currentSolution);
	  * perm = createRandomPermutation();
	  * for(j = 0; j < length[currentSolution]; j++) {
	  * 
	  *     bitFlip(currentSolution, perm[j]); 		//flips j^th bit from permutation of solution producing s' from s
	  *     tmpEval = evaluate(currentSolution);
	  *
	  *     if(tmpEval < bestEval) { 				// if there is improvement (strict improvement)
	  *
	  *         bestEval = tmpEval; 				// accept the best flip
	  *         
	  *     } else { 								// if there is no improvement, reject the current bit flip
	  *
	  *          bitFlip(solution, perm[j]); 		//go back to s from s'
	  *     }
	  * }
	  *
	  * @param problem The problem to be solved.
	  */
	public void applyHeuristic(SAT problem) {
		
		// TODO implementation of Davis's Bit Hill Climbing
	}

	public String getHeuristicName() {

		return "Davis's Bit HC";
	}

}
