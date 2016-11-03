package com.futureprogress.another.newbostonsqlite;

public class Products {
    private int _id;
    private String _productname;
    private String _productColour;

    public Products(){
    }

    public Products(int _id, String productname, String productColour) {
        this._id = _id;
        this._productname = productname;
        this._productColour = productColour;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public void set_productColour(String _productColour) {
        this._productColour = _productColour;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }

    public String get_productColour() {
        return _productColour;
    }
}
