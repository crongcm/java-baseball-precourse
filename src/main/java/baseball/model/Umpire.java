package baseball.model;

import baseball.controller.Game;
import java.util.List;
import java.util.Objects;

public class Umpire {
    private int strikeCount;
    private int ballCount;
    private List<Integer> computerBalls;
    private List<Integer> playerBalls;

    public static final String STRIKE_FORMAT = "%d스트라이크";
    public static final String BALL_FORMAT = "%d볼";
    public static final String NOTHING_FORMAT = "낫싱";

    public Umpire(List<Integer> computerBalls, List<Integer> playerBalls) {
        this.strikeCount = 0;
        this.ballCount = 0;
        this.computerBalls = computerBalls;
        this.playerBalls = playerBalls;
    }

    public GameState judge() {
        for (int i = 0; i < Game.BALL_INPUT_SIZE; i++) {
            judgeStrike(computerBalls.get(i), playerBalls.get(i));
        }

        for (Integer playerBall : playerBalls) {
            judgeBall(playerBall);
        }

        return getGameState();
    }

    private void judgeStrike(Integer computerBall, Integer playerBall) {
        if (Objects.equals(computerBall, playerBall)) {
            strikeCount++;
        }
    }

    private void judgeBall(Integer playerBall) {
        if (computerBalls.contains(playerBall)) {
            ballCount++;
        }
    }

    private boolean isVictory() {
        return strikeCount == 3;
    }

    private GameState getGameState() {
        if (isVictory()) {
            return GameState.VICTORY;
        }

        return GameState.DEFEAT;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount - strikeCount;
    }

    public String result() {
        if (getStrikeCount() == 0 && getBallCount() == 0) {
            return NOTHING_FORMAT;
        }

        if (getBallCount() == 0) {
            return String.format(STRIKE_FORMAT, getStrikeCount());
        }

        if (getStrikeCount() == 0) {
            return String.format(BALL_FORMAT, getBallCount());
        }

        return String.format(BALL_FORMAT, getBallCount()) + " " + String.format(STRIKE_FORMAT, getStrikeCount());
    }
}
