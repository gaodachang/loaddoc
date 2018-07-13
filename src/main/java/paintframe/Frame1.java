package paintframe;



import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Frame1 extends JFrame{

//	private static JLabel label;
	private static Frame1 st;
	private JButton chooseDoc;
	private JButton savePath;
	private JTextField serachDocTxt;
	private JTextField saveDocTxt;
	private static final long serialVersionUID = 1L;
	/**
	 * 画窗体
	 */
	public Frame1(){
		//设置窗体名字
		super("RoutineWork");
		//设置默认的关闭操作
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗体大小
		this.setSize(960,720);
		this.setVisible(true);
		//设置窗体布局
		this.setLayout(new FlowLayout());
//		//添加标签
//		label = new JLabel("A Label");
		//添加文本输入框
		serachDocTxt = new JTextField(10);
		add(serachDocTxt);
		serachDocTxt.setBounds(100, 100, 5, 10);
		//添加按钮
		chooseDoc = new JButton("选择文件夹");
		savePath = new JButton("保存路径");
		add(chooseDoc);
		add(savePath);
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				 st = new Frame1();
			}
		});
//		//设置窗体宽高
//		frame.setSize(960,720);
//		//按钮
//		Button choosedoc = new Button("选择文件夹");
//		frame.add(choosedoc);
//		//设置窗体可见
//		frame.setVisible(true);
	}
}
