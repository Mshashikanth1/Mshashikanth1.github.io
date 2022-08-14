class Solution {
    public int BinarySearch(int[] nums, int target, int low, int high){
        while (low<=high){
            
            int mid=low+(high-low)/2;
            //System.out.println(low+","+high+","+mid+","+nums[mid]+","+target);
            if(nums[mid]==target){return mid;}
            else if(nums[mid]>target){high=mid-1;}
            else{low=mid+1;}
        }
        return -1;
    }
    public int search(int[] nums, int target) {
           return BinarySearch(nums,target,0,nums.length-1);      
    }
}
