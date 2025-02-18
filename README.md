# Unexpected Loop Termination in Java

This repository demonstrates a potential issue with loop termination in Java. The `BuggyLoop.java` file contains a `while` loop that might not execute as expected under certain conditions. This issue can lead to unexpected program behavior if there is any code that depends on the loop always completing a specific number of iterations. The `FixedLoop.java` file shows the corrected version.

## Problem
The original loop uses a `break` statement to exit prematurely under a specific condition. However, this can lead to unpredictable behavior in the program's execution path if not properly handled. 

## Solution
The solution demonstrates a more robust way to control the loop's iterations and avoid unexpected terminations. 

## How to run
1. Clone the repository to your local machine.
2. Compile the Java files: `javac BuggyLoop.java FixedLoop.java`
3. Run the compiled files: `java BuggyLoop` and `java FixedLoop`