package com.hero.rango.dao;

import com.hero.rango.App;
import com.hero.rango.db.DaoMaster;
import com.hero.rango.db.DaoSession;

public class GreenDaoManager {

    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private static GreenDaoManager greenDaoManager; //单例

    private GreenDaoManager() {
        if (greenDaoManager == null) {
            DaoMaster.DevOpenHelper devOpenHelper = new
                    DaoMaster.DevOpenHelper(App.getContext(), "notes-db", null);
            daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
            daoSession = daoMaster.newSession();
        }
    }

    public static GreenDaoManager getInstance() {
        if (greenDaoManager == null) {
            synchronized (GreenDaoManager.class) {
                if (greenDaoManager == null) {
                    greenDaoManager = new GreenDaoManager();
                }
            }
        }
        return greenDaoManager;
    }

    public DaoMaster getMaster() {
        return daoMaster;
    }

    public DaoSession getSession() {
        return daoSession;
    }

    public DaoSession getNewSession() {
        daoSession = daoMaster.newSession();
        return daoSession;
    }
}