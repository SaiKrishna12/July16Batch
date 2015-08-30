package day8;

public class Qedge {
	int fee;
	String course;
	public void courseDetails(int fee,String course)
	{
		this.fee=fee;
		this.course=course;
	}
	public static void main(String[] args) {
		Qedge q=new Qedge();
		q.courseDetails(11111,"QTP");
		System.out.println(q.fee+"--"+q.course);
	}

}
