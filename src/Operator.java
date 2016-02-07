import java.io.*;

public class Operator {
    MainClass objectMain = new MainClass();

    void printMatrix(int matrix[][], int z){
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
                matrix[i][j]=(int)(Math.random()*201-100);
                if (matrix[i][j]<0) {
                    writer.print(matrix[i][j]+" ");
                    } else {
                    if (matrix[i][j]>0){
                        writer.print(matrix[i][j]+"  ");
                        }
                    }
                }
            writer.println();
            }
        //Print matrix into the file
        writer.close();
        }


    void addSnake (int[][] matrix){
        try
        {
            FileWriter fw = new FileWriter("Text_file.txt",true);
            fw.write("Snake:  ");
            for (int q=matrix.length-1; q>=0; q=q-2) {
                for (int k=matrix[q].length-1; k>=0; k--){
                    fw.write(matrix[q][k]+" ");
                }
                if (0==q){
                    break;
                }
                for (int k=0; k<matrix[q-1].length; k++){
                    fw.write(matrix[q-1][k]+" ");
                }
            }
            fw.write('\n');
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
        //Print snake into the file
    }

    void printTopRight(int[][] a, int x1, int y1, int x2, int y2) {
        int i = 0, j = 0;

        try
        {
            FileWriter fw = new FileWriter("Text_file.txt",true);
            for(i = x1; i<=x2; i++) {
                fw.write(a[y1][i]+" ");
            }

            for(j = y1 + 1; j <= y2; j++)         {
                fw.write(a[j][x2]+" ");
            }
            fw.close();
            if(x2-x1 > 0) {
                printBottomLeft(a, x1, y1 + 1, x2-1, y2);
            }
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }


    }

    void printBottomLeft(int[][] a, int x1, int y1, int x2, int y2) {
        int i = 0, j = 0;
        try
        {
            FileWriter fw = new FileWriter("Text_file.txt",true);
            for(i = x2; i>=x1; i--) {
                fw.write(a[y2][i]+" ");
            }
            for(j = y2 - 1; j >= y1; j--) {
                fw.write(a[j][x1]+" ");
            }
            fw.close();
            if(x2-x1 > 0) {
                printTopRight(a, x1+1, y1, x2, y2-1);
            }
        }
        catch(IOException ioe)
            {
                System.err.println("IOException: " + ioe.getMessage());
            }

    }

    void printSpiral(int[][] arr, int n) {
        try {
            FileWriter fw = new FileWriter("Text_file.txt",true);
            fw.write("Spiral: ");
            fw.close();
        }
        catch (IOException ioe){
            System.err.println("IOException: " + ioe.getMessage());

        }
        printTopRight(arr,0,0,n-1,n-1);
    }
}
