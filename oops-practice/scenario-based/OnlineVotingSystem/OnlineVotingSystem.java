package oops.scenario.OnlineVotingSystem;

public class OnlineVotingSystem {

    public static void main(String[] args) {

        ElectionService election = new ElectionServiceImpl();

        election.registerVoter(1, "amit");
        election.registerVoter(2, "rahul");

        election.addCandidate(101, "candidate a");
        election.addCandidate(102, "candidate b");

        try {
            election.castVote(1, 101);
            
            election.castVote(2, 102);
            election.castVote(1, 102);
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        
        election.declareResult();
    }
}
