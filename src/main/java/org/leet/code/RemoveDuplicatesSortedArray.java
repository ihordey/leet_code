package org.leet.code;

public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] data) {
        if (data.length == 0) {
            return -1;
        }
        int uniqueIndex = 1;
        boolean hasDuplicate = false;

        for (int i = 0; i < data.length - 1; i++) {
            final int h = i + 1;
            if (data[i] == data[h]) {
                hasDuplicate = true;
            } else if (data[i] != data[h]) {
                if (hasDuplicate || uniqueIndex < h) {
                    data[uniqueIndex] = data[h];
                    hasDuplicate = false;
                }
                uniqueIndex++;
            }
        }
        if((uniqueIndex != data.length)){
            for (int i = uniqueIndex; i < data.length; i++) {
                data[i] = -1;
            }
        }
        return uniqueIndex;
    }
}
