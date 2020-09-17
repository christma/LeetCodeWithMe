package leet.code;

public class Solution345 {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();//先将字符串转成字符数组（方便操作）
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            while (l < n && !isVowel(arr[l])) {//从左判断如果当前元素不是元音
                l++;
            }
            while (r >= 0 && !isVowel(arr[r])) {//从右判断如果当前元素不是元音
                r--;
            }
            if (l >= r) {//如果没有元音
                break;
            }
            //交换前后的元音
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;//这里要分开写，不要写进数组里面去
            r--;
        }
        return new String(arr);//最后返回的时候要转换成字符串输出
    }

    private boolean isVowel(char ch) {//判断是不是元音，如果不是元音才返回true
        //这里要直接用return语句返回，不要返回true或者false
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        Solution345 solution345 = new Solution345();
        System.out.println(solution345.reverseVowels("leetcode"));

    }
}
