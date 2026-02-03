package FactoryRobotHazard;
import java.util.Scanner;

public class UserInterFace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {
            System.out.println("=== Robot Hazard Risk Assessment ===");

            System.out.print("Enter arm precision (0.0 to 1.0): ");
            double armPrecision = scanner.nextDouble();

            System.out.print("Enter worker density "
            		+ "(1 to 20): ");
            int workerDensity = scanner.nextInt();

            scanner.nextLine(); 

            System.out.print("Enter machinery state (Worns / Faulty / Critical): ");
            String machineryState = scanner.nextLine();

            double riskScore = auditor.CalculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            System.out.println("Hazard Risk Score: " + riskScore);

        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input type. Please enter correct values.");
        } finally {
            scanner.close();
        }
    }
}
