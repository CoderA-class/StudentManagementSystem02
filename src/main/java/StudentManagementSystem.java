public class StudentManagementSystem {

    public static void main (String[] args){
        System.out.println("STUDENT MANAGEMENT SYSTEM>>> ");
        System.out.print("..." . repeat(3));

        System.out.println("under Grad : ...");
            underGrad ug1 = new underGrad.Builder("0001","Adriaan vdw")
                    .email("vdwadriaan22@gmail.com")
                    .department("COMP SCIENCE")
                            .creditHours(10)
                                    .scholarshipAmount(1209.99)
                                            .build();
        System.out.println("Grad students ...");

            Grad grad1 = new Grad.Builder("00001","James Ford")
                    .email("jamesm@gmail.com")
                            .department("COMP SCIENCE")
                                    .researchAssistant(true)
                                            .stipend(2353.33)
                                                    .build();
        System.out.println("########");
        System.out.println("DISPLAYING ALL STUDENT DETAILS : ???");

        ug1.displayStudentDetails();
        grad1.displayStudentDetails();

        System.out.println("PolyM");
        Student[] students = {ug1, grad1};

        for (Student student : students) {
            System.out.println(student.getStudentType() + ": " + student.name +
                    " - Tuition: R" + String.format("%.2f", student.calculateTuition()));
        }

    }
}
