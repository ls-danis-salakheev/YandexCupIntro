package three;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Game {
    private static final int CARD_COUNT = 30;
    private static final List<Card> cards = new ArrayList<>(CARD_COUNT);

    private static int positiveIterator = 0;
    private static int negativeIterator = 0;

    static {
        for (int i = 1; i < CARD_COUNT; i++) {
            cards.add(new Card(i));
        }
    }


    public static void main(String[] args) {
        System.out.println("Please set a goal of the game ? (0...n)");
        Scanner in = new Scanner(System.in);
        int setOfGame = in.nextInt();

        //Entities
        Player1 vasya = new Player1(setOfGame);
        ScoreInstrument petya = new Player2();

        while (setOfGame!=0) {
            Optional<Card> any = cards.stream().findAny();
            if (any.isPresent()) {
                Card anyCard = any.get();
                cards.remove(anyCard);
                if (anyCard.getCardScore() % 3 == 0) {
                    petya.plusScore();
                    positiveIterator++;
                } else if (anyCard.getCardScore() % 5 == 0) {
                    vasya.plusScore();
                    positiveIterator++;
                }
                negativeIterator++;
                setOfGame--;
            }
        }

        int totalPetyaScores = petya.getAllScoresForWin();
        int totalVasyaScores = vasya.getAllScoresForWin();


        String winner = "";
        if (totalVasyaScores > totalPetyaScores) {
            winner = "Winner of the game: Player1";
        } else if (totalPetyaScores > totalVasyaScores) {
            winner = "Winner of the game: Player2";
        } else winner = "NO ONE";

        System.out.println("`````````````````````````````````````````````````````````````");
        System.out.println(winner);
        System.out.println("````````````````````````````````````````````````````````````");
        System.out.println("Vasya's result" + vasya.toString());
        System.out.println("Petya's result" + petya.toString());
        System.out.println("```````````````````````````````````````````````````````````");
        System.out.println("All scores of the game: " + positiveIterator + negativeIterator);
        System.out.println("Total scores of gamers: " + positiveIterator);
        System.out.println("All discarded scores: " + negativeIterator);

    }

}

@ToString
class Card {
    private final int cardScore;

    public Card(int cardScore) {
        this.cardScore = cardScore;
    }

    public int getCardScore() {
        return cardScore;
    }

}

class Player1 implements ScoreInstrument {
    private int score = 0;
    private final int winScore;

    public Player1(int winScore) {
        this.winScore = winScore;
    }

    @Override
    public int getAllScoresForWin() {
        return score;
    }

    @Override
    public void plusScore() {
        score++;
    }

    @Override
    public String toString() {
        return "Player1{" +
                "score=" + score +
                '}';
    }
}

@ToString
class Player2 implements ScoreInstrument {
    private int score = 0;


    @Override
    public int getAllScoresForWin() {
        return score;
    }

    @Override
    public void plusScore() {
        score++;
    }
}

interface ScoreInstrument {
    int getAllScoresForWin();

    void plusScore();
}


