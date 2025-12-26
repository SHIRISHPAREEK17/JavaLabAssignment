/* 
Given an unsorted array of integers containing 
both positive and negative numbers, find the 
length of the longest contiguous segment 
(subarray) such that.
The segment has balanced parity, i.e., it 
contains an equal number of odd and even 
elements. 
The sum of the elements in the segment is 
greater than 0.
*/
class LongestSegement{
    public static int longestSegment(int arr[]) {
        int n = arr.length;
        int maxLength = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0, even = 0, odd = 0;
            for (int j = i; j < n; j++){
                sum += arr[j];
                if (arr[j] % 2 == 0)
                      even++;
                else
                      odd++;
                if (even == odd && sum > 0) 
                    maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-4,6};
        System.out.println("Length: " + longestSegment(arr));
    }
}