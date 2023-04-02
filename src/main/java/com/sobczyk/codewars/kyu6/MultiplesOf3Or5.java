package com.sobczyk.codewars.kyu6;

public class MultiplesOf3Or5 {

    public int solution(int number) {
        int wynik = 0;
        for (int i=1; i<=(number-1)/3; i++) {
            wynik += 3*i;
        }
        for (int i=1; i<=(number-1)/5; i++) {
            wynik += 5*i;
        }
        for (int i=1; i<=(number-1)/15; i++) {
            wynik -= 15*i;
        }
        return wynik;
    }

}
