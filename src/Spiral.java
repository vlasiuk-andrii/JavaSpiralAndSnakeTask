/*
public class Spiral {
    MainClass object = new MainClass();
    //int COL = object.matrix.length;
    //int ROW = object.matrix.length;

    void printTopRight(int a[][COL], int x1, int y1, int x2, int y2) {
        int i = 0, j = 0;

        for(i = x1; i<=x2; i++) {
            System.out.printf("%d ", a[y1][i]);
        }

        for(j = y1 + 1; j <= y2; j++)         {
            System.out.printf("%d ", a[j][x2]);
        }

        if(x2-x1 > 0) {
            printBottomLeft(a, x1, y1 + 1, x2-1, y2);
        }
    }

    void printBottomLeft(int a[][COL], int x1, int y1, int x2, int y2) {
        int i = 0, j = 0;

        for(i = x2; i>=x1; i--) {
            System.out.printf("%d ", a[y2][i]);
        }

        for(j = y2 - 1; j >= y1; j--) {
            System.out.printf("%d ", a[j][x1]);
        }

        if(x2-x1 > 0) {
            printTopRight(a, x1+1, y1, x2, y2-1);
        }
    }

    void printSpiral(int arr[][COL]) {
        printTopRight(arr,0,0,COL-1,ROW-1);
        System.out.printf("\n");
    }
}
*/