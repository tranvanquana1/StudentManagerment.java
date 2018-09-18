import java.util.ArrayList;

public class StudentManagerment {
    //ham studentByGroup
    public static void studentByGroup(Student[] students){
        System.out.println("Group K59CB: ");
        for(int i=0;i<3;i++){
            if(students[i].getGroup()=="K59CLC")
                System.out.println(students[i].getInfo());
        }
        System.out.println("Group K59CLC: ");
        for(int i=0;i<3;i++){
            if(students[i].getGroup()=="K59CB")
                System.out.println(students[i].getInfo());
        }
    }
    //ham sameGroup
    public static boolean sameGroup(Student x, Student y){
        return (x.getGroup()==y.getGroup());
    }
    //ham removeStudent
    public static void removeStudent(Student[] students,String id){
        for(int i=0; i<3; i++){
            if (students[i].getID()==id) {
                students[i]=students[i++];

            }
        }
    }
    //ham main
    public static void main(String[] args) {
        //tao Array
        Student[] students = new Student[100];
        Student sv1=new Student();
        sv1.getInfo();
        Student sv =new Student("Tran Van Quan","17021203","K62CAC", "tranvanquana1@gmail.com"  );
        System.out.println("Name: "+sv.getName());
        Student sv2= new Student(sv1);
        System.out.println("Information sv2: \n" +sv2.getInfo());
        sv.getInfo();
        //tao 3 student
        Student s1=new Student("Tran Khac Tien", "17020024", "K59CB", "tien@gmail.com");

        Student s2=new Student("Tran Quang A", "17020025", "K59CLC", "quanga@gmail.com");

        Student s3=new Student("Tran Thi B", "17020026", "K59CLC", "thib@gmail.com");
        //them student vao mang students
        students[0]=(s1);
        students[1]=(s2);
        students[2]=(s3);
        //sameGroup
        System.out.println("s1 va s2: " +StudentManagerment.sameGroup(s1,s2));
        //studentByGroup
        StudentManagerment.studentByGroup(students);
        //removeStudent
        StudentManagerment.removeStudent(students,"17020025");
        System.out.println("student has id: 17020025 removed");

        }
    }


