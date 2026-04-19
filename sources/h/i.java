package h;

import ae.r;
import i.d;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d.f f11588a = d.b.f12035a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d.f f11589a = d.b.f12035a;

        public final i a() {
            i iVar = new i();
            iVar.b(this.f11589a);
            return iVar;
        }

        public final a b(d.f fVar) {
            r.f(fVar, "mediaType");
            this.f11589a = fVar;
            return this;
        }
    }

    public final d.f a() {
        return this.f11588a;
    }

    public final void b(d.f fVar) {
        r.f(fVar, "<set-?>");
        this.f11588a = fVar;
    }
}
