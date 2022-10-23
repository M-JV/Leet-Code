class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int max = 0,i;
        //comparing value at nums[i] and max
        for(i=0;i<nums.length;i++){
            if(nums[i]>max)
                // etting new max
                max = nums[i];
        }
        
        int B[] = new int[nums.length];
        int C[] = new int[max+1];
        
        // initializing all elements of Count as 0
        for(i=0;i<=max;i++) C[i] = 0;
        
        // Setting Count
        for(i=0;i<nums.length;i++) C[nums[i]] = C[nums[i]] + 1;
        
        for(i=1;i<=max;i++) C[i] = C[i] + C[i-1];
        //Checking if ccount is 0
        for(i=0;i<nums.length;i++){
            if(nums[i]==0) B[i]=0;
            
            // Setting the ans as count
            else B[i] = C[nums[i]-1];
        }
        return B;
    }
}

