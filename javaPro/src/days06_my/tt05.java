package days06_my;

public class tt05 {

	public static void main(String[] args) {
		int lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
	      int n ;// 
	      n =  (int)( Math.random()*45)+1;
	      // 1
	      lotto1 = n;
	      // 2
	      n =  (int)( Math.random()*45)+1;
	      if( lotto1 == n ) {
	         n =  (int)( Math.random()*45)+1;
	         if (lotto1 == n) {
	            n =  (int)( Math.random()*45)+1;
	            if (lotto1 == n) {
	               n =  (int)( Math.random()*45)+1;
	               if (lotto1 == n) {
	                  n =  (int)( Math.random()*45)+1;
	                  if (lotto1 == n) {
	                     
	                  } else {
	                     lotto2 = n;
	                  } // if
	               } else {
	                  lotto2 = n;
	               } // if
	            } else {
	               lotto2 = n;
	            } // if
	         } else {
	            lotto2 = n;
	         } // if
	      }else {
	         lotto2 = n;
	      }

	}

}
