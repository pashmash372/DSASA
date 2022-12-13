package com.scaler.dsa.homework;

public class ColorofthelastballII {
}
/*Q2. Color of the last ball II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
You have 20 blue balls and 13 red balls in a bag. You put your hand in and remove two at a time.

If they’re of the same color, you add a blue ball to the bag.
If they’re of different colors, you add a red ball to the bag.
Assume you have an enormous supply of blue & red balls for this purpose.

Note: When you take the two balls out, you don’t put them back in, so the number of balls in the bag keeps decreasing.

What will be the color of the last ball left in the bag?*/

/*There are three possible cases of removing the two balls.
a) If we take off 1 RED and 1 BLUE, we actually will take off 1 BLUE.
b)If we take off 2 RED, we actually will take off 2 RED (and add 1 BLUE).
c) If we take off 2 BLUE, we actually will take off 1 BLUE.
So In case of (a) or (c), we are only removing one blue ball, but we always take off red balls two by two.

Now as the no. of red balls is odd, there will be one single red ball in the bag with other blue balls, and whenever we remove 1 red and 1 blue ball, we end up taking off only the blue ball. So the red ball will be the last ball in the bag.*/


/*red*/