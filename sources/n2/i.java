package n2;

import android.content.Context;
import android.graphics.Typeface;
import n2.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f15804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f15805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Typeface f15807h;

    private i(i0 i0Var, int i10, h0.d dVar) {
        super(c0.f15768a.b(), j.f15829a, dVar, null);
        this.f15804e = i0Var;
        this.f15805f = i10;
    }

    public /* synthetic */ i(i0 i0Var, int i10, h0.d dVar, ae.j jVar) {
        this(i0Var, i10, dVar);
    }

    @Override // n2.s
    public final i0 b() {
        return this.f15804e;
    }

    @Override // n2.s
    public final int c() {
        return this.f15805f;
    }

    public abstract Typeface f(Context context);

    public final Typeface g(Context context) {
        if (!this.f15806g && this.f15807h == null) {
            this.f15807h = f(context);
        }
        this.f15806g = true;
        return this.f15807h;
    }

    public final void h(Typeface typeface) {
        this.f15807h = typeface;
    }
}
