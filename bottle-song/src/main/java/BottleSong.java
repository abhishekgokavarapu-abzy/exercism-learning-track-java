class BottleSong {
    String recite(int startBottles, int takeDown) {
        String result = "";
        for (int i = 0; i < takeDown; i++) {
            result = result.concat(getPoem(startBottles--)) + ( i + 1 == takeDown ? "" : "\n");
        }
        return result;
    }
    private String getPoem(int number){
        return  getWordForNumber(number)+ " green " + (number!=1 ? "bottles":"bottle") + " hanging on the wall,\n" +
                getWordForNumber(number)+ " green " + (number!=1 ? "bottles":"bottle") + " hanging on the wall,\n" +
                "And if one green bottle should accidentally fall,\n" +
                "There'll be "+ getWordForNumber(number - 1).toLowerCase()+" green " + (number - 1 != 1 ? "bottles":"bottle") + " hanging on the wall.\n";

    }
    private String getWordForNumber(int number){
     if(number >= 0 && number <= 10){
         return switch (number) {
             case 0 -> "no";
             case 1 -> "One";
             case 2 -> "Two";
             case 3 -> "Three";
             case 4 -> "Four";
             case 5 -> "Five";
             case 6 -> "Six";
             case 7 -> "Seven";
             case 8 -> "Eight";
             case 9 -> "Nine";
             case 10 -> "Ten";
             default -> "UNDEFINED";
         };
     } else {
         return "UNDEFINED";
     }
    }
}