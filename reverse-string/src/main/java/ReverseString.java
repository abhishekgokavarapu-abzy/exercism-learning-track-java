class ReverseString {

    String reverse(String inputString) {
        String result = "";
            var stringArray = inputString.split("");
            for (int i = stringArray.length - 1; i >= 0; i--) {
                result = result.concat(stringArray[i]);
            }
        return result;
    }
}
