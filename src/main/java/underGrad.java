public class underGrad extends Student{

    private int creditHours;
    private double scholarshipAmount;

    private underGrad(Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double baseT = creditHours * 20.0;
        return baseT - scholarshipAmount;


    }
}
