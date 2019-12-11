package id.havanah.app.multiplechoicequizapp;

import android.os.Bundle;
import android.util.DisplayMetrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import id.havanah.app.multiplechoicequizapp.Adapter.CategoryAdapter;
import id.havanah.app.multiplechoicequizapp.Common.SpaceDecoration;
import id.havanah.app.multiplechoicequizapp.DBHelper.DBHelper;
import id.havanah.app.multiplechoicequizapp.Model.Category;

public class MainActivity extends AppCompatActivity {

  Toolbar toolbar;
  RecyclerView recycler_category;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    toolbar = (Toolbar)findViewById(R.id.toolbar);
    toolbar.setTitle("EDMT Quiz 2019");
    setSupportActionBar(toolbar);

    recycler_category = (RecyclerView)findViewById(R.id.recyclerView_categories);
    recycler_category.setHasFixedSize(true);
    recycler_category.setLayoutManager(new GridLayoutManager(this,2));

    //Get Screen height
    CategoryAdapter adapter = new CategoryAdapter(MainActivity.this, DBHelper.getInstance(this).getAllCategories());
    int spaceInPixel = 4;
    recycler_category.addItemDecoration(new SpaceDecoration(16));
    recycler_category.setAdapter(adapter);
  }

}
