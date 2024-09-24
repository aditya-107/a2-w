[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/R_7cjhEg)
# A2-PersistUI

# Project Name: Dice Game

## Author Information
- **Name**: Aditya Nair, Kshitij Vispute
- **BITS ID**: 2021B2A72364G, 2022A7PS0372G
- **Email**: f20212364@goa.bits-pilani.ac.in, f20220372@goa.bits-pilani.ac.in

## Project Description
This app is a dice-based game where users can roll a die to accumulate coins and track their roll statistics such as the number of sixes rolled, consecutive sixes, and total rolls. The app is built with a user-friendly interface and includes features like real-time updates on the roll results and coin balance. It also uses a ViewModel to maintain data across configuration changes for a seamless user experience.

### Known Bugs
- UI text can sometimes overlap on very small screens, especially in landscape mode.

## Task Descriptions

### Task 1: Die Rolling Mechanism
For this task, we implemented the functionality that allows the user to roll a die, with the roll result being reflected on the UI. We also linked the roll to the coin balance and other statistics, updating them dynamically.

### Task 2: State Management Using ViewModel
In this task, we refactored the app to use a `ViewModel` for managing UI-related data across configuration changes. This ensures the app remains stable and data persists even when the device is rotated or the app goes into the background.

### Task 3: Error Handling and Toast Messages
For this task, we integrated a robust error-handling mechanism that displays Toast messages for certain events (e.g., rolling a six). This ensures better user feedback and interaction without causing crashes.

### Task 4: Accessibility and UI Enhancements
In this final task, we worked on improving the accessibility of the app by adding content descriptions to interactive elements and ensuring that the app is compatible with screen readers such as TalkBack. We also enhanced the UI by making sure it adapts well to different screen sizes and orientations.

## Testing
We did not follow a strict test-driven development (TDD) approach while developing this app.
- **Test Cases**: Manual testing was conducted throughout development, focusing on functionality such as rolling the die, updating the UI, and handling device rotations.
- **Mockito**: We used Mockito for this project, and the app was tested for expected behaviors using  unit testing.

## Accessibility Prompts
- Ensured screen reader compatibility by adding content descriptions to buttons and roll result text views, allowing TalkBack users to easily interact with the app.
- Improved UI color contrast and text sizes to meet WCAG guidelines for better readability, especially for users with visual impairments.

## References used 
- Google for Mockito reference and BlackBox for fixing some errors/bugs.
- 
## Time Taken
It took approximately **12 hours** to complete this assignment.

## Pair Programming
We used pair programming to the extent of **4**, where 1 is not used at all, and 5 is thoroughly used.

## Difficulty Rating
We would rate this assignment a **8**, where 1 is the easiest and 10 is the most difficult.