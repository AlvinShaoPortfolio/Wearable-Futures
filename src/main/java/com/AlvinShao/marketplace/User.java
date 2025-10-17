package com.AlvinShao.marketplace;

import java.util.ArrayList;
import java.util.List;

public class User{
    private Integer id;
    private List<Clothes> shoppingBin = new ArrayList<>();

    public User(){}
    public User(Integer id){
        this.id = id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
}
