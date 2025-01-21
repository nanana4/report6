package jp.ac.uryukyu.ie.e245724;

/**
 * Jankenクラスをテストするためのクラス。
 */
public class JankenTest {
    public static void main(String[] args) {
        Janken janken = new Janken();

        // テストケース 1: プレイヤーがグー、コンピュータがチョキ（プレイヤーの勝ち）
        assert "Win".equals(janken.determineWinner(0, 2)) : "テストケース 1 失敗。";

        // テストケース 2: プレイヤーがパー、コンピュータがグー（プレイヤーの勝ち）
        assert "Win".equals(janken.determineWinner(1, 0)) : "テストケース 2 失敗。";

        // テストケース 3: プレイヤーがチョキ、コンピュータがパー（プレイヤーの勝ち）
        assert "Win".equals(janken.determineWinner(2, 1)) : "テストケース 3 失敗。";

        // テストケース 4: 引き分け
        assert "Draw".equals(janken.determineWinner(1, 1)) : "テストケース 4 失敗。";

        // テストケース 5: プレイヤーがグー、コンピュータがパー（プレイヤーの負け）
        assert "Lose".equals(janken.determineWinner(0, 1)) : "テストケース 5 失敗。";

        System.out.println("すべてのテストケースが成功しました。");
    }
}
