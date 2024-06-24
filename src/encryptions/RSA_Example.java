package encryptions;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSA_Example {

	public static void main(String[] args) throws Exception {
		rsa();
	}

	public static void rsa() throws Exception {

		// get key pair
		KeyPair keyPair = generateKeyPair();
//		System.out.println("Private Key :: " + keyPair.getPrivate() + "\nPublic Key :: " + keyPair.getPublic());

		String data = "Hii I'm Nilesh Dhawale";

		String encryptedData = encryptData(data, keyPair.getPublic());

		String decryptData = decryptData(encryptedData, keyPair.getPrivate());

		System.out.println("Original Data :: " + data + "\nEncrypted Data :: " + encryptedData + "\nDecrypted Data :: "
				+ decryptData);

	}

	// get key pair
	public static KeyPair generateKeyPair() throws Exception {

		// get key pair generator
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
		// add size
		keyPairGenerator.initialize(2048, new SecureRandom());
		// generate key pair
		return keyPairGenerator.generateKeyPair();
	}

	// encrypt data
	public static String encryptData(String data, PublicKey publicKey) throws Exception {

		// get cipher
		Cipher cipher = Cipher.getInstance("RSA");
		// encryption mode on
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		// encrypt
		byte[] result = cipher.doFinal(data.getBytes());
		// convert to Base64
		return Base64.getEncoder().encodeToString(result);
	}

	public static String decryptData(String base64String, PrivateKey privateKey) throws Exception {

		// decode base64
		byte[] codedData = Base64.getDecoder().decode(base64String);
		// get cipher
		Cipher cipher = Cipher.getInstance("RSA");
		// decryption mode on
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		// decrypt
		byte[] result = cipher.doFinal(codedData);
		// byte array to string
		return new String(result);
	}
}
