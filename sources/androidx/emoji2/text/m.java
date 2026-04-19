package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<h4.a> f3869d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f3871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f3872c = 0;

    m(l lVar, int i10) {
        this.f3871b = lVar;
        this.f3870a = i10;
    }

    private h4.a g() {
        ThreadLocal<h4.a> threadLocal = f3869d;
        h4.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new h4.a();
            threadLocal.set(aVar);
        }
        this.f3871b.d().j(aVar, this.f3870a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f3871b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f3871b.c(), this.f3870a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f3872c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f3872c & 4) > 0;
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f3872c = iD | 4;
        } else {
            this.f3872c = iD;
        }
    }

    public void m(boolean z10) {
        int i10 = this.f3872c & 4;
        this.f3872c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
