package xitong；
public class Students extends Student{

	Studentclass a ;
	Studentclass major;
	public Students(String name,String id,String sex,Studentclass a) {
		Name = name;
		Id = id;
		Sex = sex;
		major = a;

		}

	public String toString() {
	return "学生信息:  姓名：" + Name
    + "    学号：" + Id + "   性别：" + Sex + "   " + a;
	}
	public void inputName(String name){
		Name = name;
	}
                                                                                           //设置函数修改名字
	public void setCourse(Studentclass b){
		a = b;
	}

	

}