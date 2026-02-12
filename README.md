/* The builder design model i used to create objects of the grad and undergrad students. 
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
Grad student class and undergrad student class both have ovveridden methods of the calculateTuition() and displayStudentDetails() and getStudentType().
Both classes has a Builder class
Inheritance was applied by adding 'extends' to class Grad and class UnderGrad.
// public class Grad extends Student{ // 
