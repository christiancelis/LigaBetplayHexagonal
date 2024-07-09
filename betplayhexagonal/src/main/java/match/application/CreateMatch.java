package match.application;

import match.domain.Match;
import match.domain.MatchService;

public class CreateMatch {
    private final MatchService matchservice;

    public CreateMatch(MatchService matchService){
        this.matchservice = matchService;
    }

    public void execute(Match match){
        matchservice.CreateMatch(match);
    }
        
}
