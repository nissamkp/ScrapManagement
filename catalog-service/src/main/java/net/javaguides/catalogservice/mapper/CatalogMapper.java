package net.javaguides.catalogservice.mapper;

import net.javaguides.catalogservice.dto.CatalogDto;
import net.javaguides.catalogservice.entity.Catalog;


import java.util.Optional;

public class CatalogMapper {

    public static CatalogDto mapToCatalogDto(Optional<Catalog> catalog){
        CatalogDto catalogDto = new CatalogDto(
                catalog.get().getId(),
                catalog.get().getName(),
                catalog.get().getDescription(),
                catalog.get().getBrand(),
                catalog.get().getStatus(),
                catalog.get().getCategories(),
                catalog.get().getPrice(),
                catalog.get().getDiscountPrice(),
                catalog.get().getCurrency(),
                catalog.get().getStockQuantity(),
                catalog.get().getWeight(),
                catalog.get().getDimensions(),
                catalog.get().getTags(),
                catalog.get().getCreatedAt(),
                catalog.get().getUpdatedAt(),
                catalog.get().getImages(),
                catalog.get().getIsOnSale(),
                catalog.get().getAverageRating(),
                catalog.get().getRatingCount(),
                catalog.get().getIsAvailable(),
                catalog.get().getMetaTitle(),
                catalog.get().getMetaDescription(),
                catalog.get().getSeoTags(),
                catalog.get().getProductType(),
                catalog.get().getOriginCountry(),
                catalog.get().getWarranty(),
                catalog.get().getSku()

        );
        return catalogDto;
    }

    public static Catalog mapToCatalog(CatalogDto catalogDto){
        /*Catalog catalog = new Catalog(
                catalogDto.getId(),
                catalogDto.getName(),
                catalogDto.getDescription(),
                catalogDto.getBrand(),
                catalogDto.getStatus(),
                catalogDto.getCategories(),
                catalogDto.getPrice(),
                catalogDto.getDiscountPrice(),
                catalogDto.getCurrency(),
                catalogDto.getStockQuantity(),
                catalogDto.getWeight(),
                catalogDto.getDimensions(),
                catalogDto.getTags(),
                catalogDto.getCreatedAt(),
                catalogDto.getUpdatedAt(),
                catalogDto.getImages(),
                catalogDto.getIsOnSale(),
                catalogDto.getAverageRating(),
                catalogDto.getRatingCount(),
                catalogDto.getIsAvailable(),
                catalogDto.getMetaTitle(),
                catalogDto.getMetaDescription(),
                catalogDto.getSeoTags(),
                catalogDto.getProductType(),
                catalogDto.getOriginCountry(),
                catalogDto.getWarranty(),
                catalogDto.getSku()
        );*/
        Catalog catalog=new Catalog();
        catalog.setId(catalogDto.getId());
        catalog.setName(catalogDto.getName());
        catalog.setBrand(catalogDto.getBrand());
        catalog.setDescription(catalogDto.getDescription());
        return catalog;
    }
}
