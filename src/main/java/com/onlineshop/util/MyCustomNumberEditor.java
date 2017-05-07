package com.onlineshop.util;

/**
 * Created by smc on 5/7/2017.
 */

import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.util.StringUtils;

public class MyCustomNumberEditor extends CustomNumberEditor {

    public MyCustomNumberEditor(Class<? extends Number> numberClass) throws IllegalArgumentException {
        super(numberClass, true);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (!StringUtils.hasText(text)) {
            setValue(0);
        }else {
            super.setAsText(text.trim());
        }
    }

}