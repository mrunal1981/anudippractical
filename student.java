public class student{
      static  String college=" dyptc ";
        String name;
        int age;
        student(String y,int z)
        {
            name=y;
            age=z;
        }
        void display(){
            // System.out.println(college);
            System.out.println(name);
            System.out.println(age);
        }
        public static void main(String[] args) {
            student s1=new student("mrunal",23);
            student s2=new student("krunal",24);
            s1.display();
            s2.display();
        }
}
