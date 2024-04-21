public class ClosestNeighbour {
    private int[] array;

    public ClosestNeighbour(int[] array) {
        this.array = array;
    }

    public int findClosestNeighbor() {
        int minDistance = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }

        return index;
    }
}