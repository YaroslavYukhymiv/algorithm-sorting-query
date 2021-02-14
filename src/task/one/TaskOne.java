package task.one;

public class TaskOne {

    public String encode(String text, int rails) {

        char[][] rail = new char[rails][text.length()];

        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < text.length(); j++) {
                rail[i][j] = '\n';
            }
        }

        boolean bottom = false;
        int row = 0;
        int colum = 0;

        for (int j = 0; j < text.length(); j++) {

            if (row == 0 || row == rails - 1) {
                bottom = !bottom;
            }
            rail[row][colum++] = text.charAt(j);

            if (bottom) {
                row++;
            } else {
                row--;
            }
        }

        String result = "";
        for (int l = 0; l < rails; l++) {
            for (int k = 0; k < text.length(); k++) {
                if (rail[l][k] != '\n')
                    result += rail[l][k];

            }
        }
        return result;
    }

    public String decode(String code, int rails) {

        char[][] rail = new char[rails][code.length()];

        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < code.length(); j++) {
                rail[i][j] = '\n';
            }
        }

        boolean bottom = false;

        int row = 0;
        int colum = 0;

        for (int i = 0; i < code.length(); i++) {

            if (row == 0) {
                bottom = true;
            }
            if (row == rails - 1) {
                bottom = false;
            }

            rail[row][colum++] = 'X';

            if (bottom) {
                row++;
            } else {
                row--;
            }
        }

        int index = 0;
        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < code.length(); j++) {
                if (rail[i][j] == 'X' && index < code.length()) {
                    rail[i][j] = code.charAt(index++);
                }
            }
        }


        String result = "";

        row = 0;
        colum = 0;

        for (int i = 0; i < code.length(); i++) {

            if (row == 0)
                bottom = true;
            if (row == rails - 1)
                bottom = false;

            if (rail[row][colum] != 'X')
                result += rail[row][colum++];

            if (bottom) {
                row++;
            } else {
                row--;
            }

        }

        return result;
    }

    public static void main (String[] args){
        TaskOne taskOne = new TaskOne();
        System.out.println(taskOne.encode("WECRLTEERDSOEEFEAOCAIVDEN", 3));
        System.out.println(taskOne.decode("WLREAINERTEDOEEOAVECESFCD", 3));
    }

}
