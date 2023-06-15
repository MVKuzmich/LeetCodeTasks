package easy;

public class TakeGifts {

    public long pickGifts(int[] gifts, int attempt) {
        while (attempt > 0) {
            int index = findIndexWithMaxGiftQuantity(gifts);
            gifts[index] = (int) Math.sqrt(gifts[index]);
            attempt--;
        }

        return findSumArray(gifts);
    }

    private long findSumArray(int[] gifts) {
        long sum = 0;
        for (int quantity : gifts) {
            sum += quantity;
        }
        return sum;
    }

    public int findIndexWithMaxGiftQuantity(int[] gifts) {
        int maxNumber = Integer.MIN_VALUE;
        int indexMaxNumber = -1;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] > maxNumber) {
                maxNumber = gifts[i];
                indexMaxNumber = i;
            }
        }
        return indexMaxNumber;
    }
}
