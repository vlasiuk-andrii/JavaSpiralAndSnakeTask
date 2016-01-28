import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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

        PrintWriter writer = null;
        try {
            writer = new PrintWriter("Text_file.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //Create file

        for (int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=z++;
                if (j == matrix[i].length - 1) {
                   writer.print(matrix[i][j]);
                } else {
                    if (matrix[i][j]<10){
                        writer.print(matrix[i][j] + "  ");
                    } else {
                        writer.print(matrix[i][j] + " ");
                    }
                }
            }
           writer.println();
        }
        //Print matrix into the file

        writer.print("Snake:");
        for (int q=matrix.length-1; q>=0; q=q-2) {
            for (int k=matrix[q].length-1; k>=0; k--){
                writer.print(matrix[q][k]+" ");
            }
            if (0==q){
                break;
            }
            for (int k=0; k<matrix[q-1].length; k++){
                writer.print(matrix[q-1][k]+" ");
            }
        }
        //Print snake into the file

        Spiral object = new Spiral();
        object.printSpiral(matrix, num);

        writer.close();

    }
}
