package org.itstep;

public class WorkWithGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    GroupOfStudents group = new GroupOfStudents();
    group.setName(" ST 20 ");
    
    for (int i = 0; i < 15; i++){
    	
    	Student student = new Student(("ignatenko2207" + (i+1)), ("myPass" + (i +1)), "Alex", "Kiev");
    	group.addStudentToGroup(student);
    	
    }
    
    	System.out.println("My best group is" + group.getName());
    	System.out.println("List of Students:");
    
    	for (Student student : group.getStudents()) {
    		if (student.getCity().equals("Kiev")) {
    			
    			System.out.println(" Login:" + student.getLogin() + " Name:" + student.getName() + " I'm from:"
    					+ student.getCity());
    			
    			System.out.println(student.hashCode());
    		}
    	}
}
}