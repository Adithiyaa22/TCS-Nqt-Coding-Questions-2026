/*
📌 Question: Convert Speed to km/h

Write class as Myclass
You are given:

- Distance in meters (m)
- Time in seconds (s)

Convert the speed into kilometers per hour (km/h).

📥 Input:
- Distance (in meters)
- Time (in seconds)

📤 Output:
- Speed in km/h

💡 Concept:
Speed = Distance / Time

Unit Conversion:
1 meter = 0.001 kilometers
1 second = 1 / 3600 hours

So,
Speed (km/h) = (distance / time) × 3.6

⚠️ Edge Cases:
- If time = 0 → avoid division by zero (print "invalid input")
- If distance < 0 or time < 0 → "invalid input"

🧪 Example:

Input:
distance = 1000
time = 100

Output:
36.0
*/

import java.util.*;

class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int time  = sc.nextInt();
        int distance = sc.nextInt();
        if(time==0) System.out.println("invalid input");
        else if (distance < 0 || time<0) System.out.println("invalid input");
        else {
            double speed = (distance/time) * 3.6;
            System.out.println(speed);
        }
    }
}
