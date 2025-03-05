import java.util.Arrays;

public class FunWith2DArrays {
    public static int totalElements(int[][] numList) {
        int count = 0;
        for (int i = 0; i < numList.length; i++) {
            for (int j = 0; j < numList[i].length; j++) {
                count++;
            }
        }
        return count;
    }

    public static void fourCorners(String[][] strList) {
        System.out.println(strList[0][0]);
        System.out.println(strList[0][strList[0].length - 1]);
        System.out.println(strList[strList.length - 1][0]);
        System.out.println(strList[strList.length - 1][strList[strList.length - 1].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] words) {
        String[] tempList = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = tempList;
    }

    public static double average(int[][] numList) {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < numList.length; i++) {
            for (int j = 0; j < numList[i].length; j++) {
                sum += numList[i][j];
                total++;
            }
        }
        return (double) sum / total;
    }

    public static int edgeSum(int[][] numList) {
        int sum = 0;
        for (int i = 0; i < numList.length; i++) {
            if (i == 0 || i == numList.length - 1) {
                for (int j = 0; j < numList[i].length; j++) {
                    sum += numList[i][j];
                }
            } else {
                sum += numList[i][0];
                sum += numList[i][numList[i].length - 1];
            }
        }
        return sum;
    }

    public static int[] indexFound(String[][] strList, String target) {
        for (int i = 0; i < strList[0].length; i++) {
            for (int j = 0; j < strList.length; j++) {
                if (strList[j][i].equals(target)) {
                    int[] returnList = {j, i};
                    return returnList;
                }
            }
        }
        int[] returnList = {-1, -1};
        return returnList;
    }

    public static int[][] split(int[][] numList, int row, int col) {
        if (row < numList.length && col < numList[row].length) {
            int[][] newList = new int[row + 1][col + 1];
            for (int i = 0; i <= row; i++) {
                for (int j = 0; j <= col; j++) {
                    newList[i][j] = numList[i][j];
                }
            }
            return newList;
        }
        return new int[0][0];
    }

    public static int[][] invert(int[][] numList) {
        int[][] newList = new int[numList[0].length][numList.length];
        for (int i = 0; i < numList.length; i++) {
            for (int j = 0; j < numList[i].length; j++) {
                newList[j][i] = numList[i][j];
            }
        }
        return newList;
    }
}
