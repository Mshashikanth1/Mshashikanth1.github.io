/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int UsingBinarySearch(int low, int high){
        int mid=0;
        while(low<high){
            mid=low+(high-low)/2;
            if(!isBadVersion(mid)){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
        
    }
    public int firstBadVersion(int n) {
            return UsingBinarySearch(1,n);
    }
}
