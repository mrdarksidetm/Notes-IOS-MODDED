package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import nd.r0;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4374f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class<? extends Object>[] f4375g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f4376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, d.c> f4377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f4378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, oe.s<Object>> f4379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.c f4380e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final q a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new q();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    ae.r.e(str, SubscriberAttributeKt.JSON_NAME_KEY);
                    map.put(str, bundle2.get(str));
                }
                return new q(map);
            }
            ClassLoader classLoader = q.class.getClassLoader();
            ae.r.c(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                ae.r.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new q(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : q.f4375g) {
                ae.r.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public q() {
        this.f4376a = new LinkedHashMap();
        this.f4377b = new LinkedHashMap();
        this.f4378c = new LinkedHashMap();
        this.f4379d = new LinkedHashMap();
        this.f4380e = new d.c() { // from class: o4.l
            @Override // x4.d.c
            public final Bundle a() {
                return androidx.lifecycle.q.d(this.f16348a);
            }
        };
    }

    public q(Map<String, ? extends Object> map) {
        ae.r.f(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4376a = linkedHashMap;
        this.f4377b = new LinkedHashMap();
        this.f4378c = new LinkedHashMap();
        this.f4379d = new LinkedHashMap();
        this.f4380e = new d.c() { // from class: o4.l
            @Override // x4.d.c
            public final Bundle a() {
                return androidx.lifecycle.q.d(this.f16348a);
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(q qVar) {
        ae.r.f(qVar, "this$0");
        for (Map.Entry entry : r0.t(qVar.f4377b).entrySet()) {
            qVar.e((String) entry.getKey(), ((d.c) entry.getValue()).a());
        }
        Set<String> setKeySet = qVar.f4376a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(qVar.f4376a.get(str));
        }
        return k3.c.a(md.x.a("keys", arrayList), md.x.a("values", arrayList2));
    }

    public final d.c c() {
        return this.f4380e;
    }

    public final <T> void e(String str, T t10) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (!f4374f.b(t10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            ae.r.c(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj = this.f4378c.get(str);
        o4.h hVar = obj instanceof o4.h ? (o4.h) obj : null;
        if (hVar != null) {
            hVar.n(t10);
        } else {
            this.f4376a.put(str, t10);
        }
        oe.s<Object> sVar = this.f4379d.get(str);
        if (sVar == null) {
            return;
        }
        sVar.setValue(t10);
    }
}
