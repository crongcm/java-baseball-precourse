package baseball.model;

import baseball.controller.Game;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> balls;

    public Computer() {
        generateBalls();
    }

    public List<Integer> balls() {
        return balls;
    }

    private void generateBalls() {
        this.balls = new ArrayList<>();

        while (this.balls.size() < Game.BALL_INPUT_SIZE) {
            addNewBall(this.balls);
        }
    }

    private static void addNewBall(List<Integer> balls) {
        int ball = Randoms.pickNumberInRange(Game.BALL_MIN_NUMBER, Game.BALL_MAX_NUMBER);

        if (!balls.contains(ball)) {
            balls.add(ball);
        }
    }
}
