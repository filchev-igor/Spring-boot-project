package lt.vilniustech.filchev.hospital.repository;

import lt.vilniustech.filchev.hospital.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface DoctorRepository extends JpaRepository<Doctor, UUID> {
}
