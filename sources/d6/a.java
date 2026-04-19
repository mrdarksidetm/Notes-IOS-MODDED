package d6;

import a6.o;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import d6.i;
import hf.u;
import nd.c0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f9497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.m f9498b;

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    public static final class C0226a implements i.a<Uri> {
        @Override // d6.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, j6.m mVar, x5.e eVar) {
            if (o6.j.r(uri)) {
                return new a(uri, mVar);
            }
            return null;
        }
    }

    public a(Uri uri, j6.m mVar) {
        this.f9497a = uri;
        this.f9498b = mVar;
    }

    @Override // d6.i
    public Object a(qd.d<? super h> dVar) {
        String strH0 = c0.h0(c0.T(this.f9497a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new m(o.b(u.d(u.k(this.f9498b.g().getAssets().open(strH0))), this.f9498b.g(), new a6.a(strH0)), o6.j.k(MimeTypeMap.getSingleton(), strH0), a6.d.DISK);
    }
}
