public class Student{
    private String name;
    private static int count=0;
    private int[] total_marks;
    private int rollNo;

        public Student() {
            name = "";
            count++;
            rollNo=count;
            total_marks =new int[3];
            //can call parametrised constructor here
        }

        public Student(String na, int[] m){
            count++;
            this.name=na;
            this.rollNo=count;
            total_marks=m;
        }

        public void setName(String name){
            this.name=name;

        }
        //this. is not mandatory
        public String getName(){
            return this.name;
        }

        public void setRollNo(int rollNo){
            this.rollNo=rollNo;
        }

        public int getRollNo(){
            return this.rollNo;
        }

        public void set_total_marks(int[] total_marks){
            this.total_marks=total_marks;
        }

        public int[] getTotal_marks(){
            return this.total_marks;
        }

    public static void main(String [] args){
        Student s1=new Student();
        Student s2=new Student("Vachan",new int[]{23,45,32});
        s1.displayStudent();
        s2.displayStudent();

        System.out.println("Count: "+ count);

    }

    public void displayStudent(){
        System.out.println("RollNo: "+this.getRollNo());
            System.out.println("Name: "+this.getName());
            int arr[]=this.getTotal_marks();
            System.out.println("Marks: ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public double calcAverage(){
            double total=0.0;
            for(int marks : total_marks){
                total=total+marks;
            }
            return total/total_marks.length;
        }

        public double calcPercentage(){
            double total=0.0;
            for(int mark:total_marks){
                total+=mark;
            }
            return ((total/300)*100);
        }

}


