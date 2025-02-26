package lt.vilniustech.filchev.hospital.repository;

import lt.vilniustech.filchev.hospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, UUID> {
}
