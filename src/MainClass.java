import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        String s = null;
        Pattern p = Pattern.compile("([1-9]{1})|(10)");
        Matcher l = null;

        do  { System.out.print( "Please enter the dimention of the matrix: " );
            s = input.nextLine();
            l = p.matcher(s);
        } while  (!l.matches());
        num = Integer.parseInt(s);
        //User inputed the dimention of the matrix
        //num - dimention of the matrix

        int matrix[][];
        matrix = new int[num][num];
        int z = 1;
        //Create matrix

        Operator object = new Operator();
        object.printMatrix(matrix, z);
        object.addSnake(matrix);
        object.printSpiral(matrix, num);


    }
}
