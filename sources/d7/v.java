package d7;

import a7.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class v<T> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.b f9665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.b f9666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f7.a f9667c;

        public a(d.b bVar, d.b bVar2, f7.a aVar) {
            ae.r.f(bVar, "addedInVersion");
            ae.r.f(aVar, "stabilityLevel");
            this.f9665a = bVar;
            this.f9666b = bVar2;
            this.f9667c = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9665a == aVar.f9665a && this.f9666b == aVar.f9666b && this.f9667c == aVar.f9667c;
        }

        public int hashCode() {
            int iHashCode = this.f9665a.hashCode() * 31;
            d.b bVar = this.f9666b;
            return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f9667c.hashCode();
        }

        public String toString() {
            return "Info(addedInVersion=" + this.f9665a + ", removedInVersion=" + this.f9666b + ", stabilityLevel=" + this.f9667c + ')';
        }
    }

    private v() {
    }

    public /* synthetic */ v(ae.j jVar) {
        this();
    }

    public abstract String a();
}
