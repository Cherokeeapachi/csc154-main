# Module 13 - Release Candidate Verification Report

## Release Status

**Status: PARTIAL - Core workflows pass, but release requirements remain incomplete.**

Tested branch: `m13-rc-testing`  
Base commit: `3987d15` from `upstream/main`

## Build and Launch

- **PASS:** Compiled Java sources using `javac -d out src/*.java`.
- **PASS:** Launched Task Tracker using `java -cp out Main`.
- **PASS:** Application displayed the menu and exited normally.

## Regression Verification

The following checks were completed using `docs/regression-checklist.md`:

1. **PASS - Empty Task List:** Selected option 2 and confirmed the application displayed "No tasks yet."
2. **PASS - Task Creation:** Created a task titled "Module 13 RC Test" with a description and Pending status.
3. **PASS - Task Viewing:** Selected option 2 and confirmed the task title, description, and Pending status displayed correctly.
4. **PASS - Task Completion:** Selected option 3, entered task number 1, and confirmed the application displayed "Task completed."
5. **PASS - Invalid Menu Input:** Entered option 9 and confirmed the application displayed "Invalid option. Try again." without crashing.
6. **PASS - Normal Exit:** Selected option 4 and confirmed the application displayed "Goodbye!" and exited normally.

## Documentation Status

**README Status: PARTIAL**

The current README includes project information and basic Java compilation instructions. However, it still describes the application as a minimal starter project and does not fully document the current Task Tracker functionality or release-candidate limitations.

The README should be updated to reflect the implemented functionality and known limitations before final release.

## Known Issues and Limitations

- **Issue #36:** Completing an already-completed task displays a misleading success message on the tested version of `main`. A fix was developed separately for this issue.
- **Issue #25:** Task title search is not available in the tested version.
- Editing and deleting tasks are not currently available in the application menu.
- Tasks are stored in memory and are not saved after exiting the application.
- Additional input validation and edge-case testing remain incomplete.
- Full release readiness cannot be confirmed until outstanding defects and documentation gaps are addressed.

## Release Freeze Confirmation

This work is limited to release-candidate documentation, verification, and quality assessment.

No new application features or functionality changes are included. The work follows the Module 13 feature-freeze requirements.

## Final Release Candidate Assessment

The Task Tracker successfully compiled, launched, and passed the core regression checks performed during Module 13 testing.

The application supports creating, viewing, and completing tasks, as well as handling invalid menu choices and exiting normally.

However, the release candidate remains **PARTIAL** because some functionality is incomplete, certain issues remain unresolved in the tested version, and the README requires additional documentation.

**Recommendation:** Continue stabilization and documentation work before considering the application fully release-ready.
