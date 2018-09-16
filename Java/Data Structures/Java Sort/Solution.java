import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
        }
        
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int i =  Double.valueOf(s2.getCgpa()).compareTo(Double.valueOf(s1.getCgpa()));
                if (i != 0) {
                    return i;
                }
                i = s1.getFname().compareTo(s2.getFname());
                if (i != 0) {
                    return i;
                }
                return Integer.valueOf(s1.getId()).compareTo(Integer.valueOf(s2.getId()));
            }
        };

        Collections.sort(studentList, comparator);
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



