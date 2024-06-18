package array_and_array_list;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSAExampleCustomKeys {

	public static void main(String[] args) throws Exception {

		rsa();
	}

	public static void rsa() throws Exception {

		String publicKeyString = "cHVibGljS2V5";
		String privateKeyString = "cHJpdmF0ZUtleQ==";

		System.out.println("public decode :: " + new String(Base64.getDecoder().decode(publicKeyString))
				+ "\nprivate key :: " + new String(Base64.getDecoder().decode(privateKeyString)));

		PublicKey publicKey = getPublicKey(publicKeyString);
		PrivateKey privateKey = getPrivateKey(privateKeyString);

		String data = "Hii I'm Dhawale Nilesh";

		String encryptedData = encryptData(data, publicKey);

		String decryptedData = decryptData(encryptedData, privateKey);

		System.out.println("Original Data :: " + data + "\nEncrypted Data :: " + encryptedData + "\nDecrypted Data :: "
				+ decryptedData);

	}

	// generate public key
	public static PublicKey getPublicKey(String publicKeyString) throws Exception {

		// convert to base64
		byte[] base64 = publicKeyString.getBytes();
		// X509EncodedKeySpec
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(base64);
		// key factory
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		// generate public key
		return keyFactory.generatePublic(keySpec);
	}

	// generate private key
	public static PrivateKey getPrivateKey(String privateKeyString) throws Exception {

		// get base64
		byte[] base64 = Base64.getDecoder().decode(privateKeyString);
		// PKCS8EncodedKeySpec
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(base64);
		// key factory
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		// get private key
		return keyFactory.generatePrivate(keySpec);
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
