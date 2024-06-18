package array_and_array_list;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AES_Encryption_Example {

	public static void main(String[] args) throws Exception {

		AES_Encryption();
		// Note ::
		// this encryption is simple if we want to use
		// our custom secret key we need to use
		/*
		 * String customKeyString = "MyCustomSecretKey";
		 * SecretKey secretKey = new SecretKeySpec(customKeyString.getBytes(), "AES");
		 */
	}

	public static void AES_Encryption() throws Exception {

		// get secrete key
		SecretKey secretKey = generateKey();
		System.out.println("secreate key :: " + secretKey);

		// data to encryption
		String data = "Hii I'm Dhawale Nilesh";
		String encnryptedData = encryptData(data, secretKey);
		String deCryptedData = decryptData(encnryptedData, secretKey);

		System.out.println("Original Data :: " + data + "\nEncrypted Data :: " + encnryptedData + "\nDecrypted Data :: "
				+ deCryptedData);

	}

	// secrete key generate
	public static SecretKey generateKey() throws Exception {

		// get key generator
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		// set key size
		keyGenerator.init(256);
		// get key
		return keyGenerator.generateKey();
	}

	// Encryption
	public static String encryptData(String data, SecretKey secretKey) throws Exception {

		// get cipher
		Cipher cipher = Cipher.getInstance("AES");
		// Encryption Mode On
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		// Encrypt
		byte[] result = cipher.doFinal(data.getBytes());
		// byte to base64
		return Base64.getEncoder().encodeToString(result);
	}

	// Decryption
	public static String decryptData(String base64Data, SecretKey secretKey) throws Exception {

		// get byte from base64
		byte[] codedData = Base64.getDecoder().decode(base64Data);
		// get cipher
		Cipher cipher = Cipher.getInstance("AES");
		// decrypt mode
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		// decode
		byte[] finalResult = cipher.doFinal(codedData);
		// convert to string
		return new String(finalResult);

	}
}
