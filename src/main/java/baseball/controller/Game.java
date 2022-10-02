package baseball.controller;

import baseball.model.Computer;
import baseball.model.GameState;
import baseball.model.Player;
import baseball.view.View;

public class Game {
    private GameState gameState;
    private Computer computer;
    private Player player;

    public static final int BALL_MIN_NUMBER = 1;
    public static final int BALL_MAX_NUMBER = 9;
    public static final int BALL_INPUT_SIZE = 3;

    public Game() {
        this.computer = new Computer();
        this.player = new Player();
    }

    public void play() {
        this.gameState = GameState.PLAY;
        System.out.println("computer = " + computer.balls());

        player.inputBalls(View.inputPlayer());
        System.out.println("player = " + player.balls());
    }
}
