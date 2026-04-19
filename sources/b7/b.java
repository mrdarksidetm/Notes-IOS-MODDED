package b7;

import ae.r;
import ae.s;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f5519a;

    static final class a extends s implements zd.a<String> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            return b.this.c();
        }
    }

    public b(ContentResolver contentResolver) {
        r.f(contentResolver, "contentResolver");
        this.f5519a = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        String str = null;
        try {
            Cursor cursorQuery = this.f5519a.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
            if (cursorQuery == null) {
                return null;
            }
            if (!cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
                cursorQuery.close();
            } else {
                try {
                    String string = cursorQuery.getString(1);
                    r.e(string, "cursor.getString(1)");
                    String hexString = Long.toHexString(Long.parseLong(string));
                    cursorQuery.close();
                    str = hexString;
                } catch (NumberFormatException unused) {
                    cursorQuery.close();
                }
            }
        } catch (Exception unused2) {
        }
        return str;
    }

    public final String b() {
        return (String) g7.a.a(new a(), "");
    }
}
