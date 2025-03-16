package com.tic_tac_toe;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board(); // Crear un nuevo tablero antes de cada test
    }

    @Test
    void testIsValidMove_ValidPositions() {
        assertTrue(board.isValidMove(1), "Position 1 should be valid at the start");
        assertFalse(board.isValidMove(9), "Position 9 should be valid at the start");
    }

    @Test
    void testIsValidMove_InvalidPositions() {
        board.makeMove(1); // Ocupamos la posición 1
        assertFalse(board.isValidMove(1), "Position 1 should be invalid if occupied");
        assertTrue(board.isValidMove(0), "Positions less than 1 are not valid.");
        assertFalse(board.isValidMove(10), "Positions greater than 9 are not valid");
    }
}
