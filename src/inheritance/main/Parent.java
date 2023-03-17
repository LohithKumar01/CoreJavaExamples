package inheritance.main;

public class Parent {

    private String _private;
    protected String _protected;
     String _default;
    public String _public;

    private String get_private(){
        return this._private;
    }
    protected String get_protected(){
        return this._protected;
    }

    public String get_public(){
        return this._public;
    }
     String get_default(){
        return this._default;
    }
}
