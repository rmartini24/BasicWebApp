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

        return "";
    }
}