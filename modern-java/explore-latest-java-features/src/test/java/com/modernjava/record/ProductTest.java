package com.modernjava.record;

import com.modernjava.records.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductCreation(){

        Product product = new Product("Laptop", 1000.0, "Electronics");
        System.out.println("Product: " + product);
        assertEquals("Laptop", product.name());
        assertEquals(1000.0, product.cost());
        assertEquals("Electronics", product.category());
    }

    @Test
    void testProductCreationWithEmptyName(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            new Product("", 1000.0, "Electronics");
        });
        assertEquals("Product name cannot be null or empty", exception.getMessage());
    }

    @Test
    void testProductCreationWithNegativeCost(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            new Product("Laptop", -1000.0, "Electronics");
        });
        assertEquals("Product cost cannot be null or negative", exception.getMessage());
    }


    //this is the overloaded constructor test, which sets default category to "General"
    //non-canonical constructor test
    @Test
    void testProductCreationWithDefaultCategory(){
        Product product = new Product("Table", 150.0);
        System.out.println("Product: " + product);
        assertEquals("Table", product.name());
        assertEquals(150.0, product.cost());
        assertEquals("General", product.category());
    }

    @Test
    void testCompareProducts(){
        Product product1 = new Product("Laptop", 1000.0, "Electronics");
        Product product2 = new Product("Laptop", 1000.0, "Electronics");
        Product product3 = new Product("Table", 150.0);

        //equals and hashCode are automatically generated based on fields
        assertEquals(product1, product2);
        assertNotEquals(product1,product3);
    }

    @Test
    void testCompareProductsWithDifferentCategory(){
        Product product1 = new Product("Laptop", 1000.0, "Electronics");
        Product product2 = new Product("Laptop", 1000.0, "Computers");

        //equals method overridden to ignore category field
        assertEquals(product1, product2);
    }

  

}