class Solution {
    static void valpar(char[] arr, int n, int i, int o, int c, List<String>lst){
        if(i==arr.length){
            lst.add(new String(arr));
        }
        if(o<n){
            arr[i] = '(';
            valpar(arr, n, i+1, o+1,c,lst);
        }
        if(c<o){
            arr[i] =')';
            valpar(arr, n, i+1, o, c+1,lst);
        }
    }
    public List<String> generateParenthesis(int n) {
        char[] arr = new char[n*2];
        List<String> lst = new ArrayList<>();
        valpar(arr, n,0,0,0,lst);
        return lst;
    }
}