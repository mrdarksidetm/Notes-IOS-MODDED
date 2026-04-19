package bb;

import android.net.Uri;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f5648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f5649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Uri f5650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f5651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[] f5652e;

    /* JADX INFO: renamed from: bb.a$a, reason: collision with other inner class name */
    public static class C0132a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f5655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f5656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f5657e;

        public a a() {
            return new a(this.f5653a, this.f5654b, this.f5655c, this.f5656d, this.f5657e);
        }

        public C0132a b(byte[] bArr) {
            this.f5657e = bArr;
            return this;
        }

        public C0132a c(String str) {
            this.f5654b = str;
            return this;
        }

        public C0132a d(String str) {
            this.f5653a = str;
            return this;
        }

        public C0132a e(long j10) {
            this.f5656d = j10;
            return this;
        }

        public C0132a f(Uri uri) {
            this.f5655c = uri;
            return this;
        }
    }

    public a(String str, String str2, Uri uri, long j10, byte[] bArr) {
        this.f5648a = str;
        this.f5649b = str2;
        this.f5651d = j10;
        this.f5652e = bArr;
        this.f5650c = uri;
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("path", this.f5648a);
        map.put("name", this.f5649b);
        map.put("size", Long.valueOf(this.f5651d));
        map.put("bytes", this.f5652e);
        map.put("identifier", this.f5650c.toString());
        return map;
    }
}
