package net.javaguides.catalogservice.service;


import net.javaguides.catalogservice.dto.CatalogDto;

public interface CatalogService {
    CatalogDto saveCatalog(CatalogDto catalogDto);

    CatalogDto getCatalogById(String Id);
}
