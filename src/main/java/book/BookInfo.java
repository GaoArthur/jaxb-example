package book;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder = {"publication_date"})
@Data
public class BookInfo {

    private String isbn;

    @XmlElementWrapper(name = "categories")
    @XmlElement(name = "category")
    private List<String>categories;

    @XmlElementWrapper(name = "book_names")
    @XmlElement(name = "book_name")
    private List<String>book_names;

    private double rating_sum;
    private String cover;
    private String series;
    private String language;
    private String author;
    private String introduction;

    @XmlElementWrapper(name = "prices")
    @XmlElement(name = "price")
    private List<Price> prices;

    private boolean available;

    @XmlElement(name = "delivery")
    private List<Delivery> deliveries;

    private String description;

    private String format;
    private String dimension;
    //not working
    //@XmlJavaTypeAdapter(LocalDateAdapter.class)
    //private LocalDate publication_date;
    private String publication_date;
    private String publisher;
    private String imprint;
    private String publication_CityOrCountry;
    private String isbn10;
    private String isbn13;
    private int bestseller_rank;

    private List<String>author_description;

}
