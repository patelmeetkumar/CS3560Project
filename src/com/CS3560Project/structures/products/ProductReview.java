package com.CS3560Project.structures.products;

import com.CS3560Project.exceptions.ParseFailureException;
import com.CS3560Project.utility.Utils;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class ProductReview {
    private String id;
    private double rating;
    private String review;

    public Object[] fieldsToArray() {
        List<Object> fieldList = new ArrayList<>();

        fieldList.add(getId());
        fieldList.add(getRating());
        fieldList.add(getReview());

        return fieldList.stream().toArray(Object[]::new);
    }

    @Override
    public String toString() {
        return "{rating:" + getRating() + ",review:\"" + getReview() + "\"}";
    }

    public static ProductReview createInstance(ResultSet set) {
        try {
            // TODO Look at user for how to fill this in.
            // set field names are in discord
            return null;
        } catch (Exception e) {
            Utils.log("Could not parse returned list.");
            throw new ParseFailureException(set, ProductReview.class);
        }
    }
}
