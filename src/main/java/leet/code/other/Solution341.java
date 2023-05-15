package leet.code.other;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Solution341 implements Iterator<Integer> {

    //嵌套列表
    private List<NestedInteger> nestedList = null;
    //迭代器存储栈
    private Stack<Iterator<NestedInteger>> stack = new Stack<>();
    //当前迭代器
    private Iterator<NestedInteger> iterator = null;
    //当前遍历整数
    private Integer integer = 0;
    public Solution341(List<NestedInteger> nestedList) {
        //嵌套列表初始化
        this.nestedList = nestedList;
        iterator = nestedList.iterator();
    }

    @Override
    public Integer next() {
        return integer;
    }

    @Override
    public boolean hasNext() {
        if(iterator.hasNext()) {
            NestedInteger nestedInteger = iterator.next();
            if (!nestedInteger.isInteger()) {
                //该值为列表
                stack.push(iterator);
                iterator = nestedInteger.getList().iterator();
                return hasNext();
            } else {
                integer = nestedInteger.getInteger();
                return true;
            }
        }else if(!iterator.hasNext() && !stack.isEmpty()) {
            //当前迭代器至列表末尾并且栈非空
            //迭代器更新为上一级
            iterator = stack.pop();
            return hasNext();
        }else{
            return false;
        }
    }
}
