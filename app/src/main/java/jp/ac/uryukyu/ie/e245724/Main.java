package jp.ac.uryukyu.ie.e245724;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Janken janken = new Janken(); // Jankenクラスのインスタンスを生成
        Scanner scanner = new Scanner(System.in);

        System.out.println("じゃんけんゲームへようこそ！");
        System.out.println("あなたの手を入力してください: 0 (グー), 1 (パー), 2 (チョキ)。");
        System.out.print("あなたの選択: ");
        int playerChoice = scanner.nextInt();

        int computerChoice = janken.getComputerChoice();
        String result = janken.determineWinner(playerChoice, computerChoice);

        System.out.println("コンピュータの選択: " + janken.choiceToString(computerChoice));
        System.out.println("結果: あなたは" + result + "しました！");

        scanner.close(); // Scannerを明示的に閉じる
    }
}
