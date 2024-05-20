package com.mycompany.icetask3;

//Question 1:


public class ParenthesesValidator {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false; // Empty string is considered invalid
        }

        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.append(c);
            } else {
                if (stack.length() == 0) {
                    return false;
                }
                char lastChar = stack.charAt(stack.length() - 1);
                if ((c == ')' && lastChar == '(') ||
                    (c == '}' && lastChar == '{') ||
                    (c == ']' && lastChar == '[')) {
                    stack.deleteCharAt(stack.length() - 1);
                } else {
                    return false;
                }
            }
        }
        return stack.length() == 0;
    }

    public static void main(String[] args) {
        Question1 validator = new Question1();

        // Test cases
        System.out.println(validator.isValid("(){}[]")); // true
        System.out.println(validator.isValid("{}{)}"));  // false
        System.out.println(validator.isValid(""));       // false
        System.out.println(validator.isValid("{[}]"));   // false
        System.out.println(validator.isValid("()"));     // true
        System.out.println(validator.isValid("({[]})")); // true
        }
    }





