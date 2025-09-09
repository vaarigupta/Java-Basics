package com.modernjava.records;

import java.util.Objects;

/*
* This is a record class in Java, which is a special kind of class that is used to model immutable data.
* Record classes are immutable in nature, meaning once an instance is created, its state/values cannot be changed.
* Record classes are final by default, which means they cannot be inherited.
* Records automatically generate equals(), hashCode(), and toString() methods based on the fields defined in the record.
* It is a concise way to create data carrier classes without having to write boilerplate code like in usual class structure.
* The fields in a record are final by default, meaning they cannot be changed after the object is created.
* The fields are also public, so they can be accessed directly without getter methods.
* In this case, the Product record has three fields: name, cost, and category.
* https://chatgpt.com/s/t_68a8008b764c81919d8a14b8fdeb8271
* */
public record Product(String name,
                      Double cost,
                      String category) {

    //non-canonical constructor
    //A non-canonical constructor does not match the record components exactly.
    //It can take different parameters, perform validation, or provide default values, but must eventually delegate to the canonical constructor (directly or indirectly) using this(...).
    public Product(String name,Double cost){
        this(name,cost,"General");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name)
                && Objects.equals(cost, product.cost);
              //  && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, category);
    }

    public Product{
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if(cost==null || cost<0){
            throw new IllegalArgumentException("Product cost cannot be null or negative");
        }
    }
}
