class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int arr[] = new int[nums1.length];
        int t = -1;

        for(int i = 0; i < nums1.length; i++) {

            for(int j = 0; j < nums2.length; j++) {

                if(nums1[i] == nums2[j]) {

                    boolean found = false;

                    for(int k = 0; k <= t; k++) {
                        if(arr[k] == nums1[i]) {
                            found = true;
                        }
                    }

                    if(!found) {
                        t++;
                        arr[t] = nums1[i];
                    }

                    break;
                }
            }
        }

        int[] result = new int[t + 1];

        for(int i = 0; i <= t; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}