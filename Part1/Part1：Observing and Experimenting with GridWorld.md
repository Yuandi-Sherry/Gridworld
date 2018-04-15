# Part1：Observing and Experimenting with GridWorld

## Step1：Running the Demo

1. **Does the bug always move to a new location? Explain.**

   ​	No. Initially, the bug will go to empty cell which can be regarded as a new location. However, after its track constructing a cycle, if there isn't new-added rock, it will repeat previous track endlessly.

2. **In which direction does the bug move?**

   ​	It moves to the first empty cell that it is towards in its clockwise rotation.

3. **What does the bug do if it does not move?**

   ​	It rotates clockwise for 45°.

4. **What does a bug leave behind when it moves?**

   ​	A flower whose color is the same as the bug.

5. **What happens when the bug is at an edge of the grid? (Consider whether the bug is facing the edge as well as whether the bug is facing some other direction when answering this question.)**

   ​	When the bug is facing the edge of grid, the `canMove()` method will return `false`, and the bug will rotate clockwise for 45° until it doesn't face a edge any more (and the `canMove()` method will return `true`).

   ​	When the bug is facing some other direction, the if it isn't towards a stone, it will move towards and a flower whose color is the same as the bug's will appear in the cell where the bug stayed last step. 

6. **What happens when a bug has a rock in the location immediately in front of it?**

   ​	The bug will turn 45° clockwise.

7. **Does a flower move?**

   ​	No.

8. **What behavior does a flower have?**

   ​	The flower will get darker as the bug moves until its color becomes [r=0, g=0, b=0]. 

9. **Does a rock move or have any other behavior?**

   ​	No. 

10. **Can more than one actor (bug, flower, rock) be in the same location in the grid at the same time?**

   ​	No.

## Step2：Exploring Actor State and Behavior

1. Test the `setDirection` method with the following inputs and complete the table, giving the compass direction each input represents.

   | Degrees | Compass Direction |
   | ------- | ----------------- |
   | 0       | North             |
   | 45      | Northeast         |
   | 90      | East              |
   | 135     | Southeast         |
   | 180     | South             |
   | 225     | Southwest         |
   | 270     | West              |
   | 315     | Northwest         |
   | 360     | North             |

2. **Move a bug to a different location using the `moveTo` method. In which directions can you move it? How far can you move it? What happens if you try to move the bug outside the grid?**

   ​	The current direction of the bug does not matter when the `moveTo` method is used, and it will not changed unless the `setDirection` method is used. 

   ​	The original location and the target location decides how far the bug can be moved. 

   ​	If moving the bug outside the grid is tried, the program will throw an exception called `IllegalArgumentException`, which is shown as follow.

   ![2moveToException](C:\Users\Sherry\Documents\Curriculums\GridWorld\Stage1\BugRunner简答题截图\2moveToException.png)

3. **Change the color of a bug, a flower, and a rock. Which method did you use?**

   ​	The `setColor` method.

4. **Move a rock on top of a bug and then move the rock again. What happened to the bug?**

   ​	When a rock is moved to be on top of a bug, the bug in the cell will be replaced by the rock. And when the rock is moved again, the cell where it is in the last step will become empty, and the previous bug disappeared in the grid. 