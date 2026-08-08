# DecodeLabs Java Internship Projects

This repository contains two Object-Oriented Java projects completed for the DecodeLabs internship tasks: a Number Guessing Game and a Student Grade Calculator. Each project is contained in its own directory with a small set of Java classes.

---

## Project layout

- Number_Guessing_game/
  - Main.java          — entry point for the number guessing game
  - GameEngine.java    — game logic (target number, attempts, evaluation)
  - InputHandler.java  — console input validation and buffer handling

- Student_Grading_System/
  - Main.java          — entry point for the grade calculator
  - GradeCalculator.java — stores marks and computes totals/grades
  - InputHandler.java    — input collection and validation for marks

---

## Project 1 — Number Guessing Game

A simple, defensive, object-oriented number guessing game. The `GameEngine` generates a secret number in the range 1..MAX_NUM and tracks remaining attempts. `InputHandler` validates integer input and prevents scanner buffer issues.

Key details
- Configurable constants in `Number_Guessing_game/Main.java`:
  - MAX_NUM (default 100)
  - MAX_ATTEMPT (default 7)
- Game flow: the player guesses until they find the secret number or run out of attempts.
- Input is validated to ensure it is an integer and within 1..MAX_NUM.

How to run

```bash
cd Number_Guessing_game
javac Main.java GameEngine.java InputHandler.java
java Main
```

Sample session

```
===============================================

WELCOME TO THE DECODELABS NUMBER GUESSING GAME 

===============================================

          ---- Round 1 ----
Enter your guess (1-100) [7 Attempts left]: 50
 Too High
Enter your guess (1-100) [6 Attempts left]: 25
Too Low
Enter your guess (1-100) [5 Attempts left]: 37
You guessed it in 3 attempts!

Final Score  : Total Rounds = 1 
Won = 1
```

Notes
- The game currently uses `java.util.Random` to pick the target number.
- `GameEngine` exposes `getMaxNum()` and `getAttemptsLeft()` so the input handler and UI stay decoupled from internal state.

---

## Project 2 — Student Grading System

A small grade calculator that accepts marks for N subjects, calculates total and average percentage, assigns a grade and shows pass/fail status.

Key details
- Marks are collected as doubles and validated to be between 0 and 100.
- `GradeCalculator` handles total and average computation and grade assignment:
  - A+ : >= 90
  - A  : 80 - 89.99
  - B  : 70 - 79.99
  - C  : 60 - 69.99
  - D  : 50 - 59.99
  - F  : < 50

How to run

```bash
cd Student_Grading_System
javac Main.java GradeCalculator.java InputHandler.java
java Main
```

Sample session

```
==================================================
   STUDENT GRADE CALCULATOR | DECODELABS P2       
==================================================
Enter total number of subjects: 3

--------------------------------------------------
Enter marks for Subject 1 (0 - 100): 88.5
Enter marks for Subject 2 (0 - 100): 92
Enter marks for Subject 3 (0 - 100): 79.5

==================================================
                ACADEMIC REPORT CARD              
==================================================
Total Subjects Processed : 3
Total Marks Obtained     : 260.0 / 300.0
Average Percentage       : 86.67%
Assigned Grade           : A
Final Status             : PASSED
==================================================
```

---

Contributing
- If you make changes to class names or public APIs, update the README to keep the instructions in sync.
- Pull requests and issues are welcome.

---

If you'd like, I can also:
- Add small shell scripts to compile/run each project (e.g., run_p1.sh / run_p2.sh), or
- Add a CI job to compile the Java files on every push.
