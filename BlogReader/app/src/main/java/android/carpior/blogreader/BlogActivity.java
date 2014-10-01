package android.carpior.blogreader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;


public class BlogActivity extends Activity {

    protected ProgressBar progressBar;
    protected ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        String[] arrayStrings = new String[] {
                "Blog post 1",
                "Blog post 2",
                "Blog post 3",
                "Blog post 4"
        };

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        listView = (ListView)findViewById(R.id.ListView);

        listView.setEmptyView(progressBar);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayStrings);
        listView.setAdapter(adapter);
    }

}
