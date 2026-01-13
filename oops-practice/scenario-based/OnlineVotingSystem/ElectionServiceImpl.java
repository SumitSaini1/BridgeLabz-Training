package oops.scenario.OnlineVotingSystem;

import java.util.ArrayList;
import java.util.List;

// election service implementation
public class ElectionServiceImpl implements ElectionService {

    private List<Voter> voters = new ArrayList<>();
    private List<Candidate> candidates = new ArrayList<>();

    @Override
    public void registerVoter(int id, String name) {
        voters.add(new Voter(id, name));
    }

    @Override
    public void addCandidate(int id, String name) {
        candidates.add(new Candidate(id, name));
    }

    @Override
    public void castVote(int voterId, int candidateId) throws DuplicateVoteException {

        Voter voter = null;
        Candidate candidate = null;

        for (Voter v : voters) {
            if (v.getVoterId() == voterId) {
                voter = v;
                break;
            }
        }

        if (voter == null) {
            System.out.println("voter not found");
            return;
        }

        if (voter.hasVoted()) {
            throw new DuplicateVoteException("voter has already voted");
        }

        for (Candidate c : candidates) {
            if (c.getCandidateId() == candidateId) {
                candidate = c;
                break;
            }
        }

        if (candidate == null) {
            System.out.println("candidate not found");
            return;
        }

        candidate.incrementVote();
        voter.markVoted();
        System.out.println("vote cast successfully");
    }

    @Override
    public void declareResult() {
        System.out.println("\n----- election result -----");
        for (Candidate c : candidates) {
            System.out.println(c.getCandidateName() + " : " + c.getVoteCount() + " votes");
        }
    }
}
