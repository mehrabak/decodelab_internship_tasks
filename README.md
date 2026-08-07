DecodeLabs Java Internship Projects
This repository contains Object-Oriented Java implementations for Project 1 and Project 2 of the DecodeLabs Industrial Training Program.
# Project 1: Number Guessing Game (OOP Version)

A crash-proof, Object-Oriented Java number guessing game built as part of the DecodeLabs Industrial Training Program.The application generates a stochastic number within a specified range, provides real-time user feedback, tracks attempt limits using optimal search strategies, and maintains session persistence across multiple rounds

## 📌 Project Overview
* **Objective:** Bridge basic human intuition with machine randomness through control flow and state management.
* **Architecture:** Object-Oriented Programming (OOP) separating game state, input processing, and execution control[span_3](start_span)[span_3](end_span).
* **Range:** 1 to 100 inclusive[span_4](start_span)[span_4](end_span).
* **Attempt Limit:** 7 attempts per round based on binary search efficiency[span_5](start_span)[span_5](end_span).

---

## ✨ Key Features
* **Stochastic Generation:** Utilizes `java.util.Random` for 1-indexed number generation ($1 \le x \le 100$)[span_6](start_span)[span_6](end_span).
* **Defensive Engineering:** Catches `InputMismatchException` using `try-catch` blocks to prevent program crashes on invalid input (e.g., typing letters instead of numbers)[span_7](start_span)[span_7](end_span).
* **Buffer Management:** Prevents the "Scanner Trap" by flushing the input buffer (`scanner.nextLine()`) after integer reads[span_8](start_span)[span_8](end_span).
* **Multi-Round Persistence:** Supports replaying multiple sessions with continuous score tracking[span_9](start_span)[span_9](end_span).
* **Attempt Tracking:** Monitors remaining guesses per round and enforces win/loss conditions[span_10](start_span)[span_10](end_span).

---

## 🏗️ Class Architecture


src/
├── GameEngine.java       # Encapsulates secret number, attempts logic, and guess evaluation
├── InputHandler.java     # Manages console input, validation, and scanner buffer clearing
└── DecodeLabs_Java_P1.java # Main entry point orchestrating game rounds and statistics

| Class | Responsibility | Key Methods |
| :--- | :--- | :--- |
| `GameEngine` | Game rules, state tracking, logic evaluation | `evaluateGuess(int)`, `isOutofAttempts()` |
| `InputHandler` | User input capture, range check, error handling | `getValidGuess(int)`, `askToPlayAgain()` |
| `DecodeLabs_Java_P1` | Application lifecycle, score accumulation | `main(String[] args)` |

---

## 🛠️ Technical Concepts Demonstrated
* **Encapsulation:** Private state variables protected by getters and internal processing logic.
* **Separation of Concerns:** Division of I/O handling, computational rules, and execution context.
* **Control Flow:** `while` and `do-while` loops paired with `if-else` decision structures[span_11](start_span)[span_11](end_span).
* **Exception Handling:** Graceful recovery from runtime input mismatches[span_12](start_span)[span_12](end_span).

---

## 🚀 How to Run

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed.

### Execution Steps
1. Clone the repository:
   ```bash
   git clone [https://github.com/your-username/decodelabs-java-projects.git](https://github.com/your-username/decodelabs-java-projects.git)
   cd decodelab_internship_tasks/Number_Guessing_Game

 * Compile the Java source files:
   javac  Main.java GameEngine.java InputHandler.java

 * Run the main class:
   java  Main

💻 Sample Output
==================================================
   WELCOME TO THE DECODELABS NUMBER GAME (OOP)    
==================================================

--- ROUND 1 ---
Enter your guess (1-100) [7 attempts left]: 50
📉 Too High!

Enter your guess (1-100) [6 attempts left]: 25
📈 Too Low!

Enter your guess (1-100) [5 attempts left]: 37
🎯 BULLSEYE! You guessed the correct number: 37

Would you like to play another round? (Y/N): N

==================================================
Total Rounds: 1 | Rounds Won: 1
==================================================


---

```markdown
# Project 2: Student Grade Calculator (OOP Version)

A deterministic, enterprise-style Java data processor built for Project 2 of the DecodeLabs Industrial Training Program[span_13](start_span)[span_13](end_span). The application takes mark inputs for multiple academic subjects, enforces boundary constraints ($0 \le x \le 100$), calculates total and average scores with double-precision floating-point accuracy, and assigns academic grades based on a decision ladder[span_14](start_span)[span_14](end_span).

## 📌 Project Overview
* **Objective:** Replace manual grading decisions with explainable, deterministic software logic[span_15](start_span)[span_15](end_span).
* **Architecture:** Input-Process-Output (IPO) design pattern split across modular Java classes[span_16](start_span)[span_16](end_span).
* **Mark Constraints:** Validates each mark between 0 and 100[span_17](start_span)[span_17](end_span).
* **Formatting:** Displays average percentage rounded cleanly to two decimal places[span_18](start_span)[span_18](end_span).

---

## ✨ Key Features
* **Dynamic Subject Input:** Supports processing any number of subjects specified at runtime[span_19](start_span)[span_19](end_span).
* **Mathematical Precision:** Uses explicit type casting to prevent integer truncation errors when calculating averages[span_20](start_span)[span_20](end_span).
* **Defensive Boundary Checking:** Rejects inputs out of range ($< 0$ or $> 100$) and re-prompts without crashing[span_21](start_span)[span_21](end_span).
* **Logic Ladder Grading:** Categorizes average percentages into standard academic tiers (`A+`, `A`, `B`, `C`, `D`, `F`)[span_22](start_span)[span_22](end_span).
* **Status Determination:** Automatically displays an overall `PASSED` or `FAILED` result based on grade criteria[span_23](start_span)[span_23](end_span).

---

## 🛠️ Grade Allocation Scale

| Percentage Range | Grade | Status |
| :--- | :---: | :---: |
| $\ge 90\%$ | **A+** | PASSED |
| $80\% - 89.99\%$ | **A** | PASSED |
| $70\% - 79.99\%$ | **B** | PASSED |
| $60\% - 69.99\%$ | **C** | PASSED |
| $50\% - 59.99\%$ | **D** | PASSED |
| $< 50\%$ | **F** | FAILED |

---

## 🏗️ Class Architecture


src/
├── GradeCalculator.java   # Data accumulation, percentage math, and grade classification
├── InputHandler.java      # Input acquisition, type safety, and range validation
└── Main.java # Main controller executing the IPO workflow

| Class | Responsibility | Key Methods |
| :--- | :--- | :--- |
| `GradeCalculator` | Mark storage, total computation, percentage math, grade lookup | `calculateTotal()`, `calculateAveragePercentage()`, `assignGrade(double)` |
| `InputHandler` | Safe numerical input collection and validation | `getPositiveInt(String)`, `getValidMark(int)` |
| ` Main` | Workflow execution and report output | `main(String[] args)` |

---

## 🚀 How to Run

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed.

### Execution Steps
1. Navigate to the project directory:
   ```bash
   cd decodelab_internship_tasks/Student_Grading_System

 * Compile the Java source files:
   javac Main.java GradeCalculator.java InputHandler.java

 * Run the main program:
   java Main

💻 Sample Output
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


