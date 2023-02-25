package com.sobczyk.codewars.kyu7;

import org.springframework.stereotype.Service;

@Service
public class ExesOhs {

    public boolean getResult(String str) {
        int xCounter = 0;
        int oCounter = 0;

        if (str == null) {
            return false;
        }
        for(char a : str.toLowerCase().toCharArray()) {
            if (a == 'x') {
                xCounter ++;
            }
            else if (a == 'o') {
                oCounter ++;
            }
        }
        return xCounter == oCounter;
    }
}
