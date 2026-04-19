package f2;

import ae.r;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<C0267b, WeakReference<a>> f11080a = new HashMap<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p1.d f11081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11082b;

        public a(p1.d dVar, int i10) {
            this.f11081a = dVar;
            this.f11082b = i10;
        }

        public final int a() {
            return this.f11082b;
        }

        public final p1.d b() {
            return this.f11081a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return r.b(this.f11081a, aVar.f11081a) && this.f11082b == aVar.f11082b;
        }

        public int hashCode() {
            return (this.f11081a.hashCode() * 31) + Integer.hashCode(this.f11082b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f11081a + ", configFlags=" + this.f11082b + ')';
        }
    }

    /* JADX INFO: renamed from: f2.b$b, reason: collision with other inner class name */
    public static final class C0267b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources.Theme f11083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11084b;

        public C0267b(Resources.Theme theme, int i10) {
            this.f11083a = theme;
            this.f11084b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0267b)) {
                return false;
            }
            C0267b c0267b = (C0267b) obj;
            return r.b(this.f11083a, c0267b.f11083a) && this.f11084b == c0267b.f11084b;
        }

        public int hashCode() {
            return (this.f11083a.hashCode() * 31) + Integer.hashCode(this.f11084b);
        }

        public String toString() {
            return "Key(theme=" + this.f11083a + ", id=" + this.f11084b + ')';
        }
    }

    public final void a() {
        this.f11080a.clear();
    }

    public final a b(C0267b c0267b) {
        WeakReference<a> weakReference = this.f11080a.get(c0267b);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator<Map.Entry<C0267b, WeakReference<a>>> it = this.f11080a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(C0267b c0267b, a aVar) {
        this.f11080a.put(c0267b, new WeakReference<>(aVar));
    }
}
