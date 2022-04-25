package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    static boolean end = false;
    static String name;
    static int amountOfVictories = 0;
    static int victoryPlayerCounter = 0;
    static int victoryComputerCounter = 0;
    static int playerChoice = 0;
    static int computerChoice = 0;

    public static void main(String[] args) {

        RpsRunner rpsRunner = new RpsRunner();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        name = scanner.nextLine();
        System.out.println("Cześć " + name + "!");
        rpsRunner.chooseAmountOfVictories();

        while (!end) {
            System.out.println("Twój ruch:");
            String input = scanner.next();
            if ("1".equals(input)) {
                playerChoice = 1;
                rpsRunner.playRound();
            }
            if ("2".equals(input)) {
                playerChoice = 2;
                rpsRunner.playRound();
            }
            if ("3".equals(input)) {
                playerChoice = 3;
                rpsRunner.playRound();
            }
            if ("x".equals(input)) {
                rpsRunner.endGame();
            }
            if ("n".equals(input)) {
                rpsRunner.playAgain();
            }
            System.out.println(name + " " + victoryPlayerCounter + " : " + victoryComputerCounter + " Computer");

            if (victoryPlayerCounter == amountOfVictories ||
                    victoryComputerCounter == amountOfVictories) {
                if (victoryPlayerCounter>victoryComputerCounter) {
                    System.out.println("Gratulację, wygrałeś grę!");
                    System.out.println("Końcowy wynik: " + name + " " + victoryPlayerCounter + " : " + victoryComputerCounter + " Computer");
                }
                if (victoryComputerCounter>victoryPlayerCounter) {
                    System.out.println("Niestety przegrałeś... koniec gry!");
                    System.out.println("Końcowy wynik: " + name + " " + victoryPlayerCounter + " : " + victoryComputerCounter + " Computer");
                }
                rpsRunner.endChoice();
            }
        }
    }

    public void playRound() {
        Random random = new Random();
        computerChoice = random.nextInt(3);
        computerChoice++;
        // 1 - kamień
        // 2 - papier
        // 3 - nożyce

        if(playerChoice==1 && computerChoice==1) {
            System.out.println(name + "-kamień vs kamień-Computer \n" + "Remis!");
        }
        if(playerChoice==2 && computerChoice==2) {
            System.out.println(name + "-papier vs papier-Computer \n" + "Remis!");
        }
        if(playerChoice==3 && computerChoice==3) {
            System.out.println(name + "-nożyce vs nożyce-Computer \n" + "Remis!");
        }
        if(playerChoice==1 && computerChoice==2) {
            System.out.println(name + "-kamień vs papier-Computer \n" + "Przegrałeś rundę!");
            victoryComputerCounter++;
        }
        if(playerChoice==1 && computerChoice==3) {
            System.out.println(name + "-kamień vs nożyce-Computer \n" + "Wygrałeś rundę!");
            victoryPlayerCounter++;
        }
        if(playerChoice==2 && computerChoice==1) {
            System.out.println(name + "-papier vs kamień-Computer \n" + "Wygrałeś rundę!");
            victoryPlayerCounter++;
        }
        if(playerChoice==2 && computerChoice==3) {
            System.out.println(name + "-papier vs nożyce-Computer \n" + "Przegrałeś rundę!");
            victoryComputerCounter++;
        }
        if(playerChoice==3 && computerChoice==1) {
            System.out.println(name + "-nożyce vs kamień-Computer \n" + "Przegrałeś rundę!");
            victoryComputerCounter++;
        }
        if(playerChoice==3 && computerChoice==2) {
            System.out.println(name + "-nożyce vs papier-Computer \n" + "Wygrałeś rundę!");
            victoryPlayerCounter++;
        }
    }

    public void endChoice() {
        RpsRunner rpsRunner = new RpsRunner();
        System.out.println("Naciśnij 'x' aby zakończyć grę. \n" +
                "Naciśnij 'n' aby zacząć nową grę.");
        Scanner scanner = new Scanner(System.in);
        String playAgainOrEndGame = scanner.next();
        if (playAgainOrEndGame.equals("x")) {
            end = true;
        }
        if (playAgainOrEndGame.equals("n")) {
            rpsRunner.chooseAmountOfVictories();
        }
    }

    public void endGame() {
        System.out.println("Czy na pewno chcesz zakończyć grę? \n" +
                "naciśnij klawisz 't' dla \"tak\" lub 'n' dla \"nie\".");
        Scanner scanner = new Scanner(System.in);
        String yesOrNot = scanner.next();
        if (yesOrNot.equals("t")) {
            end = true;
            System.out.println("Koniec gry!");
        }
        if (yesOrNot.equals("n")) {
            System.out.println("Gramy dalej");
        }
    }

    public void playAgain() {
        RpsRunner rpsRunner = new RpsRunner();
        System.out.println("Czy na pewno chcesz zakończyć aktualną rozgrywkę? \n" +
                "naciśnij klawisz 't' dla \"tak\" lub 'n' dla \"nie\".");
        Scanner scanner = new Scanner(System.in);
        String yesOrNot = scanner.next();
            if (yesOrNot.equals("t")) {
                System.out.println("Gramy od nowa!");
                rpsRunner.chooseAmountOfVictories();
            }
            if (yesOrNot.equals("n")) {
                System.out.println("Gramy dalej");
            }
    }

    public void instruction() {
        System.out.println("Oto instrukcja obsługi: \n" +
                "Klawisz '1' - kamień \n" +
                "Klawisz '2' - papier \n" +
                "Klawisz '3' - nożyce \n" +
                "Klawisz 'x' - zakończenie gry \n" +
                "Klawisz 'n' - graj od nowa");
        System.out.println("Zaczynamy!");
    }

    public void chooseAmountOfVictories() {
        RpsRunner rpsRunner = new RpsRunner();
        Scanner scanner = new Scanner(System.in);
        victoryPlayerCounter = 0;
        victoryComputerCounter = 0;
        System.out.println("Do ilu zwycięstw chcesz grać?");
        amountOfVictories = scanner.nextInt();
        while (amountOfVictories <= 0) {
            System.out.println("Podaj liczbę większą niż 0.");
            amountOfVictories = scanner.nextInt();
        }
        System.out.println("Ok, gracie do "+ amountOfVictories +". Powodzenia!");
        rpsRunner.instruction();
    }
}
