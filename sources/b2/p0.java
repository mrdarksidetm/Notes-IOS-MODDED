package b2;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t0.f3;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<? extends Object>[] f5385a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    static final class a extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x4.d f5387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5388c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, x4.d dVar, String str) {
            super(0);
            this.f5386a = z10;
            this.f5387b = dVar;
            this.f5388c = str;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f5386a) {
                this.f5387b.j(this.f5388c);
            }
        }
    }

    static final class b extends ae.s implements zd.l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5389a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(p0.f(obj));
        }
    }

    public static final n0 b(View view, x4.f fVar) {
        Object parent = view.getParent();
        ae.r.d(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(f1.e.H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, fVar);
    }

    public static final n0 c(String str, x4.f fVar) {
        boolean z10;
        String str2 = c1.g.class.getSimpleName() + ':' + str;
        x4.d savedStateRegistry = fVar.getSavedStateRegistry();
        Bundle bundleB = savedStateRegistry.b(str2);
        final c1.g gVarA = c1.i.a(bundleB != null ? h(bundleB) : null, b.f5389a);
        try {
            savedStateRegistry.h(str2, new d.c() { // from class: b2.o0
                @Override // x4.d.c
                public final Bundle a() {
                    return p0.d(gVarA);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new n0(gVarA, new a(z10, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(c1.g gVar) {
        return g(gVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof d1.u) {
            d1.u uVar = (d1.u) obj;
            if (uVar.d() != f3.k() && uVar.d() != f3.q() && uVar.d() != f3.n()) {
                return false;
            }
            T value = uVar.getValue();
            if (value == 0) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof md.g) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f5385a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            ae.r.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
