package jp.ac.uryukyu.ie.e245724;

import java.util.Random;

/**
 * じゃんけんゲームのロジックを処理するクラス。
 */
public class Janken {
    private final String[] choices = {"グー", "パー", "チョキ"};

    /**
     * 勝敗を判定するメソッド。
     *
     * @param playerChoice プレイヤーの選択（0: グー, 1: パー, 2: チョキ）。
     * @param computerChoice コンピュータの選択（0: グー, 1: パー, 2: チョキ）。
     * @return 勝敗の結果（"Win", "Lose", "Draw"）。
     */
    public String determineWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return "Draw";
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                    (playerChoice == 1 && computerChoice == 0) ||
                    (playerChoice == 2 && computerChoice == 1)) {
            return "Win";
        } else {
            return "Lose";
        }
    }

    /**
     * コンピュータの選択をランダムに生成するメソッド。
     *
     * @return コンピュータの選択（0: グー, 1: パー, 2: チョキ）。
     */
    public int getComputerChoice() {
        Random random = new Random();
        return random.nextInt(3);
    }

    /**
     * 選択を文字列に変換するメソッド。
     *
     * @param choice 選択（0: グー, 1: パー, 2: チョキ）。
     * @return 選択の文字列表現。
     */
    public String choiceToString(int choice) {
        return choices[choice];
    }
}
