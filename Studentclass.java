package xitong；

public class Studentclass {
	String Id;
	String Name;
	String Place;
	String getPlace() {
	    return Place;
	  }
	String getId() {
	    return Id;
	  }
	String getName() {
	    return Name;
	  }
	String Time;
	String getTime() {
	    return Time;
	  }
	String Score;
	String getScore() {
	    return Score;
	  }
	public Studentclass(String name,String id,String place,String time,String score) {
		Name = name;
		Id = id;
		Place = place;
		Time = time;
		Score = score;
		}
	public void inputNew(String name,String id,String place,String time,String score){
		Name = name;
		Id = id;
		Place = place;
		Time = time;
		Score = score;
	}
	public String toString() {
	return"\n"+"     课程名：" + Name
			+"\n"+ "     课程号：" + Id +"\n"+ "     上课地点：" + Place+"\n" + "     课程时间：" + Time + "小时"+"\n" 
	+ "     课程学分：" +  Score + "分" ;
	}
}