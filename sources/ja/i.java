package ja;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class i implements ga.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14177a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14178b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ga.c f14179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f14180d;

    i(f fVar) {
        this.f14180d = fVar;
    }

    private void a() {
        if (this.f14177a) {
            throw new ga.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f14177a = true;
    }

    @Override // ga.g
    public ga.g add(String str) throws IOException {
        a();
        this.f14180d.d(this.f14179c, str, this.f14178b);
        return this;
    }

    @Override // ga.g
    public ga.g add(boolean z10) {
        a();
        this.f14180d.i(this.f14179c, z10, this.f14178b);
        return this;
    }

    void b(ga.c cVar, boolean z10) {
        this.f14177a = false;
        this.f14179c = cVar;
        this.f14178b = z10;
    }
}
