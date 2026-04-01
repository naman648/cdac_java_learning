public class Department {

    public static void main(String[] args){
        int marks1[]={12,34,56};
        Student s1=new Student("Anant",marks1);

        int marks2[]={56,87,67};
        Student s2=new Student("Vachan",marks2);

        int marks3[]={87,45,23};
        Student s3=new Student("Varnika",marks3);

        Student[] s=new Student[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;

        for(Student w :s){
            System.out.println(w);
            System.out.println(w.calcAverage());
            System.out.println(w.calcPercentage());
        }


}

}

