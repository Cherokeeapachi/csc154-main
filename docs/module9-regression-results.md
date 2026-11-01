\# Module 9 — Regression Test Results



\## Issue

Issue #22 — Regression Testing and Documentation



\## Test Environment

\- Operating System: Windows

\- Terminal: Windows PowerShell

\- Programming Language: Java

\- Branch: `issue-22-regression-results`

\- Commit Tested: `633ef22`



\## Test 1 — Compilation



\*\*Status:\*\* FAIL



\*\*Command:\*\*

`javac -d out (Get-ChildItem .\\src\\\*.java).FullName`



\*\*Expected Result:\*\*

The Java source files compile successfully without errors.



\*\*Actual Result:\*\*

Compilation failed. The compiler reported errors in `src/Main.java` at lines 7, 8, and 9 because import statements appeared in an invalid location.



\*\*Related Issue:\*\*

Issue #21 — Compilation Fix



\## Test 2 — Application Launch



\*\*Status:\*\* BLOCKED



\*\*Expected Result:\*\*

The Task Tracker launches and displays the main menu.



\*\*Actual Result:\*\*

A fresh build could not be completed because of compilation errors. Running previously compiled files would not verify the current source code.



\## Test 3 — Add Task



\*\*Status:\*\* BLOCKED



Unable to verify task creation against the tested commit because compilation failed.



\## Test 4 — View Tasks



\*\*Status:\*\* BLOCKED



Unable to verify task listing against the tested commit because compilation failed.



\## Test 5 — Complete Task



\*\*Status:\*\* BLOCKED



Unable to verify task completion against the tested commit because compilation failed.



\## Regression Checks



1\. Attempted compilation of all Java source files. Compilation failed.

2\. Checked the source directory and confirmed that `Main.java` and `Task.java` are present.



\## Risks and Notes



The compilation failure prevents verification of the Task Tracker's core functionality. Once the compilation issue is resolved, the regression checklist should be rerun against the updated commit.



\## Documentation



The regression results document records the commands used, the compilation failure, and the resulting blocked tests.

