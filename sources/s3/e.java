package s3;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f19926a;

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f19927a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f19927a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.f19927a = (InputContentInfo) obj;
        }

        @Override // s3.e.c
        public Uri a() {
            return this.f19927a.getContentUri();
        }

        @Override // s3.e.c
        public void b() {
            this.f19927a.requestPermission();
        }

        @Override // s3.e.c
        public Uri c() {
            return this.f19927a.getLinkUri();
        }

        @Override // s3.e.c
        public Object d() {
            return this.f19927a;
        }

        @Override // s3.e.c
        public ClipDescription getDescription() {
            return this.f19927a.getDescription();
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f19928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f19929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f19930c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f19928a = uri;
            this.f19929b = clipDescription;
            this.f19930c = uri2;
        }

        @Override // s3.e.c
        public Uri a() {
            return this.f19928a;
        }

        @Override // s3.e.c
        public void b() {
        }

        @Override // s3.e.c
        public Uri c() {
            return this.f19930c;
        }

        @Override // s3.e.c
        public Object d() {
            return null;
        }

        @Override // s3.e.c
        public ClipDescription getDescription() {
            return this.f19929b;
        }
    }

    private interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f19926a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private e(c cVar) {
        this.f19926a = cVar;
    }

    public static e f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new e(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f19926a.a();
    }

    public ClipDescription b() {
        return this.f19926a.getDescription();
    }

    public Uri c() {
        return this.f19926a.c();
    }

    public void d() {
        this.f19926a.b();
    }

    public Object e() {
        return this.f19926a.d();
    }
}
