package f4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class b {
    private static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static long b(Context context, Uri uri) {
        return c(context, uri, "last_modified", 0L);
    }

    private static long c(Context context, Uri uri, String str, long j10) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j10 : cursorQuery.getLong(0);
        } catch (Exception e10) {
            Log.w("DocumentFile", "Failed query: " + e10);
            return j10;
        } finally {
            a(cursorQuery);
        }
        a(cursorQuery);
    }
}
