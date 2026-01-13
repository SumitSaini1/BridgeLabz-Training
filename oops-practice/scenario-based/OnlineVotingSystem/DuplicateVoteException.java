package oops.scenario.OnlineVotingSystem;

// thrown when voter tries to vote again
public class DuplicateVoteException extends Exception {
    public DuplicateVoteException(String message) {
        super(message);
    }
}
