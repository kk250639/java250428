package ch06.exercise.p20;

import java.util.Scanner;

public class App {
    private static Account[] accounts = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");

            String selectNo = scanner.nextLine();

            switch (selectNo) {
                case "1": createAccount(); break;
                case "2": accountList(); break;
                case "3": deposit(); break;
                case "4": withdraw(); break;
                case "5": run = false; break;
                default: System.out.println("올바른 번호를 입력하세요.");
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("------");
        System.out.println("계좌생성");
        System.out.println("------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        System.out.print("예금주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(accountNumber, owner, balance);

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = newAccount;
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("------");
        System.out.println("계좌목록");
        System.out.println("------");
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.getAccountNumber() + "\t" + account.getOwner() + "\t" + account.getBalance());
            }
        }
    }

    private static void deposit() {
        System.out.println("------");
        System.out.println("예금");
        System.out.println("------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(money);
            System.out.println("예금이 성공되었습니다.");
        } else {
            System.out.println("계좌가 없습니다.");
        }
    }

    private static void withdraw() {
        System.out.println("------");
        System.out.println("출금");
        System.out.println("------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(accountNumber);
        if (account != null) {
            if (account.getBalance() >= money) {
                account.withdraw(money);
                System.out.println("출금이 성공되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("계좌가 없습니다.");
        }
    }

    private static Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account != null && account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}