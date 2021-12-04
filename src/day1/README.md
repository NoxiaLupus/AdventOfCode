# Day 1 - Sonar Sweep
## Task 1
You're minding your own business on a ship at sea when the overboard alarm goes off! You rush to see if you can help.
Apparently, one of the Elves tripped and accidentally sent the sleigh keys flying into the ocean! <br/>
Before you know it, you're inside a submarine the Elves keep ready for situations like this. It's covered in Christmas
lights (because of course it is), and it even has an experimental antenna that should be able to track the keys if you
can boost its signal strength high enough; there's a little meter that indicates the antenna's signal strength by
displaying 0 - 50 stars. <br/>
Your instincts tell you that in order to save Christmas, you'll need to get all fifty stars by December 25th. <br/>
Collect Stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar; the second
puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck! <br/>
As the submarine drops below the surface on the ocean, it automatically performs a sonar sweep of the nearby sea floor.
On a small screen, the sonar sweep report (your puzzle input) appears: each line is a measurement of the sea floor depth
as the sweep looks further and further away from the submarine. <br/>
For example, suppose you had the following report: <br/>

> 199 <br/>
> 200 <br/>
> 208 <br/>
> 210 <br/>
> 200 <br/>
> 207 <br/>
> 240 <br/>
> 269 <br/>
> 260 <br/>
> 263 <br/>

This report indicates that, scanning outward from the submarine, the sonar sweep found depths of 199, 200, 208, 210, and
so on. <br/>
The first order of business is to figure out how quickly the depth increases, just so you know what you're dealing
with - you never know if the keys will get carried into deeper water by an ocean current or a fish or something.
To do this, **count the number of times a depth measurement increases** from the previous measurement. (There is no
measurement before the first measurement.) <br/>

## Task 2
Considering every single measurement isn't as useful as you expected: <br/>
there's just too much noise in the data.

Instead, consider sums of a **three-measurement sliding window**. Again considering the above example:
> 199 A <br/>
> 200 A B <br/>
> 208 A B C <br/>
> 210 &nbsp;&nbsp;&nbsp; B C D <br/>
> 200 E&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;C D <br/>
> 207 E F &nbsp;&nbsp;&nbsp; D<br>
> 240 E F G<br>
> 269 &nbsp;&nbsp;&nbsp; F G H <br>
> 260 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; G H<br>
> 263 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; H

Start by comparing the first and the second three-measurement windows. The measurements in the first window are marked
A (199, 200, 208); their sum is 199 + 200 + 208 = 607. The second window is marked B (200, 208, 210); it's sum is 618. 
The sum of the measurements in the second window is larger than the sum of the first, so this first comparison 
**increased**. <br>
Your goal now is to count **the number of times the sum of measurements in this sliding window increases** from the 
previous su. So, compare A with B, then compare B with C, then C with D, and so on. Stop, when there aren't enough 
measurements left to ccreate a new three-measurement sum. <br>
In the above example, the sum of each three-measurement window is as follows:
> A: 607 (N/A - no previous sum) <br>
> B: 618 (increased) <br>
> C: 618 (no change) <br>
> D: 617 (decreased) <br>
> E: 647 (increased) <br>
> F: 716 (increased) <br>
> G: 769 (increased) <br>
> H: 792 (increased) <br>

Consider sums of a three-measurement sliding window. How many sums are larger than the previous sum?

[source](https://adventofcode.com/2021/day/1)