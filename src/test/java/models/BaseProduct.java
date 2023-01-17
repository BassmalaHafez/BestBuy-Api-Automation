package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseProduct {


 // Declare the request body variables
    private int id ;
    private String name ;
    private String type ;
    private double price ;
    private int shipping ;
    private String upc ;
    private String description ;
    private String manufacturer ;
    private String model ;
    private String url ;
    private String image ;

    private int total ;




    // Constructor for Get products
    public BaseProduct(){}


    //Constructor for create product
    public BaseProduct(String name , String type ,double price ,int shipping , String upc , String description
    , String manufacturer ,String model ,String url , String image){

        setName(name);
        setType(type);
        setPrice(price);
        setShipping(shipping);
        setUpc(upc);
        setDescription(description);
        setManufacturer(manufacturer);
        setModel(model);
        setUrl(url);
        setImage(image);

    }

    //Constructor for update product
    public BaseProduct(int id,String name , String type ,double price ,int shipping , String upc , String description
            , String manufacturer ,String model ,String url , String image){


        setId(id);
        setName(name);
        setType(type);
        setPrice(price);
        setShipping(shipping);
        setUpc(upc);
        setDescription(description);
        setManufacturer(manufacturer);
        setModel(model);
        setUrl(url);
        setImage(image);

    }

    // Constructor for get and delete product by id
    public BaseProduct(int id ){
        setId(id);
    }



    // set Getters and setters for the body request fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShipping() {
        return shipping;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
