package medium;

public class FirstAntFall {
    public int getRoundCountFirstAntFall(int plankLength, int leftMovePos, int rightMovePos) {
        int roundCountLeft = 0;
        int roundCountRight = 0;
        if (rightMovePos < leftMovePos) {
            while (leftMovePos - rightMovePos > 1) {
                leftMovePos--;
                roundCountLeft++;
                if (leftMovePos - rightMovePos == 1) {
                    break;
                }
                rightMovePos++;
                roundCountRight++;
            }
            int temp = rightMovePos;
            rightMovePos = leftMovePos;
            leftMovePos = temp;
        }

        return Math.min(leftMovePos + roundCountLeft, plankLength - rightMovePos + roundCountRight) + 1;
    }
}
