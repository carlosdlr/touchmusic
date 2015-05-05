package com.touchmusic;

import android.app.Activity;
import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.touchmusic.plans.contentprovider.PlanContentProvider;
import com.touchmusic.plans.database.PlanTable;

import static com.touchmusic.R.layout.activity_wallet;

/**
 * Created by cardelar on 25/03/15.
 */
public class Wallet extends ListActivity implements LoaderManager.LoaderCallbacks<Cursor>{


    // private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_wallet);
        loadData();
        this.getListView().setDividerHeight(2);


    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        String[] projection = { PlanTable.COLUMN_ID, PlanTable.COLUMN_DESCRIPTION,  PlanTable.COLUMN_VALUE};
        CursorLoader cursorLoader = new CursorLoader(this,
                PlanContentProvider.CONTENT_URI, projection, null, null, null);
        return cursorLoader;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        // data is not available anymore, delete reference
        adapter.swapCursor(null);
    }

    private void loadData(){

        // Fields from the database (projection)
        // Must include the _id column for the adapter to work
        String[] from = new String[] {PlanTable.COLUMN_DESCRIPTION, PlanTable.COLUMN_VALUE};
        // Fields on the UI to which we map
        int[] to = new int[] { R.id.firstLine, R.id.secondLine };

        getLoaderManager().initLoader(0, null, this);
        adapter = new SimpleCursorAdapter(this, R.layout.plan_row, null, from,
                to, 0);

        setListAdapter(adapter);
    }

    private void loadInitialDataFromDb(){
        ContentValues values = new ContentValues();
        values.put(PlanTable.COLUMN_VALUE, 20000);
        values.put(PlanTable.COLUMN_DESCRIPTION, "Plan 20 creditos");

        getContentResolver().insert(PlanContentProvider.CONTENT_URI,values);

        values = new ContentValues();
        values.put(PlanTable.COLUMN_VALUE, 30000);
        values.put(PlanTable.COLUMN_DESCRIPTION, "Plan 30 creditos");

        getContentResolver().insert(PlanContentProvider.CONTENT_URI,values);

        values = new ContentValues();
        values.put(PlanTable.COLUMN_VALUE, 40000);
        values.put(PlanTable.COLUMN_DESCRIPTION, "Plan 40 creditos");

        getContentResolver().insert(PlanContentProvider.CONTENT_URI,values);

    }
}
