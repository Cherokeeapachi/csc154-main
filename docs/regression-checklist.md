# Regression checklist — Task Tracker

Use this checklist after a change to check that existing features still work. Record actual results in your PR; these boxes are a template, not evidence that tests passed.

For each check, record **Pass**, **Fail**, **Blocked**, or **Not implemented**, plus a short note. Do not report missing features as passing. Link a bug Issue for failures. Record the branch or commit tested.

## Build and launch
- Compile all Java sources from the repository root: `javac -d out src/*.java`.
- Run: `java -cp out Main`.
- Confirm the menu appears and Exit ends normally.
- Check that the README instructions match what you actually ran.

## Core workflows
- Create a task with a valid title; confirm it appears in the list.
- Check title, status, and optional description where implemented.
- View an empty list, then a list with several tasks.
- Mark a task complete and confirm the displayed status changes.
- Edit a task and verify the new details, if implemented.
- Delete a task and verify the remaining list, if implemented.

## Input and edge cases
- Try a blank or whitespace-only title.
- Try an invalid menu choice.
- Try a non-numeric, zero, negative, or out-of-range task number.
- Try long text and special characters.
- Repeat an action and check that task state stays consistent.
- Confirm error messages explain how to recover without a crash.

## Storage
When storage is implemented:
- Save tasks, exit, restart, and confirm they reload.
- Check that title, status, and description are preserved.
- Check missing and empty storage files.
- Use a disposable copy of test data to check malformed data handling; do not overwrite valuable data.

## PR evidence
- Describe 3–5 specific verification steps and their actual results.
- List 1–2 regression checks beyond the change itself.
- Link any failures or missing features to Issues.
- For documentation-only changes, check commands, links, and whether a classmate can follow the instructions.
- Request your classmate's review before merging.
## Module 14 - Additional AI-Assisted Regression Checks

The following tests were initially drafted using GitHub Copilot and reviewed against the Task Tracker Java source code. These are test procedures, not claims that the tests have been executed.

### 1. Status Capitalization

- **Steps:** Create one task with status `pEnDiNg` and another with status `cOmPlEtEd`. View the task list.
- **Expected:** Both tasks are created, and their statuses display as `Pending` and `Completed`.
- **Result:** Not yet executed.

### 2. Invalid Status Rejection

- **Steps:** Attempt to create a task with status `In Progress`, then view the task list.
- **Expected:** The application displays `Invalid status. Task not created.` The rejected task does not appear.
- **Result:** Not yet executed.

### 3. Optional Description Handling

- **Steps:** Create a task with spaces before and after its description. Create another task with a blank description. View the task list.
- **Expected:** Extra spaces are removed from the first description. The second task displays without an additional description line.
- **Result:** Not yet executed.

### 4. Correct Task Number Selection

- **Steps:** Create three tasks with different titles and Pending status. Complete task number 2, then view the task list.
- **Expected:** Tasks remain in their original order. Only task number 2 changes to Completed.
- **Result:** Not yet executed.

### 5. Duplicate Task Completion

- **Steps:** Create a task with Pending status. Complete it, then attempt to complete the same task again.
- **Expected:** The first attempt displays `Task completed.` The second should display `Task is already completed.` The task remains Completed.
- **Known Issue:** [Issue #36](https://github.com/jevanoff-spcc/csc154-main/issues/36) documents the incorrect repeat-success message. The fix must be merged and verified before this test can be marked Pass on `main`.
- **Result:** Expected to fail on the inspected `main` version; corrected behavior was verified previously on the separate Issue #36 development branch.

### 6. Recovery After Invalid Input

- **Steps:** Create a valid task. Attempt to complete a task using a non-numeric task number such as `abc`. Then view the list and complete the task using its correct number.
- **Expected:** The application displays `Please enter a valid number.`, returns to the menu, preserves the task, and allows successful completion afterward.
- **Result:** Not yet executed.

### AI Verification Notes

GitHub Copilot drafted the initial six test scenarios. The suggestions were reviewed against `src/Main.java`, `src/Task.java`, and the existing regression checklist.

The duplicate-completion test was revised because Copilot described the original buggy behavior as the expected result. The revised check references Issue #36 and identifies the corrected behavior.

These additional checks are intended to improve future release testing. Results must be recorded when each check is executed.