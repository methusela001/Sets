package org.example;


import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;


    public class Testing {
        //Define a testing class with a main() method where you:
        public static void main(String[] args) {
            //create an HashSet with all the days of the week and print the content of the HashSet
            Set<String> weekDaysHashSet = new HashSet();
            weekDaysHashSet.add("Monday");
            weekDaysHashSet.add("Tuesday");
            weekDaysHashSet.add("Wednesday");     //Test per testare il funzionamento del HashSet, annulla i duplicati
            weekDaysHashSet.add("Wednesday");     //e li mette in ordine
            weekDaysHashSet.add("Thursday");
            weekDaysHashSet.add("Friday");
            weekDaysHashSet.add("Saturday");
            weekDaysHashSet.add("Sunday");
            weekDaysHashSet.addAll(weekDaysHashSet);   //test 2
            for (String day : weekDaysHashSet) {
                System.out.println("This is the order of the day according to the HashSet: "+  1 + day);
            }
            //create another implementation of Set that preserves the insertion order of the days of the week and print it
            Set<String> weekDaysLinkedHasTest = new LinkedHashSet();  //LinkedHashSet in più mantiene l ordine in cui gli
            weekDaysLinkedHasTest.add("Monday");                      //elementi sono stati aggiunti
            weekDaysLinkedHasTest.add("Tuesday");
            weekDaysLinkedHasTest.add("Wednesday");
            weekDaysLinkedHasTest.add("Thursday");
            weekDaysLinkedHasTest.add("Friday");
            weekDaysLinkedHasTest.add("Saturday");
            weekDaysLinkedHasTest.add("Sunday");
            weekDaysLinkedHasTest.addAll(weekDaysLinkedHasTest);  //test 3

            //print the new Set
            //for (String day: weekDaysLinkedHasTest)
            System.out.println("Days of the week with LinkedHashSet: " + weekDaysLinkedHasTest);

            //print the answer to the question Is the first Set equal to the second one?
            System.out.println("Il primo Set è uguale al secondo? " +weekDaysHashSet.equals(weekDaysLinkedHasTest));
        } //la risposta sarà true perchè l'equals mi dirà semplicemente se il contenuto è uguale senza interessarsi dell'ordine in cui si trovano
    }

