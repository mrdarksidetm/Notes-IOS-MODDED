package d6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import d6.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f9499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.m f9500b;

    public static final class a implements i.a<Bitmap> {
        @Override // d6.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Bitmap bitmap, j6.m mVar, x5.e eVar) {
            return new b(bitmap, mVar);
        }
    }

    public b(Bitmap bitmap, j6.m mVar) {
        this.f9499a = bitmap;
        this.f9500b = mVar;
    }

    @Override // d6.i
    public Object a(qd.d<? super h> dVar) {
        return new g(new BitmapDrawable(this.f9500b.g().getResources(), this.f9499a), false, a6.d.MEMORY);
    }
}
