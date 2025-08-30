package net.javaguides.catalogservice.repository;

import net.javaguides.catalogservice.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CatalogRepository extends JpaRepository<Catalog, String> {

    Optional<Catalog> findById(String catalogId);
}
