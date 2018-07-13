package doc_deal;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Read_Traversal {

	/**
	 * zipnamemap 中包含所有zip的名称<路径加名称，名称>
	 */
	Map<String,String> zipnamemap = new HashMap<String, String>();
	/**
	 * 将符合规定的文件传入集合中
	 * @param dir
	 */
	public void solveFile(File dir){
		if(dir.isDirectory()){
			File[] files = dir.listFiles();
			for(File file:files){
				if(file.isDirectory()){
					System.out.println(file);
//					System.out.println(file.getName());
					solveFile(file);
				}else {
//					System.out.println(file.getName().substring(file.getName().indexOf(".")+1));
					if("zip".equals(file.getName().substring(file.getName().indexOf(".")+1))){
//						System.out.println(file.getAbsolutePath()+"and"+file.getName());
					zipnamemap.put(file.getName(),file.getAbsolutePath());
					}
				}
			}
			
		}
	}
	/**
	 * 将符合要求的文件传出去
	 * @param zipMap 压缩文件的表
	 * @param time 需要的时间
	 */
	public void Traversal(Map<String,String> zipMap,String firstTime,String lastTime){
		Map<String,String> map = new HashMap<String,String>();
		map = zipMap;

		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
			String zipname = iter.next();
			int first = zipname.lastIndexOf("_");
			String zipNameTime = zipname.substring(first+1,zipname.length());
			
			Integer zipTime = Integer.valueOf(zipNameTime);
			Integer fTime = Integer.valueOf(firstTime);
			Integer lTime = Integer.valueOf(lastTime);
			
			if(fTime!=null&&lTime!=null&&zipNameTime!=null){
				if(zipTime<=lTime&&zipTime>=fTime){
					//需要将文件复制出去即可
					
				}
			}
		}
	}
	
	
	
	
}













