
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

class MyClass {

    public static void posNeg(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else if (num == 0) {
            System.out.println("Number is 0");
        }
    }

    public static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else if (num % 2 != 0) {
            System.out.println("Number is Odd");
        }
    }

    public static void firstNnaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void numbersInRange(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void greatestOfTwo(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + " is greater");
        }
        System.out.println();
    }

    public static void leapYear(int num) {
        if (num % 400 == 0) {
            System.out.println(num + " Leap Year");
        } else if (num % 4 == 0 && num % 100 != 0) {
            System.out.println(num + " Leap Year");
        } else {
            System.out.println(num + " is not Leap Year");
        }
        System.out.println();
    }

    public static void primeNumber(int n) {
        int count = 0;

        // negative numbers, 0 and 1 are not prime
        if (n < 2) {
            System.out.println("The given is number " + n + " is not prime");
            System.exit(0);
        }
        // checking the number of divisors b/w [1, n]
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }

        // if count of divisors greater than 2 then its not prime 
        if (count > 2) {
            System.out.println("The given is number " + n + " is not prime"); 
        }else {
            System.out.println("The given is number " + n + " is prime");
        }
    }

    public static boolean primeNumberWithinRange(int n) {

        // negative numbers, 0 and 1 are not prime
        if (n < 2) {
            return false;
        }
        // checking the number of divisors b/w [1, n]
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        //If reached here then must be true
        return true;
    }

    public static void sumOfDigitsOfNumbers(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum is " + sum);
    }

    static void reverseInt(int num) {
        int rev = 0, rem = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("reverse is " + rev);
    }

    static void armStrongNum(int num) {
        int len = 0, sum = 0, temp, digit;
        temp = num;
        len = order(num);
        while (temp != 0) {
            //extract the digit
            digit = temp % 10;
            //Add power to sum
            sum = sum + (int) Math.pow(digit, len);
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is not Armstrong");
        }
    }

    static void armStrongBtwRange(int low, int high) {
        for (int num = low; num < high; num++) {
            int len = 0, sum = 0, temp, digit;
            temp = num;
            len = order(num);
            while (temp != 0) {
                //extract the digit
                digit = temp % 10;
                //Add power to sum
                sum = sum + (int) Math.pow(digit, len);
                temp = temp / 10;
            }
        }
    }

    static int order(int x) {
        int len = 0;
        while (x != 0) {
            len++;
            x = x / 10;
        }
        return len;
    }

    static void fibonacci(int num) {
        int a = 0, b = 1;
        int nextTerm;
        // Here we are printing 0th and 1st terms
        System.out.print(a + " , " + b + " , ");
        for (int i = 2; i < num; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }

    static void fibonacciNthTerm(int num) {
        int a = 0, b = 1;
        int nextTerm = 0;
        // Here we are printing 0th and 1st terms
        System.out.print(a + " , " + b + " , ");
        for (int i = 2; i < num; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println("Nth term Value is " + nextTerm);
    }

    static void fibonacciSum(int num) {
        int a = 0, b = 1;
        int nextTerm = 0, sum = 0;
        // Here we are printing 0th and 1st terms
        //System.out.print (a + " , " + b + " , ");
        for (int i = 2; i < num; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            sum = a + b;
        }
        System.out.println("Value of sum is " + sum);
    }

    static void powerNum(int num1, int power) {
        int val = 1;
        while (power > 0) {//3--25,2--
            val = val * num1;
            power--;
            System.out.println("Val " + val + " power " + power);
        }
        System.out.println("Total power value is " + val);
    }

    static void factor(int num) {
        int temp = 1;
        System.out.print("Factors are ");
        while (temp <= (num / 2)) {
            if (num % temp == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }
    }

    static void replaceZerosOne() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number ");
        int temp = sc.nextInt();
        String str = Integer.toString(temp);
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                str1 = str1 + '1';
            } else {
                str1 = str1 + str.charAt(i);
            }
        }
        System.out.println("New digit is " + str1);
        sc.close();
    }

    static void replace01Range() {
        int num = 0, start = 1, end = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number with len 6-7 ");
        num = sc.nextInt();
        String str = Integer.toString(num);
        String str2 = "";
        if (str.length() < end) {
            System.out.println("Length of string is less compare to end range so please re-enter number");
            num = sc.nextInt();
        }
        for (int i = 0; i < str.length(); i++) {

            if (i >= start && i <= end) {
                if (str.charAt(i) == '0') {
                    str2 = str2 + '1';
                } else {
                    str2 = str2 + str.charAt(i);
                }
            } else {
                str2 = str2 + str.charAt(i);
            }

        }
        System.out.println("New number is " + str2);
    }

    static void letterCountSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word which contains a,b,c,d ");
        String str = sc.nextLine();
        sc.close();
        String str2;

        int countA = 0, countB = 0, countC = 0, countD = 0; //Method 1

        for (char ch : str.toCharArray()) {
            switch (ch) {
                case 'a':
                    countA++; //counts[0]++
                    break;
                case 'b':
                    countB++; //counts[1]++
                    break;
                case 'c':
                    countC++; //counts[2]++
                    break;
                case 'd':
                    countD++; //counts[3]++
                    break;
            }
        }

        StringBuilder outputBuilder = new StringBuilder();

        //Method 1:- Create a TreeMap to store and automatically sort by keys (lexicographical order)
        TreeMap<Character, Integer> countMap = new TreeMap<>();
        countMap.put('a', countA);
        countMap.put('b', countB);
        countMap.put('c', countC);
        countMap.put('d', countD);

        //Method 1:- Append each letter & its count to the stringBuilder
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            outputBuilder.append(entry.getKey()).append(entry.getValue());
        }

        int[] counts = new int[4]; //Method 2

        // Method 2:- Append each letter & its count to the stringBuilder
        for (int i = 0; i < counts.length; i++) {
            char letter = (char) ('a' + i);  //convert index to corresponding letter i.e 'a'=97 in ASCII
            if (counts[i] > 0) {
                outputBuilder.append(letter).append(counts[i]);
            }
        }

        // Convert StringBuilder to single string 
        String output = outputBuilder.toString();

        System.out.println("Output: " + output);

    }

    public static void isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int count = 0;
        for (int i = 0; i < cleanString.length() / 2; i++) {
            if (cleanString.charAt(i) != cleanString.charAt(cleanString.length() - 1 - i)) {
                System.out.println("String is not palindrome");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("String is palindrome");
        }
    }

    static void anagram(String str1, String str2) {
        String st1 = str1.toLowerCase();
        String st2 = str2.toLowerCase();

        if (st1.length() == st2.length()) {
            char[] char1 = st1.toCharArray();
            char[] char2 = st2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            Boolean result = Arrays.equals(char1, char2);
            if (result) {
                System.out.println("It is Anagram");
            } else {
                System.out.println("It's not anagram");
            }
        } else {
            System.out.println("String is not anagram");
        }

    }

    static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static void removeConsecutiveChars(String str){
        
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current=str.charAt(i);
            if (i==0|| current!=str.charAt(i-1)) {
                sb.append(current);
            }
        }
        System.out.println("Original string is "+str);
        System.out.println("Final string is "+sb.toString());
    }

    public static void main(String[] args) {
        //System.out.println("Viraj");
        //int year=1241;
        int start = 1, end = 15;
        int low = 3, high = 1000;
        int armNum = 407;//371,407
        int num = 10560781;
        int factors = 12;
        String str = "A mano, a plan, a canal: Panama";

        /*  for (int i = start; i <=end; i++) {
            primeNumberWithinRange(i);     
        } */
        removeConsecutiveChars("aabaa");
        //isValidParentheses("([{}])");
        //anagram("rat", "tar");
        //isPalindrome(str);
        //letterCountSort();
        //replace01Range();
        //replaceZerosOne();
        //factor(factors);
        //powerNum(num, low);
        //fibonacciSum(num);
        //fibonacciNthTerm(num);
        //fibonacci(num);
        //armStrongBtwRange(low,high);
        //armStrongNum(armNum);
        //reverseInt(num);
        //sumOfDigitsOfNumbers(num);
        //primeNumber(num);
        //leapYear(year);
        //greatestOfTwo(num1, num2);
        //numbersInRange(num1, num2);
        //firstNnaturalNumbers(num);
        //evenOdd(num);
        //posNeg(num);
        /*
         
1. Boundary Replacement:
Devise an algorithm that replaces all 0's with 1's in a given integer, 
but only if the 0 is at the beginning or end of the number. 
For example, if the input is 20045, the output should be 10045.

2. Even-Odd Replacement:
Write a function that replaces all 0's with 1's in a given integer if the integer is even,
and all 1's with 0's if the integer is odd. For instance, if the input is 2406 (even), 
the output should be 2416, and if the input is 35107 (odd), the output should be 35007.

3. Segmented Replacement:
Create a program that replaces all 0's with 1's in every alternate segment of 0's in a given integer.
For example, if the input is 100200300, the output should be 110200310.

4. Replacement in a Range:
Write a function that takes two integers as input: a number and a range. 
The function should replace all 0's with 1's in the number but only within the specified range (inclusive).
For example, if the input is (1020304050, 3, 7), the output should be 1021314050.

5. Replacement with Validation:
Design a program that replaces all 0's with 1's in a given integer and then checks if the new number is a prime number. 
For example, if the input is 1010, after replacement, it becomes 1111, 
and the program should verify if 1111 is prime.

6. Replacement and Summation:
Suppose you have an integer where you need to replace all 0's with 1's and then calculate 
the sum of all digits. For example, if the input is 203040, after replacement,
the output should be 214141, and the sum of digits would be 13.

7. Replacement in a Mathematical Expression:
Program that takes a mathematical expression as input, replaces all 0's with 1's in the numbers within the expression,
and then evaluates the expression. For example, if the input is "20 + 300/15", after replacement, 
it should evaluate "21 + 311/15"

         */
    }
}
