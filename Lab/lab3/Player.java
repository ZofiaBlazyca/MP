package uj.cs.mp.lab3;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Player {
    private int lettersAmount;
    private int[] letters = new int[26];
    public ArrayList<String> usedWords = new ArrayList<>();

    // konstruktor
    // dodawanie losowych liter do reki gracza
    public Player(int lettersAmount) {
        this.lettersAmount = lettersAmount;
        for(int i = 0; i < 26; i++)
            this.letters[i] = 0;

        for(int i = 0; i < lettersAmount; i++)
            this.addLetter();
    }

    // sprawdzanie czy gracz moze utworzyc slowo
    public boolean isAbleToCreate(Map<Character, Integer> wordMap, String word) {
        for(Character letter : wordMap.keySet()) {
            int amount = wordMap.get(letter);
            if(this.letters[letter - 'a'] < amount)
                return false;
        }
        for(Character letter : wordMap.keySet())
            this.letters[letter - 'a'] -= wordMap.get(letter);
        this.usedWords.add(word);
        return true;
    }

    // wypisywanie reki
    public void printHand() {
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < this.letters[i]; j++) {
                System.out.print((char) (i + 'a') + " ");
            }
        }
        System.out.println();
    }

    // wypisywanie uzytych slow
    public void printUsedWords() {
        for(String word : this.usedWords) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    // obliczanie sumy punktow
    public int getPoints()
    {
        int points = 0;
        for(String word : this.usedWords)
            points += (7 * word.length() - 3 * (this.lettersAmount - word.length()));

        return Math.max(points, 1);
    }

    // losowanie litery do reki gracza
    private void addLetter() {
        Random random = new Random();
        this.letters[random.nextInt(26)] += 1;
    }
}
