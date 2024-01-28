public class Lasagna {

    private final int EXPECTED_OVEN_TIME = 40;
    private final int TIME_TAKEN_ONE_LAYER = 2;

    public int expectedMinutesInOven(){
        return EXPECTED_OVEN_TIME;
    }

    public int remainingMinutesInOven(int minutesInOven){
        return EXPECTED_OVEN_TIME - minutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers * TIME_TAKEN_ONE_LAYER;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
        return (numberOfLayers * TIME_TAKEN_ONE_LAYER) + minutesInOven;
    }
}
