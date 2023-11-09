package tema2;

public class Utils {

    public static double miles2kilometers(double miles) {
        return miles * 1.60934;
    }

    public static double getTaxes(double euros, double tax) {
        double amount = euros * (tax / 100);
        return Math.round(amount * 100.0) / 100.0;
    }

    public static double getNetPrice(double euros, double tax) {
        double amount = euros + getTaxes(euros, tax);
        return Math.round(amount * 100.0) / 100.0;
    }

    public static int getCoins(double total){
       int coins = 0;
       int cents = (int) Math.round(total*100);
       while (cents != 0) {
           if (cents - 200 >= 0) {
               cents -= 200;
               coins += 10000000;
           } else if (cents - 100 >= 0) {
               cents -= 100;
               coins += 1000000;
           } else if (cents - 50 >=0) {
               cents -= 50;
               coins += 100000;
           } else if (cents - 20 >=0) {
               cents -= 20;
               coins += 10000;
           } else if (cents - 10 >=0) {
               cents -= 10;
               coins += 1000;
           } else if (cents - 5 >=0) {
               cents -= 5;
               coins += 100;
           } else if (cents - 2 >=0) {
               cents -= 2;
               coins += 10;
           } else {
               cents -= 1;
               coins += 1;
           }
       }
       return coins;
    }

    public static char getNIF(int numberNif) {
        int numberLetter = numberNif % 23;
        char letterNif = 'T';
        switch (numberLetter) {
            case 1: letterNif='R';
            break;
            case 2: letterNif='W';
            break;
            case 3: letterNif='A';
            break;
            case 4: letterNif='G';
            break;
            case 5: letterNif='M';
            break;
            case 6: letterNif='Y';
            break;
            case 7: letterNif='F';
            break;
            case 8: letterNif='P';
            break;
            case 9: letterNif='D';
            break;
            case 10: letterNif='X';
            break;
            case 11: letterNif='B';
            break;
            case 12: letterNif='N';
            break;
            case 13: letterNif='J';
            break;
            case 14: letterNif='Z';
            break;
            case 15: letterNif='S';
            break;
            case 16: letterNif='Q';
            break;
            case 17: letterNif='V';
            break;
            case 18: letterNif='H';
            break;
            case 19: letterNif='L';
            break;
            case 20: letterNif='C';
            break;
            case 21: letterNif='K';
            break;
            case 22: letterNif='E';
            break;
            default: System.out.println("ERROR: Introducde un DNI Válido.");
            break;
        }
        return letterNif;
    }

    public static boolean isValidNIF(int numberNif, char letterNif) {
        letterNif = Character.toUpperCase(letterNif);
        return getNIF(numberNif) == letterNifgetNIF(numberNif) == letterNif;
    }
}
