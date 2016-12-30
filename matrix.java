import java.util.*;
class matrix{
	
	public static int[][] add(int[][] a,int[][] b){
		int i = a.length;
	   int h = a[0].length;
       int j = b.length;	
       int k = b[0].length;
	   
	   int[][] res = new int[i][h];
       for(int u=0;u<i;u++){
		   for(int l=0;l<h;l++){
			   res[u][l] = a[u][l] + b[u][l];
		   }
	   }
	   
	   return res;
	   }

	   public static int[][] transpose(int[][] a){
		 int[][] b = new int[a[0].length][a.length]; 
		  for(int i=0;i<b.length;i++){
			  for(int z=0;z<b[0].length;z++){
				  b[i][z] = a[z][i];
			  }
		  }
		  
		  return b;
	   }
	   
	/*public static int[][] multiply(int[][] a,int[][] b){
	   int i = a.length;
	   int h = a[0].length;	
       int k = b[0].length;
     
      int[][] res = new int[i][k];
	
	  for(int q=0;q<i;q++){
		  for(int w=0;w<k;w++){
			  for(int e=0;e<h;e++)
			  {
				  res[q][w]+= a[q][w]*b[e][w];
			  }
		  }
	  }
	  
	  return res;
	}*/
	
	public static int[][] multiply(int[][] first,int[][] second){
	int m = first.length;
	int p = second.length;
	int q = second[0].length;
	int[][] multipl = new int[m][p];
	int sum=0;
	for (int c = 0 ; c < m ; c++ )
         {
            for (int d = 0 ; d < q ; d++ )
            {   
               for (int k = 0 ; k < p ; k++ )
               {
                  sum = sum + first[c][k]*second[k][d];
               }
 
               multipl[c][d] = sum;
               sum = 0;
            }
         }
		 
	return multipl;	 
	}
	
	public static void main(String args[]){
		/*Scanner s = new Scanner(System.in);
		int i=0;
		int j=0;
		int h=0;
		int k=0;
		
    System.out.print("dim of first matrix");
    i = s.nextInt();	
	j = s.nextInt();
    System.out.print("dim of first matrix");
    h = s.nextInt();
    k = s.nextInt();
	System.out.print("first");
	 int[][] mat1 = new int[i][j];
	 for(int f=0;f<i;f++){
		 for(int s2=0;s2<j;s2++){
			 mat1[f][s2] = s.nextInt();
			 System.out.print(" ");
		 }
		 System.out.println();
	 }
	 System.out.print("second");
	 int[][] mat2 = new int[h][k];
	 for(int f1=0;f1<h;f1++){
		 for(int s1=0;s1<k;s1++){
			 mat1[f1][s1] = s.nextInt();
			 System.out.print(" ");
		 }
		 System.out.println();
	 }
	*/
	int mat1[][] = {{1,0},{0,1}};
	int mat2[][] = {{1,2},{5,7}};
	int[][] answer = multiply(mat1,mat2);
	for(int l=0;l<2;l++){
		for(int b=0;b<2;b++){
			System.out.print(answer[l][b] + " ");
		}
		System.out.println();
	}
	}
}