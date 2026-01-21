package ResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Sumit", 3, new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Aman", 2, new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Neha", 5, new ProductManager());

        ResumeAnalyzer.analyze(r1);
        ResumeAnalyzer.analyze(r2);
        ResumeAnalyzer.analyze(r3);

        List<Resume<? extends JobRole>> resumeList = new ArrayList<>();
        resumeList.add(r1);
        resumeList.add(r2);
        resumeList.add(r3);

        ResumeDashboard.displayAll(resumeList);
    }
}
