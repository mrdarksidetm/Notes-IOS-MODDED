package n2;

import android.content.Context;
import android.graphics.Typeface;
import n2.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f15762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.d f15763d;

    public interface a {
        Object a(Context context, b bVar, qd.d<? super Typeface> dVar);

        Typeface b(Context context, b bVar);
    }

    private b(int i10, a aVar, h0.d dVar) {
        this.f15761b = i10;
        this.f15762c = aVar;
        this.f15763d = dVar;
    }

    public /* synthetic */ b(int i10, a aVar, h0.d dVar, ae.j jVar) {
        this(i10, aVar, dVar);
    }

    @Override // n2.s
    public final int a() {
        return this.f15761b;
    }

    public final a d() {
        return this.f15762c;
    }

    public final h0.d e() {
        return this.f15763d;
    }
}
