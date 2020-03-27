package com.repl.it;

public class DifferentLength  {

	static String mixString (String s1,String s2){
	String firstValue ="";
    int length;
    if(s1.length()>s2.length()){
      length=s1.length();
    }else {
    	length=s2.length();
    }
    for(int i=0; i<length; i++) {                // yeni bir String yazdigimiz icin length olarak uzun olanin length ini kullaniyoruz cunku 
    	if(i<s1.length()) {                      // onun char' i kadar kac tane ise o kadar tekrar edecek system 
    		firstValue+=s1.charAt(i);            // ve bu buyuk olan length den s1 in length i kucuk ise s1 ile baslasin ve ilk o bitsin istiyor cunku kisa olan 
    	}                                        // once bitecek bastan bitsin istiyor ortadan baslayip da bitebilir onu istemiyor 
    	if(i<s2.length()) {                      // 1a2b3cde  olsun    abc1d2e3 ---> olmasin!   (s1 kucukken boyle )
    		firstValue+=s2.charAt(i);            
    	}
    }                                                      // eger ortak length s2. nin length inden kucuk ise yazsin diyor system error vermesin diye buyuk
                                                          // olursa out of 
	return firstValue;                                
  }
  //test case below (dont change):
    public static void main(String[] args){
    String firstValue = mixString("123","abcde");
	System.out.println(firstValue);
	String secondValue = mixString("howdy","hel");
	System.out.println(secondValue);
}
	
	
}
	
	
	


