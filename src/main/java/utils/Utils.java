package utils;
import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class Utils {
	
	public static String generateRandomString(int l) {
		
	int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = l;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }  
    return buffer.toString();	
}
	

	public static String random_ISO (int a) {
		String randomElement = "";
		Random rand = new Random();
		    List<String> givenList = Arrays.asList(".com", ".lt");	 
		    for (int i = 0; i < a; i++) {
		       int randomIndex = rand.nextInt(givenList.size());
		       randomElement = givenList.get(randomIndex);     
		    }	    
		return randomElement;
	}

}

