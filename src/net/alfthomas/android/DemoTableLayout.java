package net.alfthomas.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class DemoTableLayout extends Activity {
    
    private TableLayout layout;
    private Button button;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        layout = (TableLayout) findViewById(R.id.tableLayout1);
        button = (Button) findViewById(R.id.collapse);
    }
    
    public void toggleHiddenRows(View view) {
        layout.setColumnCollapsed(1, !layout.isColumnCollapsed(1));
        if (layout.isColumnCollapsed(1)) {
            button.setText("Show second column");
        } else {
            button.setText("Hide second column");
        }
    }
}