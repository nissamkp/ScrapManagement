package net.javaguides.catalogservice.controller;

import lombok.AllArgsConstructor;


import net.javaguides.catalogservice.dto.CatalogDto;
import net.javaguides.catalogservice.service.CatalogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/catalogs")
@AllArgsConstructor
public class CatalogController {

    private CatalogService catalogService;

    // Build save Catalog REST API
    @PostMapping
    public ResponseEntity<CatalogDto> saveCatalogResponse(@RequestBody CatalogDto catalogDto){
        CatalogDto savedCatalog = catalogService.saveCatalog(catalogDto);
        return new ResponseEntity<>(savedCatalog, HttpStatus.CREATED);
    }

    // Build get Catalog rest api
    @GetMapping("{catalog-id}")
    public ResponseEntity<CatalogDto> getCatalogResponse(@PathVariable("catalog-id") String catalogId){
        CatalogDto catalogDto = catalogService.getCatalogById(catalogId);
        return new ResponseEntity<>(catalogDto, HttpStatus.OK);
    }
}
