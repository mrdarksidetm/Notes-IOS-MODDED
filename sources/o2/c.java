package o2;

import ae.j;
import ae.r;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16274b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<List<byte[]>> f16277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f16278d;

        public a(String str, String str2, int i10) {
            this(str, str2, null, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private a(String str, String str2, List<? extends List<byte[]>> list, int i10) {
            this.f16275a = str;
            this.f16276b = str2;
            this.f16277c = list;
            this.f16278d = i10;
        }

        public final List<List<byte[]>> a() {
            return this.f16277c;
        }

        public final int b() {
            return this.f16278d;
        }

        public final String c() {
            return this.f16275a;
        }

        public final String d() {
            return this.f16276b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return r.b(this.f16275a, aVar.f16275a) && r.b(this.f16276b, aVar.f16276b) && r.b(this.f16277c, aVar.f16277c) && this.f16278d == aVar.f16278d;
        }

        public int hashCode() {
            int iHashCode = ((this.f16275a.hashCode() * 31) + this.f16276b.hashCode()) * 31;
            List<List<byte[]>> list = this.f16277c;
            return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f16278d;
        }
    }

    public c(String str, boolean z10) {
        this.f16273a = str;
        this.f16274b = z10;
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("name cannot be empty".toString());
        }
    }

    public /* synthetic */ c(String str, boolean z10, int i10, j jVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    public final boolean a() {
        return this.f16274b;
    }

    public final String b() {
        return this.f16273a;
    }
}
