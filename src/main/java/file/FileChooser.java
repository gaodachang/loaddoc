package file;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
 
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class FileChooser extends JFrame implements ActionListener{
    JButton open=null;
    private JButton chooseDoc=null;
	private JButton savePath=null;
	private JTextField serachDocTxt;

    public static void main(String[] args) {
        new FileChooser();
    }
    public FileChooser(){
    	//设置窗体名字
		super("RoutineWork");
		//设置默认的关闭操作
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗体大小
		this.setSize(960,720);
		this.setVisible(true);
		//设置窗体布局
		this.setLayout(new FlowLayout());
		//添加文本输入框
		serachDocTxt = new JTextField(10);
		add(serachDocTxt);
		serachDocTxt.setBounds(100, 100, 5, 10);
		
		chooseDoc=new JButton("选择文件夹");
        this.add(chooseDoc);
        chooseDoc.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e) {
        JFileChooser jfc=new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );
        jfc.showDialog(new JLabel(), "选择");
        File file=jfc.getSelectedFile();
        if(file!=null){
        if(file.isDirectory()){
        	//获取到的文件夹名称及路径全称
            System.out.println("文件夹:"+file.getAbsolutePath());
        }
//        else if(file.isFile()){
//            System.out.println("文件:"+file.getAbsolutePath());
//        }
        //获取文件名称
        System.out.println(jfc.getSelectedFile().getName());
         
    }
    }
 
}