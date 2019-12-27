//package com.hero.rango;
//
//
//import android.app.Application;
//import android.database.sqlite.SQLiteDatabase;
//
//import com.hero.rango.dao.GreenDaoHelper;
//import com.hero.rango.db.DaoMaster;
//import com.hero.rango.db.DaoSession;
//
//public class App extends Application {
//  public DaoSession getDaoSession() {
//    return daoSession;
//  }
//
//  public void setDaoSession(DaoSession daoSession) {
//    this.daoSession = daoSession;
//  }
//
//  private DaoSession daoSession;
//  GreenDaoHelper helper;
//  private SQLiteDatabase db;
//  private DaoMaster daoMaster;
//
//  @Override
//  public void onCreate() {
//    super.onCreate();
//    helper = new GreenDaoHelper(this, "notes-db", null);
//    db = helper.getWritableDatabase();
//    daoMaster = new DaoMaster(db);
//    daoSession = daoMaster.newSession();
//// do this in your activities/fragments to get hold of a DAO
//    //noteDao = daoSession.getNoteDao();
//  }
//
//}
package com.hero.rango;


import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.hero.rango.dao.GreenDaoHelper;
import com.hero.rango.dao.GreenDaoManager;
import com.hero.rango.db.DaoMaster;
import com.hero.rango.db.DaoSession;

public class App extends Application {

  private DaoSession daoSession;
  private static Context context;
  @Override
  public void onCreate() {
    super.onCreate();
    this.context = getApplicationContext();
  }

  public static Context getContext() {
    return context;
  }
}