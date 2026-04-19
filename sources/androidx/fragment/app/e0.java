package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f4066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f4067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f4068c;

    static {
        e0 e0Var = new e0();
        f4066a = e0Var;
        f4067b = new f0();
        f4068c = e0Var.c();
    }

    private e0() {
    }

    public static final void a(n nVar, n nVar2, boolean z10, z.a<String, View> aVar, boolean z11) {
        ae.r.f(nVar, "inFragment");
        ae.r.f(nVar2, "outFragment");
        ae.r.f(aVar, "sharedElements");
        androidx.core.app.m enterTransitionCallback = z10 ? nVar2.getEnterTransitionCallback() : nVar.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(aVar.size());
            Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(aVar.size());
            Iterator<Map.Entry<String, View>> it2 = aVar.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z11) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    public static final String b(z.a<String, String> aVar, String str) {
        ae.r.f(aVar, "<this>");
        ae.r.f(str, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : aVar.entrySet()) {
            if (ae.r.b(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) nd.c0.a0(arrayList);
    }

    private final g0 c() {
        try {
            ae.r.d(c5.e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (g0) c5.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void d(z.a<String, String> aVar, z.a<String, View> aVar2) {
        ae.r.f(aVar, "<this>");
        ae.r.f(aVar2, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.i(size);
            }
        }
    }

    public static final void e(List<? extends View> list, int i10) {
        ae.r.f(list, "views");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
