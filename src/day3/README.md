# Day 3 - Binary Diagnostic
## Task 1
The submarine has been making some odd creaking noises, so you ask it to produce a diagnostic report just in case. <br>
The diagnostic report (your puzzle input) consists a list of binary numbers which, when decoded properly, can tell you
many useful things about the conditions of the submarine. The first parameter to check is the power consumption. <br>
You need to use the binary numbers (called the **gamma rate** and the **epsilon rate**). The power consumption can then
be found by multiplying the gamma rate by the epsilon rate. <br>
Each bit in the gamma rate can be determined by finding the **most common bit in the corresponding position** of all
numbers in the diagnostic report. For example, given the following diagnostic report: <br>
> 00100 <br>
> 11110 <br>
> 10110 <br>
> 10111 <br>
> 10101 <br>
> 01111 <br>
> 00111 <br>
> 11100 <br>
> 10000 <br>
> 11001 <br>
> 00010 <br>
> 01010 <br>

Considering only the first bit of each number, there are five 0 bits and seven 1 bits. Since the most common bit is 1,
the first bit of the gamma rate is 1. <br>
The most common second bit of the numbers in the diagnostic report is 0, so the second bit of the gamma rate is 0. <br>
The most common value of the third, fourth and fifth bits are 1, 1, and 0, respectively, and so the final three bits of 
the gamma rate are 110. <br>
So the gamma rate is the binary number 10110, or 22 in decimal. <br>
The epsilon rate is calculated in a similar way; rather than use the most common bit, the least common bit from each
position is used. So, the epsilon rate is 01001, or 9 in decimal. Multiplying the gamma rate (22) by the epsilon rate 
(9) produces the power consumption, 198. <br>
Use the binary numbers in your diagnostic report to calculate the gamma rate and the epsilon rate, then multiply them
together. **What is the power consumption of the submarine?** (Be sure to represent you answer in decimal, not binary.) 
<br>

[source](https://adventofcode.com/2021/day/3)