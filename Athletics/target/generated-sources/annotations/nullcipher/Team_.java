package nullcipher;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nullcipher.Athlete;
import nullcipher.Coach;
import nullcipher.Stadium;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-19T15:44:03")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile ListAttribute<Team, Stadium> stadiums;
    public static volatile ListAttribute<Team, Athlete> athlete;
    public static volatile SingularAttribute<Team, String> sport;
    public static volatile SingularAttribute<Team, Coach> coach;
    public static volatile SingularAttribute<Team, Integer> tid;

}