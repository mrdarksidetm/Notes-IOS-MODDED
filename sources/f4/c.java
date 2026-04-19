package f4;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f11120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f11121c;

    c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f11120b = context;
        this.f11121c = uri;
    }

    @Override // f4.a
    public a a(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // f4.a
    public Uri d() {
        return this.f11121c;
    }

    @Override // f4.a
    public long e() {
        return b.b(this.f11120b, this.f11121c);
    }
}
