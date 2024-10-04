package org.javapractice.october4.nestedclasses.innerclasses.practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Pair {
    private int a;
    private int b;


    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public class Nod{
        private int nod;
        private Set<Integer> aDels;
        private Set<Integer> bDels;
        private Set<Integer> retainAB = new HashSet<>();
        public Nod(){
            getMns();
        }

        private void getMns(){
            if (nod == 0){
                aDels = getDels(a);
                bDels = getDels(b);
                retainAB = aDels;
                retainAB.retainAll(bDels);
                nod = Collections.max(retainAB);
            }
            System.out.println("НОД: " + nod);
        }
        private Set<Integer> getDels(int num){
            int aF = num;
            Set<Integer> dels = new HashSet<>();
            while(aF>0){
                if (num % aF == 0){
                    dels.add(aF);
                }
                aF--;
            }
            return dels;
        }

        public int getNod() {
            return nod;
        }
    }
}
