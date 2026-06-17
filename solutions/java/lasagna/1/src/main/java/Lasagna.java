public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven){
        if (minutesInOven > expectedMinutesInOven()) {
            throw new IllegalArgumentException("Already overcooked");
        }
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        int prepTime = preparationTimeInMinutes(numberOfLayers);
        int totalTime = prepTime + minutesInOven;
        return totalTime;
    }
}
