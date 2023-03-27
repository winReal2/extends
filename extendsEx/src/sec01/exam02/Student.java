package sec01.exam02;

// 자식 클래스에서 부모클래스를 정의한다
// 자식이 부모를 선택  (extends)
public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		// super : 부모의 생성자를 호출 (부모 기본생성자가 있어야 오류안남)
		// 매개변수로 입력된 값(홍길동, 123...)을 받아서 부모생성자를 호출
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public String toString() {
		return name +"/"+ ssn +"/"+ studentNo;
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
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
		
	
}
