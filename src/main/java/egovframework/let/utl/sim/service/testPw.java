package egovframework.let.utl.sim.service;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 
public class testPw {
	private static final Logger LOGGER = LoggerFactory.getLogger(testPw.class);

	public static void main(String[] args) throws Exception {
		 
 		LOGGER.info("------------------------------------------------------"+encryptPassword("kpji92!!","admin"));

	}
	 public static String encryptPassword(String password, String id) throws Exception {

			if (password == null) {
			    return "";
			}
		
			byte[] hashValue = null; // 해쉬값
		
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			
			md.reset();
			md.update(id.getBytes());
			
			hashValue = md.digest(password.getBytes());
		
			return new String(Base64.encodeBase64(hashValue));
	    }
}
