package leet.code.other;

import java.util.Stack;

public class Solution71 {
    public String simplifyPath(String path) {

        Stack<String> stringStack = new Stack<String>();
        String[] str = path.split("/");
        for (String s : str) {
            if (s.equals("..")) {
                if (!stringStack.isEmpty())
                    stringStack.pop();
            } else if (!s.equals(".") && !s.equals("")) {
                stringStack.push(s);
            }
        }
        if (stringStack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringStack.size(); i++) {
            sb.append("/" + stringStack.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution71().simplifyPath("/a/./b/../../c/"));
    }
}
