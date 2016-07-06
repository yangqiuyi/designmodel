package clonemodel;

import java.util.ArrayList;
import java.util.List;

public class WordDecument implements Cloneable{
	
	 private String mText ;
	 private ArrayList<String> mImages = new ArrayList<String>();
	 
	 @Override
	 protected WordDecument clone(){
		 try{
			 WordDecument doc = (WordDecument)super.clone();
			 doc.mText = this .mText;
			 doc.mImages = this.mImages;
			 return doc;
		 }catch(Exception e){
			 return null;
		 }
	 } 
	 public String getText(){
		 return mText;
	 }
	 public void setText(String mText){
		 this.mText = mText;
	 }
	 public List<String> getImages(){
		 return mImages;
	 }
	 public void addImage(String img){
		 this.mImages.add(img);
	 }
	 public void showDecument(){
		 System.out.println("mText"+mText);
		 for(String imgName :mImages){
			 System.out.println("Images name:"+imgName);
		 }
		 System.out.println("-------------------");
	 }
}
