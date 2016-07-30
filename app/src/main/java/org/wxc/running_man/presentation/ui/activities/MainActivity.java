package org.wxc.running_man.presentation.ui.activities;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;

import org.wxc.running_man.network.Network;
import org.wxc.running_man.R;
import org.wxc.running_man.model.ZhuangbiImage;
import org.wxc.running_man.adapter.ZhuangbiListAdapter;

import java.util.List;

import butterknife.ButterKnife;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView gridRv;

    ZhuangbiListAdapter adapter = new ZhuangbiListAdapter();
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        swipeRefreshLayout.setEnabled(false);
        swipeRefreshLayout.setColorSchemeColors(getResources().getColor(R.color.colorAccent));
        searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
//                String key = getResources().getString(R.string.key_zhuangbi);
                Observable<List<ZhuangbiImage>> beautyObservable = Network.getZhuangbiApi().search(query);
                beautyObservable
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(items -> {
                            Log.i(TAG, "item.size: " + items.size());
                            for (ZhuangbiImage item : items) {
                                Log.i(TAG, item.description + ", " + item.image_url);
                            }
                            adapter.setImages(items);
                        });
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        gridRv = (RecyclerView) findViewById(R.id.gridRv);
        gridRv.setLayoutManager(new GridLayoutManager(this, 2));
        gridRv.setAdapter(adapter);

    }
}
