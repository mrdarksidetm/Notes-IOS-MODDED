package ed;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import ed.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.a;

/* JADX INFO: loaded from: classes2.dex */
public class a implements jc.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f10804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0 f10805b;

    /* JADX INFO: renamed from: ed.a$a, reason: collision with other inner class name */
    static class C0249a implements d0 {
        C0249a() {
        }

        @Override // ed.d0
        public String a(List<String> list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // ed.d0
        public List<String> b(String str) {
            try {
                return (List) new h0(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public a() {
        this(new C0249a());
    }

    a(d0 d0Var) {
        this.f10805b = d0Var;
    }

    private void A(sc.b bVar, Context context) {
        this.f10804a = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            c.b.g(bVar, this);
        } catch (Exception e10) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e10);
        }
    }

    private Object B(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.f10805b.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.f10804a.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f10805b.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    private Map<String, Object> z(String str, Set<String> set) {
        Map<String, ?> all = this.f10804a.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                map.put(str2, B(str2, all.get(str2)));
            }
        }
        return map;
    }

    @Override // ed.c.b
    public Map<String, Object> d(String str, List<String> list) {
        return z(str, list == null ? null : new HashSet(list));
    }

    @Override // ed.c.b
    public Boolean i(String str, List<String> list) {
        SharedPreferences.Editor editorEdit = this.f10804a.edit();
        Map<String, ?> all = this.f10804a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    @Override // ed.c.b
    public Boolean j(String str, List<String> list) {
        return Boolean.valueOf(this.f10804a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f10805b.a(list)).commit());
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        A(bVar.b(), bVar.a());
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        c.b.g(bVar.b(), null);
    }

    @Override // ed.c.b
    public Boolean q(String str, Long l10) {
        return Boolean.valueOf(this.f10804a.edit().putLong(str, l10.longValue()).commit());
    }

    @Override // ed.c.b
    public Boolean r(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f10804a.edit().putString(str, str2).commit());
    }

    @Override // ed.c.b
    public Boolean remove(String str) {
        return Boolean.valueOf(this.f10804a.edit().remove(str).commit());
    }

    @Override // ed.c.b
    public Boolean t(String str, Boolean bool) {
        return Boolean.valueOf(this.f10804a.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // ed.c.b
    public Boolean u(String str, Double d10) {
        String string = Double.toString(d10.doubleValue());
        return Boolean.valueOf(this.f10804a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit());
    }
}
