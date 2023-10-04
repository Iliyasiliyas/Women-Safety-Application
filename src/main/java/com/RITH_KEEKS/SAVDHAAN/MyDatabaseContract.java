package com.RITH_KEEKS.SAVDHAAN;

import android.provider.BaseColumns;

public class MyDatabaseContract {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "SAVDHAAN.db";

    private MyDatabaseContract() {}

    public static class SAVDHAAN_USER implements BaseColumns {
        public static final String TABLE_NAME = "SAVDHAAN_USER";
        public static final String COLUMN_NAME_ENUM = "enum";
        public static final String COLUMN_NAME_LOCATION = "location";
    }

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + SAVDHAAN_USER.TABLE_NAME + " (" +
                    SAVDHAAN_USER._ID + " INTEGER PRIMARY KEY," +
                    SAVDHAAN_USER.COLUMN_NAME_ENUM + " TEXT," +
                    SAVDHAAN_USER.COLUMN_NAME_LOCATION + " TEXT)";

    public static final String SQL_DELETE_TABLE =
            "DROP TABLE IF EXISTS " + SAVDHAAN_USER.TABLE_NAME;

}

