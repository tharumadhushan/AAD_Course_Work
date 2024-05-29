package lk.ijse.gdse65.AAD_Course_Work.repo;

import lk.ijse.gdse65.AAD_Course_Work.entity.CustomerEntity;
import lk.ijse.gdse65.AAD_Course_Work.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryDAO extends JpaRepository<InventoryEntity ,String> {
    Optional<InventoryEntity> findById(String item);
}
