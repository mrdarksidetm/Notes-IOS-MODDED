package j6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap.Config f14031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorSpace f14032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k6.i f14033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k6.h f14034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f14037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f14038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Headers f14039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r f14040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n f14041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f14042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f14043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f14044o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, k6.i iVar, k6.h hVar, boolean z10, boolean z11, boolean z12, String str, Headers headers, r rVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f14030a = context;
        this.f14031b = config;
        this.f14032c = colorSpace;
        this.f14033d = iVar;
        this.f14034e = hVar;
        this.f14035f = z10;
        this.f14036g = z11;
        this.f14037h = z12;
        this.f14038i = str;
        this.f14039j = headers;
        this.f14040k = rVar;
        this.f14041l = nVar;
        this.f14042m = bVar;
        this.f14043n = bVar2;
        this.f14044o = bVar3;
    }

    public final m a(Context context, Bitmap.Config config, ColorSpace colorSpace, k6.i iVar, k6.h hVar, boolean z10, boolean z11, boolean z12, String str, Headers headers, r rVar, n nVar, b bVar, b bVar2, b bVar3) {
        return new m(context, config, colorSpace, iVar, hVar, z10, z11, z12, str, headers, rVar, nVar, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f14035f;
    }

    public final boolean d() {
        return this.f14036g;
    }

    public final ColorSpace e() {
        return this.f14032c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (ae.r.b(this.f14030a, mVar.f14030a) && this.f14031b == mVar.f14031b && ((Build.VERSION.SDK_INT < 26 || ae.r.b(this.f14032c, mVar.f14032c)) && ae.r.b(this.f14033d, mVar.f14033d) && this.f14034e == mVar.f14034e && this.f14035f == mVar.f14035f && this.f14036g == mVar.f14036g && this.f14037h == mVar.f14037h && ae.r.b(this.f14038i, mVar.f14038i) && ae.r.b(this.f14039j, mVar.f14039j) && ae.r.b(this.f14040k, mVar.f14040k) && ae.r.b(this.f14041l, mVar.f14041l) && this.f14042m == mVar.f14042m && this.f14043n == mVar.f14043n && this.f14044o == mVar.f14044o)) {
                return true;
            }
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.f14031b;
    }

    public final Context g() {
        return this.f14030a;
    }

    public final String h() {
        return this.f14038i;
    }

    public int hashCode() {
        int iHashCode = ((this.f14030a.hashCode() * 31) + this.f14031b.hashCode()) * 31;
        ColorSpace colorSpace = this.f14032c;
        int iHashCode2 = (((((((((((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f14033d.hashCode()) * 31) + this.f14034e.hashCode()) * 31) + Boolean.hashCode(this.f14035f)) * 31) + Boolean.hashCode(this.f14036g)) * 31) + Boolean.hashCode(this.f14037h)) * 31;
        String str = this.f14038i;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f14039j.hashCode()) * 31) + this.f14040k.hashCode()) * 31) + this.f14041l.hashCode()) * 31) + this.f14042m.hashCode()) * 31) + this.f14043n.hashCode()) * 31) + this.f14044o.hashCode();
    }

    public final b i() {
        return this.f14043n;
    }

    public final Headers j() {
        return this.f14039j;
    }

    public final b k() {
        return this.f14044o;
    }

    public final boolean l() {
        return this.f14037h;
    }

    public final k6.h m() {
        return this.f14034e;
    }

    public final k6.i n() {
        return this.f14033d;
    }

    public final r o() {
        return this.f14040k;
    }
}
