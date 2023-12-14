package Arrays;

//hint: graph bnao with i-2, i-1, i and dekho downhill trend in onecase i-1 > i and in other i-2 < i and based on that pattern
//decide which value to be updated

public class NonDecreasingArray {
        public boolean checkPossibility(int[] nums) {
            int modificationsCount = 0;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] < nums[i-1]){
                    // downhill trend established
                    modificationsCount++;
                    if(i >= 2 && nums[i] < nums[i-2]){
                        nums[i] = nums[i-1]; //increasing
                    } else {
                        nums[i-1] = nums[i]; //decreasing
                    }
                }
            }
            return modificationsCount <= 1;

        }
    }