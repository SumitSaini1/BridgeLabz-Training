package ResumeScreeningSystem;

class ResumeAnalyzer {

    public static <T extends JobRole> void analyze(Resume<T> resume) {
        System.out.println("Analyzing Resume of: " + resume.getCandidateName());
        System.out.println("Required Skills: " + resume.getJobRole().getRequiredSkills());

        if (resume.isEligible()) {
            System.out.println("Status: Shortlisted");
        } else {
            System.out.println("Status: Rejected");
        }

        System.out.println("--------------------------------");
    }
}
