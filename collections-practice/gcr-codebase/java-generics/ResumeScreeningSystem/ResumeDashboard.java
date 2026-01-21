package ResumeScreeningSystem;

import java.util.List;

class ResumeDashboard {

    public static void displayAll(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> r : resumes) {
            System.out.println("Candidate: " + r.getCandidateName());
        }
    }
}
