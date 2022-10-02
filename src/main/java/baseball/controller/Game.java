package baseball.controller;

import baseball.model.Computer;
import baseball.model.GameState;

public class Game {
    private GameState gameState;
    private Computer computer;

    public static final int BALL_MIN_NUMBER = 1;
    public static final int BALL_MAX_NUMBER = 9;
    public static final int BALL_INPUT_SIZE = 3;

    public Game() {
        this.computer = new Computer();
    }

    public void play() {
        this.gameState = GameState.PLAY;
        System.out.println("computer = " + computer.balls());
    }
}
