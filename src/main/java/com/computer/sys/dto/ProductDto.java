package com.computer.sys.dto;


import java.io.Serializable;
import java.util.Date;

public class ProductDto implements Serializable {


    private String designation;

    private String description;

    private Date creationDate;

    private Date endDate;

    public ProductDto() {
    }


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "designation='" + designation + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", endDate=" + endDate +
                '}';
    }
}

