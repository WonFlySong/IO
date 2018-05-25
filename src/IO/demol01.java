package IO;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class demol01 {

	public static void main(String[] args) throws Exception {
	long start=	System.currentTimeMillis();
     //创建File对象
//		File f = new File("d:/aa.txt");
	 //创建字节输入流对象
		FileInputStream fis=new FileInputStream(new File("d:/aa.txt"));
	//读数据
		int b=fis.read();
		while(b!=-1){
			System.out.println((char)b);
			b=fis.read();
					
		}
		//关闭资源
		fis.close();
		long end=System.currentTimeMillis();
		System.out.println("一共花费了"+(end-start)+"毫秒");
	}

}
