package alpha.profile.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.cassandra.core.mapping.*;
import org.springframework.data.cassandra.core.mapping.Table;
import javax.persistence.*;
import javax.persistence.Column;


@Table("profile")
@Data
public class Profile {

    @PrimaryKey
    @Column(name="email",length=30,nullable=false)
    @NonNull
    private String email;

    @Column(name="user_id")
    private String userId;

    @Column(name="first_name",length=50,nullable=false,unique=true)
    private String firstName;

    @Column(name="last_name",length=50,nullable=false,unique=true)
    private String lastName;

    @Column(name="mobile",length=10,nullable=false)
    private String mobile;

    @Column(name="password",length=30,nullable=false)
    private String password;
}