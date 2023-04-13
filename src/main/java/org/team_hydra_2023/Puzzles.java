package org.team_hydra_2023;

public class Puzzles {
    private String puzzleInstructions;
    private String puzzleSolution;
    private int puzzleID;
    private boolean puzzleSolvedStatus;
    private String descriptionIfPuzzleIsSolved;
    private String descriptionIfPuzzleIsNotSolved;

    public Puzzles(int id, String instructions, String solution, String solvedDesc, String unsolvedDesc) {
        this.puzzleInstructions = instructions;
        this.puzzleSolution = solution;
        this.puzzleID = id;
        this.puzzleSolvedStatus = false;
        this.descriptionIfPuzzleIsSolved = solvedDesc;
        this.descriptionIfPuzzleIsNotSolved = unsolvedDesc;
    }

    // getters and setters
    public String getPuzzleInstructions() {
        return puzzleInstructions;
    }

    public void setPuzzleInstructions(String puzzleInstructions) {
        this.puzzleInstructions = puzzleInstructions;
    }

    public String getPuzzleSolution() {
        return puzzleSolution;
    }

    public void setPuzzleSolution(String puzzleSolution) {
        this.puzzleSolution = puzzleSolution;
    }

    public int getPuzzleID() {
        return puzzleID;
    }

    public void setPuzzleID(int puzzleID) {
        this.puzzleID = puzzleID;
    }

    public boolean isPuzzleSolvedStatus() {
        return puzzleSolvedStatus;
    }

    public void setPuzzleSolvedStatus(boolean puzzleSolvedStatus) {
        this.puzzleSolvedStatus = puzzleSolvedStatus;
    }

    public String getDescriptionIfPuzzleIsSolved() {
        return descriptionIfPuzzleIsSolved;
    }

    public void setDescriptionIfPuzzleIsSolved(String descriptionIfPuzzleIsSolved) {
        this.descriptionIfPuzzleIsSolved = descriptionIfPuzzleIsSolved;
    }

    public String getDescriptionIfPuzzleIsNotSolved() {
        return descriptionIfPuzzleIsNotSolved;
    }

    public void setDescriptionIfPuzzleIsNotSolved(String descriptionIfPuzzleIsNotSolved) {
        this.descriptionIfPuzzleIsNotSolved = descriptionIfPuzzleIsNotSolved;
    }

    // method to check if the player's solution is correct
    public boolean checkSolution(String input) {
        if (input.equals(this.puzzleSolution)) {
            this.puzzleSolvedStatus = true;
            return true;
        }
        return false;
    }

    // method to trigger events when the puzzle is solved
    public void solvePuzzle() {
        if (this.puzzleSolvedStatus) {
            System.out.println(this.descriptionIfPuzzleIsSolved);

        }
        else {
            System.out.println(this.descriptionIfPuzzleIsNotSolved);
        }
    }
}

