package com.sdarlot.timewriter;

class EnglishTimeWriter {

    public static String write(String string) {
        return new EnglishTimeWriter().writeTime(string);
    }

    private String writeTime(String string) {
        String[] time = string.split(":");
        
        if(time.length == 2) {
            return time[0].equals("12") ? "Noon" : "Midnight";
        }
        throw new IllegalArgumentException();
    }

}
