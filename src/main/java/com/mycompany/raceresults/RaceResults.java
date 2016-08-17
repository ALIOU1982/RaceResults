/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raceresults;

import com.mycompany.timeduration.TimeDuration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mathilda
 */
public class RaceResults {

    String TagName;
    TimeDuration timeDuration;
    static List<RaceResults> listResult = new ArrayList<>();

    public RaceResults() {
    }

    public RaceResults(String TagName, TimeDuration timeDuration) {
        this.TagName = TagName;
        this.timeDuration = timeDuration;
    }

    public String getTagName() {
        return TagName;
    }

    public TimeDuration getTimeDuration() {
        return timeDuration;
    }

    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    public void setTimeDuration(TimeDuration timeDuration) {
        this.timeDuration = timeDuration;
    }

    public int compareTo(RaceResults rRsul) {
        int res = 0;
        if (this.timeDuration.getTime() > rRsul.timeDuration.getTime()) {
            res = 1;
        }
        if (this.timeDuration.getTime() < rRsul.timeDuration.getTime()) {
            res = -1;
        }
       if (this.timeDuration.getTime() == rRsul.timeDuration.getTime()){
            res = 0;
        }
        return res;
    }

    public void onNewResult(String TagNumber, TimeDuration time) {
        //TimeDuration tD = new TimeDuration(time);
        RaceResults r;
        r = new RaceResults(TagName, time);
        listResult.add(r);
    }
    
    public void printResults(){
        Collections.sort(listResult, new Comparator<RaceResults>(){
            @Override
            public int compare(RaceResults r1, RaceResults r2){
                return r1.compareTo(r2);
            }
        });
        
        for(RaceResults r: listResult){
            System.out.println("Coureur N° "+r.TagName+" "+r.getTimeDuration().toString());
        }
                
    }
}
