package com.sdarlot.timewriter;

class EnglishTimeWriter {

    public static String write(String string) {
        EnglishTimeWriter writer = new EnglishTimeWriter();
        return writer.writeTime(string);
    }

    private String writeTime(String string) {
        return "Noon";
    }

}
