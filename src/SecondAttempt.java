

public class SecondAttempt {
    public void get_circ_arr (int n,int [][] a)
    {
        int z=n;
        {
            for (int i=0;i<n;i++)
            {
                for (int l=z-1-i;l>=i;l--)
                {
                    int k=i;
                    System.out.printf("%d",a[k][l]);
                }

                for (int j=i+1;j<=z-1-i;j++)
                {
                    int k=i;
                    {
                        System.out.printf("%d",a[j][k]);
                    }
                }

                for (int j=i+1;j<=z-i-1;j++)
                {
                    int k=z-1-i;
                    {
                        System.out.printf("%d",a[k][j]);
                    }
                }

                for (int j=z-2-i;j>=i+1;j--)
                {
                    int k=z-i-1;
                    {
                        System.out.printf("%d",a[j][k]);
                    }
                }
            }
        }
    }
}
