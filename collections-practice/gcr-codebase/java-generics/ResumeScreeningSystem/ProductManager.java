package ResumeScreeningSystem;

class ProductManager extends JobRole {
    @Override
    public String getRequiredSkills() {
        return "Communication, Planning, Strategy";
    }

    @Override
    public int getMinExperience() {
        return 4;
    }
}