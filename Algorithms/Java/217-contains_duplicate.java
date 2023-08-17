//version 2

class Solution {
    public boolean containsDuplicate(int[] nums) {
          Set<Integer> duplicate = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(duplicate.contains(nums[i])){
                return true; 
            }
            
            duplicate.add(nums[i]);
        
        }

       return false; 

        
    }
}