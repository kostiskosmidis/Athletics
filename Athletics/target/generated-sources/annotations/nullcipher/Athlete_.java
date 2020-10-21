package nullcipher;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nullcipher.Team;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-19T15:44:03")
@StaticMetamodel(Athlete.class)
public class Athlete_ { 

    public static volatile SingularAttribute<Athlete, Date> dob;
    public static volatile SingularAttribute<Athlete, Integer> weight;
    public static volatile SingularAttribute<Athlete, Team> team;
    public static volatile SingularAttribute<Athlete, Integer> aid;
    public static volatile SingularAttribute<Athlete, String> athlete_name;
    public static volatile SingularAttribute<Athlete, Integer> age;
    public static volatile SingularAttribute<Athlete, Integer> height;

}