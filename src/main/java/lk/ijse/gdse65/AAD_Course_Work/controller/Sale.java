package lk.ijse.gdse65.AAD_Course_Work.controller;

import lk.ijse.gdse65.AAD_Course_Work.dto.SaleDTO;
import lk.ijse.gdse65.AAD_Course_Work.entity.SaleEntity;
import lk.ijse.gdse65.AAD_Course_Work.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sale")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:63342")
public class Sale {
    private final SaleService saleService;

//    @GetMapping("/health")
//    public String healthTest(){
//        return "Sales Ok";
//    }
//
//    @PostMapping
//    public SaleDTO saveSale(@RequestBody SaleDTO sale) {
//        return saleService.saveSale(sale);
//    }
//    @GetMapping
//    public List<SaleDTO> getAllSale() {
//        return saleService.getAllSales();
//    }

    @PostMapping
    public ResponseEntity<Void> createSale(@RequestBody SaleDTO saleDTO) {
        saleService.createSale(saleDTO);
        return ResponseEntity.ok().build();
    }

//    @GetMapping
//    public ResponseEntity<List<SaleDTO>> getAllSales() {
//        List<SaleDTO> sales = saleService.getAllSales();
//        return ResponseEntity.ok(sales);
//    }
//
//    @GetMapping("/{orderNo}")
//    public ResponseEntity<SaleDTO> getSaleById(@PathVariable String orderNo) {
//        SaleDTO sale = saleService.getSaleById(orderNo);
//        if (sale != null) {
//            return ResponseEntity.ok(sale);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PutMapping("/{orderNo}")
//    public ResponseEntity<SaleDTO> updateSale(@PathVariable String orderNo, @RequestBody SaleDTO saleDTO) {
//        SaleDTO existingSale = saleService.getSaleById(orderNo);
//        if (existingSale != null) {
//            saleDTO.setOrderNo(orderNo);
//            SaleDTO updatedSale = saleService.saveSale(saleDTO);
//            return ResponseEntity.ok(updatedSale);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{orderNo}")
//    public ResponseEntity<Void> deleteSale(@PathVariable String orderNo) {
//        SaleDTO existingSale = saleService.getSaleById(orderNo);
//        if (existingSale != null) {
//            saleService.deleteSale(orderNo);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }


//    @PostMapping
//    public SaleDTO createSale(@RequestBody SaleDTO saleDTO) {
//        return saleService.saveSale(saleDTO);
//    }
//    @GetMapping
//    public ResponseEntity<List<SaleDTO>> getAllSales() {
//        List<SaleDTO> sales = saleService.getAllSales();
//        return ResponseEntity.ok(sales);
//    }
//
//    @GetMapping("/{orderNo}")
//    public ResponseEntity<SaleDTO> getSaleById(@PathVariable String orderNo) {
//        SaleDTO sale = saleService.getSaleById(orderNo);
//        if (sale != null) {
//            return ResponseEntity.ok(sale);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PutMapping("/{orderNo}")
//    public ResponseEntity<SaleDTO> updateSale(@PathVariable String orderNo, @RequestBody SaleDTO saleDTO) {
//        SaleDTO existingSale = saleService.getSaleById(orderNo);
//        if (existingSale != null) {
//            saleDTO.setOrder_no(orderNo);
//            SaleDTO updatedSale = saleService.saveSale(saleDTO);
//            return ResponseEntity.ok(updatedSale);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{orderNo}")
//    public ResponseEntity<Void> deleteSale(@PathVariable String orderNo) {
//        SaleDTO existingSale = saleService.getSaleById(orderNo);
//        if (existingSale != null) {
//            saleService.deleteSale(orderNo);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }


}


