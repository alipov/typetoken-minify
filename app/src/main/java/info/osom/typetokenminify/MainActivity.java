package info.osom.typetokenminify;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<? extends MyInterface> data = getData();
        for (MyInterface datum : data) {
            Log.v("typetoken", "value=" + datum.getValue());
        }
    }

    private List<? extends MyInterface> getData() {
        String input = "[{\"value\": \"data\"}]";
        Type type = new TypeToken<List<MyImplementation>>() { }.getType();
        return new Gson().fromJson(input, type);
    }
}
