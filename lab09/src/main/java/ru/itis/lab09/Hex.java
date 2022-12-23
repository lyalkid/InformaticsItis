package ru.itis.lab09;

public class Hex {

    public static String encode(byte[] inp) {
        int n = inp.length;
        char[] out = new char[n * 2];

        for(int i = 0; i < n; ++i) {
            int low = inp[i] & 0xF;
            int hi = (inp[i] & 0xF0) >> 4;

            out[2* i] = int2char(hi);
            out[2 * i + 1] = int2char(low);
        }

        return new String(out);
    }

    public static byte[] decode(String hex) {
        /* Проверяем используемый алфавит (0-9 a-f A-F)
            с помощью регулярного выражения,
        *  количество символов - четное
            Если проверка не пройдена возвращаем null
        * */
        return null;
    }

    private static char int2char(int a) {
        switch (a) {
            case 0 : return '0';
            case 1 : return '1';
            case 2 : return '2';
            case 3 : return '3';
            case 4 : return '4';
            case 5 : return '5';
            case 6 : return '6';
            case 7 : return '7';
            case 8 : return '8';
            case 9 : return '9';
            case 10 : return 'A';
            case 11 : return 'B';
            case 12 : return 'C';
            case 13 : return 'D';
            case 14 : return 'E';
            case 15 : return 'F';
            default: return '-';
        }
    }
}

