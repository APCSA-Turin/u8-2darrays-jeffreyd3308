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
}
