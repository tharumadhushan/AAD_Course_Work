package lk.ijse.gdse65.AAD_Course_Work.dto;

import jdk.jfr.Name;
import lk.ijse.gdse65.AAD_Course_Work.entity.num.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaleDTO {
    private String order_no;
    private String item_code;
    private String customer_name;
    private String item_desc;
    private int size;
    private double unit_price;
    private int item_qty;
    private double total_price;
    private Date purchase_date;
    private String payment_method;
    private double added_points;
    private String cashier_name;
}
