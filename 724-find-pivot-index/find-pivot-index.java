class Solution {
    public int pivotIndex(int[] nums) {
        int equilibriumIndex = -1;
		for(int i = 0; i < nums.length; i++){
			int leftSum = 0;
			int rightSum = 0;

			for(int j =	0; j < i; j++){
				leftSum += nums[j];
			}

			for(int j =	i+1; j < nums.length; j++){
				rightSum += nums[j];
			}

			if(leftSum == rightSum){
				equilibriumIndex = i;
                break;
			}
		}
		return equilibriumIndex;
    }
}