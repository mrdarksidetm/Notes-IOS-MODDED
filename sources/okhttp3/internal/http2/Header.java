package okhttp3.internal.http2;

import ae.j;
import ae.r;
import com.revenuecat.purchases.common.Constants;
import hf.f;

/* JADX INFO: loaded from: classes2.dex */
public final class Header {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f17333d = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f17334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f17335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f17336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f17337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f17338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f17339j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f17340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f17341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17342c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    static {
        f.a aVar = f.f11960d;
        f17334e = aVar.d(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        f17335f = aVar.d(":status");
        f17336g = aVar.d(":method");
        f17337h = aVar.d(":path");
        f17338i = aVar.d(":scheme");
        f17339j = aVar.d(":authority");
    }

    public Header(f fVar, f fVar2) {
        r.f(fVar, "name");
        r.f(fVar2, "value");
        this.f17340a = fVar;
        this.f17341b = fVar2;
        this.f17342c = fVar.F() + 32 + fVar2.F();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(f fVar, String str) {
        this(fVar, f.f11960d.d(str));
        r.f(fVar, "name");
        r.f(str, "value");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String str, String str2) {
        r.f(str, "name");
        r.f(str2, "value");
        f.a aVar = f.f11960d;
        this(aVar.d(str), aVar.d(str2));
    }

    public final f a() {
        return this.f17340a;
    }

    public final f b() {
        return this.f17341b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return r.b(this.f17340a, header.f17340a) && r.b(this.f17341b, header.f17341b);
    }

    public int hashCode() {
        return (this.f17340a.hashCode() * 31) + this.f17341b.hashCode();
    }

    public String toString() {
        return this.f17340a.K() + ": " + this.f17341b.K();
    }
}
