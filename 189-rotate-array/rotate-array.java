class Solution {
    public void rotate(int[] nums, int k) {

        if(nums.length == 1){
            return;
        }
        if(nums.length < k){
            k = k%nums.length;
        }
       //part 1 reverse
        reverse(nums, 0, nums.length - k -1);
        //part2 reverse
        reverse(nums, nums.length - k, nums.length-1); 
        //part 3 reverse
        reverse(nums, 0 , nums.length-1);
    }

    public void reverse(int[] a, int i, int j){
        int li = i;
        int ri = j;

        while(li < ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
       
    }
}