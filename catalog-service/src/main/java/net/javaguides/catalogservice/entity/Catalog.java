package net.javaguides.catalogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "catalogs")
public class Catalog {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String description;
    private String brand;
    private String sku;
    private List<String> categories;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private String currency;
    private Integer stockQuantity;
    private BigDecimal weight;
    private String dimensions;
    private List<String> tags;
    private Date createdAt;
    private Date updatedAt;
    private List<String> images;
    //private List<Variant> variants;
    private Boolean isOnSale;
    private Float averageRating;
    private Integer ratingCount;
    //private List<Review> reviews;
    //private ShippingDetails shippingDetails;
    private Boolean isAvailable;
    private String metaTitle;
    private String metaDescription;
    private List<String> seoTags;
    private String productType;
    private String status;
    private String warranty;
    private String originCountry;
    private String supplierId;

    public Catalog(String id, String name, String description, String brand, String status, List<String> categories, BigDecimal price, BigDecimal discountPrice, String currency, Integer stockQuantity, BigDecimal weight, String dimensions, List<String> tags, Date createdAt, Date updatedAt, List<String> images, Boolean isOnSale, Float averageRating, Integer ratingCount, Boolean isAvailable, String metaTitle, String metaDescription, List<String> seoTags, String productType, String originCountry, String warranty, String sku) {
    }
}
