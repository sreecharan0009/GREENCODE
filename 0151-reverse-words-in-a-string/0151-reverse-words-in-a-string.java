class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        char[] arr=s.toCharArray();
        reverse(arr,0,arr.length-1);
        int p1=0;
        for(int p2=0;p2<=arr.length;p2++){
            if(p2==arr.length || arr[p2]==' '){
            reverse(arr,p1,p2-1);
            p1=p2+1;
            }
        }
        return new String(arr);
    }
    private void reverse(char[] arr,int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}