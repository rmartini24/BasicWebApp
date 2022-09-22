package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "HelloWorld";
        }
        if (query.toLowerCase().contains("rachel")) {
            return "Rachel Martini (06 June 2022 - present) is an " +
                    "Chicago girl, athlete, and student, widely regarded as the greatest ever";
        }

        if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            int first_number = Integer.parseInt(parts[2]);
            int second_number = Integer.parseInt(parts[4]);
            Integer res = first_number + second_number;
            return res.toString();
        }

        if (query.toLowerCase().contains("multiplied")) {
            String[] parts = query.split(" ");
            int first_number = Integer.parseInt(parts[2]);
            int second_number = Integer.parseInt(parts[4]);
            Integer res = first_number * second_number;
            return res.toString();
        }

        if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split(" ");
            int num1 = Integer.parseInt(parts[8].substring(0, parts[8].length()-1));
            int num2 = Integer.parseInt(parts[9].substring(0, parts[9].length()-1));
            int num3 = Integer.parseInt(parts[10].substring(0, parts[10].length()-1));
            int num4 = Integer.parseInt(parts[11]);
            Integer largest = num1;

            if(num2 > largest) {
                largest = num2;
            }
            if(num3 > largest) {
                largest = num3;
            }
            if(num4 > largest) {
                largest = num4;
            }
            return largest.toString();
        }

        return "";
    }
}

//which of the following numbers is the largest: 7, 94, [43,] 918
//20what%20is%204%20multiplied%20by%2012