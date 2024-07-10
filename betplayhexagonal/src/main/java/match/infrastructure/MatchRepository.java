package match.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;

import config.DatabaseConfig;
import match.domain.Match;
import match.domain.MatchService;

public class MatchRepository implements MatchService {

    @Override
    public void CreateMatch(Match match) {
        String sql = "INSERT INTO match() VALUES()";
        try(
            Connection connection = DatabaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)){
                        
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    

}
