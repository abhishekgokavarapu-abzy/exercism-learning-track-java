class SqueakyClean {
    static String clean(String identifier) {
        String result;
        result = replaceSpacesWithUnderScores(identifier);
        result = replaceControlCharacters(result);
        result = kebabToCamel(result);
        result = removeEmojisS(result);
        result = removeGreekChars(result);
        return result;
    }

    private static String replaceSpacesWithUnderScores(String input){
        return input.replaceAll(" ", "_");
    }

    private static String replaceControlCharacters(String input){
        return input.replaceAll("\\p{Cntrl}", "CTRL".toUpperCase());
    }

    private static String kebabToCamel(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : input.toCharArray()) {
            if (c == '-') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    if(!Character.isDigit(c)){
                        result.append(Character.toUpperCase(c));
                        capitalizeNext = false;
                    }
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    private static String removeEmojisS(String input){
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) || c == '_') {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static String removeGreekChars(String input){
        StringBuilder builder = new StringBuilder();
        for(char c : input.toCharArray()){
            if(!Character.toString(c).matches("[α-ω]")){
                builder.append(c);
            }
        }
        return builder.toString();
    }
}