package jp.ac.uryukyu.ie.e245724;
1

import java.util.Scanner;

/**
 * じゃんけんゲームを実行するクラス。
 */
public class Main {
    public static void main(String[] args) {
        Janken janken = new Janken();
        Scanner scanner = new Scanner(System.in);

        System.out.println("じゃんけんゲームへようこそ！");
        System.out.println("あなたの手を入力してください: 0 (グー), 1 (パー), 2 (チョキ)。");

        System.out.print("あなたの選択: ");
        int playerChoice = scanner.nextInt();

        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("無効な選択です。ゲームを再起動してください。");
            return;
        }

        int computerChoice = janken.getComputerChoice();
        System.out.println("コンピュータの選択: " + janken.choiceToString(computerChoice));

        String result = janken.determineWinner(playerChoice, computerChoice);
        System.out.println("結果: あなたは" + result + "しました！");

        scanner.close();
    }
}
