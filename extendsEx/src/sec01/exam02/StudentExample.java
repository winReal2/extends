package sec01.exam02;

public class StudentExample {
	StudentExample(){
		
	}
	
	public static void main(String[] args) {
		People p = new People("홍길동", "123456-1234567");
		
		Student s = new Student("학생1", "주민번호", 1);
		System.out.println("학생정보=========");
		System.out.println(s.name);
		System.out.println(s.ssn);
		System.out.println(s.studentNo);
		
		System.out.println("s.toString()=========");
		System.out.println(s.toString());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
