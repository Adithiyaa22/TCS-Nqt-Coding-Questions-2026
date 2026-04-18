/*
📌 Question: Happy-Sad State Simulation
Give class name as "MyClass"
You are given an integer N representing the number of people initially in a happy state.

In each iteration, the following transitions happen:
- 70% of happy people become sad
- 30% of happy people remain happy
- 50% of sad people remain sad
- 50% of sad people become happy

⚙️ Task:
Simulate the process for 4 iterations and compute the final counts.

📥 Input:
- A single integer N (initial number of happy people)

📤 Output:
- Print two integers:
  1. Final number of happy people
  2. Final number of sad people

🔄 Initial State:
- Happy = N
- Sad = 0

⚠️ Note:
- Use double for calculations if needed, then convert to integer (as per problem requirement)

🧪 Example:

Input:
100

Output:
41 58   (or rounded as per requirement)
*/

import java.util.*;
public class MyClass{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int happy = sc.nextInt();
    int sad = 0;
    int new_sad = 0, new_happy = 0;
    for(int i=1;i<=4;i++)
      {
         new_sad = 0.7*happy + 0.5*sad;
        new_happy = 0.3*happy + 0.5*happy;
      }
    System.out.println(new_happy+" "+new_sad);
  }
}
