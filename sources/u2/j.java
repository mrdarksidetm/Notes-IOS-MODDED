package u2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21569b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f21570c = new j(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f21571d = new j(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j f21572e = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21573a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final j a() {
            return j.f21572e;
        }

        public final j b() {
            return j.f21570c;
        }

        public final j c() {
            return j.f21571d;
        }
    }

    public j(int i10) {
        this.f21573a = i10;
    }

    public final boolean d(j jVar) {
        int i10 = this.f21573a;
        return (jVar.f21573a | i10) == i10;
    }

    public final int e() {
        return this.f21573a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f21573a == ((j) obj).f21573a;
    }

    public int hashCode() {
        return this.f21573a;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f21573a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f21573a & f21571d.f21573a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f21573a & f21572e.f21573a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            sb2 = new StringBuilder();
            sb2.append("TextDecoration.");
            sb2.append((String) arrayList.get(0));
        } else {
            sb2 = new StringBuilder();
            sb2.append("TextDecoration[");
            sb2.append(y2.a.d(arrayList, ", ", null, null, 0, null, null, 62, null));
            sb2.append(']');
        }
        return sb2.toString();
    }
}
