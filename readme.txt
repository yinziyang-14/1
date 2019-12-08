实验五 综合性实验 学生选课系统设计
姓名：尹子阳 
学号：2018310994
班级：大数据181

一：实验目的：
1.分析学生选课系统
2.使用GUI窗体及其组件设计窗体界面
3.完成学生选课过程业务逻辑编程
4.基于文件保存并读取数据
5.处理异常


二：实验要求

1.系统角色分析及类设计
例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。
定义每种角色人员的属性，及其操作方法。
属性示例： 人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
   学生（编号、姓名、性别、所选课程、……）
   课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展。

2.要求：设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
             基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
             针对操作过程中可能会出现的各种异常，做异常处理 
             基于输入/输出编程，支持学生、课程、教师等数据的读写操作。 
             基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。

三：实验过程：

1.调整和使用之前一部分学生选课系统的源代码和选课系统GUI的代码
2.使用文件的读取和写入代码加入GUI类中。
3写入GUI类后，在实例化学生的选课主类(Stduentclass)的参数时，使用文本读取，转化为字符串，用逗号来分割学生选课的主类(Stduentclass)，用于在Gui类执行时调用。
4.设置学生姓名、学号、性别等数据后，单击“确定”键，同时应用文件写入代码，将字符串写入文本文件中。
5.设置一个Exeptions类，排除字符串为空的情况。
四：核心的实验代码(注释)及思路（详情实验代码请见其余的后缀.java文件）
1.在GUI窗口进行设计：             
                JLabel label1;
                JLabel label2;
                JLabel label3;
                JLabel label4；
                JLabel label5;
                JLabel label6;                                                                                                         //标签
	JButton button1,button2;                                                                                      //按钮
	TextArea ta1,ta2;                                                                                                   //  显示的文本框
                JTextField t1,t2,t3,t4,t5,t6,t7,t8;                                                                            //输入的8个文本框
	CheckboxGroup cbg;                                                                                          //选择组
	JComboBox b1;
                JComboBox b2;
                JComboBox b3;
                JComboBox b4;
                JComboBox b5;                                                                                                  //下拉的菜单
	JCheckBox c1,c2,c3;                                                                                           //选择的选项
	super("学生选课系统");                                                                                       //窗口名字
	label1=new JLabel("请输入学生信息和所选的课程，完成后单击确定。 ");        //输入标签显示的信息
	ta1=new TextArea(20,40);                                                                                //显示文本框长度
	ta2=new TextArea(20,40);
	button1=new JButton("确定");                                                                           //设置按钮名字
	t2=new JTextField("",10);                                                                                       // 设置输入文本框长度
	setBounds(600,300,625,600);                                                                               //设置窗口出现位置和大小
		c.setBackground(Color.white);                                                              //背景为白色
		c.setLayout(new FlowLayout(FlowLayout.LEFT));                                  //设置布局，流式布局，向左对齐		
                c.add(label2);                                                                                                       //添加标签
	c.add(t1);//添加可输入文本框
	c.add(new Checkbox("男", cbg, true)); 
	c.add(new Checkbox("女", cbg, false));                                                             //调用CheckboxGroup，选择男女
	c.add(b1);c.add(b2);c.add(b3);                                                                        //调用JCombobox，设置下拉菜单
	c.add(label5);c.add(c1);c.add(c2);c.add(c3);                                                   //调用JCheckbox，设置选项
	button2.addActionListener(this);                                                                   //调用按钮    	
                Studentclass x = null;
	Studentclass y = null;
	Studentclass z = null;
	Students students = null;
	Studentclass studentclass = null;
	x  = new Studentclass("线性代数", "300", "教102","2.5","3.0");
	y  = new Studentclass("python", "400", "教103","3.0","4.0");
	z  = new Studentclass("Java", "500", "教104","3.0","5.0");
			                                                                                           //调用Stduentclass类、Students类
    	if(e.getSource()==button1)
                ta1.append("姓名："+t1.getText()+"\n"+
		"学号："+t2.getText()+"\n"+"性别："
		+cbg.getSelectedCheckbox().getLabel()+
		"\n"+"生日："+b1.getSelectedItem()+b2.getSelectedItem()
		+b3.getSelectedItem()+"\n");
	    	                                                                                                         //输入信息后，判断设置点击Button1之后的操作
	if(c1.isSelected() && e.getSource()==button1)
	ta1.append( "课程：" + c1.getLabel()+" "+p.toString()+"\n");
	students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),p);
			                                                                                      //输入信息后，判断设置选择了选项c1并且点击Button1之后的操作，调用students类
	if(e.getSource()==button4){
		System.exit(0);
			}
			                                                                                     //点击Button4后，设置退出
	if(e.getSource()==button3)
	ta2.append("\n");
	studentclass = new Studentclass(t4.getText(),t5.getText(),
				     t6.getText(),t7.getText(),t8.getText());
				                                                                    // 输入信息后，判断设置点击Button3之后的操作，调用Studentclass类


2.设置Exceptions类，用于排除文本内空字符：
                public class Exceptions extends Exception{
	public Exceptions(){
 	}
	public Exceptions(String str){ 
            super(str);
 	}
}

3.文件的读入和读出
                 File file=new File("C:\\Users\\10001\\Desktop\\课程信息.txt");
		    try {
		        FileInputStream in=new FileInputStream(file);
		        int size=in.available();
		        byte[] buffer=new byte[size];
		        in.read(buffer);
		        in.close();
		        str=new String(buffer,"GB2312");
		    } catch (IOException e1) {
		        // TODO Auto-generated catch block
		        e1.printStackTrace();
		    }
		                                                                                                                   //打开文件，读取信息，同时排除文本空字符异常
		StringBuffer s_2=new StringBuffer();
		s_2.append(students);
		s_2.append(p);
		try {
			FileWriter fw=new FileWriter("C:\\Users\\10001\\Desktop\\test.txt");
			fw.write(s_2.toString() + "\n");
			fw.close();
		     } 
		catch (IOException n) 
		     {
			n.printStackTrace();
		     }
					                                                                     //将students类的参数写入文本文件
五：实验感想： 
通过本次综合性实验，感受到了本次实验的难度很大，通过一遍又一遍的在网上以及相关java书籍查找各种函数代码的使用以及如何综合在一起放在GUI窗口中的方法，经历了许多错误，最终写出了一个相对程序错误(bug)较少的综合学生选课实验的代码，体会到了我在java道路上还有很多的路要走，不过我会一次又一次的总结并慢慢提升自己，学到的知识会一点点的掌握。