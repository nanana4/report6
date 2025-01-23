package jp.ac.uryukyu.ie.e245724;

import java.util.Random;

public class AcchiMuiteHoi {
    private final String[] directions = {"上", "下", "左", "右"};

    /**
     * コンピュータの方向をランダムに生成する。
     * @return コンピュータの選択した方向（0: 上, 1: 下, 2: 左, 3: 右）。
     */
    public int getComputerDirection() {
        Random random = new Random();
        return random.nextInt(directions.length);
    }

    /**
     * 数値を対応する方向の文字列に変換する。
     * @param direction 数値の方向（0: 上, 1: 下, 2: 左, 3: 右）。
     * @return 対応する方向の文字列。
     */
    public String directionToString(int direction) {
        return directions[direction];
    }

    /**
     * プレイヤーとコンピュータの方向が一致しているかを判定する。
     * @param playerDirection プレイヤーの選択した方向。
     * @param computerDirection コンピュータの選択した方向。
     * @return 一致していればtrue、そうでなければfalse。
     */
    public boolean isMatch(int playerDirection, int computerDirection) {
        return playerDirection == computerDirection;
    }
}
