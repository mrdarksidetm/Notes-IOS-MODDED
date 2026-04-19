package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.ContentValues;
import android.database.Cursor;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class URLProtectionSpaceDao {
    CredentialDatabaseHelper credentialDatabaseHelper;
    String[] projection = {"_id", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT};

    public URLProtectionSpaceDao(CredentialDatabaseHelper credentialDatabaseHelper) {
        this.credentialDatabaseHelper = credentialDatabaseHelper;
    }

    public long delete(URLProtectionSpace uRLProtectionSpace) {
        return this.credentialDatabaseHelper.getWritableDatabase().delete(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, "_id = ?", new String[]{uRLProtectionSpace.getId().toString()});
    }

    public URLProtectionSpace find(String str, String str2, String str3, Integer num) {
        Cursor cursorQuery = this.credentialDatabaseHelper.getReadableDatabase().query(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, this.projection, "host = ? AND protocol = ? AND realm = ? AND port = ?", new String[]{str, str2, str3, num.toString()}, null, null, null);
        URLProtectionSpace uRLProtectionSpace = cursorQuery.moveToNext() ? new URLProtectionSpace(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM)), Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT))).intValue()) : null;
        cursorQuery.close();
        return uRLProtectionSpace;
    }

    public List<URLProtectionSpace> getAll() {
        Cursor cursorQuery = this.credentialDatabaseHelper.getReadableDatabase().query(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, this.projection, null, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            arrayList.add(new URLProtectionSpace(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM)), Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT))).intValue()));
        }
        cursorQuery.close();
        return arrayList;
    }

    public long insert(URLProtectionSpace uRLProtectionSpace) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, uRLProtectionSpace.getHost());
        contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, uRLProtectionSpace.getProtocol());
        contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, uRLProtectionSpace.getRealm());
        contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, Integer.valueOf(uRLProtectionSpace.getPort()));
        return this.credentialDatabaseHelper.getWritableDatabase().insert(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, null, contentValues);
    }
}
