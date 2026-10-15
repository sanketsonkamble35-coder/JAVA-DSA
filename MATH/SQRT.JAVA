class Solution {
    public int mySqrt(int x) {
        int z;
        for(z=1;z<=x/z;z++){}
        return z-1;
    }
}