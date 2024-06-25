package utilities;

import java.util.Random;

public class CommonUtility {

	public String generateString() 
	{
		Random r=new Random();
		   String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		      StringBuilder generatedString= new StringBuilder();
		      for (int i = 0; i < 2; i++) {
		          int randonSequence = r .nextInt(CHARACTERS.length());
		          generatedString.append(CHARACTERS.charAt(randonSequence));
		      }
		      return generatedString.toString();
	}
}
