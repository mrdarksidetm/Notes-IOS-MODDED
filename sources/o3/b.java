package o3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f16292a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f16293a;

        public a(ClipData clipData, int i10) {
            this.f16293a = Build.VERSION.SDK_INT >= 31 ? new C0368b(clipData, i10) : new d(clipData, i10);
        }

        public b a() {
            return this.f16293a.build();
        }

        public a b(Bundle bundle) {
            this.f16293a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f16293a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f16293a.a(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: o3.b$b, reason: collision with other inner class name */
    private static final class C0368b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f16294a;

        C0368b(ClipData clipData, int i10) {
            this.f16294a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // o3.b.c
        public void a(Uri uri) {
            this.f16294a.setLinkUri(uri);
        }

        @Override // o3.b.c
        public void b(int i10) {
            this.f16294a.setFlags(i10);
        }

        @Override // o3.b.c
        public b build() {
            return new b(new e(this.f16294a.build()));
        }

        @Override // o3.b.c
        public void setExtras(Bundle bundle) {
            this.f16294a.setExtras(bundle);
        }
    }

    private interface c {
        void a(Uri uri);

        void b(int i10);

        b build();

        void setExtras(Bundle bundle);
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f16295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f16296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f16297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f16298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f16299e;

        d(ClipData clipData, int i10) {
            this.f16295a = clipData;
            this.f16296b = i10;
        }

        @Override // o3.b.c
        public void a(Uri uri) {
            this.f16298d = uri;
        }

        @Override // o3.b.c
        public void b(int i10) {
            this.f16297c = i10;
        }

        @Override // o3.b.c
        public b build() {
            return new b(new g(this));
        }

        @Override // o3.b.c
        public void setExtras(Bundle bundle) {
            this.f16299e = bundle;
        }
    }

    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f16300a;

        e(ContentInfo contentInfo) {
            this.f16300a = (ContentInfo) n3.g.h(contentInfo);
        }

        @Override // o3.b.f
        public ClipData a() {
            return this.f16300a.getClip();
        }

        @Override // o3.b.f
        public int b() {
            return this.f16300a.getFlags();
        }

        @Override // o3.b.f
        public ContentInfo c() {
            return this.f16300a;
        }

        @Override // o3.b.f
        public int d() {
            return this.f16300a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f16300a + "}";
        }
    }

    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f16301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f16304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f16305e;

        g(d dVar) {
            this.f16301a = (ClipData) n3.g.h(dVar.f16295a);
            this.f16302b = n3.g.d(dVar.f16296b, 0, 5, "source");
            this.f16303c = n3.g.g(dVar.f16297c, 1);
            this.f16304d = dVar.f16298d;
            this.f16305e = dVar.f16299e;
        }

        @Override // o3.b.f
        public ClipData a() {
            return this.f16301a;
        }

        @Override // o3.b.f
        public int b() {
            return this.f16303c;
        }

        @Override // o3.b.f
        public ContentInfo c() {
            return null;
        }

        @Override // o3.b.f
        public int d() {
            return this.f16302b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f16301a.getDescription());
            sb2.append(", source=");
            sb2.append(b.e(this.f16302b));
            sb2.append(", flags=");
            sb2.append(b.a(this.f16303c));
            if (this.f16304d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f16304d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f16305e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    b(f fVar) {
        this.f16292a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static b g(ContentInfo contentInfo) {
        return new b(new e(contentInfo));
    }

    public ClipData b() {
        return this.f16292a.a();
    }

    public int c() {
        return this.f16292a.b();
    }

    public int d() {
        return this.f16292a.d();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f16292a.c();
        Objects.requireNonNull(contentInfoC);
        return contentInfoC;
    }

    public String toString() {
        return this.f16292a.toString();
    }
}
