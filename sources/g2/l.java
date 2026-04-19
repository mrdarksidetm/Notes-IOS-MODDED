package g2;

import b2.z0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l implements x, Iterable<Map.Entry<? extends w<?>, ? extends Object>>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<w<?>, Object> f11358a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11360c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g2.x
    public <T> void a(w<T> wVar, T t10) {
        if (!(t10 instanceof a) || !f(wVar)) {
            this.f11358a.put(wVar, t10);
            return;
        }
        Object obj = this.f11358a.get(wVar);
        ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj;
        Map<w<?>, Object> map = this.f11358a;
        a aVar2 = (a) t10;
        String strB = aVar2.b();
        if (strB == null) {
            strB = aVar.b();
        }
        md.g gVarA = aVar2.a();
        if (gVarA == null) {
            gVarA = aVar.a();
        }
        map.put(wVar, new a(strB, gVarA));
    }

    public final void d(l lVar) {
        if (lVar.f11359b) {
            this.f11359b = true;
        }
        if (lVar.f11360c) {
            this.f11360c = true;
        }
        for (Map.Entry<w<?>, Object> entry : lVar.f11358a.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.f11358a.containsKey(key)) {
                this.f11358a.put(key, value);
            } else if (value instanceof a) {
                Object obj = this.f11358a.get(key);
                ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map<w<?>, Object> map = this.f11358a;
                String strB = aVar.b();
                if (strB == null) {
                    strB = ((a) value).b();
                }
                md.g gVarA = aVar.a();
                if (gVarA == null) {
                    gVarA = ((a) value).a();
                }
                map.put(key, new a(strB, gVarA));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return ae.r.b(this.f11358a, lVar.f11358a) && this.f11359b == lVar.f11359b && this.f11360c == lVar.f11360c;
    }

    public final <T> boolean f(w<T> wVar) {
        return this.f11358a.containsKey(wVar);
    }

    public int hashCode() {
        return (((this.f11358a.hashCode() * 31) + Boolean.hashCode(this.f11359b)) * 31) + Boolean.hashCode(this.f11360c);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends w<?>, ? extends Object>> iterator() {
        return this.f11358a.entrySet().iterator();
    }

    public final boolean l() {
        Set<w<?>> setKeySet = this.f11358a.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((w) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final l n() {
        l lVar = new l();
        lVar.f11359b = this.f11359b;
        lVar.f11360c = this.f11360c;
        lVar.f11358a.putAll(this.f11358a);
        return lVar;
    }

    public final <T> T o(w<T> wVar) {
        T t10 = (T) this.f11358a.get(wVar);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final <T> T r(w<T> wVar, zd.a<? extends T> aVar) {
        T t10 = (T) this.f11358a.get(wVar);
        return t10 == null ? aVar.invoke() : t10;
    }

    public final <T> T s(w<T> wVar, zd.a<? extends T> aVar) {
        T t10 = (T) this.f11358a.get(wVar);
        return t10 == null ? aVar.invoke() : t10;
    }

    public final boolean t() {
        return this.f11360c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f11359b) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f11360c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<w<?>, Object> entry : this.f11358a.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(key.a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return z0.a(this, null) + "{ " + ((Object) sb2) + " }";
    }

    public final boolean u() {
        return this.f11359b;
    }

    public final void v(l lVar) {
        for (Map.Entry<w<?>, Object> entry : lVar.f11358a.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f11358a.get(key);
            ae.r.d(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objC = key.c(obj, value);
            if (objC != null) {
                this.f11358a.put(key, objC);
            }
        }
    }

    public final void w(boolean z10) {
        this.f11360c = z10;
    }

    public final void x(boolean z10) {
        this.f11359b = z10;
    }
}
