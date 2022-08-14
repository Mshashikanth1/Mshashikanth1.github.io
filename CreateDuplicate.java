class Solution {
    public boolean containsDuplicate(int[] nums) {
           Set <Integer> visited = new HashSet<Integer>();
           for(int i: nums){
               if(visited.contains(i)){return true;}
               visited.add(i);
           }
        return false;
    }
}
