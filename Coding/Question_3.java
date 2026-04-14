/*
📌 Question: Parking Fee Calculation

Calculate the total parking fee based on the number of hours parked.

📥 Input:
A single input representing the number of hours.
(Note: Input can be invalid if it is not an integer.)

📤 Output:
Print the total parking fee.
If the input is invalid (non-integer), print "ERROR".

💡 Rules:
- First 2 hours → ₹100 per hour
- Next 3 hours → ₹50 per hour
- Beyond 5 hours → ₹20 per hour

🧪 Test Cases:

Test Case 1:
Input: 2
Output: 200

Test Case 2:
Input: 6
Output: 370

Test Case 3:
Input: SIX
Output: ERROR
*/

import java.util.*;
public class Myclass
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int hours = sc.nextInt();
      int fee = 0;
      if(hours instanceof String)
      {
        System.out.println("ERROR");
      }
      else
      {
        for(int i=1;i<=n;i++)
          {
            if(hours<=2) fee += i*100;
            else if(hours>2 && hours<=5) fee += i*50;
            else fee += i*20;
          }
        System.out.println(fee);
    }
  }
