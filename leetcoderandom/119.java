import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        long val=1;
        ans.add(1);
        for(int i=1;i<=rowIndex;i++){
            val*=(rowIndex-i+1);
            val/=i;
            ans.add((int)val);
        }
        return ans;
    }
}