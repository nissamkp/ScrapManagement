package net.javaguides.catalogservice.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.catalogservice.dto.CatalogDto;
import net.javaguides.catalogservice.entity.Catalog;
import net.javaguides.catalogservice.mapper.CatalogMapper;
import net.javaguides.catalogservice.repository.CatalogRepository;
import net.javaguides.catalogservice.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private CatalogRepository catalogRepository;

    @Override
    public CatalogDto saveCatalog(CatalogDto catalogDto) {

        // convert department dto to catalog jpa entity
        Catalog catalog = CatalogMapper.mapToCatalog(catalogDto);

        Catalog savedCatalog = catalogRepository.save(catalog);

        CatalogDto savedCatalogDto = CatalogMapper.mapToCatalogDto(Optional.of(savedCatalog));

        return savedCatalogDto;
    }

    @Override
    public CatalogDto getCatalogById(String catalogId) {

        Optional<Catalog> catalog = catalogRepository.findById(catalogId);
        CatalogDto catalogDto = CatalogMapper.mapToCatalogDto(catalog);

        return catalogDto;
//        return  null;
    }
}
