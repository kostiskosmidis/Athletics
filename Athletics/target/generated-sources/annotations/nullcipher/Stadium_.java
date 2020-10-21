package nullcipher;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nullcipher.Team;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-19T15:44:03")
@StaticMetamodel(Stadium.class)
public class Stadium_ { 

    public static volatile ListAttribute<Stadium, Team> teams;
    public static volatile SingularAttribute<Stadium, String> location;
    public static volatile SingularAttribute<Stadium, Integer> sid;

}