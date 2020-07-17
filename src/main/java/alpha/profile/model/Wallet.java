package alpha.profile.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.persistence.Column;

@Table("wallet")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Wallet {

    @PrimaryKey
    private String walletId;

    @Column(name="CARDHOLDER NAME",length=50,nullable=false,unique=true)
    private String cardholder_name;

    @Column(name="CARD_NUMBER",length=50,nullable=false,unique=true)
    private Long card_number;

    @Column(name="EXPIRY DATE",length=30,nullable=false)
    private Long expiry_date;

    @Column(name="UPI ID",length=50,nullable=false,unique=true)
    private String upi_id;

}
