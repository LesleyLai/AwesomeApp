package fixr.plv.colorado.edu.awesomeapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class MyDatabase {

  public void doQuery(SQLiteDatabase db,
                      String[] columns) {

    Cursor cursor = db.query("mytable", columns, null, null,
        null, null, null);

    while (cursor.moveToNext()) {
      // get stuff from the cursor
    // new fixes to the code
    cursor.close();
    }
    }

}
