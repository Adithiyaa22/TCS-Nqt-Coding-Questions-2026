/*
📌 Question: Balloon Capacity (Greedy)
Write Class name as "MyClass"
Given the weights of people and the maximum weight capacity, find the maximum number of people that can fit without exceeding the capacity.

📥 Input:
- An array of integers representing weights of people
- An integer representing the maximum allowed weight
 
📤 Output:
Print the maximum number of people that can fit within the given capacity.

💡 Approach Hint:
Use a greedy strategy — consider selecting people in a way that maximizes count without exceeding the total capacity.

🧪 Test Cases:

Test Case 1:
Input:
weights = [20, 30, 40, 50]
maxWeight = 100
Output:
3

Test Case 2:
Input:
weights = [60, 70, 80]
maxWeight = 100
Output:
1
*/

import java.util.*;
public class MyClass{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] weights = new int[n];
    int maxWeight = sc.nextInt();
    
    for(int i=0;i<n;i++)
      {
        weights[i] = sc.nextInt();
      }

    int count = 0;
    int value = 0;
    for(int i=0;i<n;i++){
      value += weights[i];
      if(value<=100) count++;
    }
    System.out.println(count);
    
  }
}
