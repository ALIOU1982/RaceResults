/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raceresults;

import com.mycompany.timeduration.TimeDuration;

/**
 *
 * @author mathilda
 */
public class TheMain {
    public static void main(String[] args){
        RaceResults r = new RaceResults();
        r.onNewResult("U2", new TimeDuration(750));
        r.onNewResult("U3", new TimeDuration(1500));
        r.onNewResult("U4",  new TimeDuration(80));
        r.onNewResult("U5",  new TimeDuration(987));
        r.onNewResult("U6",  new TimeDuration(987500));
        r.printResults();
    }
    
}
