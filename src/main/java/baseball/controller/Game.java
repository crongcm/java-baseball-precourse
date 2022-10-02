package baseball.controller;

import baseball.model.Computer;
import baseball.model.GameState;
import baseball.model.Player;
import camp.nextstep.edu.missionutils.Console;

public class Game {
    public static final String PLAYER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
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

        System.out.println(PLAYER_INPUT_MESSAGE);
        player.inputBalls(Console.readLine());
        System.out.println("player = " + player.balls());
    }
}
