package com.example.myfirstapplication;

public class Algorithm {

    public Algorithm() {

    }


    public boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt(input);

        if (!(inputInt > 99_999 && inputInt < 1_000_000)){
            return false;
        }

        int s1 = 0, s2 = 0;

        for (int i = 0; i < 6; i++) {
            if((s1 % 2) == 0){
                s1 = s1 + inputInt % 10;
            }else {
                s2 = s2 + inputInt % 10;
            }
            inputInt = inputInt / 10;
        }


        if (s1 == s2) {
            return true;
        } else {
            return false;
        }



    }

    public int nextHappyInt(String input) {
        int inputInt = Integer.parseInt(input);

        if (!(inputInt > 99_999 && inputInt < 999_999)){
            return -1;
        }

        while (inputInt <= 999_999) {
            if (isHappyTicket(String.valueOf(inputInt)) == true) {
                return inputInt;
            }else {
                inputInt++;
            }
        }
        return -1;
    }
}
