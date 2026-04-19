package wb;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {
    public static List<Object> a(Cursor cursor, int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object objB = b(cursor, i11);
            if (xb.a.f23129c) {
                String name = objB != null ? objB.getClass().isArray() ? "array(" + objB.getClass().getComponentType().getName() + ")" : objB.getClass().getName() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("column ");
                sb2.append(i11);
                sb2.append(" ");
                sb2.append(cursor.getType(i11));
                sb2.append(": ");
                sb2.append(objB);
                sb2.append(name == null ? "" : " (" + name + ")");
                Log.d("Sqflite", sb2.toString());
            }
            arrayList.add(objB);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i10);
    }

    static Locale c(String str) {
        return Locale.forLanguageTag(str);
    }

    static Locale d(String str) {
        return c(str);
    }
}
