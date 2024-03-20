package info.osom.typetokenminify;

import com.google.gson.annotations.SerializedName;

public class MyImplementation implements MyInterface {
    @SerializedName("value")
    private String value;

    public MyImplementation() { }

    @Override
    public String getValue() {
        return value;
    }
}
