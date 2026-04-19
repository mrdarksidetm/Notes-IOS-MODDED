package a;

import ae.r;
import android.content.Context;
import android.graphics.Bitmap;
import k6.i;
import qd.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f12b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13c;

    public a(Context context, float f10) {
        r.f(context, "context");
        this.f11a = context;
        this.f12b = f10;
        this.f13c = a.class.getName() + '-' + f10;
    }

    @Override // m6.a
    public String a() {
        return this.f13c;
    }

    @Override // m6.a
    public Object b(Bitmap bitmap, i iVar, d<? super Bitmap> dVar) {
        return b.b(bitmap, this.f11a, this.f12b, false, 4, null);
    }
}
