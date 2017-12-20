public class ReverseCli {
   
   public static void main(String[] commandLine) {
      
      // problem 1
      // int i = 0;
      // for(String option: commandLine) {
         
      //    System.out.println(i + ": " + option);
      //    i++;
      // }

   	for(String option: commandLine) {

   		System.out.println(reverse_recursive(option));
   	}

   	int sum = 0;

   	for(String intpar: commandLine) {
   		int realint = Integer.parseInt(intpar);
   		sum = sum + realint;
   	}

   	System.out.println(sum);

    //tests

    System.out.println(reverse_recursive("racecar")); //expecting racecar
	System.out.println(reverse_recursive("matthew")); //expecting wehttam
	System.out.println(reverse_recursive("")); //expecting
	}
      

   public static String reverse_recursive(String s) {

   	if (s.length() == 0) {
   		return "";
   	}

   	int slength = s.length();

   	String notEnd = s.substring(0,slength-1);

   	return s.substring(slength-1) + reverse_recursive(notEnd);
   }


}