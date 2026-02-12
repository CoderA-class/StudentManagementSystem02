public class underGrad extends Student {

    private int creditHours;
    private double scholarshipAmount;

    private underGrad(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double baseT = creditHours * 20.0; //not sure what they pay
        return baseT - scholarshipAmount;


    }
@Override
public String getStudentType(){
        return "UnderGraduation Student";
}

    public void displayStudentDetails(){
        super.displayStudentDetails();
    System.out.println("CreditHours : "  + creditHours);
    System.out.println("Sholar amount R : " + String.format("%.2f" , scholarshipAmount));
    System.out.println("Tuition amount  R :" + String.format("%.2f" , calculateTuition()));
    System.out.println("/c/c/c/c/c/c/c");
}

    public static class Builder {

        private String studentId;
        private String name;


        private String email = "";
        private String department = "";
        private int creditHours = 0;
        private double scholarshipAmount = 0.0;

        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public underGrad build() {
            return new underGrad(this);
        }
    }
}
