package maps;

import com.jcraft.jsch.JSch;

public class JarVersionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSch jsch = new JSch();
		
		
		Package objPackage = jsch.getClass().getPackage();
		
		System.out.println(jsch.getClass().getPackage().getSpecificationVersion());
		System.out.println(jsch.getClass().getPackage().getImplementationVersion());
	}

}
