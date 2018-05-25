package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demol02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         File f = new File("aa.txt");
         FileOutputStream ois=new FileOutputStream(f,true);
         /* ois.write(98);*/
          String s="hello abc";
          //字符串转化为字节数组
         byte[] b=s.getBytes("UTF-8");
         
         ois.write(b);
          ois.close();
	}

}
