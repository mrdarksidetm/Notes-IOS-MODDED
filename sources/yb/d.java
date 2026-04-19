package yb;

import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class d extends yb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i f23587b;

    class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j.d f23588a;

        a(j.d dVar) {
            this.f23588a = dVar;
        }

        @Override // yb.f
        public void error(String str, String str2, Object obj) {
            this.f23588a.error(str, str2, obj);
        }

        @Override // yb.f
        public void success(Object obj) {
            this.f23588a.success(obj);
        }
    }

    public d(i iVar, j.d dVar) {
        this.f23587b = iVar;
        this.f23586a = new a(dVar);
    }

    @Override // yb.e
    public <T> T a(String str) {
        return (T) this.f23587b.a(str);
    }

    @Override // yb.e
    public boolean f(String str) {
        return this.f23587b.c(str);
    }

    @Override // yb.e
    public String getMethod() {
        return this.f23587b.f20503a;
    }

    @Override // yb.a
    public f l() {
        return this.f23586a;
    }
}
