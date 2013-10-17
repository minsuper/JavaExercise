package com.Minsup;

public class BubbleSort {
    public static void main(String[] args) {
        int sample[] = {3, 5, 8, 2, 7, 4, 1, 9, 6};
        
        for(int i=0; i<sample.length-1; i++) {
            for (int j=0; j<sample.length-1-i; j++) {
                // swap two elements if the order is not what we want
                if(sample[j] > sample[j+1]) {
                    int t = sample[j]; 
                    sample[j] = sample[j+1];
                    sample[j+1] = t;
                }
            }
        }
        
        for(int i=0; i<sample.length; i++) {
            System.out.print(sample[i] + " ");
        }
        System.out.println("");
    }
}