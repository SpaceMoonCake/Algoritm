public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13};
        System.out.println(findMissingNumber(array));
    }

    public static int findMissingNumber(int[] array) {
        int missingElement = 1;

        if (array.length > 0 && array[0] == 1) {

            int firstElement = 0;
            int lastElement = array.length - 1;
            int middleElement;

            while (firstElement <= lastElement) {
                middleElement = (firstElement + lastElement) / 2;
                if (array[middleElement] - 1 == middleElement) {
                    firstElement = middleElement + 1;
                } else {
                    if (array[middleElement] - array[middleElement - 1] == 2) {
                        missingElement = array[middleElement] - 1;
                        break;
                    } else {
                        lastElement = middleElement - 1;
                    }
                }
            }
        }

        return missingElement;
    }
}
