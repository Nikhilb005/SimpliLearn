
public class LargestIncresingSequence {
    
	 static int incre_subseq(int myarr[], int arrlen){
	      int seqarr[] = new int[arrlen];
	      int i, j, max = 0;
	      for (i = 0; i < arrlen; i++)
	      seqarr[i] = 1;
	      for (i = 1; i < arrlen; i++)
	      for (j = 0; j < i; j++)
	      if (myarr[i] > myarr[j] && seqarr[i] < seqarr[j] + 1)
	      seqarr[i] = seqarr[j] + 1;
	      for (i = 0; i < arrlen; i++)
	      if (max < seqarr[i])
	      max = seqarr[i];
	      return max;
	   }
	 
 public static void main(String args[]){
     int myarr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
     int arrlen = myarr.length;
     for(int myarrs:myarr) {
    	 System.out.print(myarrs+" ");
     }
     System.out.println();
     System.out.println("length " +  incre_subseq(myarr, arrlen));
     
  }

 }

