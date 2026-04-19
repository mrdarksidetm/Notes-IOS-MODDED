package d6;

import a6.o;
import a6.p;
import ae.r;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import d6.i;
import je.u;
import je.v;
import je.w;
import nd.c0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9531c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f9532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.m f9533b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public static final class b implements i.a<Uri> {
        private final boolean c(Uri uri) {
            return r.b(uri.getScheme(), "android.resource");
        }

        @Override // d6.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, j6.m mVar, x5.e eVar) {
            if (c(uri)) {
                return new l(uri, mVar);
            }
            return null;
        }
    }

    public l(Uri uri, j6.m mVar) {
        this.f9532a = uri;
        this.f9533b = mVar;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // d6.i
    public Object a(qd.d<? super h> dVar) {
        Integer numL;
        String authority = this.f9532a.getAuthority();
        if (authority != null) {
            if (!(!v.v(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) c0.k0(this.f9532a.getPathSegments());
                if (str == null || (numL = u.l(str)) == null) {
                    b(this.f9532a);
                    throw new md.i();
                }
                int iIntValue = numL.intValue();
                Context contextG = this.f9533b.g();
                Resources resources = r.b(authority, contextG.getPackageName()) ? contextG.getResources() : contextG.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strK = o6.j.k(MimeTypeMap.getSingleton(), charSequence.subSequence(w.c0(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (!r.b(strK, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(o.b(hf.u.d(hf.u.k(resources.openRawResource(iIntValue, typedValue2))), contextG, new p(authority, iIntValue, typedValue2.density)), strK, a6.d.DISK);
                }
                Drawable drawableA = r.b(authority, contextG.getPackageName()) ? o6.d.a(contextG, iIntValue) : o6.d.d(contextG, resources, iIntValue);
                boolean zV = o6.j.v(drawableA);
                if (zV) {
                    drawableA = new BitmapDrawable(contextG.getResources(), o6.l.f16390a.a(drawableA, this.f9533b.f(), this.f9533b.n(), this.f9533b.m(), this.f9533b.c()));
                }
                return new g(drawableA, zV, a6.d.DISK);
            }
        }
        b(this.f9532a);
        throw new md.i();
    }
}
