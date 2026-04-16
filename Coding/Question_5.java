/*
📌 Question: Gym Membership Cost

 write class name "MyClass"
 
A gym offers membership plans based on the number of months enrolled. 
Write a program to calculate the total membership cost.

📥 Input:
- An integer representing number of months

📤 Output:
- Print the total membership cost based on pricing rules
- Print "Error" for invalid month values
- Print "invalid input" if input < 0

💰 Pricing Rules:
1 month      → ₹2000
2 or 3 months → ₹5000
4 to 6 months → ₹9000
9 months     → ₹12000
12 months    → ₹15000
Any other value → "Error"

⚠️ Edge Cases:
- If input < 0 → "invalid input"
- If input = 0 → 0

🧪 Example:

Input:
3
Output:
5000

Input:
-2
Output:
invalid input

Input:
7
Output:
Error
*/
import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int months = sc.nextInt();
        String res = "";
        
        if(months<0) res = "Invalid input";
        else if(months == 0) res = "0";
        else if(months == 1) res = "2000";
        else if(months>=2 && months<=3) res = "5000";
        else if(months>=4 && months<=6) res = "9000";
        else if(months==9) res = "12000";
        else if(months==12) res = "15000";
        else res = "Error";
        
        System.out.print(res);
    }
}
