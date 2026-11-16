# CSC-154 Software Development

Official course repository for **CSC-154 Software Development — Fall 2026**.

This repository will be used throughout the semester to practice professional software-development workflows with Git and GitHub.

## Course Workflow

As the course progresses, you will use this repository to practice:

- cloning repositories
- creating branches
- making and reviewing commits
- pushing changes to GitHub
- working with Issues and Pull Requests
- reviewing code
- testing and verifying changes
- collaborating on a shared software project

## Important

**Do not commit directly to `main` unless instructed.**  
Create and use your own branch for course work.

Additional workflow requirements will be introduced as we progress through the course.

## Module 3

For Module 3, complete your required change in:

`module-3/pr-practice.md`

Since there are only 2 of us, use any turn order and follow the Pull Request workflow described in Canvas.

## Module 4 — Issue-Driven Workflow

Module 4 introduces GitHub Issues as the starting point for development work.

You will:

1. Create one **Feature** Issue
2. Create one **Bug** or **Task** Issue
3. Add clear acceptance criteria, a label, and an assignee
4. Choose one Issue to complete
5. Create a branch named `issue-<number>-short-name`
6. Open a Pull Request into `main`
7. Reference the Issue in the PR description with `Closes #<number>`, `Fixes #<number>`, or `Resolves #<number>`

For a small documentation change, you may use:

`module-4/issue-practice.md`

Follow the Canvas Module 4 instructions for required evidence and submission links.

# Module 6

# CSC-154 Task Tracker

## Project Summary

The CSC-154 Task Tracker is a simple command-line application that allows users to create and manage tasks. The project will provide the core functions needed to organize tasks while giving the team experience developing a shared Java application through GitHub.

## Technology Choice

**Language/Platform:** Java command-line application (CLI)

**Storage:** Local file-based storage

The team selected Java because it supports object-oriented programming and provides a straightforward way to build and organize the Task Tracker. The MVP will run entirely from the command line and store task information locally without requiring a database or internet connection.

## Milestone 1 — MVP Task Tracker

The first usable version will include:

- Create a new task.
- View the task list.
- Mark a task as complete.
- Edit an existing task.
- Delete a task.
- Each task will include a `title` and `status`.
- Tasks may also include an optional `description`.
- Save and load tasks using local file-based storage.

## Milestone 2 — Improvements

Potential improvements after the MVP is complete include:

- Task priority levels.
- Due dates.
- Tags or categories.
- Search and filtering.
- Sorting tasks by status, priority, or due date.
- Improved persistence or storage options.
- Additional input validation and error handling.

## Out of Scope

The following features are outside the scope of the initial project:

- User accounts or login authentication.
- Advanced user roles or permissions.
- Mobile application development.
- Graphical user interface or web interface.

## Definition of Done

Work is considered complete when:

- Work begins as a clearly defined GitHub Issue with acceptance criteria.
- Development occurs on a separate branch and not directly on `main`.
- The required feature, task, bug fix, or documentation change has been completed.
- The Pull Request includes a **How Tested** section and **Risks/Notes**.
- The work has been tested or otherwise verified.
- A Pull Request has been reviewed before being merged.
- Any requested changes have been addressed.
- The Pull Request has been merged into `main`.
- Relevant documentation has been updated when needed.

## Running the Starter Project

The repository includes a minimal Java starter in the `src/` folder.

To compile:

```bash
javac src/Main.java src/Task.java
```

To run:

```bash
java -cp src Main
```

The starter is intentionally minimal. MVP features should be implemented through the normal course workflow:

**Issue → Branch → Pull Request → Review → Merge**

## Release Candidate Status

Status: NOT READY

The current Task Tracker source does not compile successfully.
The build was tested using:

    javac -d out src/*.java

The compiler reported three errors in src/Main.java.
The file contains two public Main class declarations,
with import statements appearing after the first class.

See Issue #21 for the existing compilation bug.

## Intended Task Tracker Usage

The Task Tracker code contains menu options for:

1. Add task - Enter a nonblank task title.
2. View tasks - Display tasks and their completion status.
3. Complete task - Select a task by its displayed number.
4. Exit - Close the application.

These workflows are currently blocked by the compilation
failure and have not been verified on this branch.

## Release Candidate Verification

Run the following commands from the repository root:

    javac -d out src/*.java
    java -cp out Main

Only attempt to launch the application after compilation
succeeds.

Use docs/regression-checklist.md to verify the following:

- Compilation and application launch.
- Creating and viewing tasks.
- Completing a task and checking its status.
- Handling invalid input without crashing.
- Exiting the application normally.

Record actual Pass, Fail, Blocked, or Not implemented
results in the pull request.

## Known Limitations

- The application currently fails compilation.
- Creating, viewing, and completing tasks cannot be
  verified until the compilation issue is resolved.
- Editing and deleting tasks are not implemented in
  the inspected Main.java code.
- File-based task persistence is not implemented in
  the inspected Main.java code.
- Task search is not present in the inspected code.
  Issue #25 tracks the search improvement.

## Release Notes

- Added release-candidate verification instructions.
- Documented current functionality and known limitations.

