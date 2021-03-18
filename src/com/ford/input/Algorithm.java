package com.ford.input;

public class Algorithm {
    public String convert(int input) {
        return input % 3 == 0 && input % 5 == 0 ? "MustangBronco"
              :input % 3 == 0 ? "Mustang"
              :input % 5 == 0 ? "Bronco"
              :String.valueOf(input);
    }
}
