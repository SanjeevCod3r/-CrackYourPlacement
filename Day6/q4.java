class Solution {
    public String simplifyPath(String path) {
        String[] str=path.split("/");
        Stack <String> stack= new Stack<>();
        for(int i=0;i<str.length;i++){
            if(!stack.isEmpty() && str[i].equals(".."))
                stack.pop();
            else if(!str[i].equals(".") && !str[i].equals("..") && !str[i].equals(""))
                stack.push(str[i]);
        }
         List<String> list = new ArrayList(stack);
         return "/"+String.join("/", list);
    }
}