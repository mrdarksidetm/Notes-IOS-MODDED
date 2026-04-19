package l3;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f14726b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f14725a = i10;
            this.f14726b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f14726b;
        }

        public int c() {
            return this.f14725a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f14727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f14729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f14730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f14731e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f14727a = (Uri) n3.g.h(uri);
            this.f14728b = i10;
            this.f14729c = i11;
            this.f14730d = z10;
            this.f14731e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f14731e;
        }

        public int c() {
            return this.f14728b;
        }

        public Uri d() {
            return this.f14727a;
        }

        public int e() {
            return this.f14729c;
        }

        public boolean f() {
            return this.f14730d;
        }
    }

    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return g3.b.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        l3.a aVar = new l3.a(cVar, handler);
        return z10 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, null, aVar);
    }
}
