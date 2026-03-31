package ResumeScreeningSystem;

class DataScientist extends JobRole {
    @Override
    public String getRequiredSkills() {
        return "Python, ML, Statistics";
    }

    @Override
    public int getMinExperience() {
        return 3;
    }
}
