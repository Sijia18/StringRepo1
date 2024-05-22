package co.develhope.crud.repository;

import co.develhope.crud.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepo extends JpaRepository<Car, Long> {
}
