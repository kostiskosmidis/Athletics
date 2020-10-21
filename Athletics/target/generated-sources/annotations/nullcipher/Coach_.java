package nullcipher;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nullcipher.Team;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-19T15:44:03")
@StaticMetamodel(Coach.class)
public class Coach_ { 

    public static volatile SingularAttribute<Coach, String> coach_name;
    public static volatile SingularAttribute<Coach, Team> team;
    public static volatile SingularAttribute<Coach, Integer> salary;
    public static volatile SingularAttribute<Coach, Integer> cid;
    public static volatile SingularAttribute<Coach, Date> start_date;

}