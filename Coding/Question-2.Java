/*
📌 Question: Discount Calculator (Easy)

you were asked to define Class as "MyClass" for Java

Given a purchase amount, calculate the final payable amount after applying the appropriate discount.

📥 Input:
A single integer representing the purchase amount.

📤 Output:
Print the final amount after applying the discount, rounded to 2 decimal places.

💡 Discount Rules:
- If amount < 1000 → 5% discount
- If 1000 ≤ amount < 5000 → 10% discount
- If amount ≥ 5000 → 15% discount

🧪 Test Cases:

Test Case 1:
Input: 800
Output: 760.00

Test Case 2:
Input: 3000
Output: 2700.00

Test Case 3:
Input: 6000
Output: 5100.00
*/


//Solution
import java.util.*;
Public class MyClass
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int amount = sc.nextInt();
float fprice = 0;

if(amount<1000) fprice = amount * 0.05 - amount;
else if(amount>=1000 && amount<5000) fprice = amount * 0.1 - amount;
else fprice = amount * 0.15 - amount;

System.out.printf("%.2f",fprice);

}
}
