package lk.ijse.gdse65.AAD_Course_Work.controller;

import lk.ijse.gdse65.AAD_Course_Work.Exception.NotFoundException;
import lk.ijse.gdse65.AAD_Course_Work.dto.CustomerDTO;
import lk.ijse.gdse65.AAD_Course_Work.dto.SupplierDTO;
import lk.ijse.gdse65.AAD_Course_Work.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/suppliers")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:63342")
public class Supplier{
    private final SupplierService supplierService;

    @GetMapping("/health")
    public String healthCheck() {
        return "suppliers OK";
    }
    @GetMapping
    public List<SupplierDTO> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }
    @PostMapping
    public SupplierDTO save(@RequestBody SupplierDTO supplierDTO){
        return supplierService.saveSupplier(supplierDTO);
    }
    @PatchMapping
    public void update(@RequestBody SupplierDTO supplierDTO) throws NotFoundException {
        supplierService.updateSupplier(supplierDTO.getSupplier_id(),supplierDTO);
    }

    @DeleteMapping("/{supplier_id}")
    public void delete(@PathVariable("supplier_id") String id) throws NotFoundException {
        supplierService.deleteSupplier(id);
    }
}
