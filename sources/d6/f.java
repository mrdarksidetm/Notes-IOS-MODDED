package d6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d6.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f9505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.m f9506b;

    public static final class a implements i.a<Drawable> {
        @Override // d6.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Drawable drawable, j6.m mVar, x5.e eVar) {
            return new f(drawable, mVar);
        }
    }

    public f(Drawable drawable, j6.m mVar) {
        this.f9505a = drawable;
        this.f9506b = mVar;
    }

    @Override // d6.i
    public Object a(qd.d<? super h> dVar) {
        Drawable bitmapDrawable;
        boolean zV = o6.j.v(this.f9505a);
        if (zV) {
            bitmapDrawable = new BitmapDrawable(this.f9506b.g().getResources(), o6.l.f16390a.a(this.f9505a, this.f9506b.f(), this.f9506b.n(), this.f9506b.m(), this.f9506b.c()));
        } else {
            bitmapDrawable = this.f9505a;
        }
        return new g(bitmapDrawable, zV, a6.d.MEMORY);
    }
}
