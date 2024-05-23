package lk.ijse.gdse65.AAD_Course_Work.entity;

import jakarta.persistence.*;
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
    @JoinColumn(name = "employee_id", referencedColumnName = "employeeId")
    private EmployeeEntity employee;

    @OneToOne
    @JoinColumn(name = "sale_order_no", referencedColumnName = "order_no")
    private SaleEntity sale;

    // Uncomment and adjust if RefundEntity is supposed to reference InventoryEntity
    // @ManyToOne
    // @JoinColumn(name = "item_code", referencedColumnName = "item_code")
    // private InventoryEntity inventory;
}
