package v5;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f22039d;

    public a(String str, int i10, int i11, d dVar) {
        r.f(str, "originalPhotoFilePath");
        r.f(dVar, "corners");
        this.f22036a = str;
        this.f22037b = i10;
        this.f22038c = i11;
        this.f22039d = dVar;
    }

    public final d a() {
        return this.f22039d;
    }

    public final String b() {
        return this.f22036a;
    }

    public final int c() {
        return this.f22038c;
    }

    public final void d(d dVar) {
        r.f(dVar, "<set-?>");
        this.f22039d = dVar;
    }
}
