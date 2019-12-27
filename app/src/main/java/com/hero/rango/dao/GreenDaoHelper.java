package com.hero.rango.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.hero.rango.db.DaoMaster;
import com.hero.rango.db.FeulDao;

import org.greenrobot.greendao.database.Database;

public class GreenDaoHelper extends DaoMaster.OpenHelper {
    public GreenDaoHelper(Context context, String name) {
        super(context, name);
    }

    public GreenDaoHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");

        DaoMaster.dropAllTables(db, false);
        FeulDao.createTable(db, false);

    }
}
