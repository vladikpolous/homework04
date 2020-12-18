package com.alevel.homework4;

import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, вводите любой текст кириллицей. Пожалуйста, вводите любой текст кириллицей. Размер текста не должен превышать 30 символов");
        Scanner scanner = new Scanner(System.in);
        String translatedLine;
        while (true) {
            translatedLine = scanner.nextLine();
            if (translatedLine.length() > 30) {
                System.out.println("Размер текста не должен превышать 30 символов. Попробуйте ещё раз");
            } else {
                break;
            }
        }
        System.out.println(translate(translatedLine));
    }

    static String translate(String string) {
        String[] Cyrillic = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й",
                "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф",
                "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я", " "};
        String[] lettersForTranslation = {"a", "b", "v", "g", "d", "e", "yo", "zh", "z", "i", "yi",
                "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f",
                "h", "c", "ch", "sh", "shch", "″", "y", "′", "e", "yu", "ya", " "};
        String translatedString = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < Cyrillic.length; j++) {
                if (String.valueOf(string.charAt(i)).equals(Cyrillic[j])) {
                    translatedString += lettersForTranslation[j];
                    break;
                }
            }
        }
        return translatedString;
    }
}
