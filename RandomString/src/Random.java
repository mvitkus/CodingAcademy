
public class Random {
	
	public String generateRandomString() {
		
		 String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		
		StringBuilder sb = new StringBuilder(3); 
		
		for (int i = 0; i < 3; i++) { 
			  
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  

            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
	}

}
