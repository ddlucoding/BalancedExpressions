package BalancedExpressions;

import java.util.Stack;

public class BalancedString2 {
    public boolean IsBalanced(String str) {
        Character[] type1 = {'(', ')'};
        Character[] type2 = {'[', ']'};
        Character[] type3 = {'{', '}'};
        Character[] type4 = {'<', '>'};

        var one = isBalancedOne(type1, str);
        var two = isBalancedOne(type2, str);
        var three = isBalancedOne(type3, str);
        var four = isBalancedOne(type4, str);
        if (one == false || two == false || three == false || four ==false) {
            return false;
        }
        return true;
    }
    private boolean isBalancedOne(Character[] array, String str) {
        Stack stack = new Stack();
        for (char character : str.toCharArray()) {
            if (character == array[0]) {
                stack.push(character);
            }
            if (character==array[1]) {
                if (stack.isEmpty()==true) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}


// '(', ')'
// '[', ']'
// '{', '}'
// '<', '>'
//4 types

