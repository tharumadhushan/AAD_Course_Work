package lk.ijse.gdse65.AAD_Course_Work.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "refund")
public class RefundEntity implements SuperEntity{
    @Id
    private String refundId;
    private String description;
    private Date refundDate;

    @OneToOne
    private EmployeeEntity employee;

    @OneToOne
    private SaleEntity saleItem;
}
