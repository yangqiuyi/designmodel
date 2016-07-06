package clonemodel;


import java.util.ArrayList;
import java.util.List;

class CloneModel {
	
	public static void main(String args[]) {
		WordDecument originDoc = new WordDecument();
		originDoc.setText("这是一篇文档");
		originDoc.addImage("图片1");
		originDoc.addImage("图片2");
		originDoc.addImage("图片3");
		originDoc.showDecument();
		
		WordDecument doc2 = originDoc.clone();
		doc2.showDecument();
		
		doc2.setText("这是修改后的doc2");
		doc2.showDecument();
		originDoc.showDecument();
	}
	

}
