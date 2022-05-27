package org.leet.code;

public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] data) {
        if (data.length == 0) {
            return -1;
        }
        int uniqueIndex = 1;

        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[i - 1]) {
                if (uniqueIndex != i) {
                    data[uniqueIndex] = data[i];
                }
                uniqueIndex++;
            }
        }
        if ((uniqueIndex != data.length)) {
            for (int i = uniqueIndex; i < data.length; i++) {
                data[i] = -1;
            }
        }
        return uniqueIndex;
    }
}
