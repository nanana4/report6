package jp.ac.uryukyu.ie.e245724;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Janken janken = new Janken();
        AcchiMuiteHoi acchiMuiteHoi = new AcchiMuiteHoi();
        Scanner scanner = new Scanner(System.in);

        System.out.println("じゃんけんゲームへようこそ！");
        System.out.println("0: グー, 1: パー, 2: チョキ");

        // じゃんけん部分
        System.out.print("あなたの手を入力してください: ");
        int playerChoice = scanner.nextInt();
        int computerChoice = janken.getComputerChoice();

        System.out.println("あなたの選択: " + janken.choiceToString(playerChoice));
        System.out.println("コンピュータの選択: " + janken.choiceToString(computerChoice));

        String result = janken.determineWinner(playerChoice, computerChoice);
        System.out.println("結果: " + result);

        // 勝者のみ「あっち向いてホイ」に進む
        if (result.equals("Win")) {
            System.out.println("あっち向いてホイ！");
            System.out.println("0: 上, 1: 下, 2: 左, 3: 右");

            System.out.print("あなたの指の方向を入力してください: ");
            int playerDirection = scanner.nextInt();
            int computerDirection = acchiMuiteHoi.getComputerDirection();

            System.out.println("あなたの指の方向: " + acchiMuiteHoi.directionToString(playerDirection));
            System.out.println("コンピュータの顔の向き: " + acchiMuiteHoi.directionToString(computerDirection));

            if (acchiMuiteHoi.isMatch(playerDirection, computerDirection)) {
                System.out.println("勝利しました！");
            } else {
                System.out.println("勝利には至りませんでした。");
            }
        }

        scanner.close();
    }
}
