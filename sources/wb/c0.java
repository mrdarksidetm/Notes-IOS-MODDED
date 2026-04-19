package wb;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f22770b;

    public c0(String str, List<Object> list) {
        this.f22769a = str;
        this.f22770b = list == null ? new ArrayList<>() : list;
    }

    private Object[] e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            bArr[i10] = (byte) ((Integer) list.get(i10)).intValue();
        }
        return bArr;
    }

    public void a(SQLiteProgram sQLiteProgram) {
        long jLongValue;
        List<Object> list = this.f22770b;
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object objF = f(this.f22770b.get(i10));
                int i11 = i10 + 1;
                if (objF == null) {
                    sQLiteProgram.bindNull(i11);
                } else if (objF instanceof byte[]) {
                    sQLiteProgram.bindBlob(i11, (byte[]) objF);
                } else if (objF instanceof Double) {
                    sQLiteProgram.bindDouble(i11, ((Double) objF).doubleValue());
                } else {
                    if (objF instanceof Integer) {
                        jLongValue = ((Integer) objF).intValue();
                    } else if (objF instanceof Long) {
                        jLongValue = ((Long) objF).longValue();
                    } else if (objF instanceof String) {
                        sQLiteProgram.bindString(i11, (String) objF);
                    } else {
                        if (!(objF instanceof Boolean)) {
                            throw new IllegalArgumentException("Could not bind " + objF + " from index " + i10 + ": Supported types are null, byte[], double, long, boolean and String");
                        }
                        jLongValue = ((Boolean) objF).booleanValue() ? 1L : 0L;
                    }
                    sQLiteProgram.bindLong(i11, jLongValue);
                }
                i10 = i11;
            }
        }
    }

    public List<Object> b() {
        return this.f22770b;
    }

    public String c() {
        return this.f22769a;
    }

    public Object[] d() {
        return e(this.f22770b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        String str = this.f22769a;
        if (str != null) {
            if (!str.equals(c0Var.f22769a)) {
                return false;
            }
        } else if (c0Var.f22769a != null) {
            return false;
        }
        if (this.f22770b.size() != c0Var.f22770b.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f22770b.size(); i10++) {
            if ((this.f22770b.get(i10) instanceof byte[]) && (c0Var.f22770b.get(i10) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f22770b.get(i10), (byte[]) c0Var.f22770b.get(i10))) {
                    return false;
                }
            } else if (!this.f22770b.get(i10).equals(c0Var.f22770b.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f22769a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22769a);
        List<Object> list = this.f22770b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f22770b;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
