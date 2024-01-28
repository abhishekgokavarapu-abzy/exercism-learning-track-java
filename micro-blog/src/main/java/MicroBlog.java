class MicroBlog {
    public String truncate(String input) {
        var unicodeArray = input.codePoints().limit(5).toArray();
        var string = input.codePoints().limit(5)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        String result = "";
        for (int i = 0; i < unicodeArray.length; i++) {
            result = result.concat(Character.toString(unicodeArray[i]));
        }
        return result;
    }
}
