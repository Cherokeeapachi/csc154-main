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
