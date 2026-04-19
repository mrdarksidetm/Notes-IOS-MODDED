package f4;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes.dex */
class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f11122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f11123c;

    d(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f11122b = context;
        this.f11123c = uri;
    }

    private static Uri f(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // f4.a
    public a a(String str, String str2) {
        Uri uriF = f(this.f11122b, this.f11123c, str, str2);
        if (uriF != null) {
            return new d(this, this.f11122b, uriF);
        }
        return null;
    }

    @Override // f4.a
    public Uri d() {
        return this.f11123c;
    }

    @Override // f4.a
    public long e() {
        return b.b(this.f11122b, this.f11123c);
    }
}
