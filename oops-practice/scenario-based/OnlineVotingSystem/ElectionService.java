package oops.scenario.OnlineVotingSystem;



// election operations abstraction
public interface ElectionService {

    void registerVoter(int id, String name);

    void addCandidate(int id, String name);

    void castVote(int voterId, int candidateId) throws DuplicateVoteException;

    void declareResult();
}
