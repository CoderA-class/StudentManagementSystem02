

public class Grad extends Student{

     public boolean researchAssistant;
    private double stipend;

    private Grad(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        // Base tuition: $15,000 per semester
        double baseTuition = 15000.0;

        // Research assistants get tuition waiver
        if (researchAssistant) {
            return 0.0;
        }

        return baseTuition;
    }
    @Override
    public String getStudentType() {
        return "Graduate Student";
    }
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Research Assistant: " + (researchAssistant ? "Yes" : "No"));
        System.out.println("Stipend: $" + String.format("%.2f", stipend));
        System.out.println("Total Tuition: $" + String.format("%.2f", calculateTuition()));

    }
    public static class Builder {
        // Required parameters
        private String studentId;
        private String name;

        // Optional parameters
        private String email = "";
        private String department = "";
        private boolean researchAssistant = false;
        private double stipend = 0.0;

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

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public Grad build() {
            return new Grad(this);
        }
    }
}
