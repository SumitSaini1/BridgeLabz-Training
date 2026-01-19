package TimeComplexity;

public class StringConcatenationPerformance {
	public static void compare(int n) {
		String name="";
		 long startstringTime= System.nanoTime();
		 for(int i=0;i<n;i++) {
			 name=name + "hello";
		 }
		 long endstringTime= System.nanoTime();
		 long stringTotalTime = startstringTime - endstringTime;
		
		
       // stringbuffer performance
       StringBuffer stringBuffer = new StringBuffer();
       long startTimeBuffer = System.nanoTime();

       for (int i = 0; i < n; i++) {
           stringBuffer.append("hello");
       }

       long endTimeBuffer = System.nanoTime();
       long bufferTime = endTimeBuffer - startTimeBuffer;

       // stringbuilder performance
       StringBuilder stringBuilder = new StringBuilder();
       long startTimeBuilder = System.nanoTime();

       for (int i = 0; i < n; i++) {
           stringBuilder.append("hello");
       }

       long endTimeBuilder = System.nanoTime();
       long builderTime = endTimeBuilder - startTimeBuilder;

       // print results
       System.out.println("String time(ns)"+ stringTotalTime);
       System.out.println("stringbuffer time (ns): " + bufferTime);
       System.out.println("stringbuilder time (ns): " + builderTime);
       
	}

	public static void main(String[] args) {
		compare(1000);
		compare(10000);
		compare(100000);
		
		
        
        

	}

}
