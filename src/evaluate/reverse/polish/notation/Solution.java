package evaluate.reverse.polish.notation;

import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {
        Stack<String> data = new Stack<String>();

        Integer right ;
        Integer left ;
        Integer result ;

        for(int i =0;i<tokens.length;i++){
            String temp = tokens[i];
            switch (temp){
                case "+":
                     right = Integer.parseInt(data.pop());
                     left = Integer.parseInt(data.pop());
                     result = left + right;
                    data.push(result.toString());
                    break;
                case "-":
                    right = Integer.parseInt(data.pop());
                     left = Integer.parseInt(data.pop());
                     result = left - right;
                    data.push(result.toString());
                    break;
                case "*":
                    right = Integer.parseInt(data.pop());
                    left = Integer.parseInt(data.pop());
                    result = left * right;
                    data.push(result.toString());
                    break;
                case "/":
                    right = Integer.parseInt(data.pop());
                    left = Integer.parseInt(data.pop());
                    result = left / right;
                    data.push(result.toString());
                    break;
                default:
                    data.push(temp);
                    break;
            }

        }

        return Integer.parseInt(data.pop());
    }

}
