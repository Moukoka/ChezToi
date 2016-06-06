package com.mouks.rosie.cheztoi.repository.Impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.mouks.rosie.cheztoi.conf.DBConstants;
import com.mouks.rosie.cheztoi.domain.CustomerDetails;
import com.mouks.rosie.cheztoi.repository.CustomerRepository;


//import java.sql.SQLException;
import java.util.Set;

/**
 * Created by Rosie on 2016/05/31.
 */
public class CustomerRepositoryImpl extends SQLiteOpenHelper implements CustomerRepository {

    //create database and assign a name
    public static final String TABLE_NAME = "Customer_Details";

    //create columns contained in the table
    public static final String COL_1 = "ID";
    public static final String COL_2 = "customerId";
    public static final String COL_3 = "surname";
    public static final String COL_4 = "username";
    public static final String COL_5 = "password";
    public static final String COL_6 = "age";

    private SQLiteDatabase db;

    public CustomerRepositoryImpl(Context context) {
        //call a function that create the database

        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }

    //Database creation sql statement
    private static final String DATABASE_CREATE = "CREATE TABLE "
            + TABLE_NAME + "("
            +COL_1 + " INTEGER AUTOINCREMENT, "
            +COL_2 + " TEXT PRIMARY KEY AUTOINCREMENT, "
            +COL_3 + " TEXT NOT NULL, "
            +COL_4 + " TEXT NOT NULL, "
            +COL_5 + " TEXT NOT NULL, "
            +COL_6 + " INTEGER NOT NULL );";

    public void open()throws SQLException {
        db = this.getWritableDatabase();
    }
    public void close(){this.close();}

    @Override
    public CustomerDetails findById(String s) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor;
        cursor = db.query(TABLE_NAME,
                new String[]{
                        COL_1,
                        COL_2,
                        COL_3,
                        COL_4,
                        COL_5,
                        COL_6
                ,},
                COL_2 + " =? ",
                new String[]{String.valueOf(s)},null,null,null,null);
        return null;
    }

    @Override
    public CustomerDetails save(CustomerDetails entity) {
        open();
        ContentValues values = new ContentValues();
        values.put(COL_1, entity.getId());
        values.put(COL_2, entity.getCustomerId());
        values.put(COL_3, entity.getName());
        values.put(COL_4, entity.getUsername());
        values.put(COL_5, entity.getPassword());
        values.put(COL_6, entity.getAge());
        long id = db.insertOrThrow(TABLE_NAME, null,values);
        CustomerDetails insertCustomer = new CustomerDetails.Builder().copy(entity).id(new Long(id)).build();
        return insertCustomer;
    }

    @Override
    public CustomerDetails update(CustomerDetails entity) {
        open();
        ContentValues values = new ContentValues();
        values.put(COL_1, entity.getId());
        values.put(COL_2, entity.getCustomerId());
        values.put(COL_3, entity.getName());
        values.put(COL_4, entity.getUsername());
        values.put(COL_5, entity.getPassword());
        values.put(COL_6, entity.getAge());
        db.update(TABLE_NAME, values,
                COL_1 + " =? ",
        new String[]{String.valueOf(entity.getId())});
        return entity;
    }

    @Override
    public CustomerDetails delete(CustomerDetails entity) {

        open();
        db.delete(TABLE_NAME,
                COL_1 + " =? ",
                new String[]{String.valueOf(entity.getId())});
        return entity;
    }

    @Override
    public Set<CustomerDetails> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        open();
        int rowsDeleted = db.delete(TABLE_NAME,null,null);
        close();
        return rowsDeleted;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
